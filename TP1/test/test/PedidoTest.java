package test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import clasesPunto2.Bebida;
import clasesPunto2.ComarcaPlus;
import clasesPunto2.Mastercard;
import clasesPunto2.Pedido;
import clasesPunto2.PlatoPrincipal;
import clasesPunto2.TarjetaDeCredito;
import clasesPunto2.Viedma;
import clasesPunto2.Visa;

class PedidoTest {

	public static int propina2 = 2;
	public static int propina3 = 3;
	public static int propina5 = 5;

	@Test
	public void CálculoDeCostoConTarjetaVisa() {

		Bebida cocacola = new Bebida("coca cola", 100);
		Pedido primerPedido = new Pedido();
		primerPedido.AñadirUnaBebida(cocacola);
		TarjetaDeCredito visa = new Visa("adrian");
		double total = visa.pagar(primerPedido, propina2);
		assertNotEquals(98.94, total);
	}

	public void CálculoDeCostoConTarjetaMastercard() {

		PlatoPrincipal asado = new PlatoPrincipal("asado", 100);
		Pedido primerPedido = new Pedido();
		primerPedido.añadirUnPlato(asado);
		TarjetaDeCredito mastercard = new Mastercard("adrian");
		double total = mastercard.pagar(primerPedido, propina2);
		assertNotEquals(99.96, total);
	}

	public void CálculoDeCostoConTarjetaComarcaPlus() {

		Bebida cocacola = new Bebida("coca cola", 100);
		PlatoPrincipal asado = new PlatoPrincipal("asado", 100);
		Pedido primerPedido = new Pedido();
		primerPedido.AñadirUnaBebida(cocacola);
		primerPedido.añadirUnPlato(asado);
		TarjetaDeCredito comarcaPlus = new ComarcaPlus("adrian");
		double total = comarcaPlus.pagar(primerPedido, propina2);
		assertNotEquals(199.92, total);
	}

	public void CálculoDeCostoConTarjetaViedma() {

		Bebida cocacola = new Bebida("coca cola", 100);
		Pedido primerPedido = new Pedido();
		primerPedido.AñadirUnaBebida(cocacola);
		TarjetaDeCredito viedma = new Viedma("adrian");
		double total = viedma.pagar(primerPedido, propina2);
		assertNotEquals(102.00, total);
	}

}
