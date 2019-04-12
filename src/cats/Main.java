package cats;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska");


        Plate plate1 = new Plate(100);
        System.out.println(plate1);
        Plate plate2 = new Plate(24);
        System.out.println(plate2);


//        cat1.eat(plate1);
//        System.out.println(cat1);
//        cat1.eat(plate2);
//        System.out.println(cat1);
//        System.out.println(plate1);
//        System.out.println(plate2);


        Cat[] cats = {new Cat("Fedy"),
                new Cat("Murzik"),
                new Cat("Boris")};

        for (Cat cotyra :cats) {
            if (!cotyra.eat(plate2)){
                plate2.loadFood(34);
                System.out.println(plate2);
                cotyra.eat(plate2);
            }
        }


        System.out.println(plate2);
        plate2.loadFood(35);
        System.out.println(plate2);

    }
}
