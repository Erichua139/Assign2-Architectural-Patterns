import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CashRegister {

  private String productName;
  private int productPrice;
  private int total=0;
  private String filePath = "Products.txt";
  private static Scanner x;

  public void findProduct(int productId) {
    //find product from the file and store it in productName
    //find product price and place it in productPrice

    //------------------------------------------------------//
    readFile(String.valueOf(productId), filePath);
    total = total + productPrice;
  }

  public void readFile(String searchTerm, String filePath){
    boolean found = false;
    String ID = ""; String name = ""; String price = "";

    try {
      x = new Scanner(new File(filePath));
      x.useDelimiter("[,\n]");

      while (x.hasNext() && !found) {
        ID = x.next();
        name = x.next();
        price = x.next();

        if (ID.equals(searchTerm)) {
          productName = name;
          productPrice = Integer.parseInt(price.trim());
          found = true;
        }
      }
    } catch (Exception e) {
        
    }
  }

  public String getProductName(){
    return productName;
  }

  public int getProductPrice(){
    return productPrice;
  }

  public int getTotal(){
    return total;
  }
}