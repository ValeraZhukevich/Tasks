public class NodNokService {
    private int number1;
    private int number2;
    private int nod;
    private int nok;

    public NodNokService(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }



    public int findNod(){
        int currentNod = 1;
        int minNumber = Math.min(number1, number2);

        for (int i = 1; i < minNumber; i++){
            if(number1 % i == 0 && number2 % i == 0){
                currentNod = i;
            }
        }
        nod = currentNod;
        return nod;
    }

    public int findNok(){
        if (nod == 0){
            findNod();
        }
        return number1*number2/nod;
    }


}
