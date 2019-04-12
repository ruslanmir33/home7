package cats;

public class Cat {
    private String name;
    private boolean satisfied;

    public Cat(String name) {
        this.name = name;
        satisfied = false;

    }

    public boolean eat(Plate plate){
        if (plate.decreaseFood(10)) {
            System.out.println(name + " eat...");
            satisfied = true;
            return true;
        } else {
            System.out.println(name + " no eat((");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void  fear(Dog dog){
        System.out.println(name + " испугалась " + dog.getName());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satisfied=" + satisfied +
                '}';
    }
}



