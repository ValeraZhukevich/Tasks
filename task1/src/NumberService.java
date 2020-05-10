public class NumberService {
    private int numberValue;
    private Number number;


    private void findParity(){
        if (numberValue % 2 == 0){
            number.setParity(Parity.EVEN);
        }else {
            number.setParity(Parity.ODD);
        }
    }

    private void findPrimeOrCompaund(){
        if (number.getValue() == 1){
            number.setPrimeAndCompaund(PrimeAndCompaund.ONE);
        }
        if (number.getValue() == 0){
            number.setPrimeAndCompaund(PrimeAndCompaund.NULL);
        }
        if (number.getParity() == Parity.EVEN){
            if (number.getValue() == 2){
                number.setPrimeAndCompaund(PrimeAndCompaund.PRIME);
            }else{
                number.setPrimeAndCompaund(PrimeAndCompaund.COMPAUND);
            }
        }else{
            number.setPrimeAndCompaund(PrimeAndCompaund.PRIME);
            for (int i = 2; i < numberValue; i++){
                if(numberValue % i == 0){
                    number.setPrimeAndCompaund(PrimeAndCompaund.COMPAUND);
                }
            }
        }
    }

    private void checkNumber(){
        if (numberValue == (int)numberValue){
            number.setValue(numberValue);
            findParity();
            findPrimeOrCompaund();
        }
    }

    public Number getNumber(int numberValue){
        this.numberValue = numberValue;
        number = new Number();
        checkNumber();
        return number;
    }
}
