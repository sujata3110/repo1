class Test{
    public static void main(String args[])
{
 	int arr[]={40,60,70,50,80,100};
	int n=arr.length;
	int span=1;
	System.out.print(span+" ");
  for(int i=1;i<n;i++)
{
   for(int j=i-1;j>=0;j--)
   {
	if(arr[i]>=arr[j])
	span++;
	else 
	break;
   }
	System.out.print(span+" ");
	   span=1;
          }
     }
}