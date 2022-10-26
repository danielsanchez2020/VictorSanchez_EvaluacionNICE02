
import java.util.Arrays;

import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        /*
        String cadena;
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.print("Escriba la frase: ");
        cadena = lecturaTeclado.nextLine();
*/
        String[] ar = {"Wait","for","me"};
        Arrays.sort(ar, Collections.reverseOrder());
        //Arrays.sort(ar);
        System.out.printf("Modified ar[] Ascendente orden: %s", Arrays.toString(ar));
        //System.out.println();


        System.out.println("Hola Mundo!");
    }
}