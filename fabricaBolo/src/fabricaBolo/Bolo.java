package fabricaBolo;

public abstract class Bolo {
	private String nome, tipo;
	private float preco;
	public abstract void receita();
	public void sobreBolo(){
		System.out.println(nome + " " + preco);
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
}
