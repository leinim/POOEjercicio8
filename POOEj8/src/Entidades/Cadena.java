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
package Entidades;
//

/**
 *
 * @author Mile
 */
public class Cadena {
    
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    
    public int mostrarVocales(Cadena c){
        int contador;
        contador = 0;
        String fra = c.getFrase().toLowerCase();
        for (int i = 0; i < c.getLongitud(); i++){
            switch (fra.substring(i, i+1)){
                case "a":
                    contador++;
                    break;
                case "e":
                    contador++;
                    break;
                case "i":
                    contador++;
                    break;
                case "o":
                    contador++;
                    break;
                case "u":
                    contador++;
                    break;
                default:    
                    break;    
                    
            }
        }
        return contador;
        
    }
    
    public String invertirFrase(Cadena c){
        String fraseInv;
        fraseInv = "";
        for (int i = c.getLongitud()-1; i >= 0; i--){
            fraseInv += c.getFrase().charAt(i);
            
        }
        return fraseInv;
        
    }
    public int vecesRepetido(String letra, Cadena c){
        int contador;
        String fra = c.getFrase();
        
        contador = 0;
        for (int i = 0; i < c.getLongitud(); i++){
            String letra1 = fra.substring(i, i+1);
            if (letra.equalsIgnoreCase(letra1)){
                contador++;
            }
            
                
        }
        return contador;
              
    }
     public boolean compararLongitud(String frase, Cadena c){
        boolean igualLong;
        igualLong = c.getLongitud() == frase.length();
        
        return igualLong;      
   
    }
    
    public String unirFrases(String frase, Cadena c){
        String frase2 = c.getFrase() + " " + frase;
        
        return frase2;        
    }
    
    public String reemplazar(String letra, Cadena c){
        String frase1 = "";
        String fra = c.getFrase();
        for ( int i = 0; i < c.getLongitud(); i++){
            if (fra.substring(i, i+1).equalsIgnoreCase("a")){
                frase1 += letra;
            } else {
                frase1 += fra.charAt(i);
            }
        }
        return frase1;
    }
    
    public boolean contiene(String letra, Cadena c){
        boolean contener = false;        
        for (int i = 0; i < c.getLongitud(); i++){
            if (c.getFrase().substring(i, i+1).equalsIgnoreCase(letra)){
                contener = true;
                break;
            }
        }        
        return contener;
    }
}
