package paket.academy;

public class Dekanat {
    public static void main(String[] args) {
        Student petya = new Student();
        petya.age = 17;
        petya.averageMark = 4.8;
        System.out.println(petya.sumOfStependium(petya.averageMark));
    }
}
