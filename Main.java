import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String args[]){

        VideoTube youtube = new VideoTube();
        Canale channel = new Canale("calisthenXAndria", "Matteo Attimonelli", "01/01/16");
        LinkedList<Video> list = new LinkedList<>();
        Video video1 = new Video("si","20min","5000","1920*1080","CXA CREW");
        VideoPlayer videoplayer1 = new VideoPlayer(false,10, video1);

        list.add(video1);

        youtube.aggiungiCanale(channel, list);

        System.out.println(youtube.getMappa().values());
        youtube.setVideoPlayer1(videoplayer1);

        try {
            youtube.getVideoPlayer1().attivaSottotitoli();
            youtube.getVideoPlayer1().aumentaVolume(100);
            System.out.println(youtube.getVideoPlayer1().getVolume());
        }catch (NoSottotitoliException ex){}

        //---------------------------------------------------------
        Canale canale1 = new Canale("canale1", "matteo", "01/01/01");
        Canale canale2 = new Canale("canale2", "giovanni", "01/01/02");
        Canale canale3 = new Canale("canale3", "mauro", "01/01/03");

        Video videoOne = new Video("no", "10min", "100", "1920*1080", "video1");
        Video videoTwo = new Video("si", "100min", "1000", "1920*1080", "video2");
        Video videoThree = new Video("no", "1000min", "10000", "1920*1080", "video3");
        Video videoFour = new Video("si", "20min", "200", "1920*1080", "video4");
        Video videoFive = new Video("si", "200min", "2000", "1920*1080", "video5");
        Video videoSix = new Video("no", "200min", "2000", "1920*1080", "video6");

        LinkedList<Video> listaNumeroUno = new LinkedList<>();
        LinkedList<Video> listaNumeroDue = new LinkedList<>();

        VideoPlayer videoPlayerUno = new VideoPlayer(false, 10, videoOne);
        VideoPlayer videoPlayerDue = new VideoPlayer(true, 100, videoFour);

        listaNumeroUno.add(videoOne);
        listaNumeroUno.add(videoTwo);
        listaNumeroUno.add(videoThree);

        listaNumeroDue.add(videoFour);
        listaNumeroDue.add(videoFive);

        HashMap<Canale, LinkedList<Video>> mappaOne = new HashMap<>();
        HashMap<Canale, LinkedList<Video>> mappaTwo = new HashMap<>();

        VideoTube tubeMate = new VideoTube(mappaOne, videoPlayerUno);
        VideoTube androidReader = new VideoTube(mappaTwo, videoPlayerDue);

        tubeMate.aggiungiCanale(canale1, listaNumeroUno);
        System.out.println(tubeMate.getMappa().keySet());
        System.out.println("________________________________");
        tubeMate.aggiungiCanale(canale2, listaNumeroDue);
        System.out.println(tubeMate.getMappa().keySet());
        System.out.println("____________________________");
        System.out.println(tubeMate.getMappa().values());

        System.out.println("_________________________________________");

        tubeMate.aggiungiVideo(canale2, videoSix);
        System.out.println(tubeMate.getMappa().get(canale2));
        /*try {
            tubeMate.rimuoviCanale(canale3);
        }catch (NoCanaleException ex){}*/
        System.out.println("_________________________________");
        try {
            tubeMate.rimuoviCanale(canale2);
            System.out.println(tubeMate.getMappa().keySet());
        }catch(NoCanaleException ex){}
        System.out.println("______________________");
        tubeMate.aggiungiVideo(canale2, videoSix);
        System.out.println(tubeMate.getMappa().values());
        System.out.println("_____________________________________");
        try {
            tubeMate.rimuoviVideo(canale1, videoTwo);
        }catch(NoVideoException noEx){}
        catch( NoCanaleException NoCh){}
        System.out.println(tubeMate.getMappa().values());
        System.out.println("___________________________________________");

        /*try {
            tubeMate.getVideoPlayer1().attivaSottotitoli();
        }catch(NoSottotitoliException NoSt){}*/
        try {
            androidReader.getVideoPlayer1().attivaSottotitoli();
            System.out.println(androidReader.getVideoPlayer1().getSottotitoli());

            androidReader.getVideoPlayer1().disattivaSottotitoli();
            System.out.println(androidReader.getVideoPlayer1().getSottotitoli());
        }catch(NoSottotitoliException NoSt){}
    }
}
