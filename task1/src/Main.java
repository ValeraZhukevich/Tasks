import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            try {
                int numberValue = Integer.parseInt(in.nextLine());
                NumberService numberService = new NumberService();
                Number number = numberService.getNumber(numberValue);
                PrintInfo printInfo = new PrintInfo(number);
                printInfo.printNumber();
            } catch (NumberFormatException | NullPointerException nfe) {
                System.out.println("Please check the correctness of the entered number. The number must be an integer");
            }
        }

    }
}
