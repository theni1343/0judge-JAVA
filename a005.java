import java.util.Scanner;

public class a003{
	public static void main(String[] args) {
		
		int t,a,b,c,d,e;
		Scanner scanner = new Scanner(System.in);
		 t = scanner.nextInt();
		while(t-- !=0 && t<=20 ) {
			  
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			d = scanner.nextInt();
			System.out.print(a+" "+b+" "+c+" "+d+" ");	
			if(b-a == d-c) {
				e=d+b-a;
				System.out.println(e);		
				
			}
			else if (d/c == b/a){
				e=d*b/a;
				System.out.println(e);
				
			}
		    
	}	
}
}
