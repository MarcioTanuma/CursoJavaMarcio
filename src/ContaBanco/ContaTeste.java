package ContaBanco;

public class ContaTeste {
    public static void main(String[] args) {

        Conta objetoContaOrigem = new Conta();

        objetoContaOrigem.setNome("Marcio");
        objetoContaOrigem.setAgencia(123);
        objetoContaOrigem.setNumeroconta(12345);
        objetoContaOrigem.setCpf("12345678");
        objetoContaOrigem.exibirExtrato();

        objetoContaOrigem.depositar(objetoContaOrigem,500);

        objetoContaOrigem.exibirExtrato();

        Conta objetoContaDestino = new Conta();

        objetoContaDestino.setAgencia(3456);
        objetoContaDestino.setNumeroconta(999999);
        objetoContaDestino.setNome("Cleber");
        objetoContaDestino.setCpf("123445669");

        objetoContaDestino.exibirExtrato();

        objetoContaOrigem.tranferir(objetoContaOrigem, objetoContaDestino, 500);

        objetoContaOrigem.exibirExtrato();
        objetoContaDestino.exibirExtrato();

        objetoContaDestino.sacar(objetoContaDestino, 115);

        objetoContaDestino.exibirExtrato();

        objetoContaOrigem.pix(objetoContaOrigem, objetoContaDestino, 45);

        objetoContaOrigem.exibirExtrato();
        objetoContaDestino.exibirExtrato();

    }
}