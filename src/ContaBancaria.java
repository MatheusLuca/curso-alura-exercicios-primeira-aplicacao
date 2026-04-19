import java.util.Scanner;

public class ContaBancaria {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite o tipo de conta: ");
        String contaCliente = sc.nextLine();
        System.out.println("Digite o saldo inicial da conta: ");
        double saldoCliente = sc.nextDouble();


        System.out.println("********************");
        System.out.println("Nome:               " + nomeCliente);
        System.out.println("Tipo de conta:      " + contaCliente);
        System.out.println("Saldo inicial:      " + saldoCliente);
        System.out.println("********************");


        int opcaoCliente = 0;
        while( opcaoCliente != 4 ){
            System.out.println("Menu de Operações: ");
            String menu = """
                1 - Consultar saldo
                2 - Deposito
                3 - Sacar
                4 - Sair
                """;
            System.out.println(menu);
            System.out.println("Escolha a opção: ");
            opcaoCliente  = sc.nextInt();

                switch (opcaoCliente){
                    case 1:
                        System.out.println("Saldo: " + saldoCliente);
                    break;
                    case 2:
                        System.out.println("Digite quanto quer depositar: ");
                        double deposito = sc.nextDouble();
                        saldoCliente = depositar(deposito, saldoCliente);
                        break;
                    case 3:
                        System.out.println("Digite quanto quer sacar: ");
                        double sacar = sc.nextDouble();
                        saldoCliente = sacar(sacar, saldoCliente);
                        System.out.println("Saldo atualizado após saque: " + saldoCliente);
                    case 4:
                        opcaoCliente = 4;
                }
        }
    }

    public static double depositar(double valorDeposito, double saldoCliente){
        return saldoCliente += valorDeposito;
    }

    public static double sacar(double valorSaque, double saldoCliente){
        return saldoCliente -= valorSaque;
    }
}
