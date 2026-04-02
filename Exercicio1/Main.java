import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean entrar = true;
        Conta conta1 = new Conta();

        String menu = getMenu();
        System.out.println("Operaçõs disponíveis \n" + menu);
        int operacao = sc.nextInt();


        switch ( operacao ){
            case 1:
                System.out.println("Saldo disponível: " + conta1.getSaldo());
                break;

            case 2:
                System.out.println("Cheque especial: " + conta1.consultarChequeEspecial());
                break;

            case 3:
                System.out.println("Informe o valor que deseja depositar");
                int valorDeposito = sc.nextInt();
                conta1.setDepositar(valorDeposito);
                break;

            case 4:
                System.out.println("Qual o valor do saque? " );
                int valorSaque = sc.nextInt();

                System.out.println("Ação bem sucessida" +  conta1.getSacar(valorSaque));
                break;

            case 5:
                System.out.println("Valor do boleto: ");
                int valorBoleto = sc.nextInt();

                System.out.println(conta1.pagarBoleto(valorBoleto));
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida!");
        } sc.close();

    }

    private static String getMenu() {
        String menu = "1-Consultar Saldo\n" +
                "2-Consultar cheque especial\n" +
                "3-Depositar dinheiro\n" +
                "4-Sacar dinheiro\n" +
                "5-Pagar boleto";
        return menu;
    }
}