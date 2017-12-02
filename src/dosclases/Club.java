package dosclases;

public class Club {
    private String nombre;
    private String apellido;
    private static int contador = 0;

    public Club(String nom, String ape){
        nombre = nom;
        apellido = ape;
        contador++;

        System.out.printf("Constructor para %s  %s, hay %d\n ", nombre, apellido, contador);
    }

}
