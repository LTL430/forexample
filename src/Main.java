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
			printLine(i);
		}
		
	
	}

	private static void printLine(int line) {
		// TODO Auto-generated method stub
		for (int i=0;i<line;i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
