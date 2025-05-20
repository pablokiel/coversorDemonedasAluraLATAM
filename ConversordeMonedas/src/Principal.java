import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner introduce = new Scanner(System.in);
        int opcion = 0;
        double cantidad = 0;

        while (opcion != 7) {

            System.out.println("***************************************");
            System.out.println("Sea Bienvenido al conversor de monedas");
            System.out.println("***************************************\n");
            System.out.println("Por favor escoja la operaciòn que quiere realizar\nConvertir de: \n");
            System.out.println("1) Dolar a Peso Argentino");
            System.out.println("2) Peso Argentino a Dolar");
            System.out.println("3) Dolar a Real Brasileño");
            System.out.println("4) Real Brasileño a Dolar");
            System.out.println("5) Dolar a Peso Mexicano");
            System.out.println("6) Peso Mexicano a Dolar");
            System.out.println("7) Salir\n");
            System.out.println("**************************************\n");
            System.out.println("Elija una opcion");

            try {


                String direccion = "https://v6.exchangerate-api.com/v6/e2a19d36011125e680507af6/pair/";
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();
//                   HttpResponse<String> response = client
//                            .send(request, HttpResponse.BodyHandlers.ofString());


                opcion = introduce.nextInt();


                switch (opcion) {

                    // siglas que se usan USD  MXN  ARS  BRL
                    case 1:
                        System.out.println("Introduce la cantidad de Dolares que quieres convertir a Pesos Argentinos");
                        cantidad = introduce.nextDouble();


                        direccion = direccion+"/USD/ARS/"+cantidad;

                        System.out.println(cantidad+" USD son: "+" ARS");
                        break;
                    case 2:
                        System.out.println("Introduce la cantidad de Pesos Argentinos que quieres convertir a Dolares");
                        cantidad = introduce.nextDouble();


                        direccion = direccion+"/ARS/USD/"+cantidad;

                        System.out.println(cantidad+" ARS son: "+ " USD");
                        break;
                    case 3:
                        System.out.println("Introduce la cantidad de Dolares que quieres convertir a Reales Brasileños");
                        cantidad = introduce.nextDouble();


                        direccion = direccion+"/USD/BRL/"+cantidad;

                        System.out.println(cantidad+" USD son: "+" BRL");
                        break;
                    case 4:
                        System.out.println("Introduce la cantidad de Reales Brasileños que quieres convertir a Dolares");
                        cantidad = introduce.nextDouble();


                        direccion = direccion+"/BRL/USD/"+cantidad;

                        System.out.println(cantidad+" BRL son: "+ " USD");
                        break;
                    case 5:
                        System.out.println("Introduce la cantidad de Dolares que quieres convertir a Pesos Mexicanos");
                        cantidad = introduce.nextDouble();


                        direccion = direccion+"/USD/MXN/"+cantidad;

                        System.out.println(cantidad+" USD son: "+ " MXN");
                        break;
                    case 6:
                        System.out.println("Introduce la cantidad de Pesos Mexicanos que quieres convertir a Dolares");
                        cantidad = introduce.nextDouble();


                        direccion = direccion+"/MXN/USD/"+cantidad;

                        System.out.println(cantidad+" MXN son: "+ " USD");
                        break;
                    case 7:
                        System.out.println("Hasta Luego");
                        break;

                    default:
                        System.out.println("\n¡Opción no válida! Por favor, elige un número del 1 al 7.");

                }

            } catch (Exception e) {

                System.out.println("\nError: Debes ingresar un número válido. Intenta de nuevo\n");
                introduce.nextLine();


            }
        }
    }
}