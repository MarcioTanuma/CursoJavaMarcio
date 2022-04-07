public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadoraSoma = new Calculadora();
        calculadoraSoma.entrada1=15;
        calculadoraSoma.entrada2=20;
        calculadoraSoma.operadorLogico="+";
        calculadoraSoma.calcular();

        Calculadora calculadoraSubtracao = new Calculadora();
        calculadoraSubtracao.entrada1=30;
        calculadoraSubtracao.entrada2=20;
        calculadoraSubtracao.operadorLogico="-";
        calculadoraSubtracao.calcular();

        Calculadora calculadoraDivisao = new Calculadora();
        calculadoraDivisao.entrada1=60;
        calculadoraDivisao.entrada2=3;
        calculadoraDivisao.operadorLogico="/";
        calculadoraDivisao.calcular();

        Calculadora calculadoraMultiplicacao = new Calculadora();
        calculadoraMultiplicacao.entrada1=15;
        calculadoraMultiplicacao.entrada2=4;
        calculadoraMultiplicacao.operadorLogico="*";
        calculadoraMultiplicacao.calcular();

     }
}
