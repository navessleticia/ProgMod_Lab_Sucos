
public class Suco extends Bebida {

	public Suco(EFruta fruta) {
		super("Suco");
		if (fruta != null) {
			this.frutas.add(fruta);
		}
	}

	@Override 
	public int adicionar(EFruta fruta) {
		if (fruta != null {
			boolean podeAdicionar = false;
			switch (frutas.size()){
				case 0 -> podeAdicionar = true;
				case 1 -> podeAdicionar = 
					fruta.equals(EFruta.LARANJA) || 
					frutas.get(0).equals(EFruta.LARANJA);
			}
			if(podeAdicionar)
				frutas.add(fruta);
		} 

		return frutas.size();
	}	

	@Override 
	public double preco() {
		double total = 0; 

		for (EFruta fruta : frutas){
			total += fruta.preco();
		}

		if (frutas.isEmpty()){
			return 0;
		}

		return total / frutas.size();
	}

	@Override 
	public String toString() {
		
	}

}
