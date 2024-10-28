import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();




        System.out.println("Escreva a idade e o sexo 5 vezes ou mais como no exemplo -- Idade,Sexo -- \\n'M' -Para macho\\nE 'F' Femeas");
        for (int i = 0; i < 5; i++) {
            System.out.println("Escreva a idade e o sexo (Idade,Sexo):");
            String entrada = scan.nextLine();
            String[] divisao = entrada.split(",");

            if (divisao.length == 2) {
                try {
                    int idade = Integer.parseInt(divisao[0].trim());
                    String sexo = divisao[1].trim();

                    pessoas.add(new Pessoa(idade, sexo));
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Idade deve ser um número.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, siga o formato 'Idade,Sexo'.");
            }
        }

        Separar separador = new Separar ();
        separador.separar(pessoas);

        System.out.println("Total de pessoas cadastradas: " + pessoas.size());
        System.out.println("Número de mulheres: " + separador.getFeminino().size());
        System.out.println("Número de homens: " + separador.getMasculino().size());
    }
}
