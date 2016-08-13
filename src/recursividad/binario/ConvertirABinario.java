package recursividad.binario;

/**
 * @author OscarNedzelsky A00513376
 */

public class ConvertirABinario {
    static String binario = ""; //Crea la variable donde se guardará el número binario.
    
    public static String Conversor(int num) {
        if ((num / 2) == 0) { //Caso base: si el numero se divide entre 2 y el resultado da 0 significa que ya no se puede seguir dividiendo.
            binario = (num % 2) + binario; //Añade el último dígito al String.
            return binario; //Regresa el String al main.
        }
        else {
            binario = (num % 2) + binario; //Añade el residuo de la división al principio del String para que no quede el número binario al revés.
            return Conversor(num / 2); //Dominio: divide el número entre dos y eso lo manda de nuevo al método.
        }
    }
}
