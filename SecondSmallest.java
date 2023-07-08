package lambdaEx;


	
public class SecondSmallest 
{

	public int getSecondSmallest(int[]arr)
	{
		int smallest=Integer.MAX_VALUE;
		int SecondSmall=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				SecondSmall=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<SecondSmall && arr[i]!=smallest)
			{
				SecondSmall=arr[i];
			}
		}
		return SecondSmall;
	}
	public static void main(String args[])
	{
		
	}
}
	

