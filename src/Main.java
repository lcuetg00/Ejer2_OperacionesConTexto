import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        final String texto = "Proconsi es una empresa de Tecnologías de la Información y la Comunicación especializada en el desarrollo e integración de soluciones informáticas para todo tipo de empresas. Más de tres décadas de experiencia avalan a una compañía tan flexible como responsable. Cuenta con un equipo multidisciplinar de más de 120 profesionales cualificados, expertos y comprometidos con un único objetivo: hallar la solución tecnológica exacta para cada cliente. Proconsi es especialista en la creación y el desarrollo de software de gestión, consultoría tecnológica, dirección y gestión de proyectos I+D+i basados en TIC, soporte técnico, aplicaciones móviles y fomento de tendencias en nuevas tecnologías, como el cloud computing.";

        System.out.println("Número de caracteres en el texto: " + texto.length());
        System.out.println("Texto en mayúsculas :");
        System.out.println(texto.toUpperCase());

        System.out.println("Texto en minúsculas :");
        System.out.println(texto.toLowerCase());

        System.out.println("Palabras junto a sus repeticiones :");
        //Hashmap contendrá como llave la palabra y como valor el número de repeticiones ella
        HashMap<String, Integer> listaPalabras = new HashMap<String, Integer>();

        final String textoSinSimbolosDePuntuacion = texto.replaceAll("[¿?¡!,.:;()]",""); //Cambio los simbolos de puntuación que aparecen en el español por la cadena vacía
        //Utilizando los Greedy quantifiers (Class Pattern)
        // \s+ = caracteres espacio donde haya 1 o más de 1 seguidos

        //Reemplazo todos los caracteres \s (tanto 1 como más de uno seguidos) con la cadena vacía ''
        String[] arrayPalabrasSeparadas = textoSinSimbolosDePuntuacion.split("\\s+"); //Array de String que contiene cada palabra separada

        for(String palabra : arrayPalabrasSeparadas) {
            if(listaPalabras.containsKey(palabra)) { //Si la lista ya contiene la palabra, actualizamos su número de repeticiones
                listaPalabras.put(palabra, (listaPalabras.get(palabra)+1));
            } else {
                listaPalabras.put(palabra, 1); //Añadimos la palabra al hashmap y marcamos que es la primera vez que aparece
            }
        }




        System.out.println("Reemplazar \"Proconsi\" por \"Isnocorp\":");
        System.out.println(texto.replaceAll("Proconsi", "Isnocorp"));


        System.out.println("Concatenar el texto 1000 veces: ");

        long startTime = System.nanoTime();


        long endTime = System.nanoTime();

        long duration = ((endTime - startTime)/1000000); //tiempo en milisegundos

        System.out.println("["+"\s"+"]");






    }
}