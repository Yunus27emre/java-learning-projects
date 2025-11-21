import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("What will you do? \n1-Toplama"
				+ "\n2-Çıkarma"
				+ "\n3-Çarpma"
				+ "\n4-Bölme");
		int islem=scan.nextInt();
		System.out.print("Enter 2 numbers:");
		int number1=scan.nextInt();
		System.out.print("Second:");
		int number2=scan.nextInt();
		scan.close();
		switch (islem) {
		case 1:
			System.out.println("Result:"+(number1+number2));
			break;
		case 2:
			System.out.println("Result:"+(number1-number2));
			break;
		case 3:
			System.out.println("Result:"+(number1*number2));
			break;
		case 4:
			if(number2!=0){
			System.out.println("Result:"+(number1/number2));
			}else System.out.println("Wrong number.");
		break;
		default:
			System.out.println("Wrong choice.");
		}
		
	}

}
