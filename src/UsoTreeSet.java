import java.util.Iterator;
import java.util.TreeSet;

public class UsoTreeSet
{
    private TreeSet<Producto> treeSet = new TreeSet<>();

    public void add(Producto p)
    {
        treeSet.add(p);
    }

    public UsoTreeSet(TreeSet<Producto> treeSet)
    {
        this.treeSet = treeSet;
    }

    public UsoTreeSet()
    {

    }

    @Override
    public String toString()
    {
        String cadena = "";

        //orden normal
        Iterator iterator = treeSet.iterator();
        cadena += "USANDO ITERATOR TREESET \n";
        while (iterator.hasNext())
        {
            cadena += iterator.next() + "\n";
        }

        //orden invertido usando descendingIterator()
        Iterator iter = treeSet.descendingIterator();
        cadena += "\n USANDO LIST-ITERATOR TREESET \n";
        while (iter.hasNext())
        {
            cadena+=iter.next()+"\n";
        }

        return cadena;
    }

    public static void main(String [] args)
    {
        UsoTreeSet tree = new UsoTreeSet();
        tree.add(new Producto(1, "GALLETAS", 200));
        tree.add(new Producto(2, "CEREAL", 2000));
        tree.add(new Producto(3, "PAPAS", 500));
        tree.add(new Producto(4, "TOMATES", 1000));
        tree.add(new Producto(5, "CHILE", 400));
        tree.add(new Producto(6, "ARROZ", 3500));

        System.out.println(tree.toString());
    }
}
