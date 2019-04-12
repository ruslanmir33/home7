package cats;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food < amount) {
            return false;
        } else {
            food -= amount;
            return true;

        }

    }

    public void loadFood(int r){
        food += r;
    }


}
