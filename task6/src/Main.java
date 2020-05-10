import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        System.out.print("Input a load weight of backpack, kg: ");
        Scanner in = new Scanner(System.in);
        BackPack backPack = new BackPack(Integer.parseInt(in.nextLine()));
        while (true){
            Item item = new Item();
            System.out.println("Input parameters of items");
            System.out.print("Input a name: ");
            String name = in.nextLine();
            item.setName(name);
            System.out.print("Input a weight of item, kg: ");
            item.setWeight(Integer.parseInt(in.nextLine()));
            System.out.print("Input a price of item: ");
            item.setWeight(Integer.parseInt(in.nextLine()));
            items.add(item);

            System.out.print("If you want to stop enter the world stop, else - any key: ");
            String word = in.nextLine().toLowerCase();
            if (word.equals("stop")){
                break;
            }
        }
        PackBackpackService packBackpackService = new PackBackpackService(backPack, items);

    }
}
