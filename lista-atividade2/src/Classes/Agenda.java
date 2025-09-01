package Classes;
import java.util.ArrayList;

public class Agenda {
    private int contato;
    private String nome;
    private int telefone;

    ArrayList<String> contatos = new ArrayList<>();

    public Agenda() {

    }

    public int getContato() {
        return this.contato;
    }
    public void setContato(int contato) {
        this.contato = contato;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return this.telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void adicionarContato(String nome, int telefone) {

    }

    public void removerContato() {

    }

    public void listarContatos() {

    }
}
