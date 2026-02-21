/*By using Arrays.toString(arr) printing the elements of the  
of the array by sorting using Arrays.sort(arr)*/
import java.util.*;
public class Array{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(Arrays.toString(arr));
	}
}