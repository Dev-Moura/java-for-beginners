package cap2;
// Demonstra o escopo de bloco
public class ScopeDemo {
    public static void main(String[] args) {
        int x; //conhecida pelo código dentro de main()

        x = 10;
        if ( x == 10) { //inicia novo escopo

            int y = 20; // conhecida apenas no bloco

            // tanto x quanto y são conhecido aqui.
            System.out.println( "x and y: " + x + " " + y );
            x = y * 2;
        }
        // y = 100; // Erro! Y não é conhecido aqui

        // x ainda é conhecido aqui.
        System.out.println("x is " + x);
    }    
}
