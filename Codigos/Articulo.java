import java.util.ArrayList;
import java.util.List;

class Autor {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private List<Articulo> articulos;

    public Autor(String nombre, String apellido, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.articulos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }
}

class Articulo {
    private String titulo;
    private String fecha;
    private String contenido;
    private Autor autor;

    public Articulo(String titulo, String fecha, String contenido, Autor autor) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.contenido = contenido;
        this.autor = autor;
        autor.agregarArticulo(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public Autor getAutor() {
        return autor;
    }
}

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel", "García Márquez", "Colombiana");
        Autor autor2 = new Autor("Isabel", "Allende", "Chilena");

        new Articulo("Cien Años de Soledad", "1967", "Novela icónica del realismo mágico.", autor1);
        new Articulo("El Amor en los Tiempos del Cólera", "1985", "Historia de un amor eterno.", autor1);
        new Articulo("La Casa de los Espíritus", "1982", "Primera novela de la autora.", autor2);

        listarArticulosDeAutor(autor1);
        listarArticulosDeAutor(autor2);
    }

    public static void listarArticulosDeAutor(Autor autor) {
        System.out.println("Artículos de " + autor.getNombre() + " " + autor.getApellido() + ":");
        for (Articulo articulo : autor.getArticulos()) {
            System.out.println("- " + articulo.getTitulo() + " (Fecha: " + articulo.getFecha() + ")");
        }
    }
}
