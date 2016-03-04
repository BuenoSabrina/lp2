public class Calculadora{

	int a,b;
	int soma,subtracao,multiplicacao;
	float divisao;

public void somar(){
	System.out.println ("A soma dos dois número é:" + this.soma);
	soma=a+b;
}

public void dividir(){
	System.out.println ("A divisão dos dois números é:" + this.divisao);
	divisao=a/b;
}

public void multiplicar(){
	System.out.println ("A multiplicação dos dois números é:" + this.multiplicacao);
}

public void subtrair(){
	System.out.println ("A subtração dos dois números é:" + this.subtracao);
}

public static void main (String [] args){

	Calculadora objeto1 = new Calculadora();
	Calculadora objeto2 = new Calculadora();
	Calculadora objeto3 = new Calculadora();

objeto1.a=10;
objeto1.b=2;
objeto1.somar();
objeto1.dividir();
objeto1.multiplicar();
objeto1.subtrair();

objeto2.a=60;
objeto2.b=30;
objeto2.somar();
objeto2.dividir();
objeto2.multiplicar();
objeto2.subtrair();

objeto3.a=100;
objeto3.b=20;
objeto3.somar();
objeto3.dividir();
objeto3.multiplicar();
objeto3.subtrair();

	}
}
