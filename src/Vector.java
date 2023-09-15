class Vector {  // Задание 8, создать класс вектор и сделать методы для вычисления длины, скалярного и векторного произведения, а также суммы и разности
    private double x = 0;
    private double y = 0;
    private double z = 0;

    Vector(double x_value, double y_value, double z_value) {
        this.x = x_value;
        this.y = y_value;
        this.z = z_value;
    }

    public double getLength() {
        return Math.pow(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2), 0.5);
    }

    public static double scalarProduct(Vector v1, Vector v2) {
        return (v1.x * v2.x + v1.y + v2.y + v1.z + v2.z);
    }

    public Vector vectorProduct(Vector v1, Vector v2) {
        return new Vector(v1.y * v2.z - v1.z * v2.y, v1.z * v2.x - v1.x * v2.z, v1.x * v2.y - v1.y * v2.x);
    }

    public Vector sum(Vector v1, Vector v2) {
        return new Vector(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public Vector subtraction(Vector v1, Vector v2) {
        return new Vector(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
