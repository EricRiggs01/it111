import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {

    public static void main(String[] args) {

        // declare our variables
        // we are going to make them CONSTANTS

        final int WINDOW_WIDTH = 380;
        final int WINDOW_HEIGHT = 450;

        // Create a window

        JFrame window = new JFrame();
        window.setTitle("My Simple Window");

        // setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        // setting the background color
        window.getContentPane().setBackground(Color.RED);
        // setting the location that our form first appears
        window.setLocation(550,300);

        // Set the layout manager to null for absolute positioning
        window.setLayout(null);

        JLabel label = new JLabel("My First Big label!!!");
        label.setBounds(17,20,200,90);

        // Set the bigger and bold font for the label
        Font currentFont = label.getFont();
        Font newFont = currentFont.deriveFont(Font.BOLD, currentFont.getSize() + 3.0f);
        label.setFont(newFont);

        JTextField textField = new JTextField();
        textField.setBounds(18,75,275,40);

        window.add(label);
        window.add(textField);

        // Second label and text field
        JLabel label2 = new JLabel("My Second Big Label!");
        label2.setBounds(17, 120, 150, 30);

        // Set the bigger font for the second label
        Font currentFont2 = label2.getFont();
        Font newFont2 = currentFont2.deriveFont(currentFont2.getSize() + 1.5f);
        label2.setFont(newFont2);

        JTextField textField2 = new JTextField();
        textField2.setBounds(17, 150, 275, 40);

        window.add(label2);
        window.add(textField2);

        // close the window and exit the program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the window - if we do not display the window it will not display
        // displaying the window is a boolean

        window.setVisible(true);
    }
}