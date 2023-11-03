package ar.programa;

import ar.programa.interfaces.Transforme;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class Clase2
{
    public static void main( String[] args )
    {
     Transforme mayuscula=new Transforme() {
            @Override
            public List<String> convertir(List<String> cadena) {

              return  cadena.stream()
                        .map(elemento -> elemento.toUpperCase())
                        .collect(Collectors.toList());

              }
        };


        List<String> cadena= devolverListaString();
        System.out.println("\nResultato: ");
        mayuscula.convertir(cadena).forEach(r -> System.out.print(r));

    }



    private static List<String> devolverListaString(){
        ArrayList<String> cadena=new ArrayList<>();
        cadena.add("hola!!! ");
        cadena.add("la cadema ");
        cadena.add("tiene que ");
        cadena.add("salir en mayuscyula.");
        System.out.println("Cadena Original:");
        cadena.forEach(e -> System.out.print(e));
        return cadena;

    }
}
