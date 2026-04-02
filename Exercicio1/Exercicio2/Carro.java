package Exercicio2;

public class Carro {
    private boolean ligar = true;
    private boolean desligar = false;
    private String direcao;
    private boolean acelerar = true;
    private int velocidade;

    public int acelerar(){
        int acelerando = 0;
        for (int i = 0; i <= 120; i++){
           acelerando = velocidade+i;
        } return acelerando;

    }

}
