import java.awt.event.ActionListener;
import javax.swing.*;

public class Display extends JFrame{
  private JLabel productID = new JLabel("Product ID:");
  private JTextField productNum = new JTextField(10);
  private JButton findProductButton = new JButton("Query For Product");
  private JLabel ItemName = new JLabel("Item Name:");
  private JTextField productName = new JTextField(10);
  private JLabel Cost = new JLabel("Cost: ");
  private JLabel dollarSign = new JLabel("$");
  private JTextField productPrice = new JTextField(10);
  private JLabel totalAmount = new JLabel("Total: $");
  private JTextField total = new JTextField(7);

  Display(){
    JPanel displayPanel = new JPanel();

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(900,  200);

    displayPanel.add(productID);
    displayPanel.add(productNum);
    displayPanel.add(findProductButton);
    displayPanel.add(ItemName);
    displayPanel.add(productName);
    displayPanel.add(Cost);
    displayPanel.add(dollarSign);
    displayPanel.add(productPrice);
    displayPanel.add(totalAmount);
    displayPanel.add(total);

    this.add(displayPanel);
  }


  public int getProductNum(){
    return Integer.parseInt(productNum.getText());
  }
  public int getProductName(){
    return Integer.parseInt(productName.getText());
  }
  public int getProductPrice(){
    return Integer.parseInt(productPrice.getText());
  }

  public void setProductName(String name){
    productName.setText(name);
  }
  public void setProductPrice(int price){
    productPrice.setText(Integer.toString(price));
  }
  public void setTotal(int price){
    total.setText(Integer.toString(price));
  }


  void findProductListener(ActionListener listenForFindButton){
    findProductButton.addActionListener(listenForFindButton);
  }

  void displayErrorMessage(String errorMessage){
    JOptionPane.showMessageDialog(this, errorMessage, errorMessage, ABORT);
  }


  
}