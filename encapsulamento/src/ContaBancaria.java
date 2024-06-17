
public class ContaBancaria {

	private String titular;
	private int numeroConta;
	
	private double saldoConta;


	
	
	public ContaBancaria(String titular, int numeroConta) {
		
		this.titular = titular;
		this.numeroConta = numeroConta;
		
	}
	
	public ContaBancaria(String titular,int numeroConta,double depositoInicial) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		deposito(depositoInicial);
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getNumeroConta() {
		return numeroConta;
	}

	
	

	public double getSaldoConta() {
		return saldoConta;

	}

	public void deposito(double valor) {
		saldoConta += valor;
		
	}

	public void saque(double valor) {
		saldoConta -= valor +5;
		
		
	}
	public String toString() {
		return "Conta "
				+ numeroConta
				+ ", Titular :"
				+ titular
				+ ", Saldo : $ "
				+ String.format("%.2f", saldoConta);
		
	}

}
