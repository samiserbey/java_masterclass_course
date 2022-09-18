package udemy_course.section4;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(6044);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int rest = kiloBytes % 1024;
            int megaBytes = (kiloBytes - rest) / 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + rest + " KB");
        }
    }
 
}