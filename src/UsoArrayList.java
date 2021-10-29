import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UsoArrayList
{
    List<Producto> arrayList = new ArrayList<>();

    public UsoArrayList(List<Producto> arrayList)
    {
        this.arrayList = arrayList;
    }

    public UsoArrayList()
    {

    }

    public void add(Producto p)
    {
        arrayList.add(p);
    }

    @Override
    public String toString()
    {
        String cadena = "";
        Iterator iterator = arrayList.iterator();
        cadena += "USANDO ITERATOR \n";
        while (iterator.hasNext())
        {
            cadena += iterator.next() + "\n";
        }

        ListIterator<Producto> iter = arrayList.listIterator();
        cadena += "USANDO LIST-ITERATOR \n";
        while(iter.hasNext())
        {
            cadena += iter.next() + "\n";
        }

        return cadena;
    }

    public static void main(String [] args)
    {
        UsoArrayList miArray = new UsoArrayList();
        miArray.add(new Producto(1, "GALLETAS", 200));
        miArray.add(new Producto(2, "CEREAL", 2000));
        miArray.add(new Producto(3, "PAPAS", 500));
        miArray.add(new Producto(4, "TOMATES", 1000));
        miArray.add(new Producto(5, "CHILE", 400));
        miArray.add(new Producto(6, "ARROZ", 3500));

        System.out.println(miArray.toString());
    }
}
