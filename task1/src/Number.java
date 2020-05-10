public class Number {

    private int value;
    private Parity parity;
    private PrimeAndCompaund primeAndCompaund;

    public Number() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Parity getParity() {
        return parity;
    }

    public void setParity(Parity parity) {
        this.parity = parity;
    }

    public PrimeAndCompaund getPrimeAndCompaund() {
        return primeAndCompaund;
    }

    public void setPrimeAndCompaund(PrimeAndCompaund primeAndCompaund) {
        this.primeAndCompaund = primeAndCompaund;
    }
}
