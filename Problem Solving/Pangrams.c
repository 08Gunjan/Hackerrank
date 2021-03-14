#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>


void pangrams(char* s) {
 int index=0;
 int ch;
 int arr[26]={0};
 int len=strlen(s);
 for(int i=0;i<len;i++){
     ch=s[i];
     if(ch=='\0')
     break;
     if(isalpha(ch)){
//         printf("hi");
         char ch1 =tolower(ch);
          index=ch1-'a';
        
         arr[index]=1;
       // printf("%d ",index);
     }
 }
 int flag=0;
 for(int i=0;i<26;i++){
     if(arr[i]==0){
         flag=1;
         break;
     }
     //printf("i: %d %d \n",i,arr[i]);
 }
 if (flag==1)
 printf("not pangram");
else
printf("pangram");
}

int main()
{
    char str[10000];
    fgets(str ,sizeof(str), stdin);
    pangrams(str);
}
