package HomeWork6;

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeNoise() {
        System.out.println(getName() + " says MEOW");
    }
}

