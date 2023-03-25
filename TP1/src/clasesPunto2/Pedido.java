package clasesPunto2;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<Bebida> bebidas;
	private ArrayList<PlatoPrincipal> platosPrincipales;
	private boolean pagado;

	public Pedido() {
		super();
		this.bebidas = new ArrayList<Bebida>();
		this.platosPrincipales = new ArrayList<PlatoPrincipal>();
		this.pagado = false;
	}

	public void añadirUnPlato(PlatoPrincipal unPlato) {
		this.platosPrincipales.add(unPlato);
	}

	public void AñadirUnaBebida(Bebida unaBebida) {
		this.bebidas.add(unaBebida);
	}

	public double total(int descuentoPlatosPrincipales, int descuentoBebidas, int propina) {
		double total = 0;
		for (PlatoPrincipal plato : platosPrincipales) {
			total = total + plato.precio(descuentoPlatosPrincipales);
		}
		for (Bebida bebida : bebidas) {
			total = total + bebida.precio(descuentoBebidas);
		}
		return total = total * (1 + (propina / 100));

	}

	public void pagado() {
		this.pagado = true;
	}

	public boolean isPagado() {
		return pagado;
	}

}
