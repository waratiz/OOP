package Lab5;

public class Counter {
    private int count;

    public Counter(){
        count =0;
    }

    public int click(){
        return count++;
    }

    public int getCount(){
        return count;
    }

    public int reset(){
        return count =0;
    }
}
