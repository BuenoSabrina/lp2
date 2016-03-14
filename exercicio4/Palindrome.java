public class Palindrome{

	public static void main(String[] args){
	String parametro = args[0];
	String fim;
	String teste = parametro;
	fim = teste;
	int stringtam, x, y, tam, posinicial=0, posfinal=0,j;
	boolean var = false;
		tam = teste.length();
		stringtam = teste.length();
	while (tam > 1 && var == false){
		x = tam;
		for(posinicial=0; posinicial <= posfinal; posinicial++){
			y = posinicial + x;
			teste = fim.substring(posinicial,y);
		
		StringBuffer sb = new StringBuffer(teste);
		sb.reverse();
		String contrario = sb.toString();
		if(teste.equals(contrario)){
		j = y - 1;
		System.out.println(teste);
		System.out.println("Posição: " + posinicial + " até " + j);
		var = true;
			}
		}
			posfinal++;
			tam--;
		}
	}
}	
