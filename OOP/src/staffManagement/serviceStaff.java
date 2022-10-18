package staffManagement;

import java.util.Scanner;

public class serviceStaff extends cadres {
    String workType;

    public serviceStaff() {

    }

    public serviceStaff(String name, String dateOfBirth, String sex, String address, String workType) {
        super(name, dateOfBirth, sex, address);
        this.workType = workType;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Work Type: " + workType;
    }
    @Override
    public void inPut() {
        // TODO Auto-generated method stub
        super.inPut();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input work Type: ");
        workType = sc.nextLine();
    }
    



   
    
}
