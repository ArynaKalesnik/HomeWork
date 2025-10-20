class Phone {
    String number;
    String model;
    double weight; 

    Phone() {
        System.out.println("without parameters");
    }
    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }
    void receiveCall(String name) {
        System.out.println(name + "name ");
    }
    void receiveCall(String name, String PhoneNumber) {
        System.out.println(name + "calls " + " from number " + PhoneNumber);
    }
    String getNumber() {
        return number;
    }
    void sendMessage(String... numbers) {
        System.out.println(("send the message on numbers: "));
        for (String n : numbers) {
            System.out.println(n);
        }
    }
}

class Call {
    public static void main(String[] args) {
        Phone phone1 = new Phone("555555555 ", " is Apple ", 0.3);
        Phone phone2 = new Phone("6666666666 ", " is Motorola ");
        Phone phone3 = new Phone();

        System.out.println("Phone number 1 " + phone1.number + "and " + phone1.model + "and " + phone1.weight);
        System.out.println("Phone number 2 " + phone2.number + "and " + phone2.model);
        System.out.println("Phone numver 3 " + phone3.number + "and " + phone3.model);

        phone1.receiveCall("Lana ");
        System.out.println("phone number " + phone1.getNumber());
        phone2.receiveCall("Luca ", "123447878");
        phone3.sendMessage("1099878989", "47654586583", "77548585");
    }
}

