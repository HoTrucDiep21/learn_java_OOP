package part17_QLNV;

public class main {
    public static void main(String[] args) {
        employee em1 = new employee();
        em1.input();
        employee em2 = new employee("Lewiss Dang", "Male", "Quang Ngai", "CEO", "2000");
        
        em1.display();
        em2.display();
    }
}
