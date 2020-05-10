import java.util.ArrayList;
import java.util.List;

public class PackBackpackService {
    private BackPack backPack;
    private List<Item> items;

    public PackBackpackService(BackPack backPack, List<Item> items) {
        this.backPack = backPack;
        this.items = items;
    }

    public BackPack puck(){
        UnitPriceComparator unitPriceComparator = new UnitPriceComparator();
        items.sort(unitPriceComparator);
        for (Item item : items){
            System.out.println(item);
            backPack.addItem(item);
        }
        return backPack;
    }
}
