import java.util.Random;

class Main {
    public static void main(String[] args) {
        short[] z = new short[10];
        double[] x = new double[17];
        double[][] c = new double[10][17];
        Random rnd = new Random();
        System.out.print("Первый массив(Z): ");
        for (int i = 1; i < z.length; i++) {
            z[0] = 3;
            z[i] = (short) (z[i - 1] + 2);;
            System.out.printf("%d", z[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("Второй массив(x): ");
        for (int i = 0; i < x.length; i++) {
            x[i] = rnd.nextDouble(-4.0,2.0);
            System.out.printf("%f", x[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Третий массив(c): ");
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < x.length; j++) {
                    if (z[i] == 15) {
                        c[i][j] = Math.pow(3 / 4 / (1 / 2 - Math.pow(3, 0.5) * Math.cos(x[j])), Math.log(Math.pow(Math.E, x[j])));
                    }

                    if (z[i] == 9 | z[i] == 11 | z[i] == 17 | z[i] == 19 | z[i] == 21) {
                        c[i][j] = Math.pow(Math.log(Math.pow(Math.tan(x[j]), 2)), 0.5 * (4 - Math.atan(Math.pow((x[j] - 1) / 6, 2))));
                    }

                    else {
                        c[i][j] = Math.cos(Math.tan(Math.atan(1/4*(x[j]-1)/6)));
                    }
                }
            }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 17; j++) {
                System.out.printf("%10.2f", c[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}