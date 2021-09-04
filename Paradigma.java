import javax.swing.JOptionPane;

public class Paradigma {
	public static void main(String[] args) {
		// punto de entrada del proyecto
		System.out.println("Hola Mundo!");

		System.out.println("-- auto1 --");
		Auto auto1 = new Auto();		//método constructor
		auto1.marca = "Fiat";
		auto1.modelo = "Toro";
		auto1.color = "Rojo";
		auto1.acelerar(); // 10
		auto1.acelerar(); // 20
		auto1.acelerar(); // 30
		auto1.frenar(); // 20
		System.out.println(auto1.marca + " " + auto1.modelo + " " + auto1.color + " " + auto1.obtenerVelocidad());

		System.out.println("-- auto2 --");
		Auto auto2 = new Auto();
		auto2.marca = "Citroen";
		auto2.modelo = "C4";
		auto2.color = "Gris";
		auto2.acelerar(); // 10
		auto2.acelerar(15); // 25
		auto2.acelerar(140);		
		//auto2.velocidad=350;
		
		System.out.println(auto2.marca + " " + auto2.modelo + " " + auto2.color + " " + auto2.obtenerVelocidad());

		auto2.imprimirVelocidad();
		System.out.println(auto2.obtenerVelocidad());

		//JOptionPane.showMessageDialog(null, "velocidad: " + auto2.obtenerVelocidad());


		String texto="Esto es una cadena de texto!";
		System.out.println(texto);
		System.out.println(texto.toUpperCase());

		Auto auto3=new Auto();
		auto2.acelerar();

	} // end main
}// end class Paradigma

// declaración de clase
class Auto {

	// atributos
	String marca;
	String modelo;
	String color;
	private int velocidad;

	// métodos
	void acelerar() {
		//velocidad = velocidad + 10;
		acelerar(10);						//llamado de método dentro de una misma clase
	}

	void acelerar(int kilometros) {
		velocidad = velocidad + kilometros;
		if(velocidad>100){
			velocidad=100;
		}
	}

	void acelerar(int kilometros, boolean tieneNitro) {
		if (tieneNitro == false) {
			acelerar(kilometros);			//llamado de método dentro de una misma clase
		} else {
			acelerar(kilometros * 2);		//llamado de método dentro de una misma clase
		}
	}

	void frenar() {
		velocidad = velocidad - 10;
	}

	void imprimirVelocidad() {
		System.out.println(velocidad);
	}

	int obtenerVelocidad() {
		return velocidad;
	}

}// end class Auto
