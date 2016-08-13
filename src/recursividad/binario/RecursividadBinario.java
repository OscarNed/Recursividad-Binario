package recursividad.binario;
import java.util.Scanner;

/**
 * @author OscarNedzelsky A00513376
 */
public class RecursividadBinario {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Teclee el número que quiere convertir a binario:"); //Pide al usuario que teclee el número que quiere convertir.
        int n = scan.nextInt();
        String binario = ConvertirABinario.Conversor(n); //Crea un String para guardar el número binario y comienza el método recursivo.
        System.out.println("El número " + n + " se escribe " + binario + " en binario.");
        /* El String del número binario fue regresado al main para poder mostrar la frase de arriba y recordar al usuario cual
            número escribió y mostrarle su resultado al mismo tiempo.
        */
    }
    
}
