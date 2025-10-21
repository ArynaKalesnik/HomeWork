package HomeWork6;

class Drum implements Instrument{
    int size;
    Drum(int size) {
        this.size = size;

    }
    @Override
    public void play() {
        System.out.println("бьют в барабан диаметром " + size + "звучит " + KEY);
    }
}
