package dosclases;

public class DosClases {
    public static void main(String[] args) {
        Club miembro1 = new Club("juan", "Lopez");
        Club miembro2 = new Club("Alfredo", "Bravo");

        System.out.println();
        System.out.println("El nombre del socio 1 es: "+ miembro1.getNombre());
        System.out.println("El apellido del socio 1 es: "+ miembro1.getApellido());
        System.out.println("El total de socios es: "+ miembro1.getMiembros());


    }
}
