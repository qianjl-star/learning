import java.util.Arrays;

public class Methods {
    int[] n = new int[4];
    int num;

    public void splitNum(int num) {
        this.num = num;
        //各位数字
        n[0] = num/1000;
        n[1] = num%1000/100;
        n[2] = num%100/10;
        n[3] = num%10;
    }

    public boolean combination() {
        //选定两个数放置在前面，作为十分位
        int n1;
        int n2;
        int temp;

        for (int i = 0; i < 4; i++) {
            int[] arr = Arrays.copyOf(n, 4);

            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    continue;
                }

                temp = arr[1];
                arr[1] = arr[j];
                arr[j] = temp;

                n1 = arr[0] * 10 + arr[2];
                n2 = arr[1] * 10 + arr[3];
                if (num == n1 * n2) {
                    return true;
                }

                n1 = arr[0] * 10 + arr[3];
                n2 = arr[1] * 10 + arr[2];
                if (num == n1 * n2) {
                    return true;
                }
            }
        }
        return false;
    }
}
