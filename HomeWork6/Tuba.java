package HomeWork6;

class Tuba implements Instrument{
    int diameter;
    Tuba(int diameter) {
        this.diameter = diameter;
    }
    @Override
    public void play() {
        System.out.println("Играют на тубе диаметром " + diameter + "звучит" +  KEY);
    }
}

