public class MultiDimension {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[][] arrD = { 
            {1, 2, 3},
            {2, 4},
            {5, 6, 7, 8}
        };

        
        System.out.println("Array arr:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Array arrD:");
        for (int i = 0; i < arrD.length; i++) {
            for (int j = 0; j < arrD[i].length; j++) {
                System.out.print(arrD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
