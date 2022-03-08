public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        var valorInicial		: int			= 5;

//GUI Text en el que se va a ver el conteo
var GUITextVisualizador	: GUIText;

function Start () {
	
	// Llamada a función contadora
	CountDown();
	
}

function CountDown(){

	if(valorInicial>0){ // Si valorInicial es mayor a 0
		GUITextVisualizador.text = valorInicial.ToString(); // Imprimir valorInicial en variable GUI como String
		yield WaitForSeconds(1); // Esperar 1 segundo antes de ejecutar lo que esta debajo
		valorInicial--; // Restar 1 a valorInicial
		Reiniciar(); // Función Loop
	} else { // Si ya no es mayor a 0
		GUITextVisualizador.text = 'Conteo finalizado'; // Al terminar el conteo
	}

}

function Reiniciar(){
	CountDown(); // Ejecutar de nuevo la función contadora
}
    }
}
