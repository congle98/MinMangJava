import java.util.Scanner;

public class demo {
    static int[] arr(Scanner scanner, int n){
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            System.out.println("Mời nhập phần tử thứ "+(i+1));
            arr[i]= scanner.nextInt();
        }
        return arr;
    }
    static int minValue(int []arr){
        int min = arr[0];
        int index=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử trong mảng:");
        int n = scanner.nextInt();
        int arr[]=arr(scanner,n);
        System.out.println("số nhỏ nhất trong mảng tại vị trí: "+minValue(arr)+" là số: "+arr[minValue(arr)]);



    }
}
