public class Main {
    public static void main(String[] args) {
        NormalDistribution normal = new NormalDistribution();
        System.out.println(normal.pdf(-1));
        System.out.println(normal.pdf(1));
        System.out.println(normal.trapezoid(3, 9, 2));
        System.out.println(normal.riemann(-1, 1, (int)Math.pow(10, 7)));
        System.out.println(normal.cdf(-100, 100));
        System.out.println(normal.cdf(0, Math.pow(10, 5)));
        System.out.println(normal.cdf(1));
    }
}