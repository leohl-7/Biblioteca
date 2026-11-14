public class Socio {
    private String nombre;
    private int numeroSocio;
    private Libro libroActual;

    public Socio(String nombre, int numeroSocio) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.libroActual = null;
    }

    public void pedirLibro(Libro libro) {
        if (libroActual != null) {
            System.out.println(nombre + " ya tiene un libro: "
                    + libroActual.getTitulo());
        } else {
            if (libro.prestar()) {
                libroActual = libro;
                System.out.println(nombre + " se lleva "
                        + libro.getTitulo());
            } else {
                System.out.println(libro.getTitulo()
                        + " no esta disponible para " + nombre);
            }
        }
    }

    public void devolverLibro() {
        if (libroActual == null) {
            System.out.println(nombre
                    + " no tiene ningun libro que devolver");
        } else {
            System.out.println(nombre + " devuelve "
                    + libroActual.getTitulo());

            libroActual.devolver();
            libroActual = null;
        }
    }
}
