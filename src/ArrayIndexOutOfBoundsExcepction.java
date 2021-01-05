import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExcepction {
    public static int[]arr(){
        Random random= new Random();
        int[]arr= new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= random.nextInt(100);
            System.out.println(arr[i]+" ");
        }return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExcepction a = new ArrayIndexOutOfBoundsExcepction();
        int[]arr= a.arr();
        System.out.println("Enter any number of elements");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        try {
            System.out.println("The value of element "+ x+" is "+arr[x] );
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Beyond the array");
        }
    }
}
