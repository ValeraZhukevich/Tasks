import java.util.ArrayList;
import java.util.List;

public class BackPack {
    private int loadWeight;
    private  int currentWeight;
    private List<Item> items;


    public BackPack(int weight) {
        this.loadWeight = weight;
        this.currentWeight = 0;
        items = new ArrayList<>();
    }

    public int getLoadWeight() {
        return loadWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public List<Item> getItems() {
        return items;
    }

    public boolean addItem(Item item){
        if (item.getWeight() <= loadWeight - currentWeight){
            items.add(item);
            currentWeight += item.getWeight();
            return true;
        }
        return false;
    }
}
