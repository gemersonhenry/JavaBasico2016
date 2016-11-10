package tema_05;

public class Ventas {
    
    private String tipo_de_venta;
    private String dia_de_venta;

    public Ventas() {
    }

    public Ventas(String tipo_de_venta, String dia_de_venta) {
        this.tipo_de_venta = tipo_de_venta;
        this.dia_de_venta = dia_de_venta;
    }

    public String getTipo_de_venta() {
        return tipo_de_venta;
    }

    public void setTipo_de_venta(String tipo_de_venta) {
        this.tipo_de_venta = tipo_de_venta;
    }

    public String getDia_de_venta() {
        return dia_de_venta;
    }

    public void setDia_de_venta(String dia_de_venta) {
        this.dia_de_venta = dia_de_venta;
    }
    
    
}
