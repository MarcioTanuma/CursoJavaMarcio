public class Calculadora {

    double entrada1;
    String operadorLogico;
    double entrada2;
    double resultado;

    public void calcular() {
        if (operadorLogico.equals("+")) {
            resultado = entrada1 + entrada2;
        } else if (operadorLogico.equals("-")) {
            resultado = entrada1 - entrada2;
        } else if (operadorLogico.equals("*")) {
            resultado = entrada1 * entrada2;
        } else if (operadorLogico.equals("/")) {
            resultado = entrada1 / entrada2;
        } else {
            System.out.println("Operador invalido!!");
        }
        if (operadorLogico.equals("+")) {
            System.out.println("O Resultado da soma é: " + resultado);
        } else if (operadorLogico.equals("-")) {
            System.out.println("O Resultado da subtração é: " + resultado);
        } else if (operadorLogico.equals("*")) {
            System.out.println("O Resultado da multiplicação é: " + resultado);
        } else if (operadorLogico.equals("/")) {
            System.out.println("O Resultado da divisão é: " + resultado);
        }
    }

}