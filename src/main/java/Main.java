public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Иван", "Петрович", "Сидоров", 34);
        person1.printName();

        Person person2 = new Person ("Ирина", "Алексеевна", "Иванова", 24);
        person2.printName();

        person1.setName("Павел");
        person1.printName();
        person1.printYear();

        System.out.println("Человек 2: " + person2);
    }
}
