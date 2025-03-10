import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;a[i++]=sc.nextInt());
		Arrays.sort(a);
		int searchelement=sc.nextInt();
		int result=binarySearch(a,searchelement);
		System.out.println("Sorted Array");
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
		
		if(result==-1)
		System.out.println("Element Not found");
		else
		System.out.println("Element found at index "+result);
		
	}
	public static int binarySearch(int[] arr, int key) {
        int left=0,right=arr.length-1;
        
        while(left<=right) {
            int mid=left+(right-left)/2;
            
            if (arr[mid]==key)
                return mid; 
            
            if (arr[mid]<key)
                left=mid+1;
            else
                right=mid-1;
        }
        
        return -1;
    }
}
