import java.time.Year;

public class Car {
    public int yearsOfProd;
    String bodyType;
    String fuel;
    String model;
    String color;

    public Car(int yearsOfProd, String bodyType, String fuel, String model, String color) {
        this.yearsOfProd = yearsOfProd;
        this.bodyType = bodyType;
        this.fuel = fuel;
        this.model = model;
        this.color = color;
    }

    public Car() {
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }
    public void changeYearsOfProd(int newYear) {
        this.yearsOfProd = newYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearsOfProd=" + yearsOfProd +
                ", bodyType='" + bodyType + '\'' +
                ", fuel='" + fuel + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
