public class Search_in_2Darray {
    public static void main(String[] args) {
        int [][] arr = {
            {1,5,2},
            {8,3,5},
            {4,8,2}
        };
        int target = 4;
        int[] indexes = search(arr, target);
        if(indexes!= null) {
            System.out.println("Element found at index (" + indexes[0] + ", " + indexes[1] + ")");
        } else {
            System.out.println("Element not found");
        }
    }

    static int[] search(int [][] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}