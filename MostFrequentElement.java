import java.util.*;
public class MostFrequentElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int maxCount = 1;
        int currCount = 1;
        int mostFreq = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currCount++;
            } else {
                currCount = 1;
            }

            if (currCount > maxCount) {
                maxCount = currCount;
                mostFreq = arr[i];
            }
        }

        System.out.println("Most frequent element: " + mostFreq);
        System.out.println("Frequency: " + maxCount);
    }
}
