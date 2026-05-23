import java.util.ArrayList;
import java.util.List;
public class Estudiante {
    private String nombre;
    private List<Double> notas;
    //Constructor
    public Estudiante(String nombre){
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(double nota){
        if (nota < 0.0 || nota > 5.0){
            throw new NotaInvalidaException(
                    "Nota inválida: " + nota + ". Debe estar entre 0.0 y 5.0"
            );
        }
        notas.add(nota);
    }

    public double calcularPromedio(){
        if (notas.isEmpty()){
            throw new NotaInvalidaException("El estudiante no tiene notas registradas.");
        }
        double suma = 0;
        for (double nota : notas){
            suma += nota;
        }
        return suma / notas.size();
    }
}

