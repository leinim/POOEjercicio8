/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package pooej8;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class POOEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cadena c1 = new Cadena();
        
        System.out.println("Ingrese una palabra o frase");
        String frase = leer.nextLine();
        
        c1.setFrase(frase);
        c1.setLongitud(frase.length());
        
        System.out.println("La frase contiene " + c1.mostrarVocales(c1) + " vocales.");
        System.out.println("La frase invertida queda asi: " + c1.invertirFrase(c1));
        
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        
        System.out.println("La letra ingresada se repite " + c1.vecesRepetido(letra, c1) + " vez/veces.");
        
        System.out.println("Ingrese otra palabra o frase");
        frase = leer.nextLine();
               
        if (c1.compararLongitud(frase, c1) == true){
          System.out.println("Las frases tienen la misma longitud.");  
        } else {
          System.out.println("Las frases no tienen la misma longitud.");
        }
        
        System.out.println("Ingrese otra palabra o frase");
        frase = leer.nextLine();
        
        System.out.println("La frase original unida a la frase ingresada queda asi:" + c1.unirFrases(frase, c1));
        
        System.out.println("Ingrese un caracter");
        letra = leer.next();
        
        System.out.println("Cambiamos las ´a´ por el caracter ingresado: " + c1.reemplazar(letra, c1));
        
        System.out.println("Ingrese la letra que desee comprobar si se encuentra en la frase");
        letra = leer.next();
        
        if (c1.contiene(letra, c1) == true){
            System.out.println("La frase contiene la letra ingresada.");
        } else {
            System.out.println("La frase no contiene la letra ingresada.");
        }
        
        
    }
    
}
