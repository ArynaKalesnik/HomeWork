package HomeWork6;

class Guitar implements Instrument{
    int strings;
    Guitar(int strings) {
        this.strings = strings;
    }
    @Override
    public void play() {
        System.out.println("Играет струнная гитара с " + strings + "струнами" + "нота " + KEY);
    }
}
