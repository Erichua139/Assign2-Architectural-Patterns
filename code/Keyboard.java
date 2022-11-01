import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Keyboard {
  private Display theDisplay;
  private CashRegister theCashRegister;

  public Keyboard(Display theDisplay, CashRegister theCashRegister){
    this.theDisplay = theDisplay;
    this.theCashRegister = theCashRegister;

    this.theDisplay.findProductListener(new productListener());
  }

  class productListener implements ActionListener{
    public void actionPerformed(ActionEvent arg0) {
      int productNum = 0;
      try {
        productNum = theDisplay.getProductNum();

        theCashRegister.findProduct(productNum);
        
        theDisplay.setProductName(theCashRegister.getProductName());
        theDisplay.setProductPrice(theCashRegister.getProductPrice());
        theDisplay.setTotal(theCashRegister.getTotal());
      } catch(NumberFormatException ex){
        // TODO: handle exception
        System.out.println(ex);
        theDisplay.displayErrorMessage("You Need to Enter an product id");
      }
    }
  }
}