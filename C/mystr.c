#include <stdio.h>
#include <string.h> 
 
int mystrlen(const char *); 
 
int main(void) {   
    char str[] =  "C 언어는 좀 어렵지만, 재미있는 언어입니다.";  
    char *ptoken;  
    char *delimiter = " ,.";  
 
    ptoken = strtok(str, delimiter);  
    while ( ptoken != NULL ){    
        printf("%s ", ptoken);   
        printf("%5d %5d\n", mystrlen(ptoken), strlen(ptoken)); 
 
        ptoken = strtok(NULL, delimiter);
    } 
 
    return 0;
    } 
 
int mystrlen(const char *s){  
    int cnt = 0;  
    while (*s++) ++cnt; 

    return cnt;
} 
 