import java.util.*;
public class Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        while(n>0){
            int r=n%10;
            s=s+""+r;
            n=n/10;
        }System.out.println(s);
    }
}