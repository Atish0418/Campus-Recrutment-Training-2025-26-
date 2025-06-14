import java.util.*;

public class A1 {
    public static void reverse(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int N = sc.nextInt();
        int arr[] = new int[N];

        System.out.print("Enter the k size for reverse : ");
        int k = sc.nextInt();

        System.out.print("Enter the numbers in array : ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(" The number in array : ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

        int n = arr.length;
        for (int i = 0; i + k <= n; i += k) {
            reverse(arr, i, i + k - 1);
        }

        System.out.print("\n");
        System.out.print("After Rotation:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
