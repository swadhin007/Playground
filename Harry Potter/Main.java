#include<iostream>
using namespace std;
int main()
{
  int a;
  std::cin>>a;
  int first=a/1000;
  int last=a%10;
  std::cout<<first+last;
}