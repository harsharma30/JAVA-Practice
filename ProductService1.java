public class ProductService1 {
    list.addProduct(new Product(111,"Mouse",4,450));
    list.addProduct(new Product(222,"Keyboard",2,1450));
    list.addProduct(new Product(333,"Scanner", 3,4500));
    list.showAllProducts();

    System.out.println(list.searchPrductbyID(222));
    int prodId = 2232;
    Product temp = list.searchPrductbyId(prodId);
    if(temp == null){
        System.err.println("Product not found for prod ID: "+prodId);
    }
    else{
        System.out.println(temp);
    }

    //removing  product by id
    list.removeProductById(prodId);
    list.removeProductById(111);
}
