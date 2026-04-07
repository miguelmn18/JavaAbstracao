package Exercicio3;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcaoEscolhida = -1;
        MaquinaBanho maquinaBanho = new MaquinaBanho();
        System.out.println("Está máquina de banho consegue realizar as seguintes operações: ");
        Pet pet1 = new Pet("Flor", "Cachorro", "Vira-lata", 60, "preto");

        while (opcaoEscolhida != 0) {
            menuOpcoes();
            opcaoEscolhida = sc.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println(maquinaBanho.usarMaquina(pet1));
                    break;

                case 2:
                    System.out.println(maquinaBanho.abastecerAgua());
                    break;
                case 3:
                    System.out.println(maquinaBanho.abastecerShampoo());
                    break;
                case 4:
                    System.out.println(maquinaBanho.verificaNivel());
                    break;
                case 5:
                    System.out.println(maquinaBanho.verificaNivel());
                    break;
                case 6:
                    System.out.println(maquinaBanho.verificaQuantidadeDePetNoBanho());
                    break;

                case 7:
                    System.out.println(maquinaBanho.usarMaquina(pet1));
                    break;

                case 8:
                    System.out.println(maquinaBanho.retirarMaquina(pet1));
                    break;

                case 9:
                    System.out.println(maquinaBanho.limparMaquina());
                    break;

                case 0:
                    System.out.println("Função inválida!");

            }
        }

    }


    private static void menuOpcoes() {
        String menu = "Controles do banho:\n" +
                "1-Dar banho no pet\n" +
                "2-Abastecer com água\n" +
                "3-Abastecer com Shampoo\n" +
                "4-Verificar nível da água\n" +
                "5-Verificar nível do Shampoo\n" +
                "6-Verificar se tem pet no banho\n" +
                "7-Colocar pet na máquina\n" +
                "8-Retirar pet da máquina\n" +
                "9-Limpar máquina\n" +
                "0-Sair";
        System.out.println(menu);
    }

}

