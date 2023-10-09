public class DataTypes {
    public static void main(String[] args) {
        // Note: You can use the shortcut `sout` to generate the following line.
        System.out.println("Hello and welcome!");
        // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,

        // ## Use of var - Java 10+
        // keyword var is used to declare a variable but without specifying its type.
        // The type of the variable is inferred from the value assigned to it.
        var x = 10;
        var y = 20;
        var z = x + y;
        System.out.println("z = " + z);

        var a = 0.3;
        var z$ = z * a;
        System.out.println("z$ = " + z$);

        var salary = 1000;
        var pension = salary * 0.03;
        var totalSalary = salary - pension;

        var employeeName = "John Doe";

        System.out.println("Employee: " + employeeName + ", Salary: " + totalSalary);

        // ## Numeric data types

        // int. Max value: 2,147,483,647
        // Size: 4 bytes
        int n = 1234567890;

        // short. Max value: 32,767
        // Size: 2 bytes
        short s = 12345;

        // long. Max value: 9,223,372,036,854,775,807
        // Size: 8 bytes
        long l = 1234567890123456789L;

        // float. Max value: 3.4028235E38
        // Size: 4 bytes
        float f = 3.14159265358979323846264338327950288419716939937510582097494459230781640628620899f;

        // double. Max value: 1.7976931348623157E308
        // Size: 8 bytes
        double d = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089d;

        // byte. Max value: 127
        // Size: 1 byte
        byte b = 127;

        System.out.println("int: " + n);
        System.out.println("short: " + s);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("byte: " + b);

        // ## Boolean data type

        // boolean. Values: true, false
        // Size: 1 bit
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("isTrue: " + isTrue);
        System.out.println("isFalse: " + isFalse);

        // ## Character data type

        // char. Values: Unicode characters
        // Size: 2 bytes
        char c = 'A';
        char d1 = 'B';
        char e = 'C';

        System.out.println("c: " + c);
        System.out.println("d1: " + d1);
        System.out.println("e: " + e);

        // ## String data type

        // String. Values: Unicode characters
        // Size: 2 bytes per character
        String str = "Hello World!";

        System.out.println("str: " + str);

        // ## Type casting

        // Implicit casting
        int i = 10;
        long l1 = i; // warning: Local variable 'l1' is redundant

        System.out.println("i: " + i);
        System.out.println("l1: " + l1);

        // Explicit casting
        long l2 = 100;
        int i1 = (int) l2;

        System.out.println("l2: " + l2);
        System.out.println("i1: " + i1);
    }
}
