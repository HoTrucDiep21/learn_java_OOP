package staffManagement;

import java.util.Scanner;

public class cadres {
    String name, dateOfBirth, sex, address;

    public cadres() {
    }

    public cadres(String name, String dateOfBirth, String sex, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "cadres [name = " + name + ", dateOfBirth=" + dateOfBirth + ", sex =" + sex + ", address =" + address + "]";
    }

    public void disPlay() {
        System.out.println(this);
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        name = sc.nextLine();
        System.out.println("Input date of birth: ");
        dateOfBirth = sc.nextLine();
        System.out.println("Sex: ");
        sex = sc.nextLine();
        System.out.println("Address: ");
        address = sc.nextLine();
    }

    /**
     *
     */
   
}
