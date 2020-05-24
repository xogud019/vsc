#include <stdio.h>  
#include <conio.h>
int main(void)  {      
    //char *name, *line;
    char ch; 
    char name[20];
    char line[20];
 
    gets(line);
    puts(line); 
 
    scanf("%s", name);
    printf("%s\n", name); //문자열 출력 
 
    ch=getch();
    putch(ch);
    puts(""); 
 
    return 0; 
} 