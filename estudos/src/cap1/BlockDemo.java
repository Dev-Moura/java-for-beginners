package cap1;

public class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;

        i = 5;
        j = 10;

        // o alvo desta instrução if é um blco código
        if ( i != 0 ) {
            System.out.println("i does not equal zero");
            
            d = j / i;

            System.out.println("j / i is " + d);
        }
    }

}
