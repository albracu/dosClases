package dosclases;

public class Encadenar {
    private int mes;
    private int dia;
    private int anio;

    public Encadenar(int m, int d, int a){
        mes = m;
        dia = d;
        anio = a;

        System.out.printf("El conctructor es: %s\n", this);
    }

    public String toString() {
        return String.format("%d/%d/%d", mes,dia,anio);
    }
}
