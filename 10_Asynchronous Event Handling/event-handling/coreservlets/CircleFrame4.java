package coreservlets;

import javax.swing.*;

public class CircleFrame4 extends JFrame {
  public CircleFrame4() {
    super("Anonymous Inner Class");
    setContentPane(new CirclePanel4());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new CircleFrame4();
  }
}
