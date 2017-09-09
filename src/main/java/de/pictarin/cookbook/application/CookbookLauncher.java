package de.pictarin.cookbook.application;

import javax.swing.JFrame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CookbookLauncher {

  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(CookbookLauncher.class);
    logger.info("Starting application");
    MainView mainView = new MainView();
    JFrame mainFrame = MainFrame.buildFrame(mainView.getPanel());
    mainFrame.setVisible(true);
  }

}
