//This code is very long and might need to be refactored!
public class BinarySearch{
    public static int Search(int[] array, int lowerbound, int upperbound, int searchKey){
        int location = -1;
        for(int i = lowerbound; i <= upperbound; i++){
            if(array[i] == searchKey){
                location++;
            }
        }
        return location;
    }
 public static void main(String[] args){
    int[] sortedArray = {1, 2, 3, 5, 6, 7, 9, 10};
    int first = 0, last = sortedArray.length - 1, middle = (last/2);
    int SearchKey = 10;
    int result = -1;
    if(SearchKey == sortedArray[middle]){
        System.out.println("The Value was found in the array in the position: "+middle);
    }
    else if(SearchKey > sortedArray[middle]){
        first = middle + 1;
        result = Search(sortedArray, first, last, SearchKey);
    }
    else if(SearchKey < sortedArray[middle])
    {
        last = middle - 1;
        result = Search(sortedArray, first, last, SearchKey);
    }
    else{
        System.out.println("There was a problem attempting the search!!");
    }
    if(result > -1){
        System.out.println("The Value was found in the array");
    }
    else{
        System.out.println("The value was not found in the array");
    }
 }   
}