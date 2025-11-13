// File: BMIModel.java
public class BMIModel {
    private double height;
    private double weight;

    public BMIModel(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double calculateBMI() {
        return weight / Math.pow(height / 100, 2); // convert cm to meter
    }

    public String getCategory(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 24.9)
            return "Normal weight";
        else if (bmi < 29.9)
            return "Overweight";
        else
            return "Obese";
    }
}
