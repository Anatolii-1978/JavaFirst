public class Animal {
    private int maxRunDistance;
    private double maxJumpHeight;
    private int maxSwimDistance;

    public Animal(int maxRunDistance, double maxJumpHeight, int maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
    }

    public Animal() {
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(double maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public void setMaxSwimDistance(int maxSwimDistance) {
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int a){
        if (a<=getMaxRunDistance()){
            System.out.println("run: true");
        }
        else {
            System.out.println("run: false");
        }
    }

    public void jump(double b){
        if (b<=getMaxJumpHeight ()){
            System.out.println("run: true");
        }
        else {
            System.out.println("run: false");
        }

    }
    public void swim(int d){
        if (d<=getMaxSwimDistance()){
            System.out.println("run: true");
        }
        else {
            System.out.println("run: false");
        }

    }


}

