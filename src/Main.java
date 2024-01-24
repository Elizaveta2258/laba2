
import java.util.Scanner;
        public class Main {
            public static double factorial(double x) {
                double s = 1;
                for (double i = 1; i <= x; i++) {
                    s *= i;
                }
                return s;
            }

            public static void main(String[] args) {
                double sum = 0;
                System.out.println("До какого числа");
                Scanner input = new Scanner(System.in);
                double a = input.nextDouble();
                System.out.println("Число");
                double b = input.nextDouble();
                for (double i = 0; i <= a; i++) {
                    sum += Math.pow(-1, i) * Math.pow(b, i) / factorial(i);

                }
                System.out.println(sum);
            }
        }