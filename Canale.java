import java.util.LinkedList;

public class Canale {

    private String nome;
    private String autore;
    private String dataDiCreazione;

    public Canale(){}
    public Canale(String nome, String autore, String dataDiCreazione){
        this.nome=nome;
        this.autore=autore;
        this.dataDiCreazione=dataDiCreazione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getDataDiCreazione() {
        return dataDiCreazione;
    }

    public void setDataDiCreazione(String dataDiCreazione) {
        this.dataDiCreazione = dataDiCreazione;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\nautore: " + autore + "\ndata di creazione: " + dataDiCreazione;
    }
}
