public class Main {
    public static void main(String[] args) {

         ContaBancaria conta = new ContaBancaria();

        /**
         * Definindo titular da conta
         */
        conta.setTitular("matheus");

        /**
         * Definindo saldo da conta
         */
        conta.setSaldo(2300.00);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: " + conta.getSaldo());

        /**
         * Método que deposita mais valor na conta - incrementa valor
         */
        conta.Depositar(300.00);
        System.out.println("Saldo após depósito: " + conta.getSaldo());


        /**
         * Método que decrementa o saldo de acordo com o valor de saque
         */

        double novoSaldo = conta.Sacar(100.00);
        System.out.print("Saldo após saque: " + novoSaldo);
    }
}