import java.util.*;
public class FindmissingElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int s=0;
        for(int i=0;i<n;i++){
            s=s+arr[i];
        }
        int s1=0;
        for(int i=1;i<=k;i++){
            s1=s1+i;
        }System.out.println(s1-s);
    }
}