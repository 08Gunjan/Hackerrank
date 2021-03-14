#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void hackerrankInString(char* str) {
 char ch;
  char a[11]="hackerrank";
   int len =strlen(str);
   int j=0;
   for(int i=0;i<len;i++){
       ch=str[i];
       if(ch=='\0')
       break;
       if(ch==a[j]){
           j++;
       }
   }
   if(j==10){
      printf("YES\n");
   }
   else
   printf("NO\n");
   

}

int main()
{   
    int n;
    char str[100000];
     scanf("%d ",&n);
    
    for(int i=0;i<n;i++){ 
    scanf("%s",str); 
    hackerrankInString(str);
    }
}
