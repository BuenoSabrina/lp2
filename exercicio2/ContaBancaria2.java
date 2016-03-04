public class ContaBancaria2{

	int agencia, ContaCorrente;
	double saldo,limiteExtra;
	String titularConta;
	
public void ImprimirSaldo(){
	System.out.println ("o saldo é:" + this.saldo);
}

public void ImprimirSaldoTotal(){
	System.out.println ("o saldo total é:" + this.saldo + this.limiteExtra); 
}

public void ImprimirAgencia(){
	System.out.println ("A agencia é" + this.agencia);
}

public void ImprimirContaCorrente(){
	System.out.println ("A conta-corrente é:" + this.ContaCorrente);
}

public void ImprimirTitular(){
	System.out.println ("O titular da conta é:" + this.titularConta);
}

public static void main (String [] args){

ContaBancaria2 objeto1 = new ContaBancaria2();
ContaBancaria2 objeto2 = new ContaBancaria2();

objeto1.titularConta = "Sabrina";
objeto1.agencia = 3610;
objeto1.ContaCorrente = 15766;
objeto1.saldo = 35.54;
objeto1.limiteExtra=50;
objeto1.ImprimirTitular();
objeto1.ImprimirAgencia();
objeto1.ImprimirContaCorrente();
objeto1.ImprimirSaldo();
objeto1.ImprimirSaldoTotal();

objeto2.titularConta = "Herbert";
objeto2.agencia = 	java810;
objeto2.ContaCorrente = 6132;
objeto2.saldo = 42.31;
objeto2.limiteExtra=75;
objeto2.ImprimirTitular();
objeto2.ImprimirAgencia();
objeto2.ImprimirContaCorrente();
objeto2.ImprimirSaldo();
objeto2.ImprimirSaldoTotal();
}
}
