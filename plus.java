import java.util.Scanner;


public class plus {
	public static void main(String[] args) {
		
		int a,b,c;
		Scanner scanner = new Scanner (System.in);
		
		while(scanner.hasNextInt()) {
			
			a=scanner.nextInt();
			b=scanner.nextInt();
			
			c=a+b;
					
			System.out.println(+c);
		}
		
	}
}