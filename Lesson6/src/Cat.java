public class Cat extends Animal {
    private int maxRunDistance = 200;
    private double maxJumpHeight = 2;
    private int maxSwimDistance = 0;

    @Override
    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public void setMaxJumpHeight(double maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    @Override
    public void setMaxSwimDistance(int maxSwimDistance) {
        this.maxSwimDistance = maxSwimDistance;
    }

    private Cat() {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
    }

    @Override
    public void run(int a) {
        super.run(a);
    }

    @Override
    public void jump(double b) {
        super.jump(b);
    }

    @Override
    public void swim(int d) {
        super.swim(d);
    }

    public static void main(String[] args) {
        Cat cat1;
        cat1 = new Cat();
        cat1.run(300);
        cat1.run(150);
        cat1.jump(1.5);
        cat1.swim(1);

    }
}
