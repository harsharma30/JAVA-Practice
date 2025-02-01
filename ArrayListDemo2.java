import java.util.ArrayList;
public class ArrayListDemo2 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("India");
        list.add("SriLanka");
        list.add(1,"Bhutan");

        //calling simply collection object
        System.out.println(list);
        //using loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get[i]+"\t");
        }

        //using enhanced loop
        System.out.println();
        for(String str:list){
            System.out.println(str + "\t");
        }
        //using iterator

    }
}
