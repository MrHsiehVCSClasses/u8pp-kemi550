package u8pp;
import java.util.ArrayList;

public class SearchSort {
    // for arr
    public static void selectionSort(int[] arr) {
        // iterates through the array, gets the min value at each iteration and swapping it with the current index
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    // for arrList 
    public static ArrayList<Student> selectionSort(ArrayList<Student> list) {
        ArrayList<Student> sortedList = new ArrayList<>(list);
        // iterates through the list, gets the minimum value at each iteration and swapping it with the current index
        for (int i = 0; i < sortedList.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < sortedList.size(); j++) {
                if (sortedList.get(j).compareTo(sortedList.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Student temp = sortedList.get(i);
            sortedList.set(i, sortedList.get(minIndex));
            sortedList.set(minIndex, temp);
        }
        return sortedList;
    }
}
