public class Main {
    public static void main(String[] args) {
        Live house1 = new House("House","alatoo 1",10);
        Livable dormitory1 = new Dormitory("Dormitory","Jayil baatyr 12",30);
        Dormitory dormitory2 = new Dormitory("Dormitory2","Aitmatov 35",35);
        Flat flat1 = new Flat("Flat","ALa archa 23",5);
        house1.pay();
        house1.live();
        flat1.live();
        dormitory2.live();
        dormitory1.pay();
        house1.liveAt();
        dormitory2.liveAt();
        System.out.println(house1);
    }
}