import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        System.out.println(list.size());
        list.add("India");
        list.add("SriLanka");
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list);
        list.add("India");
        list.add("Srilanka");
        System.out.println(list.size());
        System.out.println(list);
        list.add(1,"Bhutan");
        System.out.println(list.size());
        System.out.println(list);
    }
}
