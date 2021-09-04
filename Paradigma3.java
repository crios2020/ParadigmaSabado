public class Paradigma3{
	public static void main(String[] args){
		
		Auto.acelerar();
		
		System.out.println("-- auto1 --");
		Auto auto1 = new Auto("VW","UP","Blanco");
		Auto.acelerar();
		auto1.acelerar();					
		auto1.acelerar();					
		auto1.frenar();						
		System.out.println(auto1.getEstado()+", "+auto1.getVelocidad());
		
		System.out.println("-- auto2 --");
		Auto auto2 = new Auto("Renault","Kangoo","Bordo");
		auto2.acelerar();					
		System.out.println(auto2.getEstado()+", "+auto2.getVelocidad());
		System.out.println(auto1.getEstado()+", "+Auto.getVelocidad());
	}
}

class Auto{
	private String marca;
	private String modelo;
	private String color;
	private static int velocidad;
	
	public Auto(String marca, String modelo, String color){
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
	}
	
	public String getEstado(){
		return marca+", "+modelo+", "+color;
	}
	
	public static void acelerar(){
		velocidad +=10;
	}
	
	public static void frenar(){
		velocidad -=10;
	}
	
	public static int getVelocidad(){
		return velocidad;
	}
	
}
