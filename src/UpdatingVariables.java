public class UpdatingVariables {
    public static void main(String[] args) {
        // Actualizando variables Numéricas
        int salary = 1000;

        // Bono $200
        int bonus = 200;
        salary = salary + bonus;
        System.out.println(salary);

        // Pension: $50 descuento
        int pension = 50;
        salary = salary - pension;
        System.out.println(salary);

        // 2 horas extra $30 c/u
        // Comida: $45
        int extraHours = 30;
        int comida = 45;
        salary = salary + (extraHours * 2) - comida;
        System.out.println(salary);

        // Actualizando cadenas de texto
        String employeeName = "Juan Perez";
        System.out.println(employeeName);
        employeeName = employeeName + " Diaz de Leon";
        System.out.println(employeeName);
        employeeName = "Luis " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);
    }
}
