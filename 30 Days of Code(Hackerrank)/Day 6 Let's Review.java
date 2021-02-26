#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

void even(char* str){
    int l=strlen(str);
    char ch;
    for(int i=0;i<l;i=i+2){
        ch=str[i];
        printf("%c",ch);
        
    }
    printf(" ");
}

void odd(char* str){
    int l=strlen(str);
    char ch;
    for(int i=1;i<l;i=i+2){
        ch=str[i];
        printf("%c",ch);
        
    }
    printf(" ");
}
int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int t; 
    char str[100000];
    scanf("%d",&t);
    
    while(t--){
        scanf("%s",str);
        even(str);
        odd(str);
        printf("\n");
    }
    return 0;
}


