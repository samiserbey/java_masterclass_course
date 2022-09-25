package udemy_course.section6.vehicle;

public class Main {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari(12);
        ferrari.steer(45);
        ferrari.accelerate(30);
        ferrari.accelerate(20);
        ferrari.accelerate(-42);
    }
}
