public class LiveVideo extends Video {
    private String data;
    private String ora;

    public LiveVideo(){}
    public LiveVideo(String sottotitoli, String durata, String visualizzazione, String risoluzione, String nome, String data, String ora){
        super(sottotitoli, durata, visualizzazione, risoluzione, nome);
        this.data = data;
        this.ora = ora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }
}
