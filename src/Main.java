import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sum=0; 
		int n=0;
		int m=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("please input m:");
		m=sc.nextInt();
		System.out.print("please input n:");
		n=sc.nextInt();
		for (int i=m;i<=n;i++){
			sum = sum+i;
		}
		System.out.print(sum);

	}

}
