package Exercicio2;

import java.util.Random;

public class Carro {

    private int velocidade;
    private Random random = new Random();

    public String ligarCarro() {
        if (velocidade == 0) {
            return "Carro ligado!";
        } else {
            return "Carro ainda desligado";
        }
    }

    public String desligarCarro() {
        if (velocidade == 0) {
            return "Carro desligado";
        } else{
            return "Não é possível desligar, carro ainda em movimento";
        }
    }


    public int acelerarCarro() {
       return velocidade = random.nextInt(120);

    }


    public int desacelerarCarro() {
        int desacelera = velocidade--;
        return desacelera;

    }

    public String virandoDireita() {
        String virarDireita = " ";
        if(velocidade >= 1 && velocidade < 40){
            return  "Virando a direita";
        } else{
            return "Diminua a velocidade para efetuar manobra";

        }
    }

    public String virandoEsquerda() {
        String virarEsquerda = " ";
        if(velocidade >= 1 && velocidade < 40){
            return "Virando a esquerda";
        } else {
            return "Diminua a velocidade para efetuar manobra";
        }

    }

    public int verificaVelocidade() {
        return velocidade;

    }
}
