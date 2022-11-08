import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
		for(int i = 0; i < 2; i++){
                	Scanner sc1 = new Scanner(System.in);
                	System.out.println("g’·:");
                	double a = sc1.nextDouble();
                	Scanner sc2 = new Scanner(System.in);
                	System.out.println("‘Ìd:");
                	double b = sc2.nextDouble();
                	double bmi=(b/(a*a));
                	System.out.println(String.format("%.2f",bmi));
		}
        }
}
