import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
        int a=0,b=0,c=0;
		for(int i=0;i<n;i++){
            for(int j=0;i<m;j++){
                if(i==j){
                    a=a+arr[i][j];
                }
                else if(i>j){
                    b=b+arr[i][j];
                }
                else{
                    c=c+arr[i][j];
                }
            }
        }
        System.out.println( Math.max(c,Math.max(a,b)) +"");
	}
}