import java.util.*;
public class BoxMatrix{
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
            for(int j=0;j<m;j++){
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
        }if(a>b&&a>c){
            System.out.println(a);
        }
        else if(b>a&&b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
        
	}
}