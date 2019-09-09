public class MultiDimPrint {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("" + i + "\t" + j + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        
        for  (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
