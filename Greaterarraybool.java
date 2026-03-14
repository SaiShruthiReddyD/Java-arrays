import java.util.*;
public class Greaterarraybool {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>x){
                System.out.println("Yes");
                break;
            }System.out.println("No");
            break;
        }
    }
}
