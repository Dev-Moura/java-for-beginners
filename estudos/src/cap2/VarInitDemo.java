package cap2;

// Demonstra o tempo de via de uma variável
public class VarInitDemo {
    public static void main(String[] args) {
        int x;

        for ( x = 0; x < 3; x++){
            int y = -1; // y será incializada sempre que entrarmos no bloco
            System.out.println("y is " + y); // essa linha sempre exibe -1
            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}
