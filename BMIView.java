// File: BMIView.java
import javax.swing.*;
import java.awt.*;

public class BMIView extends JFrame {
    JLabel heightLabel, weightLabel;
    JTextField heightField, weightField;
    JButton calcButton, clearButton;

    public BMIView() {
        setTitle("BMI Calculator");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        heightLabel = new JLabel("Enter Height (cm):");
        heightField = new JTextField();
        weightLabel = new JLabel("Enter Weight (kg):");
        weightField = new JTextField();

        calcButton = new JButton("Calculate BMI");
        clearButton = new JButton("Clear");

        add(heightLabel);
        add(heightField);
        add(weightLabel);
        add(weightField);
        add(calcButton);
        add(clearButton);

        setVisible(true);
    }
}
