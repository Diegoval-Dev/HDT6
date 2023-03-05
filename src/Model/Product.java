package Model;

public class Product {
    private String categoria;
    private String nombre;

    /**
     * Constructor objeto Producto
     * @param categoria categoria del producto
     * @param nombre nombre del producto
     */
    public Product(String categoria, String nombre) {
        this.categoria = categoria;
        this.nombre = nombre;
    }

    /**
     * Obtener la categoria
     * @return categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Pone una categoria
     * @param categoria categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtener el nombre del producto
     * @return nombre producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modificar el nombre
     * @param nombre nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
