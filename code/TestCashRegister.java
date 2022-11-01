public class TestCashRegister {

  public static void main(String[] args) {
    Display theDisplay = new Display();

    CashRegister theCashRegister = new CashRegister();

    Keyboard theKeyboard = new Keyboard(theDisplay, theCashRegister);

    theDisplay.setVisible(true);
  }
}