    // Declare second integer, double, and String variables.
    int j;
    double var;
    char a[100];
    // Read and save an integer, double, and String to your variables.
    scanf("%d",&j);
    scanf("%lf",&var);
    //gets(a);
    scanf("%*[\n] %[^\n]", a); 
    // Print the sum of both integer variables on a new line.
    printf("%d\n",i+j);
    // Print the sum of the double variables on a new line.
    printf("%.1lf\n",d+var);
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.
   // strcat(s,a);
  // printf("%s",a);
    printf("%s%s",s,a);
