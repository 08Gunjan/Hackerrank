#include <assert.h>
#include <ctype.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
    long n;
    int f[5]={0};
    int arr[1000000];
    scanf("%ld",&n);
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<n;i++){
        int index=arr[i]-1;
        f[index]++;
    }
    int max=0;
    int ind_max;
for(int i=0;i<5;i++){
    if(f[i]>max){
       max=f[i];
        ind_max=i;
    }
}
int flag=0;
for(int i=0;i<5;i++){
    if(max==f[i]){
        flag=1;
        if(ind_max>i){
            ind_max=i;
        }
    }
}
//if(flag==0)
printf("%d",ind_max+1);
 return 0;   
}
