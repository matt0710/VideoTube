public class VideoPlayer {
    private boolean sottotitoli;
    private int volume;
    private Video videoProva;

    public VideoPlayer(){}
    public VideoPlayer(boolean sottotitoli, int volume, Video videoProva){
        this.sottotitoli=sottotitoli;
        this.volume=volume;
        this.videoProva = videoProva;
    }
    public VideoPlayer(int volume){
        this.volume=volume;
    }

    public void play(){
        System.out.println("Play");
    }
    public void stop(){
        System.out.println("Stop");
    }
    public void pausa(){
        System.out.println("Pausa");
    }

    public void aumentaVolume(int incremento){
        volume += incremento;
    }
    public void decrementaVolume(int decremento){
        volume += decremento;
    }

    public void attivaSottotitoli() throws NoSottotitoliException{
        if(videoProva.getSottotitoli().equals("si"))
            this.sottotitoli = true;
        else
            throw new NoSottotitoliException();
    }

    public void disattivaSottotitoli() throws NoSottotitoliException{
        if(videoProva.getSottotitoli()!=null)
            sottotitoli = false;
        else
            throw new NoSottotitoliException();
    }

    public boolean getSottotitoli() {
        return sottotitoli;
    }

    public void setSottotitoli(boolean sottotitoli) {
        this.sottotitoli = sottotitoli;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Video getVideoProva() {
        return videoProva;
    }

    public void setVideoProva(Video videoProva) {
        this.videoProva = videoProva;
    }
}
