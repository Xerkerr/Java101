import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matris = {{1,2,3},{2,3,4},{4,5,6},{7,8,9}};
        int[][] matris01 = new int[matris[0].length][matris.length];


        for (var i = 0; i < matris.length; i++) {
            System.out.println(Arrays.toString(matris[i]));
        }
        System.out.println("==========================================================");

        for (var i = 0; i < matris.length; i++) {
            for (var j = 0; j < matris01.length; j++){
                matris01[j][i] = matris[i][j];
            }
        }
        for (var i = 0; i < matris01.length; i++) {
            System.out.println(Arrays.toString(matris01[i]));
        }
    }
}
