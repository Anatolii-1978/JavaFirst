package CatEating;

public class Eating {
    public static void main(String[] args) {
        Plate plate = new Plate(15);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsuk", 20);
        cats[1] = new Cat("Vaska", 15);
        cats[2] = new Cat("Murzik", 10);
        cats[3] = new Cat("Kartuz", 25);
        cats[4] = new Cat("Pushok", 30);

        System.out.println("СОСТОЯНИЕ КОТОВ ДО КОРМЛЕНИЯ");
        System.out.println("в процессе кормления корм подается в тарелку атоматически");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName() + " ; " + cats[i].getAppetite() + " ; " + cats[i].isSatiety());
        }
        plate.plateInfo();

        for (int i = 0; i < cats.length; i++) {
            cats[i].eating(plate);
        }

        System.out.println();
        System.out.println();
        System.out.println("СОСТОЯНИЕ КОТОВ ПОСЛЕ КОРМЛЕНИЯ");
        System.out.println("---------------------------------------------------------------------------------------");

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName() + " ; " + cats[i].getAppetite() + " ; " + cats[i].isSatiety());
        }
        plate.plateInfo();
    }
}

