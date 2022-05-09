package ContaBanco;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Conta {

    private String nome;
    private String cpf;
    private long agencia;
    private long numeroconta;
    private double saldo;

    public Conta() {
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getAgencia() {
        return agencia;
    }

    public void setAgencia(long agencia) {
        this.agencia = agencia;
    }

    public long getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(long numeroconta) {
        this.numeroconta = numeroconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(Conta contaDestino, double valorDeposito){
        return contaDestino.saldo = contaDestino.saldo+valorDeposito;
    }

    public double tranferir(Conta contaDestino, double valorTransferencia){
        contaDestino.saldo = contaDestino.saldo + valorTransferencia;
        return saldo = saldo - valorTransferencia;

    }

    public double sacar(double valorSaque){
        return saldo = saldo - valorSaque;

    }
/*
    public double pix(Conta contaOrigem, String chavePix, double valorPix){
        contaDestino.saldo = contaDestino.saldo + valorPix;
        return  contaOrigem.saldo = contaOrigem.saldo - valorPix;
    }

    public Conta buscarContaPix(String chavePix, List<Conta> listaContasDestinos){

        for (Conta contaDestino:listaContasDestinos) {
            if (contaDestino.getCpf().equals(chavePix)) {
                return contaDestino;
            }
            return null; // continuar a partir daqui
        }
    }
*/
    public void exibirExtrato(){
        System.out.println("=============== Extrato do dia: "+ LocalDateTime.now()+" ===============");
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Agencia: "+agencia);
        System.out.println("Conta: "+numeroconta);
        System.out.println("Saldo: "+saldo);
        System.out.println("=======================================================================");
    }

}
