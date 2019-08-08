import java.util.ArrayList;

public class ArrayListTut {

//    Difference b/t abstract class and interface

    public static void main(String[] args) {
        ArrayListTut m = new ArrayListTut();

        // Declaring an array
        int[] numbers = new int[3];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;


        // method to insert new item in a array
        numbers = m.add(numbers, 3);
        numbers = m.add(numbers, 4);
        numbers = m.add(numbers, 5);

        System.out.println("Adding elements");
        m.printArray(numbers);


        // remove element from array based on index
        numbers = m.remove(numbers,4);
        System.out.println("Removing elements");
        m.printArray(numbers);

        numbers = m.delete(numbers,3);
        System.out.println("Deleting elements");
        m.printArray(numbers);



        // =================================================
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);

        arrayList.remove(1);
    }

//    [0,1,2,3,4,5,6]
//    [0,1,3,4,5,6,0]
    public int[] delete(int[] arr, int deleteIndex){
        boolean flag = false;


        for (int i = 0; i < arr.length-1; i++) {

            if(i==deleteIndex){
                flag = true;
            }

            if(flag){
                arr[i] = arr[i+1];
            }

        }

        arr[arr.length-1] = 0;
        return arr;
    }

    //    [0,1,2,3,4,5,6]
    //    [0,1,0,3,4,5,6]
    public int[] remove(int[] arr, int removeIndex){
        int index = 2;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr[i] = 0;
                return arr;
            }
        }
        return arr;
    }


    public int[] add(int[] oldArray, int num) {

        // oldArray size : 3
        // newArray size : 4
        int[] newArray = new int[oldArray.length + 1];

        int count = 0;

        // while loop iterartes 3 times
        while (count < oldArray.length) {

            int data = oldArray[count];
            newArray[count] = data;
            count++;

        }
        newArray[oldArray.length] = num;
        return newArray;
    }


    public void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
