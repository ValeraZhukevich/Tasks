import java.util.Comparator;

public class UnitPriceComparator implements Comparator<Item> {

    public int compare(Item a, Item b){

        if(a.getPrice()/a.getWeight() > b.getPrice()/b.getWeight())
            return -1;
        else if(a.getPrice()/a.getWeight() > b.getPrice()/b.getWeight())
            return 1;
        else
            return 0;
    }
}
