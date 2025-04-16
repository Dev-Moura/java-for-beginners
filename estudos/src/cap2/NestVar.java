package cap2;
/*
    Este programa tenta declara uma variável em
    um escopo interno com o memso nome de uma
    definida em um escopo externo.
    
    *** Este programa não será compilado. *** 
*/
public class NestVar {
    public static void main(String[] args) {
        int count;
        
        for ( count = 0; count < 10; count++) {
            System.out.println("This is count " + count);

            int count; // inválido!!!
            for ( count = 0; count < 2; count++)
                System.out.println("This program is in error!");
        }
    }
}
