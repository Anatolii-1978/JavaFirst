package CatEating;

import com.sun.jdi.IntegerValue;

import java.util.Random;

public class Plate {
    public int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }



    public void foodDecrease(int n){
       this.food-=n;
    }

    public void plateInfo (){
        System.out.print(this);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public void foodAdd() {
        this.food= food+(int)(Math.random()*100);
    }
}
