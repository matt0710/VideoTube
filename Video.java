public class Video {
    protected String sottotitoli;
    protected String durata;
    protected String visualizzazioni;
    protected String risoluzione;
    protected String nome;

    public Video(){
        this.sottotitoli = null;
    }
    public Video(String sottotitoli, String durata, String visualizzazioni, String risoluzione, String nome){
        this.sottotitoli = sottotitoli;
        this.durata = durata;
        this.visualizzazioni = visualizzazioni;
        this.risoluzione = risoluzione;
        this.nome = nome;
    }

    public String getSottotitoli() {
        return sottotitoli;
    }

    public void setSottotitoli(String sottotitoli) {
        this.sottotitoli = sottotitoli;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String getVisualizzazioni() {
        return visualizzazioni;
    }

    public void setVisualizzazioni(String visualizzazioni) {
        this.visualizzazioni = visualizzazioni;
    }

    public String getRisoluzione() {
        return risoluzione;
    }

    public void setRisoluzione(String risoluzione) {
        this.risoluzione = risoluzione;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nDurata: " + durata + "\nVisualizzazioni: " + visualizzazioni + "\nrisoluzione: " + risoluzione + "\nSottotitoli: " + sottotitoli;
    }

}
