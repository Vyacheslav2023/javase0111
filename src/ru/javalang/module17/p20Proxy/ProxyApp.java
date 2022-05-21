package ru.javalang.module17.p20Proxy;

//This implementation of Proxy-pattern is Virtual Proxy

public class ProxyApp {
    public static void main(String[] args) {

        Image image = new ProxyImage("/home/gorynych/image.jpg");
        image.display();
    }
}

//Service block on diagram
interface Image {
    void display();
}

//ServiceImpl block on diagram
class RealImage implements Image {

    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    void load(){
        System.out.println("Load file " + file);
    }

    @Override
    public void display() {

    }
}

//ServiceProxy on diagram
class ProxyImage implements Image{

    String file;

    RealImage realImage;

    public ProxyImage(String file) {
        this.file = file;
    }

    //Lazy load
    @Override
    public void display() {
        if(realImage == null){
            realImage=new RealImage(file);
        }

        realImage.display();
    }
}