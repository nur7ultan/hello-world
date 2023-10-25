import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Добро пожаловать в конвертор денег");
//        System.out.println("Введите сумму");
//        double dollar = new Scanner(System.in).nextDouble();
//        System.out.println(dollar + " доллар = " + dollar * 89.5 + " сом");
          int twix = 45;
          int snickers = 55;
          int mars = 40;
          int bountie = 100;
          boolean iscanbuy = false;


        System.out.println("Сколько у вас денег? ");
        System.out.println("twix = 45;\n" +
                "snickers = 55;\n" +
                "mars = 40;\n" +
                "bountie = 100;");
        System.out.println("Пожалуйста введитье : ");

        int money = new Scanner(System.in).nextInt();

            if(money >= twix) {
            System.out.println("Вы можете купить Twix!");
            iscanbuy = true;
            }
            if(money >= snickers) {
            System.out.println("Вы можете купить Snikers!");
            iscanbuy = true;
            }
            if(money >= mars) {
            System.out.println("Вы можете купить Mars!");
            iscanbuy = true;
            }
            if(money >= bountie) {
            System.out.println("Вы можете купить Bountie!");
            iscanbuy = true;
            }
            if(iscanbuy == false){
                System.out.println("У вас недостаточно денег!");
            }
        }
    }

