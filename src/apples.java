import java.util.Scanner;
public class apples {
	
public static void main(String args[]) {
	Scanner chady = new Scanner(System.in);
	double fnum, snum, answer;
	
	System.out.println("Enter first number: ");
	fnum = chady.nextDouble();
	
	System.out.println("Enter second number: ");
	snum = chady.nextDouble();
	
	answer = fnum + snum;
	System.out.println(answer);
}

}
