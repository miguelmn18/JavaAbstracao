package Exercicio2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Carro carro = new Carro();
        int opcao = -1;

        //mensagem inicial para informar que o carro está desligado e não há como realizar nenhuma função até que o carro seja ligado
        System.out.println("O carro " + carro + " está desligado" + " em ponto morto" + " e sua velocidade atual é de 0km");
        System.out.println("Carro está desligado, não pode realizar nenhuma função.");

        //Informar funções e permiti que o usuário as selecione

        while (opcao != 0) {
            funcoesDoCarro();
            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println(carro.ligarCarro());
                    break;

                case 2:
                    System.out.println(carro.desligarCarro());
                    break;

                case 3:
                    System.out.println("Velocidade atual: " + carro.acelerarCarro() );
                    break;

                case 4:
                    System.out.println("Desacelerando: " + carro.desacelerarCarro());

                    break;

                case 5:
                    System.out.println(carro.virandoDireita());
                    break;

                case 6:
                    System.out.println(carro.virandoEsquerda());
                    break;

                case 7:
                    System.out.println("Velocidade: " + carro.verificaVelocidade());
                    break;

                case 8:
                    System.out.println("Selecione a machar do carro para poder sair: ");
                    marchas();
                    int selecionaMarcha = sc.nextInt();
                    switch (selecionaMarcha) {

                        case 0:
                            System.out.println("O carro não pode acelerar.");
                            break;

                        case 1:
                            if (carro.verificaVelocidade() >= 0 && carro.verificaVelocidade() <= 20) {
                                int numeroVelocidade = random.nextInt(20);
                                System.out.println("Seu carro está a " + numeroVelocidade + "km");
                            }
                            break;

                        case 2:
                            if (carro.verificaVelocidade() >= 21 && carro.verificaVelocidade() <= 40) {
                                int numeroVelocidade2 = random.nextInt(40);
                                System.out.println("Seu carro está a " + numeroVelocidade2 + "km");

                            }

                        case 3:
                            if (carro.verificaVelocidade() >= 41 && carro.verificaVelocidade() <= 60) {
                                int numeroVelocidade3 = random.nextInt(60);
                                System.out.println("Seu carro está a " + numeroVelocidade3 + "km");
                            }
                            break;

                        case 4:
                            if (carro.verificaVelocidade() >= 61 && carro.verificaVelocidade() <= 80) {
                                int numeroVelocidade4 = random.nextInt(80);
                                System.out.println("Seu carro está a " + numeroVelocidade4 + "km");
                            }
                            break;

                        case 5:
                            if (carro.verificaVelocidade() >= 81 && carro.verificaVelocidade() <= 100) {
                                int numeroVelocidade5 = random.nextInt(100);
                                System.out.println("Seu carro está a " + numeroVelocidade5 + "km");
                            }
                            break;

                        case 6:
                            if (carro.verificaVelocidade() >= 101 && carro.verificaVelocidade() <= 120) {
                                int numeroVelocidade6 = random.nextInt(120);
                                System.out.println("Seu carro está a " + numeroVelocidade6 + "km");
                            }
                            break;

                        default:
                            System.out.println("Marcha errada!");
                    }


            }
        }
    }


        private static void marchas () {
            String quantidadeMarcha =
                    "Primeira marcha\n" +
                            "Segunda marcha\n" +
                            "Terceira marcha\n" +
                            "Quarta marcha\n" +
                            "Quinta marcha\n" +
                            "Sexta marcha\n";
            System.out.println(quantidadeMarcha);
        }

        private static void funcoesDoCarro () {
            String menu = "Selecione um número para realizar uma função\n" +
                    "1-Ligar o carro\n" +
                    "2-Desligar o carro\n" +
                    "3-Acelerar o carro\n" +
                    "4-Diminuir velocidade\n" +
                    "5-Virar para esquerda\n" +
                    "6-Virar para a direita\n" +
                    "7-Verificar velocidade\n" +
                    "8-Trocar marcha";
            System.out.println(menu);
        }
    }




