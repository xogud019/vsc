#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <netinet/in.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <sys/un.h>
#include <time.h>

#define MAX 100
#define DEFAULT_PROTOCOL 0

int powMod(int a, int b, int n);		//rsa
int compute(int a, int m, int n);		//dh

int main(int argc, char **argv){
	
	srand(time(NULL));

	int servSock, cliSock, serverlen,clientlen,nRcv;
	int sPort;
	int num;
	int n=0;
	int p = 20;				//dh
	int g = 13;				//dh
	int cliSecKey =rand()%10+1;		//dh
	int cliPubKey =compute(g,cliSecKey,p);	//dh
	int cliKey;				//dh
	int i;					//dh
	int num1,N,e;				//rsa
	char sAddr[15];
	char sendM[MAX];
	char RSAM[MAX];				//rsa socket
	char sDHM[MAX];				//dh socket
	char cDHM[MAX];				//dh socket
	char ID[MAX],PWD[MAX];			
	char next[MAX];
	struct sockaddr_in serverAddr, clientAddr;
	struct hostent *host;
	
	printf("server address:");
	gets(sAddr);
	printf("port number:");
	gets(sendM);
	sPort = atoi(sendM);

	cliSock = socket(AF_INET,SOCK_STREAM, DEFAULT_PROTOCOL);

	memset(&serverAddr,0,sizeof(struct sockaddr_in));
	serverAddr.sin_family = AF_INET;
	serverAddr.sin_port = htons(sPort);
	serverAddr.sin_addr.s_addr = inet_addr(sAddr);

	if((servSock = socket(AF_INET,SOCK_STREAM,DEFAULT_PROTOCOL)) == -1){
		printf("socket create error \n");
		exit(1);
	}
	else{
		printf("socket create success\n");
	}

	
	if(connect(servSock,(struct sockaddr*)&serverAddr, sizeof(serverAddr))<0){
		printf("connect server failed\n");
		exit(1);
	}
	else{
		printf("connet server\n");
	}
	
	bzero(RSAM,sizeof(RSAM));		//rsa exchange start
    read(servSock,RSAM,sizeof(RSAM));
	N =atoi(RSAM);

	bzero(next,sizeof(RSAM));
    read(servSock,RSAM,sizeof(RSAM));
	e = atoi(RSAM);
	printf("N = %d e = %d\n", N,e);		//rsa exchange end
	
	bzero(cDHM,sizeof(cDHM));		//dh start
	sprintf(cDHM,"%d",cliPubKey);
	write(servSock,cDHM,sizeof(cDHM));

	bzero(sDHM,sizeof(sDHM));
	read(servSock,sDHM,sizeof(sDHM));
	cliKey = atoi(sDHM);
	cliKey = compute(cliKey,cliSecKey,p);	//key compute
	printf("%d\n",cliKey);			//dh end

	while(1){
		printf("input ID : ");
   		bzero(ID,sizeof(ID));
        n = 0;
        while((ID[n++] = getchar()) != '\n');

		for(i = 0; (i < 100 && ID[i] != '\0'); i++)
        	ID[i] = ID[i] + cliKey;

        write(servSock,ID,sizeof(ID));
		bzero(next,sizeof(next));
        read(servSock,next,sizeof(next));

		if((strncmp(next,"next",4))==0){
			printf("input PWD : ");
        	bzero(PWD,sizeof(PWD));
        	n = 0;
       		while((PWD[n++] = getchar()) != '\n');

			for(i = 0; (i < 100 && PWD[i] != '\0'); i++)
        		PWD[i] = PWD[i] + cliKey;

        	write(servSock,PWD,sizeof(PWD));
			bzero(next,sizeof(next));
            read(servSock,next,sizeof(next));

			if((strncmp(next,"next",4))==0){
				printf("Authecation Success\n");

				while(1){
					bzero(sendM,sizeof(sendM));
					printf("\nSend Message : ");

	 				n = 0;
					while((sendM[n++] = getchar()) != '\n');
					num1 = atoi(sendM);
					num1 = powMod(num1,e,N);
					sprintf(sendM,"%d",num1);
					for(i = 0; (i < 100 && sendM[i] != '\0'); i++)
        				sendM[i] = sendM[i] + cliKey;

					write(servSock,sendM,sizeof(sendM));
					if((strncmp(sendM,"exit",4))==0){
                      	printf("client Exit \n");
                        break;
                	}
	
					bzero(sendM,sizeof(sendM));
					printf("\nReceive Message : ");
					read(servSock,sendM,sizeof(sendM));
					for(i = 0; (i < 100 && sendM[i] != '\0'); i++)
        				sendM[i] = sendM[i] - cliKey;
						
					num = atoi(sendM);
					num = powMod(num,e,N);
					printf("%d",num);
				}
			}//PWD if
			else{
				printf("PWD Authecation Failed\n");
				break;
			}
		}//ID if 
		else{
			printf("ID Authecation Failed\n");
			break;
		}
	
	}//while	
	
}

int powMod(int a, int b, int n) {
	long long x = 1, y = a;

	while (b > 0) {
		if (b % 2 == 1)
			x = (x * y) % n;
		y = (y * y) % n; // Squaring the base
		b /= 2;
	}

	return x % n;
}

int compute(int a, int m, int n){
	int r;
	int y = 1;

	while (m > 0)
	{
		r = m % 2;

		if (r == 1){
			y = (y*a) % n;
		}
		a = a*a % n;

		m = m / 2;
	}

	return y;
}
