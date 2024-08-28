import java.util.*;/**
 * InnerExercise
 */

public class Exercise {
    public static void main(String[] args){
        Random random = new Random();
        Integer[] arr = new Integer[10];
        for(int i = 0; i < 10; i++){
            arr[i] = random.nextInt(10,30); //Question 1. Create the Array, and fill it with random numbers between 10 and 30
        }
        System.err.println(Arrays.toString(arr));// Print the randomly generated array to the console
        List<Integer> list = (Arrays.asList(arr));
        System.err.println("List: "+list); // Print out the list to the console
        Collections.sort(list);
        System.out.println("The Sorted Array list is : "+list); // Sort the list and print it out to the console
        //Remove the duplicated elements from the list
        Set<Integer> array = new HashSet<>(list);
        System.err.println("Array having removed duplicates: "+array); // Print out the list without duplicates Look at slide 29 for help....
    }
}
