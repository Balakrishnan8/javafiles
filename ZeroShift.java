public class ZeroShift
{
public static void main(String [] args)
{
int a = 0;
int arr [] = {1,2,0,5,34,0,0,9,0,5};
for (int b=0;b<arr.length;b++)
{
if (arr[b]!=0)
{
int tmp = arr[a];
arr[a] = arr[b];
arr[b] = tmp;
a++;
}
}
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}