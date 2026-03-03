import java.util.*;
public class Arrayrotationright {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int temp;
        while(k!=0){
            temp=arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(i!=0){
                arr[i]=arr[i-1];
            }else{
                arr[i]=temp;
            }
            }k--;
        }System.out.println(Arrays.toString(arr));
    }
    }