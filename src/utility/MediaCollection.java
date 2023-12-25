package utility;

import media.Media;

import java.util.ArrayList;
import java.util.List;

// Composite Design pattern
public class MediaCollection implements Media {
    private List<Media> mediaList=new ArrayList<>();

    public MediaCollection(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    @Override
    public void play() {
        for(Media media:mediaList){
            media.play();
        }
    }
    public void addMedia(Media media){
        mediaList.add(media);
    }
}
