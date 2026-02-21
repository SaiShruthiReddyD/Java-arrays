//Count of elements which are less than the elements in array respectively. 
import java.util.*;
public class Array1{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        int count=0;
        for(int j=0;j<n;j++){
            if(arr[j]<arr[i]){
                count=count+1;
            }
        }System.out.print(count+" ");
    }
	}
}