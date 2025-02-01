import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        System.out.println(map.size());

        map.put(111,"Madhu");
        map.put(222,"Sandhu");
        map.put(333,"Bandhu");
        map.put(444,"Chandhu");
        map.put(555,"Ramu");
        System.out.println(map.size());
        System.out.println(map);  //LIFO
        

        //prints only key
        for(Map.Entry<Integer,String> obj :map.entrySet()){
            System.out.println(obj.getKey());
        }

        //prints only value
        for(Map.Entry<Integer,String> obj :map.entrySet()){
            System.out.println(obj.getValue());
        }

        //print both key and value
        for(Map.Entry<Integer,String> obj :map.entrySet()){
            System.out.println("Roll number: " + obj.getKey()+ " Name: " +obj.getValue());
        }
    }
}
