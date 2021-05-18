public class WaterBottle {

    private int volume;
    private String name;

    public WaterBottle(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    public void drink(){
        if (this.volume >= 10){
        this.volume -= 10;}
    }

    public void empty(){
        this.volume = 0;
    }

    public int getVolume(){
        return this.volume;
    }

    public void fill(){
        this.volume = 100;
    }
}

