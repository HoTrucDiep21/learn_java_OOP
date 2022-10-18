package part17_QLNV;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class StudenMark {
    static List<StudenMark> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {
        int choose;
        do {
            menu();
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("Input the number of student to add: ");

                    int n = sc.nextInt();
                    for (int i = 1; i < n; i++) {
                        StudenMark st = new StudenMark();
                        st.input();
                        studentList.add(st);
                    }

                    break;
                case 2:
                    System.out.println("Highest mark: ");
                    int max = 0;
                    for (StudenMark st : studentList  ) {
                        if (max < st.getMark()) {
                            max = st.getMark();
                        }
                    }
                    display();
                          

                    break;
                case 3:
                    for (StudenMark st : studentList) {
                        display();
                    }

                    break;
                case 0:
                    break;

                default:
                    break;
            }

        } while (choose != 0);

    }

    static String rollno;
    static String name;
    static String classRoom;
    static String subject;
    static int mark;

    public StudenMark() {
    }

    public StudenMark(String rollno, String name, String classRoom, String subject, int mark) {
        this.rollno = rollno;
        this.name = name;
        this.classRoom = classRoom;
        this.subject = subject;
        this.mark = mark;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;

        } else {
            System.out.println("Mark incorect!!!");
        }

    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input rollno: ");
        rollno = sc.nextLine();
        System.out.println("Input name: ");
        name = sc.nextLine();
        System.out.println("Input class: ");
        classRoom = sc.nextLine();
        System.out.println("Input Subject: ");
        subject = sc.nextLine();
        System.out.println("Input mark: ");
        mark = sc.nextInt();
    }

    public static void display() {

        System.out.println("rollno: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Class: " + classRoom);
        System.out.println("Subject: " + subject);
        System.out.println("Mark: " + mark);
    }

   

    public static void menu() {
        System.out.println("1. Input information for Student");
        System.out.println("2. Show highest mark");
        System.out.println("3. Show List");
        System.out.println("0. Exit!!!");
        System.out.println("Input choose: ");
    }

}
