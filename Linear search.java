import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;arr[i++]=sc.nextInt());
		int searchElement=sc.nextInt();
		int res=linearSearch(n,arr,searchElement);
		if(res==-1)
		System.out.println("Element not found");
		else
		System.out.println("Element "+searchElement+" found at index "+res);
	}
	public static int linearSearch(int n,int[]arr,int searchElement)
	{
	    for(int i=0;i<n;i++)
		{
		    if(arr[i]==searchElement)
		    return i;
		}
		return -1;
	}
}
