import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String sum=""; 
		int n=0;
		int m=0;
		Scanner sc= new Scanner(System.in);
		//System.out.print("please input m:");
		//m=sc.nextInt();
		System.out.print("please input n:");
		n=sc.nextInt();
		for (int i=1;i<=n;i++){
			sum=makeLine(i,n);
			System.out.println(sum);
		}
		
	
	}

	private static String makeLine(int m, int n) {
		// TODO Auto-generated method stub
		String line="";
		for (int i=0; i<n-m; i++) {
			line+=" ";
		
		}
		for (int i=0; i<m; i++) {
			line+="*";
		}
		return line;
	}


	
}
