public class Product{
    private int prodId;
    private String name;
    private int qty;
    private double price;

    public int getprodId(){
        return prodId;
    }

    public void setprodId(int prodId){
        this.prodId = prodId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty=qty;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }
    System.out.println("Products total price whose price is between 100 to 1500 "+ totalPrice);
    Map<String, List<Product>> productByPrice = productList.stream();
}