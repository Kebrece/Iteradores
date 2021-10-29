public class Producto implements Comparable<Producto>
{

    private int id;
    private String nombre;
    private int cantidad;

    public Producto(int id, String nombre, int cantidad)
    {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int compareTo(Producto pr)
    {
        if(getId()==pr.getId())
            return 0;
        else if(getId()>pr.getId())
            return 1;
        else
            return -1;
    }

    @Override
    public String toString()
    {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this==o) return true;
        else
            return false;
    }
}
