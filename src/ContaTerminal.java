import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Bem vindo ao nosso banco! por favor, digite o número da conta");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência!");
        String agencia = scanner.next();
        scanner.nextLine();
        System.out.println("Por favor, me informe o seu nome! ");
        String cliente = scanner.nextLine();
        System.out.println("Por favor, informe o seu saldo!");
        BigDecimal saldo = scanner.nextBigDecimal();


        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta: " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
