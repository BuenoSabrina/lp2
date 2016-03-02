public class ContaBancaria2{

	int agencia, contaCorrente;
	double saldo, limiteExtra;
	String titularConta;
	
	public void imprimirAgencia(){
		System.out.println("A agencia é: " + this.agencia);
	}
	
	public void ImprimirContaCorrente(){
		System.out.println("A conta‐corrente é:" + this.conta.Corrente);
	}
	
	public void imprimirTitular(){
		System.out.println("O titular da conta é: " + this.titularConta);
	}

	public void imprimirSaldo(){
		System.out.println("Saldo: " + this.saldo);
	}

	public static void main(String [] args){

	System.out.println("Quadro de cima: ");
		ContaBancaria2.agencia = 3610;
		ContaBancaria2.contaCorrente = 15766;
		ContaBancaria2.saldo = 35.54;
		ContaBancaria2.limiteExtra = 50.00;
		ContaBancaria2.titularConta = "Herbert";
		ContaBancaria2.imprimirSaldo();
		ContaBancaria2.imprimirSaldoTotal();

	System.out.println("Quadro de baixo: ");{
		ContaBancaria2.agencia = 0810; 
		ContaBancaria2.contaCorrente = 6132;
		ContaBancaria2.saldo = 42.31;
		ContaBancaria2.limiteExtra = 75.00;
		ContaBancaria2.titularConta = "Herbert";
		ContaBancaria2.imprimirSaldo();
		ContaBancaria2.imprimirSaldoTotal();
}
