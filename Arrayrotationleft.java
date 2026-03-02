import java.util.*;
public class Arrayrotationleft {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        while(k != 0){
            int temp = arr[0];
            for(int i = 0; i < n; i++){
                if(i != n - 1){
                    arr[i] = arr[i + 1];
                } else {
                    arr[i] = temp;
                }
            }
            k--;
        }
        System.out.println(Arrays.toString(arr));
    }
}