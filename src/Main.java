public class Main {

    public static void main(String[] args) {

        System.out.println(area (10));
        System.out.println(area (25, 25));
    }
    public static double area(double r) {
        if(r < 0){
            return -1;
        }
        return r * r * Math.PI;
    }
    public static double area(double x, double y) {
        if(x < 0 || y < 0){
            return -1;
        }

        return x * y;
    }

}
