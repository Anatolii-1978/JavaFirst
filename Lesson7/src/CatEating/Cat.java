package CatEating;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eating(Plate plate) {
        if (appetite <= plate.getFood()&& this.satiety==false){
            plate.foodDecrease(appetite);
            this.setSatiety(true);
        }else if (appetite > plate.getFood()){
            plate.foodAdd();
            if(this.satiety==false){
                plate.foodDecrease(appetite);
                this.setSatiety(true);
            }

        }

        }

    }
