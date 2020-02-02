public class Dog extends Animal {

    private int maxRunDistance = 500;
    private double maxJumpHeight = 0.5;
    private int maxSwimDistance = 10;

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

    private Dog() {
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
        Dog dog1;
        dog1 = new Dog();
        dog1.run(300);
        dog1.run(600);
        dog1.jump(1.5);
        dog1.swim(1);

    }
}
