public class AreaCircle {
    public static void main(String[] args) {
        System.out.println(calcAreaOfCircle(3)); // 28.274333882308138
        System.out.println(calcPathVelocity(0.8, 3)); // 1.6755160819145563
        System.out.println(calcCentripetalAccel(1.67, .8)); // 3.486125
    }

    /**
     * This method calculates the area of a circle
     * @param radius
     * @return
     */
    public static double calcAreaOfCircle(double radius) {
        // A = PI * r^2
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calcPathVelocity(double radius, double period) {
        double circumference = 2 * Math.PI * radius;
        return circumference / period;
    }

    public static double calcCentripetalAccel(double pathVel, double radius) {
        return Math.pow(pathVel, 2) / radius;
    }
}
