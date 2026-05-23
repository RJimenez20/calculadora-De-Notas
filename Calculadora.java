import java.util.HashMap;
import java.util.Map;
public class Calculadora {
    private Map<String, Estudiante> estudiantes;

    public Calculadora() {
        this.estudiantes = new HashMap<>();
    }

    public void registrarEstudiante(String nombre) {
        estudiantes.put(nombre, new Estudiante(nombre));
        System.out.println("Estudiante registrado: " + nombre);
    }

    public void agregarNota(String nombre, double nota) {
        Estudiante e = estudiantes.get(nombre);
        if (e == null) {
            System.out.println("Estudiante no encontrado: " + nombre);
            return;
        }
        e.agregarNota(nota); // puede lanzar NotaInvalidaException
    }

    public void mostrarPromedio(String nombre) {
        Estudiante e = estudiantes.get(nombre);
        if (e == null) {
            System.out.println("Estudiante no encontrado.");
            return;
        }
        double promedio = e.calcularPromedio();
        String estado = promedio >= 3.0 ? "APROBADO" : "REPROBADO";
        System.out.printf("Promedio de %s: %.2f → %s%n", nombre, promedio, estado);
    }
}
