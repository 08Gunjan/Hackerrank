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

int grade(int num){
    if(num<38){
        return num;
    }
    int j=num;
    if(j%5==0){
        return j;
    }
    else{
    while(j%5!=0){
        j++;
    }
    
    if(j-num<3)
    return j;
    else
    return num;
    }
}
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int num;
        scanf("%d",&num);
        int ans=grade(num);
        printf("%d\n",ans);
    }
    return 0;
}
