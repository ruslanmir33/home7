package dogs;

public class MainClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Timka");
        Dog dog2 = new Dog("Tuzik");

        Ball ball = new Ball("Red");
        Ball ball2 = new Ball("Black");

        dog1.play(ball);
        dog1.stop();
        dog2.play(ball);
        dog2.play(ball2);
    }
}
