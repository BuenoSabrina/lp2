public class Aluno{

	String nome, numeroMatricula;
	int idade;

	public void ImprimirDadosCadastrados(){
		System.out.println("nome:" + this.nome);
		System.out.println("matrícula:" + this.numeroMatricula);
		System.out.println("idade:" + this.idade);
}


	public static void main(String[] args){
		
		Aluno objeto1 = new Aluno();
		Aluno objeto2 = new Aluno();
		Aluno objeto3 = new Aluno();
		Aluno objeto4 = new Aluno();


	System.out.println("Objeto 1:");
		objeto1.nome = "Sabrina";
		objeto1.numeroMatricula = "201418110256";
		objeto1.idade = 16;
		objeto1.ImprimirDadosCadastrados();

	System.out.println("Objeto 2:");
		objeto2.nome = "Caio";
		objeto2.numeroMatricula = "201418110051";
		objeto2.idade = 16;
		objeto2.ImprimirDadosCadastrados();

	System.out.println("Objeto 3:");
		objeto3.nome = "Rafaela";
		objeto3.numeroMatricula = "201418110221";
		objeto3.idade = 16;
		objeto3.ImprimirDadosCadastrados();

	System.out.println("Objeto 4:");
		objeto4.nome = "Pedro";
		objeto4.numeroMatricula = "201418110213";
		objeto4.idade = 17;
		objeto4.ImprimirDadosCadastrados();

}
}
