package carro;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;

public class TestaCarros {
    public static void main(String[] args) {
        Carro objetoFerrari=new Carro();
        objetoFerrari.ano=2022;
        objetoFerrari.cor="vermelha";
        objetoFerrari.marca="Ferrari";
        objetoFerrari.modelo="Ferrari Turbo";
        objetoFerrari.placa="XXX1234";
        objetoFerrari.dadosMotor.modeloMotor="Turbo";
        objetoFerrari.dadosMotor.combustivelTipo="Gasolina";
        objetoFerrari.dadosMotor.potencia=4.5;
        objetoFerrari.dadosMotor.qtdeValvula=16;

        objetoFerrari.exibirDados();
    }

}
