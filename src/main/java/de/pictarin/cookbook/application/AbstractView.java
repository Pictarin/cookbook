package de.pictarin.cookbook.application;

import javax.swing.JComponent;

public abstract class AbstractView {

  private JComponent panel;

  public AbstractView() {
    super();
  }

  public synchronized JComponent getPanel() {
    if (panel == null) {
      panel = buildPanel();
    }
    return panel;
  }

  public abstract JComponent buildPanel();
}
