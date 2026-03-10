import java.util.*;
public class EvenNumberofDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }int count=0;
        for(int i=0;i<n;i++){
            int c=0;
            while(arr[i]>0) {
                arr[i]=arr[i]/10;
                c++;
            }
            if (c%2==0){
                count++;
        }
        }System.out.println(count);
    }
}
