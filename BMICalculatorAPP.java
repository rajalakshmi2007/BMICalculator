// File: BMICalculatorApp.java
import javax.swing.*;
import java.awt.event.*;

public class BMICalculatorApp implements ActionListener {
    private BMIView view;

    public BMICalculatorApp(BMIView view) {
        this.view = view;

        // Attach event listeners
        this.view.calcButton.addActionListener(this);
        this.view.clearButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.calcButton) {
            try {
                double height = Double.parseDouble(view.heightField.getText());
                double weight = Double.parseDouble(view.weightField.getText());

                BMIModel model = new BMIModel(height, weight);
                double result = model.calculateBMI();
                String category = model.getCategory(result);

                JOptionPane.showMessageDialog(null,
                        String.format("Your BMI: %.2f\nCategory: %s", result, category),
                        "BMI Result", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid numbers!",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == view.clearButton) {
            view.heightField.setText("");
            view.weightField.setText("");
        }
    }

    public static void main(String[] args) {
        BMIView view = new BMIView();
        new BMICalculatorApp(view);
    }
}
