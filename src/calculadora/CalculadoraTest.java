package calculadora;

import java.util.Scanner;

public class CalculadoraTest {

    static int a;
    static int b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var calculadora = new CalculadoraImpl();
        boolean salir = false;
        do {
            calculadora.menu();
            int opt = sc.nextInt();

            switch (opt) {
                case 1: {//Operacion Suma
                    System.out.println("Introduce el primer valor a calcular");
                    a = sc.nextInt();
                    System.out.println("Introduce el segundo valor a calcular");
                    b = sc.nextInt();
                    System.out.println("Resultado " + calculadora.suma(a, b));
                    break;
                }
                case 2: {//Operacion Resta
                    System.out.println("Introduce el primer valor a calcular");
                    a = sc.nextInt();
                    System.out.println("Introduce el segundo valor a calcular");
                    b = sc.nextInt();
                    System.out.println("Resultado " + calculadora.resta(a, b));
                    break;
                }
                case 3: {//Operacion Multiplicacion
                    System.out.println("Introduce el primer valor a calcular");
                    a = sc.nextInt();
                    System.out.println("Introduce el segundo valor a calcular");
                    b = sc.nextInt();
                    System.out.println("Resultado " + calculadora.multiplicacion(a, b));
                    break;
                }
                case 4: {//Operacion Division
                    System.out.println("Introduce el primer valor a calcular");
                    a = sc.nextInt();
                    System.out.println("Introduce el segundo valor a calcular");
                    b = sc.nextInt();
                    System.out.println("Resultado " + calculadora.divicion(a, b));
                    break;
                }
                case 5: {//Operacion Potencia
                    System.out.println("Introduce la base");
                    a = sc.nextInt();
                    System.out.println("Introduce el exponente");
                    b = sc.nextInt();
                    System.out.println("Resultado " + calculadora.potencia(a, b));
                    break;
                }
                case 6: {//Operacion Raiz Cuadrada
                    System.out.println("Introduce el valor a radicar");
                    a = sc.nextInt();
                    System.out.println("Resultado " + calculadora.raizCuadrada(a));
                    break;
                }
                case 7: {
                    System.out.println("Esta saliendo del programa");
                    
                    salir = true;
                    break;
                }
                case 8:{
                    System.out.println("Porciento");
                    System.out.println("Introduce la base");
                    a = sc.nextInt();
                    System.out.println("Introduce el exponente");
                    b = sc.nextInt();
                    System.out.println(calculadora.porCiento(a, b));
                }
                default: {//Opcion no valida
                    System.out.println("Consulta no valida intente de nuevo");
                    break;
                }
            }
        } while (salir == false);

    }
}
