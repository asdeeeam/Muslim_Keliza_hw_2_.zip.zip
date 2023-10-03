import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(transactionConditions(15, -10));
        System.out.println(transactionConditions(20, 15));
        System.out.println(transactionConditions(23, 17));
        System.out.println(transactionConditions(33, 19));
        System.out.println(transactionConditions(37, 23));
    }

    public static String transactionConditions(int age, int temperature) {
        if ((age >= 20 && age <= 40 && temperature >= -20 && temperature <= 30)
                || (age < 20 && temperature <= 28)
                || (age < 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять ";
        } else {
            return "Оставайтесь дома";
        }
    }

    public class test {
        public static void main(String[] args) {


            System.out.println(transactionConditions(23, 10));
            System.out.println(transactionConditions(generateRandomAge(), 10));

        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(45) + 1;
    }
}


