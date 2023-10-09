public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); // 4

        lives--; // Decrement
        System.out.println(lives); // 3

        lives++; // Increment
        System.out.println(lives); // 4

        // Postfija
        // Gana un regalo por ganar una vida
        int gift = 100 + lives++; // Primero se asigna el valor de lives a gift y luego se incrementa lives
        System.out.println(gift); // 104
        System.out.println(lives); // 5

        // Prefija
        // Gana un regalo por ganar una vida
        int gift2 = 100 + ++lives; // Primero se incrementa lives y luego se asigna el valor de lives a gift2
        System.out.println(gift2); // 106
        System.out.println(lives); // 6
    }
}
