package lessons33;

public class Test {
    public static void main(String... args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        AnimalBarberShop animalBarberShop = new AnimalBarberShop();
        animalBarberShop.shear(dog);
        animalBarberShop.shear(cat);

        Animal animal = new Dog();
        Animal animal1 = new Cat();
        animal1.voice();
        animal.voice();
        System.out.println("dvkjfdnvkj");

    }
}
