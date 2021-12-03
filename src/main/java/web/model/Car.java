package web.model;

public class Car {
    private String model;
    private String color;
    private String year;

    public Car (String model, String color, String year) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model +
                ", color='" + color +
                ", year='" + year +
                '}';
    }
}
