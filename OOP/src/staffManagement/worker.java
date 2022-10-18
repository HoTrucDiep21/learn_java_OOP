package staffManagement;

import java.util.Scanner;

public class worker extends cadres {
    public static final int RANK_MAX = 7;
    int rank;// -> 1->7

    public worker() {
    }

    public worker(String name, String dateOfBirth, String sex, String address, int rank) {
        super(name, dateOfBirth, sex, address);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + "rank = " + rank;
    }

    @Override
    public void inPut() {

        super.inPut();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Rank of Worker: ");
        rank = Integer.parseInt(sc.nextLine());
    }

   
    

}
