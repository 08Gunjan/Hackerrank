#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void marc(char* s){
    char a[3]="SOS";
    int l=strlen(s);
    int c=0,i=0;
      while(i<l){
        int j=0;
        while(j<3){
            if(s[i]!=a[j])
                c++;
                j++;
                i++;
            
        }
    }
    printf("%d",c);
}
int main(){
    char s[100];
    fgets(s,sizeof(s),stdin);
    marc(s);
    return 0;
}
