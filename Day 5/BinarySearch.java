import java.util.*;
public class BinarySearch{
    public static int Search(int[] array, int searchkey){
        int left = 0;
        int right = array.length -1;
        int middle = (left + right)/2;
        // int 
        int location = -1; //If the location is found then modify the location value, otherwise \
        do{
            if(searchkey == array[middle]){
                location = middle; //Return the middle index
            }
            else if(searchkey < array[middle]){
                right = middle -1;  //The Searchkey belongs on the lower bound, so we need to search on the lower bound
            }
            else{ //Searching on the higher bound
                left = middle + 1; // the key is found on the upper bound hence needs to start searching from the middle + 1;
            }
        }while((location == -1) && (left <= right));
        return location;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5,6, 7, 8, 9, 10};
        System.out.println("Enter the value you are looking for from 1 - 10: ");
        int searchkey = scanner.nextInt();
        System.out.printf("The location of %d in the array is %d",searchkey, Search(array, searchkey));
        scanner.close();
    }
}