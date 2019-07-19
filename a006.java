import java.util.Scanner;


public class a003{
	public static void main(String[] args) {
		
		int a,b,c,D,x1,x2;
		Scanner scanner = new Scanner(System.in);
		 
		while(scanner.hasNextInt()) {
			  
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			D = b*b-4*a*c;
			
			if(D>0) {
				x1 = (int)((-1*b+Math.sqrt(D))/2*a);
				x2 = (int)((-1*b-Math.sqrt(D))/2*a);
				System.out.println("Two different roots x1="+ x1 + " , x2=" + x2);
				
			}
			else if (D==0) {
				x1= -1*b / (2*a);
				System.out.println("Two same roots x=" + x1 );
			}
			else {
				System.out.println("No real root");
			}
			
			
		    
	}	
}
}
