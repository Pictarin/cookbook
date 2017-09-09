package de.pictarin.cookbook.application;

import javax.swing.JButton;
import javax.swing.JComponent;

public class MainView extends AbstractView {

  @Override
  public JComponent buildPanel() {
    return new JButton("Hello");
  }

}
