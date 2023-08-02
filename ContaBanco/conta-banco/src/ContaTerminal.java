import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.next();

        System.out.println("Por favor, digite o número da Conta!");
        numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite o Saldo da Conta!");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();

    }
}
