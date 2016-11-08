package tema_05;

public class Productos {
    
    private String nombre_del_producto;
    private double precio_del_producto;

    public Productos() {
    }

    public Productos(String nombre_del_producto, double precio_del_producto) {
        this.nombre_del_producto = nombre_del_producto;
        this.precio_del_producto = precio_del_producto;
    }

    public String getNombre_del_producto() {
        return nombre_del_producto;
    }

    public void setNombre_del_producto(String nombre_del_producto) {
        this.nombre_del_producto = nombre_del_producto;
    }

    public double getPrecio_del_producto() {
        return precio_del_producto;
    }

    public void setPrecio_del_producto(double precio_del_producto) {
        this.precio_del_producto = precio_del_producto;
    }
    
}
