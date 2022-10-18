import java.util.Scanner;

public abstract class animal {
    String name, foodType;

    public animal() {
    }

    public animal(String name, String foodType) {
        this.name = name;
        this.foodType = foodType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void running() {
        System.out.println("Annimal is running");
    }

    // public void showSound() {
    //     System.out.println("Animal showSoud");
    // }
    public abstract void amThanh();
}
