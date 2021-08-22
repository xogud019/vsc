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

int square(int num);			//find square
int checkPrime(int n);			//rsa start
int findGCD(int n1, int n2);
int powMod(int a, int b, int n);	//rsa end
int compute(int a, int m, int n);	//dH 

int main(int argc, char *argv[]){

	srand(time(NULL));

    int servSock, cliSock, serverlen,clientlen,nRcv;
	int num;
	int n;
	int i;					//dh
	int p = 20;				//dh
	int g = 13;				//dh
	int num1,N,oN,prime1,prime2,e,d;		//rsa
	int servSecKey =rand()%10+1;		//dh secret key
	int servPubKey =compute(g,servSecKey,p);//dh public key
	int servKey;				//dh simmetric key
	FILE *user;				//id,pwd file
	char RSAM[MAX];				//rsa socket
	char sDHM[MAX];				//dh socket
	char cDHM[MAX];				//dh socket
        char sendM[MAX];
	char next[MAX] = "next";
	char ID[MAX],PWD[MAX];
	char buf1[MAX],buf2[MAX];		//id,pwd string save
	char *line_p;
	
    struct sockaddr_in serverAddr, clientAddr;

	if(argc !=2){
		printf("insert port Number\n");
		exit(1);
	}

	if((user= fopen("userData.txt","r")) == NULL){
                printf("error");
                exit(2);
        }
	
	while(1){
		prime1 = rand()%100+1;
		prime2 = rand()%100+1;
		if (!(checkPrime(prime1) && checkPrime(prime2)))
			printf("try again\n");
		else if (!checkPrime(prime1))
			printf("try again\n");
		else if (!checkPrime(prime2))
			printf("try again\n");
		else
			break;
	}

	N = prime1*prime2;

	oN = (prime1-1)*(prime2-1);

	e = 0;
	for (e = 5; e <= 100000; e++) {
		if (findGCD(oN, e) == 1)
			break;
	}
	
	d = 0;
	for (d = e + 1; d <= 100000; d++) {
		if ( ((d * e) % oN) == 1)
			break;
	}
		
	printf("N = %d oN = %d e = %d d = %d\n",N,oN,e,d);

	fgets(buf1,sizeof(buf1),user);
    //if((line_p = strchr(buf1,'\n'))!=NULL)*line_p = '\0';
    fgets(buf2,sizeof(buf2),user);
    //if((line_p = strchr(buf2,'\n'))!=NULL)*line_p = '\0';

    servSock = socket(AF_INET,SOCK_STREAM, DEFAULT_PROTOCOL);
	
	if(servSock == -1){
		printf("socket creation failed\n");
		exit(1);
	}
	else{
		printf("socket creation success\n");
	}

    memset(&serverAddr,0,sizeof(struct sockaddr_in));
    serverAddr.sin_family = AF_INET;
    serverAddr.sin_port = htons(atoi(argv[1]));
    serverAddr.sin_addr.s_addr = htonl(INADDR_ANY);

    if(bind(servSock,(struct sockaddr*)&serverAddr, sizeof(serverAddr))!=0){
        printf("binding failed\n");
        exit(1);
    }
    else{
		printf("binding success\n");
	}

	if(listen(servSock,5) != 0){
		printf("listen failed\n");
		exit(1);
	}
	else{
		printf("listen success\n");
	}
	clientlen = sizeof(clientAddr);
	cliSock = accept(servSock,(struct sockaddr*)&clientAddr,&clientlen);
	printf("server accept\n");
    printf("connected\n");

	bzero(RSAM,sizeof(RSAM));		//rsa exchange start
	sprintf(RSAM,"%d",N);
	write(cliSock,RSAM,sizeof(RSAM));

	bzero(RSAM,sizeof(RSAM));
	sprintf(RSAM,"%d",e);
	write(cliSock,RSAM,sizeof(RSAM));	//rsa exchange end
	
	bzero(cDHM,sizeof(cDHM));		//dh start
	read(cliSock,cDHM,sizeof(cDHM));
	servKey = atoi(cDHM);
	servKey = compute(servKey,servSecKey,p);   //key compute

	bzero(sDHM,sizeof(sDHM));
	sprintf(sDHM,"%d",servPubKey);
	write(cliSock,sDHM,sizeof(sDHM));	//dh end
	printf("%d\n",servKey);
	
	while(1){
		bzero(ID,sizeof(ID));
		printf("ID :");
      	read(cliSock,ID,sizeof(ID));

		for(i = 0; (i < 100 && ID[i] != '\0'); i++)
        	ID[i] = ID[i] - servKey;

		if(strncmp("exit",ID,4) ==0){
			fclose(user);
            printf("Server Exit\n");
            break;
        }

        printf("%s",ID);

		if(strcmp(buf1,ID)==0){
			write(cliSock,next,sizeof(next));
			bzero(PWD,sizeof(PWD));
			printf("PWD :");
			read(cliSock,PWD,sizeof(PWD));

			for(i = 0; (i < 100 && PWD[i] != '\0'); i++)
        		PWD[i] = PWD[i] - servKey;

			if(strncmp("exit",PWD,4) ==0){
				fclose(user);
                printf("Server Exit\n");
                break;
            }

			printf("%s",PWD);

			if(strcmp(buf2,PWD)==0){
				printf("Authecation Success\n");
				write(cliSock,next,sizeof(next));

				while(1){
					bzero(sendM,sizeof(sendM));
					printf("Message Receive : ");
					read(cliSock,sendM,sizeof(sendM));

					for(i = 0; (i < 100 && sendM[i] != '\0'); i++)
        				sendM[i] = sendM[i] - servKey;

					num1 = atoi(sendM);
					num1 = powMod(num1,d,N);
					sprintf(sendM,"%d",num1);

					if(strncmp("exit",sendM,4) ==0){
						fclose(user);
                		printf("Server Exit\n");
                		break;
               		}

					printf("%s\n",sendM);
					num = atoi(sendM);
					num = square(num);
					num = powMod(num,d,N);
					sprintf(sendM,"%d",num);
					for(i = 0; (i < 100 && sendM[i] != '\0'); i++)
        				sendM[i] = sendM[i] + servKey;

					write(cliSock,sendM,sizeof(sendM));
					printf("Send Message \n");
				}	
			}//PWD if
			else{
				fclose(user);
				printf("PWd Authecation Failed\n");
				break;
			}
		}//ID if
		else{
			fclose(user);
			printf("ID Authecation Failed\n");
			break;
		}
	}//while
}	

int square(int num){
	int squares = 0;

	squares = (num*num);
	return squares;

}

int checkPrime(int n) {
	int i;
	int m = n / 2;
	
	for (i = 2; i <= m; i++) {
		if (n % i == 0) {
			return 0; // Not Prime
		}
	}

	return 1; // Prime
}

int findGCD(int n1, int n2) {
	int i, gcd;

	for(i = 1; i <= n1 && i <= n2; ++i) {
		if(n1 % i == 0 && n2 % i == 0)
			gcd = i;
	}

	return gcd;
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
