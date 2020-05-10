public class PrintBackpuckInfo {
    private BackPack backPack;
    private int price = 0;

    public PrintBackpuckInfo(BackPack backPack) {
        this.backPack = backPack;
    }

    public void printInfo(){
        System.out.println("Load weight:" + backPack.getLoadWeight());
        System.out.println("Current loaded weight: " + backPack.getCurrentWeight());
        for (Item item : backPack.getItems()){
            price += item.getPrice();
        }
        System.out.println("Total price of loaded items: " + price);
    }
}
