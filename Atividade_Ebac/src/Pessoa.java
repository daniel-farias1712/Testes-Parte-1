public class Pessoa {
    int idade;
    String Sexo;

    public Pessoa (int idade ,String Sexo ){
        this.idade = idade;
        this.Sexo = Sexo;

    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
