import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o numero da Agencia : ");
        int numero=sc.nextInt();
        System.out.print("Por favor, digite o id da Agencia : ");
        String agencia = sc.next();
        System.out.print("Por favor, digite o seu nome : ");
        sc.nextLine();
        String cliente = sc.nextLine();
        System.out.print("Informe o quanto voce ira depositar : ");
        double saldo = sc.nextDouble();

        System.out.println();
        System.out.printf("Olá "+ cliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero + " e seu saldo "+saldo+" já está disponível para saque.");


        sc.close();
        
    }
}
