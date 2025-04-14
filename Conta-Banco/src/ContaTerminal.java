import java.util.Scanner;

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public static void main(String[] args) throws Exception {

        ContaTerminal c1 = new ContaTerminal();

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência: ");
        c1.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Usuáro: ");
        c1.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o numero da conta: ");
        c1.numero = scanner.nextInt();

        c1.saldo = 250;


        System.out.println("Olá"+c1.nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é: " + c1.agencia + ", conta: " + c1.numero + " e seu saldo: "+c1.saldo+" já está disponível para saque.");

    }
}
