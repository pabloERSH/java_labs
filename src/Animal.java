import java.util.Scanner;

public abstract class Animal {
    private double weight;
    private int age;
    private String name;
    public void set_animal(){
        System.out.println("Введите имя животного: ");
        Scanner s = new Scanner(System.in);
        name = s.nextLine();
        System.out.println("Введите вес животного: ");
        weight = Input.num_double();
        System.out.println("Введите возраст животного: ");
        age = Input.num_int();
    }
    public void print_animal(){
        System.out.println("Имя животного: " + this.name + "\nВес животного: " + this.weight + "\nВозраст животного: " + this.age);
    }
}
