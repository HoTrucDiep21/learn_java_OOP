package part17_QLNV;



import java.util.Scanner;

public class employee {
    
    String name, sex, address, position, salary;

    public employee() {
    }

    public employee(String name, String sex, String address, String position, String salary) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        name = sc.nextLine();
        System.out.println("Sex: ");
        sex = sc.nextLine();
        System.out.println("Address: ");
        address = sc.nextLine();
        System.out.println("Position: ");
        position = sc.nextLine();
        System.out.println("input salary: ");
        salary = sc.nextLine();
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Sex: " + this.sex);
        System.out.println("Address: " + this.address);
        System.out.println("Position: " + this.position);
        System.out.println("Salary: "+this.salary);
    }

}


