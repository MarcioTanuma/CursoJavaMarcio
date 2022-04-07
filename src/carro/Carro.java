package carro;

public class Carro {
    String marca;
    String modelo;
    int ano;
    String cor;
    String placa;
    Motor dadosMotor=new Motor();

    public void exibirDados(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Cor: "+cor);
        System.out.println("Placa: "+placa);
        System.out.println("Potência Motor: "+dadosMotor.potencia);
        System.out.println("Modelo Motor:"+dadosMotor.modeloMotor);
        System.out.println("Qtde de Válvulas: "+dadosMotor.qtdeValvula);
        System.out.println("Tipo Comustível: "+dadosMotor.combustivelTipo);
    }

}
