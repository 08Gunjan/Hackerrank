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

// Complete the solve function below.
void solve(double meal_cost, int tip_percent, int tax_percent) {
    double tc=0;
    
    double tp;
    tp =(meal_cost*tip_percent)/100;
    double tt;
    tt =(meal_cost*tax_percent)/100;
    tc =  meal_cost + tp + tt;
    printf("%d",(int)round(tc));
}

int main()
{
    int tip,tax;
    double meal;
    scanf("%lf %d %d",&meal,&tip,&tax);
    solve(meal,tip,tax);
}
