#include <stdio.h>
int main()
{
    int n;
    int count=0;
    printf("Enter a prime number");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            count++;
        }
    }
        if(count==2)
        {
            printf("%d is a prime number",n);
        }
        else
        {
            printf("%d is not a prime number",n);
        }
        
    
    return 0;
}