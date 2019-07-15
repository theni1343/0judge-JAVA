import java.util.Scanner;

public class JAVA{
	public static void main(String[] args) {
		
		int M,D,S;
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()) {
			
			M=scanner.nextInt();
			D=scanner.nextInt();
			S=(M*2+D)%3;
			
			if(S==0) {
				System.out.println("普通");
			}
			else if(S==1) {
				System.out.println("吉");
			}
			else {
				System.out.println("大吉");
			}
		 
		
		}
	}
}
