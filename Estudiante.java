import java.util.ArrayList;
import java.util.List;
public class Estudiante {
    private String nombre;
    private List<double> notas;
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
}

