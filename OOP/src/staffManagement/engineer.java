package staffManagement;

import java.util.Scanner;

public class engineer extends cadres {
    String field;

    public engineer() {
        
    }

    public engineer(String name, String dateOfBirth, String sex, String address, String field) {
        super(name, dateOfBirth, sex, address);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
    @Override
    public String toString() {

        return super.toString() + "Field: " + field;
    }
    @Override
    public void inPut() {
        
        super.inPut();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input field of Engineer: ");
        field = sc.nextLine();
        
    }
    

    

    
}
