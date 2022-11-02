package exp6;
import java.io.*;

public class MergeSort 
{
 /* Merge Sort function */
 public static void sort(int[] a, int low, int high) 
 {
 int N = high - low; 
 if (N <= 1) 
 return; 
 int mid = low + N/2; 
 // recursively sort 
 sort(a, low, mid); 
 sort(a, mid, high); 
 // merge two sorted subarrays
 int[] temp = new int[N];
 int i = low, j = mid;
 for (int k = 0; k < N; k++) 
 {
 if (i == mid) 
 temp[k] = a[j++]; else if (j == high) 
 temp[k] = a[i++];
 else if (a[j]<a[i]) 
 temp[k] = a[j++];
 else 
 temp[k] = a[i++];
 } 
 for (int k = 0; k < N; k++) 
 a[low + k] = temp[k]; 
 }
 /* Main method */
 public static void main(String[] args) throws IOException
 {
 InputStreamReader obj=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(obj); 
 System.out.println("Merge Sort Test\n");
 int n, i;
 /* Accept number of elements */
 System.out.println("Enter number of integer elements");
 n = Integer.parseInt(br.readLine());
 /* Create array of n elements */
 int arr[] = new int[ n ];
 /* Accept elements */ System.out.println("\nEnter "+ n +" integer elements");
 for (i = 0; i < n; i++)
 arr[i] = Integer.parseInt(br.readLine());
 /* Call method sort */
 sort(arr, 0, n);
 /* Print sorted Array */
 System.out.println("\nElements after sorting "); 
 for (i = 0; i < n; i++)
 System.out.print(arr[i]+" "); 
 System.out.println(); 
 } 
}