
#include <stdio.h>

int main()
{   float a,b;
    scanf("%f %f",&a,&b);
    float Area=a*b;
    printf("Area is %f and %f = %f",a,b,a*b);
    
    char c;
    //scanf("%c",&c); Error as before it there is different data
    scanf(" %c",&c); //correct add a space before 
    printf("%c",c);
    return 0;
}
