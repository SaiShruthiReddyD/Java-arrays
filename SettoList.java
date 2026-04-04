import java.util.*;
public class SettoList {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        ArrayList<Integer> list=new ArrayList<>(set);
        System.out.println(list);
    }
}