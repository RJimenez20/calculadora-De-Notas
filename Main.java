public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.registrarEstudiante("Ana Torres");
        calc.registrarEstudiante("Luis Gómez");

        // Notas válidas
        calc.agregarNota("Ana Torres", 4.5);
        calc.agregarNota("Ana Torres", 3.8);
        calc.agregarNota("Ana Torres", 4.0);

        calc.agregarNota("Luis Gómez", 2.5);
        calc.agregarNota("Luis Gómez", 1.8);

        // Ver promedios
        calc.mostrarPromedio("Ana Torres");
        calc.mostrarPromedio("Luis Gómez");

        // Probar la excepción
        try {
            calc.agregarNota("Ana Torres", 6.0); // inválida!
        } catch (NotaInvalidaException e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
    }
}
