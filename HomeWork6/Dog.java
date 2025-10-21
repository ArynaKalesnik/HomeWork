package HomeWork6;

class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    void makeNoise() {
        System.out.println(getName() + " says WOOF");
    }
}
