import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
@Test

public void VerificarSecontemoSexocertonasListas(){
 List<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(new Pessoa(25, "F"));
    pessoas.add(new Pessoa(30, "M"));
    pessoas.add(new Pessoa(22, "F"));
    pessoas.add(new Pessoa(28, "F"));
    pessoas.add(new Pessoa(28, "M"));
    pessoas.add(new Pessoa(28, "F"));
    pessoas.add(new Pessoa(28, "M"));
    pessoas.add(new Pessoa(28, "M"));

    Separar separador = new Separar ();
    separador.separar(pessoas);

    assertEquals(4,separador.getFeminino().size());
    assertEquals(4,separador.getMasculino().size());

   System.out.println("Número de mulheres: " + separador.getFeminino().size());
   System.out.println("Número de homens: " + separador.getMasculino().size());


}
}
