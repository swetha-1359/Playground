#include<stdio.h>
int main()
{
  	int n,i,ele1_,ele2_,ele1_index=-1,ele2_index=-1;
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++)
    {
      scanf("%d",&a[i]);
    }
  scanf("%d%d",&ele1_,&ele2_);
  for(i=0;i<n;i++)
  {
    if(ele1_==a[i] && ele1_index==-1)
    {
      ele1_index=i;
    }
    if(ele2_==a[i] && ele2_index==-1)
    {
      ele2_index=i;
    }
  }
  printf("Element 1 index = %d\nElement 2 index = %d",ele1_index,ele2_index);
}
     