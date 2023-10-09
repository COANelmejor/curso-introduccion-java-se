public class MathematicalOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // Constantes de la clase Math
        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.ceil(x)); // Redondea hacia arriba
        System.out.println(Math.floor(x)); // Redondea hacia abajo
        System.out.println(Math.pow(x, y)); // Potencia
        System.out.println(Math.max(x, y)); // Devuelve el número más grande

        System.out.println(Math.sqrt(y)); // Raíz cuadrada

        // Área de un círculo
        // pi * r^2
        System.out.println(Math.PI * Math.pow(y, 2));

        // Área de una esfera
        // 4 * pi * r^2
        System.out.println(4 * Math.PI * Math.pow(y, 2));

        // Volumen de una esfera
        // (4/3) * pi * r^3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
