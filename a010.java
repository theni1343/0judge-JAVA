import java.util.Scanner;
public class a003 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int a;
	
	while(scanner.hasNext()) {
		a = scanner.nextInt();
		
		for(int i = 2 ; i<=a ; i++) {
			int count = 0 ; 
			
			while(a%i==0) {
				a = a/i;
				count++;
			}
			
			if(count>1&&a==1) {
				System.out.print(i+"^"+count);
			}
			if(count>1&&a>1) {
				System.out.print(i+"^"+count+" * ");
			}
			if(count==1&&a==1) {
				System.out.print(i);
			}
			if(count==1&&a>1) {
				System.out.print(i+" * ");
			}
			
		} 
		
			System.out.println();
		}
	}
		
		
		

} 
