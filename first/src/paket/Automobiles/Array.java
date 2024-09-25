package paket.Automobiles;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[15];
        array[0] = 135;
        array[1] = 153;
        array[2] = 6523;
        array[3] = 1733;
        array[4] = 1787;
        array[5] = 1787;
        array[6] = 1787;
        array[7] = 873;
        array[8] = 1797;
        array[9] = 99;
        array[10] = 167;
        array[11] = 417;
        array[12] = 167;
        array[13] = 176;
        array[14] = 1117;

        int b = 0;
        for (int i = 0; i < array.length; i++){
            b += array[i];
        }
        int c = b/15;
    System.out.println(c);
    }
}
