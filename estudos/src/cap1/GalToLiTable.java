package cap1;

public class GalToLiTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // converte para litros
            System.out.println(gallons + " gallons is " + liters + " liters.");

            counter++;
            // a cada décima linha, exibe ma linha em branco
            if (counter == 10) {
                System.out.println();
                counter = 0; // zera o contador de linha
            }

        }

    }
}
