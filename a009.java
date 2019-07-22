import java.util.Scanner;
public class a003 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	String a;
	int b;
	while(scanner.hasNext()) {
		a = scanner.nextLine();
		b = a.length();
		for( int i=0 ; i<b ; i++) {        
			char s =(char)(a.charAt(i)-7); //將字串a逐字-7
			System.out.print(s);           //逐字輸出
		}
		System.out.println();              //解碼後換行
	}

}
}
