import java.util.*;
public class FormMaxNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] count=new int[10];
        for(int i=0;i<n;i++){
            if(arr[i]>=0&&arr[i]<= 9){
                count[arr[i]]++;
            }
        }
        for(int i=9;i>=0;i--){
            while(count[i]>0){
                System.out.print(i);
                count[i]--;
            }
        }
    }
}