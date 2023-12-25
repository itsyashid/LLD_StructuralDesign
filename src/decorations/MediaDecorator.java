package decorations;

import media.Media;

public abstract class MediaDecorator implements Media {
    protected Media decoratedMedia;

    public MediaDecorator(Media decoratedMedia) {
        this.decoratedMedia = decoratedMedia;
    }
    public void play(){
        this.decoratedMedia.play();
    }
}
