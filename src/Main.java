public class Main {
    public static int feladat01(String[] szinek){
        int variaciok = 0;
        int tombHossz = szinek.length;
        if (tombHossz > 1){
            variaciok = 1;
            for (int i = 2; i < tombHossz; i++) {
                variaciok = variaciok * 2 + i;
            }
        }
        return variaciok;
    }

    public static void main(String[] args) {

    }
}