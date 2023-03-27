package patterns;

public class Circle implements Shape {
    private  String color;
    private int x;
    private int y;
    private  int raduis;

    public Circle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRaduis() {
        return raduis;
    }

    public void setRaduis(int raduis) {
        this.raduis = raduis;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", raduis=" + raduis +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("Something Draw " + color + " " + x + " " + y + " " + " radius " + raduis);
    }
}
