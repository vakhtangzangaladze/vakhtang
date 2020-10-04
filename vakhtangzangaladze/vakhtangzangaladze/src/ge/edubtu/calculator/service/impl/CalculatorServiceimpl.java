import java.util.Scanner;

public class CalculatorServicelmpl {

    public static void main(String[] args) {

        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("პირველი რიცხვი:");


        num1 = scanner.nextDouble();
        System.out.print("მეორე რიცხვი:");
        num2 = scanner.nextDouble();

        System.out.print("შეიყვენეთ ოპერატორი (+, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;

            case '/':
                output = num1 / num2;
                break;

            default:
                System.out.printf("ოპერატორი არასწორია");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}
