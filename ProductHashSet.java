import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class ProductHashSet {
    private  int prodId;
    private String prodName;
    private  double prodPrice;

    public int getProdId(){
        return prodId;
    }
    public void setprodId(int prodId){
        this.prodId = prodId;
    }
    public String getprodName(){
        return prodName;
    }
    public void setprodName(String prodName){
        this.prodName = prodName;
    }
    public double getprodPrice(){
        return prodPrice;
    }
    public void setprodPrice(double prodPrice){
        this.prodPrice = prodPrice;
    }


    //write a code to search a product having prodId = 222
    public boolean searchById(HashSet<Product> set,int prodId) {
		//write code to search a product having prodId=prodId
		boolean status=false;
		for(Product prod:set) {
			if(prod.getProdId()==prodId) {
				status=true;
				System.out.println(prod);
				break;
			}
		}
		return status;
	}
    public Set<Product> findProductHavingPriceRange(HashSet<Product> set, double minVal, double maxVal){
        HashSet<Product> newSet = null;
        
        return newSet;
    }
}
