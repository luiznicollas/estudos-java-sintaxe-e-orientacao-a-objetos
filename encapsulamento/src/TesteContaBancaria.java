import java.util.Locale;
import java.util.Scanner;

public class TesteContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		ContaBancaria conta;

		System.out.println("Entre com o numero da conta");
		int numeroConta = scan.nextInt();

		System.out.println("Entre com seu titular");
		scan.nextLine();
		String titular = scan.nextLine();

		System.out.println("Existe um deposito inicial? (y/n)");

		char resposta = scan.next().charAt(0);

		if (resposta == 'y') {
			System.out.println("Entre com o valor inicial");
			double depositoInicial = scan.nextDouble();
			conta = new ContaBancaria(titular, numeroConta, depositoInicial);

		} else {
			conta = new ContaBancaria(titular, numeroConta);

		}

		System.out.println();
		System.out.println("Dados da conta");
        System.out.println(conta);

        System.out.println();
        System.out.println("Entre com o valor do deposito");
        double valorDeposito = scan.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println();
        System.out.println("Atualização dos dados da conta");
        System.out.println(conta);
        
        System.out.println();
        System.out.println("Entre com o valor do saque");
        double valorSaque = scan.nextDouble();
        conta.saque(valorSaque);
        System.out.println();
        System.out.println("Atualização dos dados da conta");
        System.out.println(conta);
        
		scan.close();

	}

}
