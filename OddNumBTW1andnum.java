import java.util.*;
public class OddNumBTW1andnum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res="";
        for(int i=1;i<n;i++){
            if(i%2!=0){
                if(res.isEmpty()){
                    res=i+"";

                }else{
                    res=res+","+i;
                }
            }
        }System.out.println(res);
    }
}
