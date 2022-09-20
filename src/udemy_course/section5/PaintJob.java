package udemy_course.section5;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(
                getBucketCount(2.75, 3.25, 2.5, 1)); // 3
        System.out.println(getBucketCount(7.25, 4.3, 2.35));     // 14
        System.out.println(getBucketCount(3.26, 0.75));                 // 5
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double missingArea = area - (areaPerBucket * extraBuckets);
        int neededBuckets = (int) Math.ceil(missingArea / areaPerBucket);
        return neededBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area, 1, areaPerBucket);
    }
}
