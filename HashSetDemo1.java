import java.util.*;
public class HashSetDemo1 {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(12);
        set.add(22);
        set.add(32);
        set.add(42);
        
        System.out.println("HasetSet size is now : "+set.size());   //4

        //adding duplicate value 42
        System.out.println(set);
        set.add(42);
        System.out.println("HasetSet size is now : "+set.size());   //Still 4 because the value is repeated 

        //adding null
        set.add(null);
        System.out.println("HasetSet size is now : "+set.size());
        System.out.println(set);   

        //we have 8 integers with some duplicate  values in the list, need to make it unique
        // List<Integer> list = Arrays.asList(12,23,34,45,56,45,23,78);
        // System.out.println(list);
        // HashSet<Integer> set2=new HashSet<Integer>(list);
        // System.out.println(set2);

        //find diff between comparable and comparator
    }
}
