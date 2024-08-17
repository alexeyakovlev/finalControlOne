import java.util.ArrayList;
import java.util.List;

public class PetRegistry {
    private List<Animals> animals;
    private Counter counter;

    public PetRegistry() {
        animals = new ArrayList<>();
        counter = new Counter();
    }

    public void addAnimal(String name, String type) {
        try (Counter c = counter) {
            if (name.isEmpty() || type.isEmpty()) {
                throw new RuntimeException("Все поля должны быть заполнены");
            }
            Animals animal;
            switch (type) {
                case "cat":
                    animal = new Cat(name);
                    break;
                case "dog":
                    animal = new Dog(name);
                    break;
                case "hamster":
                    animal = new Hamster(name);
                    break;
                case "horse":
                    animal = new Horse(name);
                    break;
                case "camel":
                    animal = new Camel(name);
                    break;
                case "donkey":
                    animal = new Donkey(name);
                    break;
                default:
                    throw new RuntimeException("Введен неверный тип животного");
            }
            animals.add(animal);
            c.add();
        }
    }

    public void listAnimals(){
        for (Animals animal : animals) {
            System.out.println(animal);
        }
    }

    public void addCommand(String name, String command){
        for (Animals animal : animals) {
            if (animal.getName().equals(name)) {
                animal.addCommand(command);
                return;
            }
        }
        System.out.println("Животное не найдено");
    }

    public void listCommands(String name){
        for (Animals animal : animals) {
            if (animal.getName().equals(name)) {
                System.out.println(animal.getCommands());
                return;
            }
        }
        System.out.println("Животное не найдено");
    }
}