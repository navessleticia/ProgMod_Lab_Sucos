
public class Vitamina extends Bebida {

	private static final double ACRESCIMO = 2.5;


	public Vitamina(EFruta fruta) {
		super("Vitamina");
			if (fruta != null) {
			this.frutas.add(fruta);
		}
	}

	@Override 
	public int adicionar(EFruta fruta) {
		
	}

	@Override 
	public double preco() {
		
	}

	@Override 
	public String toString() {
		
	}

}
