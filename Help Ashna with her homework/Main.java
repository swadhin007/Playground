#include<iostream>
int main()
{
  int a,b,c,s,d,m,dd,mm;
  std::cin>>a>>b;
  s=a+b;
  d=a-b;
  m=a*b;
  dd=a/b;
  mm=a%b;
  std::cout<<"a+b="<<s;
  std::cout<<"\na-b="<<d;
  std::cout<<"\na*b="<<m;
  std::cout<<"\na/b="<<dd;
  std::cout<<"\na%b="<<mm;
}