package test;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola");
    }
}

abstract class LibroRevista{
    protected Publicacion[] publicaciones;
    protected int cantidadPublicaciones;

    public LibroRevista() {
        publicaciones = new Publicacion[5];
        this.cantidadPublicaciones = 0;
    }

    abstract void mostrarDatos();
    public void cargarPublicacion(Publicacion publicacion){
        publicaciones[cantidadPublicaciones]=publicacion;
        cantidadPublicaciones++;
    }
}
abstract class Publicacion{
    protected String titulo;
    protected String autor;
    protected int anio;
    abstract void esAntigua();
}


class Libro extends LibroRevista {
    private String editorial;
    private int cantidadPagina;

    public Libro(String editorial) {
        super();
        this.editorial = editorial;
        this.cantidadPagina = 0;
    }
    @Override
    void mostrarDatos() {
        System.out.println(1);
    }
}


class Revista extends LibroRevista {
    private int issn;
    private String frecuenciaPublicacion;

    public Revista(int issn, String frecuenciaPublicacion) {
        super();
        this.issn = issn;
        this.frecuenciaPublicacion = frecuenciaPublicacion;
    }

    @Override
    void mostrarDatos() {
        System.out.println(1);
    }
}
