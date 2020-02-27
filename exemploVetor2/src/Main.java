import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int v1[] = {1,3,5,7,9,11,13,15,17,19};
        int v2[] = new int[20];
        Arrays.fill(v2, 30);
        System.arraycopy(v1, 2, v2, 0, 5);
        for (int i = 0; i < v2.length; i++) {
            System.out.printf("v2[%d] = %d \n", i, v2[i]);
        }

    }
}
