import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        quickSort(arr,0,n-1);
        for (int num : arr)
            System.out.print(num+" ");
    }

    public static void quickSort(int[] arr,int first,int last) {
        if (first<last) {
            int pivotIndex=partition(arr,first,last);
            quickSort(arr,first,pivotIndex - 1);
            quickSort(arr,pivotIndex+1,last);
        }
    }

    public static int partition(int[] arr,int first,int last) {
        int pivot=arr[first];
        int i=first,j=last;
        while(i<j) {
            while(i<last && arr[i]<=pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i < j) {
                swap(arr,i,j);
            }
        }
        
        swap(arr,first,j);
        return j;
    }

    public static void swap(int[] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
