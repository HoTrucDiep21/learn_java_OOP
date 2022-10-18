public class dog extends animal {
    String dogType;

    public dog() {
        
    }

    public dog(String dogType) {
        this.dogType = dogType;
    }

    

    public dog(String name, String foodType, String dogType) {
        super(name, foodType);
        this.dogType = dogType;
    }

    
    public void showSound() {
        System.out.println("Dog - gau gau....");
    }

    @Override
    public void amThanh() {
        System.out.println("Keu meo meo...");
        
    }
    

    

}
