import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UsoMap
{
    private Map<Integer, Producto> map = new HashMap<>();

    public void add(Producto p)
    {
        map.put(p.hashCode(), p);
    }

    @Override
    public String toString()
    {
        String cadena = "";

        Iterator<Map.Entry<Integer, Producto>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<Integer, Producto> entry = iterator.next();
            cadena += "Key = " + entry.getKey() +
                    ", Value = " + entry.getValue() + "\n";
        }

        return cadena;
    }

    public static void main(String [] args)
    {
        UsoMap map = new UsoMap();
        map.add(new Producto(1, "GALLETAS", 200));
        map.add(new Producto(2, "CEREAL", 2000));
        map.add(new Producto(3, "PAPAS", 500));
        map.add(new Producto(4, "TOMATES", 1000));
        map.add(new Producto(5, "CHILE", 400));
        map.add(new Producto(6, "ARROZ", 3500));

        System.out.println(map.toString());
    }
}
