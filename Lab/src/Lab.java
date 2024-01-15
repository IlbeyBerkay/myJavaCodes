import java.util.LinkedList;
import java.util.ListIterator;

public class Lab {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Maviş");
        list.add("Beyaz");
        list.add("Karagöz");

        System.out.println("Forward Iteration:");

        ListIterator list_Iter = list.listIterator();
        while(list_Iter.hasNext()){
            System.out.println(list_Iter.next());
        }

        System.out.println("Backward Iteration:");

        while(list_Iter.hasPrevious()){
            System.out.println(list_Iter.previous());
        }
    }
}
