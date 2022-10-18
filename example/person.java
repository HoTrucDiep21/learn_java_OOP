public class person {
    String name;
    int age;
    String address;
    

    public person() {
    }
    


    public person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
public static void main(String[] args) {
    student std = new student();
    std.address("Tra Tan");

    System.out.println(std);
}


    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public String getAddress() {
        return address;
    }



    public void setAddress(String address) {
        this.address = address;
    }



    public void sleep() {
        System.out.println("can sleep");
    }

    public void eatting() {
        System.out.println("can eatting");
    }
}
