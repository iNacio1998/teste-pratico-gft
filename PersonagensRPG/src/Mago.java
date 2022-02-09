import java.util.ArrayList;
import java.util.List;

public class Mago extends Personagem{

	
	private List<String> magias = new ArrayList();
	
	public Mago(List<String> magias) {
		this.magias = magias;
	}
	
	public Mago() {
		
	}

	public void lvlUp() {
		this.vida++;
		this.mana =+ this.mana + 3;
		this.xp++;
		this.inteligencia += this.inteligencia + 2;
		this.forca++;
		this.level++;
	}
	
	public void attack() {
		double valorAttack = (this.inteligencia / 2 * Math.pow(this.level, 2)) + Math.random() * 180;
		System.out.println("Valor attack do mago" + valorAttack);
	}
	
	public void aprenderMagia(String magia) {
		this.magias.add(magia);
	}

	public List<String> getMagias() {
		return magias;
	}

	public void setMagias(List<String> magias) {
		this.magias = magias;
	}
	
}
