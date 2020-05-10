public class PrintInfo {
    private Number number;

    public PrintInfo(Number number) {
        this.number = number;
    }


    public void printNumber(){
        if (number != null){
            System.out.println("Value: " + number.getValue());
            System.out.print("Parity: ");
            if (number.getParity() == Parity.EVEN){
                System.out.println("even");
            }
            if (number.getParity() == Parity.ODD){
                System.out.println("odd");
            }
            if (number.getValue() == 0){
                printNull();
            }
            if (number.getValue() == 1){
                printNull();
            }
            System.out.print("Number is a ");
            if (number.getPrimeAndCompaund() == PrimeAndCompaund.COMPAUND){
                System.out.println("prime");
            }else{
                System.out.println("compaund");
            }
        }
        else {
            System.out.println("Please check the correctness of the entered number. The number must be an integer");
        }

    }

    private void printNull(){
        System.out.println("zero is not a natural number");
    }

    private void printOne(){
        System.out.println("one is neither simple nor compound");
    }
}
