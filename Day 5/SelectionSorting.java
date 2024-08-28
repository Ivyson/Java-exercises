public class SelectionSorting {
    public static void main(String[] args){
        //I need to sort the contents of an array
        int[] array = {7, 1, 10, 2, 9, 3, 5, 6};
        int[] sortedArray = {};
        for(int i = 0; i < array.length - 1; i++){
            for(int index = i; index < array.length; index++){
                if(array[i] > array[index]){
                    array[i] = array[index];
                }
                else{
                    array[i] = array[i];                  
                }
            }
        }
        System.out.println(array.toString());
    }
}
