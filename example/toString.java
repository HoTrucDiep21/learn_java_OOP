public class toString {
    int rollno;
    String name;
    String city;

    public toString(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }
    

    @Override
    public String toString() {
        return "toString [city= " + city + ", name= " + name + ", rollno= " + rollno + "]";
    }


    public static void main(String[] args) {
        toString student1 = new toString(1, "Lewiss Dang", "Quang Ngai");

        System.out.println(student1);
    }
}