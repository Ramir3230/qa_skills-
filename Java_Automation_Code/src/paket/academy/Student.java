package paket.academy;

public class Student extends MainPlaces{
    public String group;

    public double averageMark;

    public static int sumOfStependium(double a) {
        int d;

        if (a == 5) {
            d = 100;
        } else if (a < 5 && a >= 4) {
            d = 50;
        } else {
            d = 0;
        }
        return d;
    }
}
