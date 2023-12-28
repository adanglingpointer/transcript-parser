public class AreaCircle {
    public static void main(String[] args) {
        System.out.println(calcAreaOfCircle(3)); //28.274333882308138
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
}
