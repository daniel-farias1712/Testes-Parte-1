import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Separar {
    private List<Pessoa> feminino = new ArrayList<>();
    private List<Pessoa> masculino = new ArrayList<>();


    public void separar(List<Pessoa> pessoas) {
        feminino = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        masculino = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("M"))
                .collect(Collectors.toList());
    }

    public List<Pessoa> getFeminino() {
        return feminino;
    }

    public List<Pessoa> getMasculino() {
        return masculino;
    }
}
