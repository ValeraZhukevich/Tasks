import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.print("Input amount of numbers: ");
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        if (Integer.parseInt(number) > 100){
            System.out.println("Number of digits should be less or equal 100");
        }
        System.out.print("Input sequence of numbers: ");
        String sequance = in.nextLine();
        if (sequance.length() < Integer.parseInt(number)){
            System.out.println("You should enter " + number + "of digits");
        }
        if (sequance.length() > Integer.parseInt(number) ){
            sequance = sequance.substring(0,100);
        }
        PalindromeService palindromeService = new PalindromeService(sequance);

        for (String digit : palindromeService.palindromes){
            System.out.println(digit);
        }



    }
}
