public class VampireNumbers {
    public static void main(String[] args) {
        int num = 0;
        Methods methods = new Methods();
        for(int i=1000; i<10000; i++) {
            methods.splitNum(i);
            if(methods.combination()) {
                System.out.println(i);
                num++;
            }
        }
        System.out.println("四位数字中一共有吸血鬼数字" + num + "个。");
    }
}
