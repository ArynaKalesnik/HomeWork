package HomeWork6;

public interface Instrument {
String KEY = "До мажор";
void play();
    
} 
class Main {

    public static void main(String[] args) {
        Instrument[] musician = {new Guitar(12), new Drum(1), new Tuba(2)};
    
    for (Instrument i : musician) {
        i.play();
    }
}
}