package udemy_course.section6.wall;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());     // 20.0
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());   // 5.0
        System.out.println("height= " + wall.getHeight()); // 0.0
        System.out.println("area= " + wall.getArea());     // 0.0
    }
}
