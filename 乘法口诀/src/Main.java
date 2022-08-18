public class Main {
    public static void main(String[] args) {
        int min,max;
        min=1;//起始数
        max=9;//结束数
        for (int i = min; i <=max ; i++) {
            for (int j = min; j <=i ; j++) {
                System.out.format("%dx%d=%d     ",j,i,j*i);
            }
            System.out.println();
        }

    }
}