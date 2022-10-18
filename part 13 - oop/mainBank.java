public class mainBank {
    public static void main(String[] args) {
        bank b;
        b = new hdBank();
        
        System.out.println("get rate of interest " + b.getRateOfInterest());
        b = new mbBank();

     

        System.out.println("get rate of interest "+b.getRateOfInterest());
    }
}
