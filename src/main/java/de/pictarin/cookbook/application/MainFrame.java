package de.pictarin.cookbook.application;

import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JFrame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainFrame {

  private static final Logger LOGGER = LoggerFactory.getLogger(MainFrame.class);

  public static JFrame buildFrame(JComponent content) {
    LOGGER.info("Building frame");
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setPreferredSize(new Dimension(800, 600));
    frame.setContentPane(content);
    frame.pack();
    return frame;
  }

}
