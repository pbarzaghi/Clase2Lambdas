package ar.programa;

import ar.programa.interfaces.Transforme;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3Ejercicio2 {

    public static void main( String[] args )
    {

        int nRepeticiones=6;
        System.out.println("----   CLASE 3  -- > EJERCICIO 1   ------");
        List<String> cadenaEjemplo1=ejercicio1(cargarLitaString());
        cadenaEjemplo1.forEach(e -> System.out.println(e));
        System.out.println("\n-------------------------------------");

        System.out.println("----   CLASE 3  -- > EJERCICIO 2   ------");
        List<String> cadenaEjemplo2= cargarLitaString();
        System.out.println("Nro de caracteres :"+nRepeticiones);
        System.out.println("Cadena de String Original:");
        cadenaEjemplo2.forEach(e -> System.out.print(e));
        System.out.println("\nResultado:");
        String str= ejercicio2(cadenaEjemplo2,nRepeticiones);
        System.out.print(str);

    }


    private static List<String> ejercicio1(List<String> cadena){
        return cadena.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }
    private static String ejercicio2(List<String> cadena,int nro){
        return cadena.stream().filter(st -> st.length() > nro).collect(Collectors.joining( ", "));
    }




    private static List<String> cargarLitaString() {
        ArrayList<String> cadenaStr=new ArrayList<>();
            cadenaStr.add("Primero");
            cadenaStr.add("Segundo");
            cadenaStr.add("Tercero");
            cadenaStr.add("Cuarto");
            cadenaStr.add("Quinto");
            cadenaStr.add("Sexto");
            cadenaStr.add("Septimo");
            cadenaStr.add("Octavo");
            cadenaStr.add("Noveno");
            cadenaStr.add("Decimo");
        return cadenaStr;
    }


}
