public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1: \nwidth = " + rectangle1.getWidth() + ", height = " + rectangle1.getHeight() + ", area = " + rectangle1.getArea() + ", perimeter = " + rectangle1.getPerimeter() + "\n");
        System.out.println("Rectangle 2: \nwidth = " + rectangle2.getWidth() + ", height = " + rectangle2.getHeight() + ", area = " + rectangle2.getArea() + ", perimeter = " + rectangle2.getPerimeter());
    }
}
