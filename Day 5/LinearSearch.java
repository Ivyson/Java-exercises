public class LinearSearch{
    public static void main(String[] args){
        int[] array = {7, 1, 10, 2, 9, 3, 5, 6};
        int location = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 5)
            {
                location++;
            }
        }
        if(location > 0){
            System.out.println("The Occurance of the value 5 was found in the data");
        }
        else{
            System.out.println("The occurance of the number 5 cannot be traced in the array");
        }
    }
}