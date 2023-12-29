public class AreaCircle {
    public static void main(String[] args) {
//        System.out.println(calcAreaOfCircle(3)); // 28.274333882308138
//        System.out.println(calcPathVelocity(0.8, 3)); // 1.6755160819145563
//        System.out.println(calcCentripetalAccel(1.67, .8)); // 3.486125
//        System.out.println(calcCentripetalForce(.2, 3.504)); // 0.7008000000000001

        System.out.println(calcCentripetalForce(.2, .8, 3)); // 0.7018385351885765

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

    private static double calcPathVelocity(double radius, double period) {
        double circumference = 2 * Math.PI * radius;
        return circumference / period;
    }

    private static double calcCentripetalAccel(double pathVel, double radius) {
        return Math.pow(pathVel, 2) / radius;
    }

    private static double calcCentripetalForce(double mass, double acc) {
        return mass * acc;
    }

    public static double calcCentripetalForce(double mass, double radius, double period) {
        double pathVelocity = calcPathVelocity(radius, period);
        double centripetalAccel = calcCentripetalAccel(pathVelocity, radius);
        double centripetalForce = calcCentripetalForce(mass,centripetalAccel);
        return centripetalForce;
    }
}
