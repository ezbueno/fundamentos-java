package modulo7.exemplos1;

public abstract class Item {

	private int posX;
	private int posY;

	public abstract void pegar();

	public int getPosX() {
		return this.posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return this.posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
}
