import java.util.*;
public class Array2{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int[] arr=new int[n];
        int[] arr2=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        arr2[arr[i]]+=1;
    }
    for(int i=0;i<101;i++){
        arr2[i]=arr2[i]+arr2[i-1];
    }
    for(int i=0;i<n;i++){
        System.out.print(arr2[arr[i]-1]+" ");
    }
	}
}