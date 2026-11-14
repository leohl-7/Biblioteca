public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    public void devolver() {
        disponible = true;
    }

    public void mostrarFicha() {
        if (disponible) {
            System.out.println("Libro: " + titulo + " (" + autor + ") - disponible");
        } else {
            System.out.println("Libro: " + titulo + " (" + autor + ") - prestado");
        }
    }

    public String getTitulo() {
        return titulo;
    }
}
