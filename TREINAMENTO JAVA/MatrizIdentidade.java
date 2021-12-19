public class MatrizIdentidade {
    public static void main(String[] args) {
        Integer[][] mID = new Integer[4][4];
        int i, j;

        for(i = 1; i <= 3; i++) {
            for(j = 1; j <= 3; j++) {
            if(i == j) {
                mID[i][j] = 1;
            } else {
                mID[i][j] = 0;
              }
            }
        }
        for(i = 1; i <= 3; i++) {
            for(j = 1; j <= 3; j++) {
                System.out.printf(" %-4d",mID[i][j]);
            }
           System.out.println();
        }
    }
}
