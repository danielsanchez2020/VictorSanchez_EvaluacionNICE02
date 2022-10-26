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

        System.out.printf("Modified ar[] Ascendente orden: %s", Arrays.toString(ar));
        //System.out.println();
        Arrays.sort(ar);
        for(int i = 0; i< ar.length;i++){

            System.out.println("\n"+invertirfrase(ar[i]));
        }

        System.out.println("Hola Mundo!");
    }
    private static StringBuilder invertirfrase(String palabra) {
        StringBuilder word = new StringBuilder(palabra);
        return word.reverse();
    }
}