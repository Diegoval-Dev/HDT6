package Model;

public class Product {
    private String categoria;
    private String nombre;

    public Product(String categoria, String nombre) {
        this.categoria = categoria;
        this.nombre = nombre;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
