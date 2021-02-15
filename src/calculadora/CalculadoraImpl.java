
package calculadora;


public class CalculadoraImpl implements CalculadoraInterfaz{

    @Override
    public void menu() {
        System.out.println("Ejercicio Calculadora");
        System.out.println("1-Operacion Sumar");
        System.out.println("2-Operacion Restar");
        System.out.println("3-Operacion Multiplicar");
        System.out.println("4-Operacion Dividir");
        System.out.println("5-Operacion Potencia");
        System.out.println("6-Operacion Raiz Cuadrada");
    }

    @Override
    public double suma(int a, int b) {
        return a+b;
    }

    @Override
    public double resta(int a, int b) {
        return a-b;
    }

    @Override
    public double multiplicacion(int a, int b) {
        return a*b;
    }

    @Override
    public double divicion(int a, int b) {
        return a/b;
    }

    @Override
    public double potencia(int a, int b) {
        return Math.pow(a, b);
    }

    @Override
    public double raizCuadrada(int a) {
        return Math.sqrt(a);
    }

    @Override
    public double porCiento(double a, double b) {
        double resultado=a*b/100;
        return resultado;
    }
    
    
}
