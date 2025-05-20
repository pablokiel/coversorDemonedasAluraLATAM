import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

            Scanner introduce = new Scanner(System.in);
            int opcion = 0;

            while (opcion != 7) {

                System.out.println("***************************************");
                System.out.println("Sea Bienvenido al conversor de monedas");
                System.out.println("***************************************\n");
                System.out.println("Por favor escoja la operaciòn que quiere realizar\nConvertir de: \n");
                System.out.println("1) Dolar a Peso Argentino");
                System.out.println("2) Peso Argentino a Dolar");
                System.out.println("3) Dolar a Real Brasileño");
                System.out.println("4) Real Brasileño a Dolar");
                System.out.println("5) Dolar a Peso Columbiano");
                System.out.println("6) Peso Columbiano a Dolar");
                System.out.println("7) Salir\n");
                System.out.println("**************************************\n");
                System.out.println("Elija una opcion");

                try {
                    opcion = introduce.nextInt();
                    introduce.close();

                    switch (opcion) {
                        case 1:
                            System.out.println("Opcion 1");
                            break;
                        case 2:
                            System.out.println("Opcion 2");
                            break;
                        case 3:
                            System.out.println("Opcion 3");
                            break;
                        case 4:
                            System.out.println("Opcion 4");
                            break;
                        case 5:
                            System.out.println("Opcion 5");
                            break;
                        case 6:
                            System.out.println("Opcion 6");
                            break;
                        case 7:
                            System.out.println("Opcion 7");
                            break;

                        default:
                            System.out.println("\n¡Opción no válida! Por favor, elige un número del 1 al 7.");

                    }
                }catch (Exception e) {

                    System.out.println("\nError: Debes ingresar un número entero válido.\n");
                    introduce.nextLine();

            }
            System.out.println("El programa ha fallado");
        }
    }
}
