import java.util.Scanner;
public class InToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Please Enter Integer Value");
				int integer = input.nextInt();
		
		
		String string;
		
		
		string = String.valueOf(integer);
		
		System.out.println("String Result : "  + string);
		

		input.close();
	}

}