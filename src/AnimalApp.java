import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal a = new Animal();


        System.out.println("Please enter the animal name: ");
        String name = sc.nextLine();
        a.setName(name);
        System.out.println("Please enter the animal type: ");
        String type = sc.nextLine();
        a.setType(type);
        System.out.println("Please enter the animal description: ");
        String description = sc.nextLine();
        a.setDescription(description);
        System.out.println("Please enter the animal price: ");
        Double price = sc.nextDouble();
        a.setPrice(price);
        a.getPet();

    }
}
