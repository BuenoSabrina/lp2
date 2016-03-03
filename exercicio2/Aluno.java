public class Aluno{

String nome, numeroMatricula,idade;

public void imprimirDadosCadastrados(){
	System.out.println("Nome:" + this.nome);
	System.out.println("Idade:" + this.idade);
	System.out.println("Matricula:" + this.numeroMatricula);
}


public static void main(String[] args) {
	Aluno objeto1 = new Aluno();
	Aluno objeto2 = new Aluno();
	Aluno objeto3 = new Aluno();
	Aluno objeto4 = new Aluno();

System.out.println ("Objeto numero 1:");
	objeto1.nome = "Sabrina Marinho Bueno";
	objeto2.idade = "16";
	objeto3.numeroMatricula = "201418110256";
	objeto4.imprimirDadosCadastrados();

System.out.println ("Objeto numero 2:");
	objeto1.nome = "Julia";
	objeto2.idade = "16";
	objeto3.numeroMatricula = "201418110257";
	objeto4.imprimirDadosCadastrados();

System.out.println ("Objeto numero 3:");
	objeto1.nome = "Amanda";
	objeto2.idade = "16";
	objeto3.numeroMatricula = "201418110258";
	objeto4.imprimirDadosCadastrados();

System.out.println ("Objeto numero 4:");
	objeto1.nome = "Andreza";
	objeto2.idade = "16";
	objeto3.numeroMatricula = "201418110259";
	objeto4.imprimirDadosCadastrados();

}
}
