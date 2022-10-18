

public class extend {
    public static void main(String[] args) {
        programer p = new programer();
        System.out.println("programer salary is = " + p.salary);
        System.out.println("Bonus is programer = "+ p.bonus);
    }
   
}

class employee(){
      float salary = 10000;          
}
 
class programer extends employee{
    float bonus = 15000;
}

@Override
public String toString() {
    return "employee []";
}
