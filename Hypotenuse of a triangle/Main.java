#include<stdio.h>
#include<math.h>
int main()
{
  float p,b,hypo;
  scanf("%f%f",&p,&b);
  hypo=hypot(p,b);
  printf("%.2f",hypo);
  return 0;
}