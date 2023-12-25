package media;

/*
Note here we have display method whereas in audio and video we have play method
hence we make use of adapter design pattern so that all media formats can have same play level
 */
public class Image {
    private String fileName;

    public Image(String fileName) {
        this.fileName = fileName;
    }
    public void display(){
        System.out.println("Displaying Image : "+this.fileName);
    }
}
