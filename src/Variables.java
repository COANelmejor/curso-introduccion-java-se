public class Variables {
    public static void main(String[] args) {
        // Declarando una variable
        int speed;

        // Si se trata de acceder a una variable sin inicializar, el compilador
        // arrojará un error.
        // System.out.println(speed);
        // Error: variable speed might not have been initialized

        // Inicializando una variable
        speed = 10;

        // Imprimiendo el valor de una variable
        // Ahora sí se puede acceder a la variable e imprimir su valor.
        System.out.println(speed);

        // Declarando e inicializando una variable
        int salary = 1000;

        // String
        String employeeName = "Juan Perez";
        System.out.println(employeeName);

        String employeeCompany = "Google";

    }
}
