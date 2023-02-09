public class Main {
    public static void main(String[] args) {
        int n = 4;
        BlocNum test = new BlocNum("SaLut",n);
        int[] resASCII = test.getStrNum();
        String[] res = test.getStrTrans();
        for (String re : res) {
            System.out.println(re);
        }
        for (int j : resASCII) {
            System.out.print(j);
        }
    }
}