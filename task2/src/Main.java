import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true){
            System.out.print("Input two numbers: ");
            Scanner in = new Scanner(System.in);


            try {

                int number1 = Integer.parseInt(in.nextLine());
                int number2 = Integer.parseInt(in.nextLine());
                NodNokService nodNokService = new NodNokService(number1, number2);
                System.out.println("greatest common factor: " + nodNokService.findNod());
                System.out.println("least common multiple: " + nodNokService.findNok());


            } catch (NumberFormatException | NullPointerException nfe) {
                System.out.println("Please check the correctness of the entered number. The number must be an integer and natural");
            }


        }


    }


}
