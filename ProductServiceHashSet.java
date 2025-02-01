import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ProductServiceHashSet {
    public static void main(String[] args){
        List<Product> list=new ArrayList<Product>();
		list.add(new Product(111,"Mouse",450));
		list.add(new Product(222,"Keyboard",2450));
		list.add(new Product(333,"Scanner",4560));
		list.add(new Product(222,"Keyboard",2450));
		list.add(new Product(111,"Mouse",450));
		
		System.out.println(list);
		HashSet<Product> set=new HashSet<Product>(list);
		System.out.println(set);
		
		//write code to search a product having prodId=333
		int prodId=333;
		boolean status=new ProductPro().searchById(set, prodId);
		if(!status)
			System.err.println("Entered prodId :"+prodId+" is not found");
		
		prodId=2222;
		status=new ProductPro().searchById(set, prodId);
		if(!status)
			System.err.println("Entered prodId :"+prodId+" is not found");
    }
}
