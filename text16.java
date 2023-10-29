package Number.java.util;

public class text16 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 5,};
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    if (arr[i] ==arr[j]){
                        System.out.println("不存在");
                    } else {
                        System.out.println(arr[i]);
                        System.out.println(arr[j]);
                    }
                }

            }
        }
    }
}

