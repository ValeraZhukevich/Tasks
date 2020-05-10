import java.util.List;

public class PackBackpackService {
    private BackPack backPack;
    private List<Item> items;

    public PackBackpackService(BackPack backPack, List<Item> items) {
        this.backPack = backPack;
        this.items = items;
    }
}
