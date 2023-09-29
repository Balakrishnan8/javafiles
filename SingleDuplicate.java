public class SingleDuplicate
{
public static void main(String [] args)
{
int arr [] = {1,5,5,3,2,1};
for (int i=0;i<6;i++)
{
for (int j=i+1;j<6;j++)
{
if(arr[i]==arr[j])
{
System.out.println(arr[i]);
break;
}
}
}

}
}