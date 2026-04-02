public class Conta {
    private int saldo;
    private int depositar;
    private int sacar;
    private double chequeEspecial;
    private boolean primeiroDeposito = true;

    public int getSaldo() {
        return saldo;
    }


    public int getDepositar() {
        return saldo;
    }

    public void setDepositar(int valor) {
        this.saldo += valor;
        if (primeiroDeposito) {
            if (valor >= 500) {
                chequeEspecial = valor / 2; // 50% do primeiro depósito
            } else {
                chequeEspecial = valor; // valor integral do primeiro depósito
            }
            primeiroDeposito = false; // garante que só acontece uma vez
        }
    }

    public int getSacar(int valor) {
        return this.saldo -= valor;

    }
    public double consultarChequeEspecial (){
        return chequeEspecial;
    }
    public String pagarBoleto(int valor) {

        if (valor <= (saldo + chequeEspecial)) {
            saldo -= valor;
            return "Boleto pago com sucesso";
        } else {

            return ("Saldo insuficiente para pagar o boleto.");
        }
    }

}
