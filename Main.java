import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Input length: ");
		double length = input.nextDouble();
		input.nextLine();
		System.out.print("Input width: ");
		double width = input.nextDouble();
		input.close();
		
		double area = length * width;
		double perimeter = 2 * length + 2 * width;
		double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
		
		System.out.printf("Area: %.2f", area);
		System.out.printf("\nPerimeter: %.2f", perimeter);
		System.out.printf("\nDiagonal: %.2f", diagonal);

	}

}
