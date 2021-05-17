public class Printer {

    private int paper;
    private int tonerVolume;

    public Printer(int paper, int tonerVolume){
        this.paper = paper;
        this.tonerVolume = tonerVolume;
    }

    public int getPaper(){
        return this.paper;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public void print(int pages, int copies){
        int pagesTotal = pages * copies;
        if (pagesTotal <= this.paper) {
            this.paper -= pagesTotal;
            this.tonerVolume -= pagesTotal;
        }

    }
}
