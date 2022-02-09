import java.util.ArrayList;
import java.util.List;


public class Guerreiro extends Personagem {

	private List<String> habilidades = new ArrayList();
	
	public void lvlUp() {
		this.vida = this.vida + 15;
		this.mana++;
		this.xp++;
		this.inteligencia++;
		this.forca = this.forca + 10;
		this.level++;
	}
	
	public void attack() {
		double valorAttack = (this.forca / 2 * Math.pow(this.level, 2)) + Math.random() * 180;
		System.out.println("Valor attack do Guerreiro" + valorAttack);
	}
	
	public void aprenderHabilidade(String habilidade) {
		this.habilidades.add(habilidade);
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}

	public Guerreiro(List<String> habilidades) {
		super();
		this.habilidades = habilidades;
	}
	
	public Guerreiro() {
		
	}
	
}
