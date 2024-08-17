import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PetRegistry registry = new PetRegistry();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1. Добавить новое животное");
            System.out.println("2. Список животных");
            System.out.println("3. Добавить команду для животного");
            System.out.println("4. Список команд для животного");
            System.out.println("5. Выход");
        }
    }
}
