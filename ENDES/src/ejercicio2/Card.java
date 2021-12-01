package ejercicio2;
//Crea la clase Card y define los elementos que contine
public class Card {

	public String suit;
	public String value;
	
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	public String toString () {
		//muestra el formato en el que se mostrará el resultado.
		return (this.suit+"-"+this.value);
	}
}
