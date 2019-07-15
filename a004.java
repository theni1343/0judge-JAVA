import java.util.Scanner;

public class a003{
	public static void main(String[] args) {
		
		int y;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()){
		
		y=scanner.nextInt();
		
		if(y%4==0 &&  y%100!=0 || y%400==0 )
		System.out.println("閏年");
		 
		else
		System.out.println("平年");
		 
		
		}
		scanner.close();
	}
}
