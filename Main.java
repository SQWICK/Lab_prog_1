import java.util.Random;

class Main {
    public static void main(String[] args) {
        short[] z = ZArray();
        double[] x = XArray();
        double[][] c = CArray(z, x);


        Printall1("Первый массив(Z): ", z);
        Printall2("Второй массив(x): ", x);
        Printall3("Третий массив(c): ", c);

    }

    public static short[] ZArray() {
        short[] z = new short[10];
        for (int i = 1; i < z.length; i++) {
            z[0] = 3;
            z[i] = (short) (z[i - 1] + 2);
        }
        return z;
    }

    public static double[] XArray() {
        double[] x = new double[17];
        Random rnd = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rnd.nextDouble(-4.0, 2.0);
        }
        return x;
    }

    public static double[][] CArray(short[] z, double[] x) {
        double[][] c = new double[10][17];
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (z[i] == 15) {
                    c[i][j] = Math.pow(3 / 4 / (1 / 2 - Math.cbrt(Math.cos(x[j]))), Math.log(Math.pow(Math.E, x[j])));
                } else if (z[i] == 9 || z[i] == 11 || z[i] == 17 || z[i] == 19 || z[i] == 21) {
                    c[i][j] = Math.pow(Math.log(Math.pow(Math.tan(x[j]), 2)), 0.5 * (4 - Math.atan(Math.pow((x[j] - 1) / 6, 2))));
                } else {
                    c[i][j] = Math.cos(Math.tan(Math.atan(1 / 4 * (x[j] - 1) / 6)));
                }
            }
        }
        return c;
    }

    public static void Printall1(String Printall1, short[] cn) {
        System.out.print(Printall1);
        for (short num : cn) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }

    public static void Printall2(String Printall2, double[] cn) {
        System.out.print(Printall2);
        for (double num : cn) {
            System.out.printf("%f ", num);
        }
        System.out.println();
    }

    public static void Printall3(String Printall3, double[][] cn) {
        System.out.println(Printall3);
        for (double[] row : cn) {
            for (double num : row) {
                System.out.printf("%10.2f ", num);
            }
            System.out.println();
        }
    }
}
