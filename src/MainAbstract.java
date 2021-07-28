abstract class Subject {

    abstract public void display();

}

class History extends Subject{

    @Override
    public void display() {
        System.out.println("Welcome to the History class!");
    }
}
public class MainAbstract{
    public static void main(String[] args) {
        Subject WorldHistory = new History();
        WorldHistory.display();
    }
}














