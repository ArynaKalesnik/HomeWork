package HomeWork6;

class Rat extends Animal{
    public Rat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeNoise() {
        System.out.println(getName() + " says WEE-WEE");
    }
}