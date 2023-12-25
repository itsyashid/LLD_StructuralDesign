import decorations.HighQualityMediaDecorator;
import media.*;
import utility.MediaCollection;

import java.util.ArrayList;

public class MultimediaApp {
    public static void main(String[] args){
        Media video=new Video("movie.mp4");
        Media audio=new Audio("song.mp3");
        Image img=new Image("picture.jpg");
        Media image=new ImageAdapter(img);

        Media highQualityAudio=new HighQualityMediaDecorator(audio);

        MediaCollection allMedia=new MediaCollection(new ArrayList<>());

        allMedia.addMedia(video);
        allMedia.addMedia(highQualityAudio);
        allMedia.addMedia(image);
        allMedia.play();
    }
}
