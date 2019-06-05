import java.util.HashMap;
import java.util.LinkedList;

public class VideoTube {
    private HashMap <Canale, LinkedList<Video>> mappa = new HashMap<Canale, LinkedList<Video>>();
    private VideoPlayer videoPlayer1;

    public VideoTube(HashMap<Canale,LinkedList<Video>> mappaDaPassare, VideoPlayer videoDaPassare){
        this.mappa = mappaDaPassare;
        this.videoPlayer1 = videoDaPassare;
    }

    public VideoTube(){}

    public void aggiungiCanale(Canale canaleDaAggiungere, LinkedList<Video> listaVideo){
        this.mappa.put(canaleDaAggiungere, listaVideo);
    }


    public void rimuoviCanale( Canale canaleDaRimuovere) throws NoCanaleException{
        if(this.mappa.containsKey(canaleDaRimuovere))
            this.mappa.remove(canaleDaRimuovere);
        else
            throw new NoCanaleException();
    }

    public void aggiungiVideo(Canale canaleDaAggiungere, Video videoDaAggiungere){
        if(mappa.containsKey(canaleDaAggiungere))
            mappa.get(canaleDaAggiungere).add(videoDaAggiungere);
        else {
            LinkedList<Video> nuovaLista = new LinkedList<>();
            nuovaLista.add(videoDaAggiungere);
            mappa.put(canaleDaAggiungere, nuovaLista);
        }
    }

    public void rimuoviVideo(Canale canaleDaRimuovere, Video videoDaRimuovere) throws NoCanaleException, NoVideoException{
        if(mappa.containsKey(canaleDaRimuovere)){
            if(!mappa.get(canaleDaRimuovere).remove(videoDaRimuovere)){
                throw new NoVideoException();
            }
        }
        else{
            throw new NoCanaleException();
        }
    }

    public void playVideo(VideoPlayer videoDaRiprodurre){
        for(int i=0; i<mappa.values().size(); i++){
            if(mappa.containsValue(videoDaRiprodurre.getVideoProva())){
                videoDaRiprodurre.play();
            }
        }
    }

    public HashMap<Canale, LinkedList<Video>> getMappa() {
        return mappa;
    }


    public VideoPlayer getVideoPlayer1() {
        return videoPlayer1;
    }

    public void setVideoPlayer1(VideoPlayer videoPlayer1) {
        this.videoPlayer1 = videoPlayer1;
    }

    /*public <Canale> getCanale(){
        return mappa.keySet();
    }*/

    @Override
    public String toString() {
        String s = "";
        for(int i=0; i<mappa.values().size(); i++){
            s += mappa.get(i);
        }
        return s;
    }
}
