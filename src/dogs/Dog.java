package dogs;

public class Dog {
    private String name;
    private Ball ball; //null red

    public Dog(String name) {
        this.name = name;
    }

    public void play(Ball b) {
        if (ball == b){
            System.out.println(" уже играем ");
            return;
        }

        if (!b.isBusy()) {
            if (ball != null){
                stop();
            }
            System.out.println(name + " играт с " + b.getColor());
            b.setBusy(true);
            ball = b;
        } else {
            System.out.println(name + " не возможно играть(( ");
        }

    }

    public void stop() {
        if (ball != null) {
            System.out.println(name + " перестал играть с мячём ");
            ball.setBusy(false);
            ball = null;
        }else  {
            System.out.println(name + " : мы же не играем!");
        }


    }
}
