import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many bacteria are there initially? ");
        int startingNumber = input.nextInt();
        input.nextLine();

        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();

        long bacteria = numBacteriaAlive(hours,startingNumber);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }

    public static long numBacteriaAlive(int hour) {
        return numBacteriaAlive(hour,10);
    }
    public static long numBacteriaAlive(int hour, int startingNumber) {
        if (hour==0) {
            return startingNumber;
        }

        return numBacteriaAlive(hour-1, startingNumber)*3;
    }
}
