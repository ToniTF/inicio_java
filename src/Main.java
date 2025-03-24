import com.formacom.Numeros;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuseleccionado;
        String menu= """
                1. Nuevo alumno
                2. Listar alumnos
                ...
                10. Salir
                """;
        do{
            System.out.println(menu);
            menuseleccionado=scanner.nextInt();
            switch (menuseleccionado){
                case 1:
                    System.out.println("Nuevo alumno");
                    break;
                case 2:
                    System.out.println("Listar alumnos");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(scanner.nextInt()!=10);


        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        Numeros listaNumeros = new Numeros(numeros);

        System.out.println("El número mínimo es: " + listaNumeros.min());
        System.out.println("El número máximo es: " + listaNumeros.max());
        System.out.println("Números pares: " + listaNumeros.getPares());
        System.out.println("Números impares: " + listaNumeros.getImpares());


        scanner.close();
    }
}