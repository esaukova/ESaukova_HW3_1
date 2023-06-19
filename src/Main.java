import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену билета: ");

        int price = scanner.nextInt();
        int bonusMiles = service.calculate(price); // если price = 10_000 должно получиться 500 бонусных миль

        System.out.println("Количество бонусных миль: " + bonusMiles + " миль");

    }
}

