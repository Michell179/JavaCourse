public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        // Sumar Bono 200 pesos
        salary += 200;

        // Bono 200
        salary = salary + 200;
        System.out.println("Salario + Bono " + salary);

        // Pnesion de 10% - Descuento
        salary = salary - 50;
        System.out.println("Pension " + salary);

        // 2 Horas extras 30 pesos C/U
        // Cupon de Alimentacion 45
        salary = salary + (30 *2) - 45;
        System.out.println("Pago " + salary);

        // Actualizar cadenas de texto
        String nombreEpleado = "Michell ";
        nombreEpleado = nombreEpleado + "Arias Orozco";
        System.out.println(nombreEpleado);

        // Actualizando Nombres
        nombreEpleado = "Felipe " + nombreEpleado;
        System.out.println(nombreEpleado);

        // Actualizando variable tel
        String tel = "4996";
        System.out.println(tel);

        // Agregando nuevos valores a la variable
        tel = tel + "232";
        System.out.println(tel);
    }
}
