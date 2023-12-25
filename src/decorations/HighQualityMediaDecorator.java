package decorations;

import media.Media;

public class HighQualityMediaDecorator extends  MediaDecorator{

    public HighQualityMediaDecorator(Media decoratedMedia) {
        super(decoratedMedia);
    }
    public void play(){
        super.play();
        System.out.println("Improving playback Quality");
    }
}
