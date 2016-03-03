public class Calculadora {
	
int a,b;
	

public void somar(){
	int soma;
	soma=this.a+this.b;
	System.out.println("A soma dos dois número é:" + soma);
}

public void sutrair(){
	int subtracao;
	subtracao=this.a-this.b;
	System.out.println("A subtração dos dois número é:" + subtracao);
}

public void multiplicar(){
	int multiplicacao;
	multiplicacao=this.b*this.a;
	System.out.println("A multiplicão dos dois número é:" + multiplicacao);
}

public void dividir(){
	int divisao;
	divisao=this.a/this.b;
	System.out.println("A divisão dos dois número é:" + divisao);
}

public static void main(String[] args){
	Calculadora objeto1 = new Calculadora();
	Calculadora objeto2 = new Calculadora();
	Calculadora objeto3 = new Calculadora();

System.out.println ("Objeto1:");
	objeto1.a=200;
	objeto1.b=100;
	objeto1.somar();
	objeto1.subtrair();
	objeto1.dividir();
	objeto1.multiplicar();
}

System.out.println ("Objeto2:");
	objeto2.a=50;
	objeto2.b=25;
	objeto2.somar();
	objeto2.subtrair();
	objeto2.dividir();
	objeto2.multiplicar();
}

System.out.println ("Objeto3:");
	objeto3.a=60;
	objeto3.b=30;
	objeto3.somar();
	objeto3.subtrair();
	objeto3.dividir();
	objeto3.multiplicar();
}

}
