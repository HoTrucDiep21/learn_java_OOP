public class cat extends animal {
    String color;

    public cat() {

    }
    

    public cat(String color) {
        this.color = color;
    }


    public cat(String name, String foodType, String color) {
        super(name, foodType);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showSound() {
        System.out.println("Cat - meo meo....");
    }


    @Override
    public void amThanh() {
        System.out.println("Sua gau gau....");
        
    }

    // @Override
    // public void running() {
    //    System.out.println("Cat is running");
    // }
    

  
}
