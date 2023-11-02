
class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        this.radius = r;
        color = "red";
    }

    public Circle(double r, String col) {
        radius = r;
        color = col;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return String.format("Kruh[radius= %.2f, barva = %s]", radius, color);
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.println(c1.toString());

        Circle c2 = new Circle(1.2);
        System.out.println(c2.toString());
        System.out.println(c2);

        Circle c3 = new Circle(3.0, "black");
        System.out.printf("Radius kruhu %.2f, barva %s a jeho obsah %.2f%n", c3.getRadius(), c3.getColor(), c3.getArea());

        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("Radius je " + c4.getRadius());
        c4.setColor("blue");
        System.out.println("Barva je " + c4.getColor());
    }
}
