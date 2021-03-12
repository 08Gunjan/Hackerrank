#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* readline();
char** split_string(char*);

// Complete the catAndMouse function below.

// Please either make the string static or allocate on the heap. For example,
// static char str[] = "hello world";
// return str;
//
// OR
//
// char* str = "hello world";
// return str;
//
void catAndMouse(int x, int y, int z) {
    int s1 = abs(z-x);
    int s2 =abs(z-y);
    
    if(s1>s2)
    printf("Cat B\n");
    if(s2>s1)
    printf("Cat A\n");
    if(s1==s2)
    printf("Mouse C\n");

}

int main()
{
    int n,a[100];
    scanf("%d",&n);
    int c1,c2,m1;
    for(int i=0;i<n;i++)
    {
        scanf("%d %d %d",&c1,&c2,&m1);
        catAndMouse(c1,c2,m1);
        
    }
}
