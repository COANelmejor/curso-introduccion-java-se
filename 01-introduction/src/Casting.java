public class Casting {
    public static void main(String[] args) {
        // En un año ubicar 30 perritos
        // Cuantos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        // Estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        // Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        // Otros ejemplos

        double c1 = a/b;
        double c2 = (double) a/b;
        System.out.println(c1);
        System.out.println(c2);

        char n = '1';
        int nI = n;
        System.out.println(n);  // 1
        System.out.println(nI); // 49 // 1 en ASCII

        short nS = (short) n;
        System.out.println(nS); // 49
    }
}
