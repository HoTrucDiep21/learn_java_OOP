public class thisKeyWord {
    int id;
    String name;

    
    thisKeyWord() {
        System.out.println("Goi constructor mac dinh");
    }

    public thisKeyWord(int i, String n) {
        this();
        id = i;
        name = n;
    }
    public void display() {
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        thisKeyWord tkw = new thisKeyWord(111, "Lewiss");
        thisKeyWord tkw2 = new thisKeyWord(222, "Dang");

        tkw.display();
        tkw2.display();

    }
}
