#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
    int n,socks[100];
    int freq[100];
    for(int i=0;i<100;i++){
        freq[i]=1;
    }
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%d",&socks[i]);
    }
    
    //  printf("\n");
    // for(int i=0;i<n;i++){
    //     printf("%d ",freq[i]);
    // }
    //   printf("\n");
      
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(socks[i]!=-1&&socks[j]!=-1)
            if(socks[i]==socks[j]){
                freq[i]++;
                socks[j]=-1;
            }
        }
    }
    // for(int i=0;i<n;i++){
    //     printf("%d ",socks[i]);
    // }
    // printf("\n");
    // for(int i=0;i<n;i++){
    //     printf("%d ",freq[i]);
    // }
    int pair=0;
    for(int i=0;i<n;i++){
        if(freq[i]!=1){
            if(freq[i]%2==0){
                pair+=(freq[i]/2);
            }
            else{
                pair+=((freq[i]-1)/2);
            }
        }
    }
    printf("%d",pair);
return 0;
}
