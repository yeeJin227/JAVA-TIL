package Rectangle;

public class RectangleMain {
    public static void main(String[] args) {
        RectangleData data = new RectangleData();

        data.width = 8;
        data.height = 8;

        int area = data.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = data.calculatePerimeter();
        System.out.println("둘레: " + perimeter);

        boolean  square = data.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}
