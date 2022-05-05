package projetoclone;

public class ClasseTeste{

	private String cor;
	private int idade;
	private float velocidade;	
	
	public ClasseTeste(String cor, int idade, float velocidade) {
		this.setCor(cor);
		this.setIdade(idade);
		this.setVelocidade(velocidade);
	}
	
	public void aumentar() {
		this.setVelocidade(getVelocidade() + 1);;
	}
	
	public void diminuir() {
		this.setVelocidade(getVelocidade() - 1);;
	}
	
	public void aniversario() {
		this.setIdade(getIdade() + 1);
	}
	
	public void mudarCor(String x) {
		this.setCor(x);
	}
	
	public void status() {
		System.out.println("Cor atual: " + this.getCor());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Velocidade: " + this.getVelocidade());
	}
	
	//getter e setter
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
}
