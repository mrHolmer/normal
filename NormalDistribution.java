public class NormalDistribution {
    private double mu;
    private double sigma;
    public NormalDistribution() {
        sigma = 1;
    }

    public NormalDistribution(double m, double s) {
        mu = m;
        sigma = s;
    }

    public double pdf(double x) {
        double a = 1 / (Math.sqrt(2 * Math.PI * Math.pow(sigma, 2)));
        double b = Math.pow(Math.E, -Math.pow(x - mu, 2) / (2 * Math.pow(sigma, 2)));
        return a * b;
    }

    public double trapezoid(double left, double right, double interval) {
        double average = (left + right) / 2;
        return average * interval;
    }
    
    public double riemann(double left, double right, int slices) {
        double area = 0;
        double dx = (right - left) / slices;
        for (int i = 0; i < slices; i++) {
            double x = left + i * dx;
            area += trapezoid(pdf(x), pdf(x + dx), dx);
        }
        return area;
    }

    public double cdf(double left, double right) {
        return riemann(left, right, (int) Math.pow(10, 7));
    }

    public double cdf(double value) {
        return riemann(-10, value, (int) Math.pow(10, 7));
    }

}