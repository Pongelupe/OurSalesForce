
public class Produto {
	private static int id = 0;
	private String nome;
	// @toDo: implementar um tipo de produto (usando Enum) depois de saber sobre o que se trata o sales force
	
	Produto(String nome) {
		id++;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static int getId() {
		return id;
	}
	
}
