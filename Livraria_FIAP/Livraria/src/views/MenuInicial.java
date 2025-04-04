package views;

import java.util.Scanner;

public class MenuInicial {

    public void menuExibir() {
        System.out.println("=== Menu ===");

        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("1 - views.Supermercado");
            int escolher = entrada.nextInt();
            entrada.nextLine();
            switch (escolher) {
                case 1:
                    Supermercado mercado = new Supermercado();
                    mercado.teste();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
            }


        } while (true);











    }

}
