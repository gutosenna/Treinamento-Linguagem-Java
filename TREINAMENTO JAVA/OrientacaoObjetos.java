public class OrientacaoObjetos {
private int numero;
private String nome;
public static void main(String[ ] args) {
	OrientacaoObjetos orientacaoObjetos = new OrientacaoObjetos();    // Cria��o  do objeto
	orientacaoObjetos.setNumero(10);
	orientacaoObjetos.setNome("Pele");
	System.out.println("O " + orientacaoObjetos.getNome() + " foi um dos melhores camisa " +
	orientacaoObjetos.getNumero() + " de todos os tempos");
	System.out.println("referencia do objeto " + orientacaoObjetos); }
	
public String getNome() {	// m�todo para pegar o valor da vari�vel nome
	return nome;
}

public int getNumero() {	// m�todo para pegar o valor da vari�vel n�mero
	return numero;
}

public void setNome(String nome) {	// m�todo para mudar o valor da vari�vel nome
	this.nome = nome;
}

public void setNumero(int numero) {	// m�todo para mudar o valor da vari�vel n�mero
	this.numero = numero;
}
}