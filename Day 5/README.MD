# Searching, Sorting and Big O
## Outline of this Lecturer
- Searching Algorithms
    - Linear Search
    - Binary Search
- Algorithm Complexity / Efficiency (Big O) 
- Sorting Algorithm 
    - Selection Sorting
    - Insertion Sorting
    - Merge Sorting 

## Lecture 
### Searching algorithms
Involves Searching if a specific content does exist within a specified arraylist or a collection of data, If the content exists then return that content or the location of that content
- The Value that is searched is called <b>Search Key </b>
- There are two popular search algorithms, Linear Search And Binary Search algorithm
#### Linear Search
Simple but slow. This algorithm uses loops to iterate through an Array, search each element until the the last index of an array to find the Search key

```Java 
    public static int linearSearch(int[] array, int target) {
    for (int i = 0; i < array.length; i++) { //Iterates through each and every Element of the array 
        if (array[i] == target) { //Checks if the Search key is found
            return i; // Target found at index i
        }
    }
    return -1; // Target not found
    }
 ```
Because this algorithm uses indexing to find the location of the key, in Java, returning ` -1 ` Means that the element is not found, hence a good practice to use -1 in this instance, or even just a negative value, because a negative value means not found. 
- Advantages
    - The advantages of this algorithm is that it is easier to implement,
    - works on both sorted and unsorted data structures, as long as they allow sequential access, just like arrays.
- Disadvantage 
    - Very Slow, as it uses O(n) time complexity
    - For large data sets, this algorithm turns out to be terribly slow
- Use cases
    - If the data set is small
    - If the sorting the data is not practivally viable
    - If simplicity is what needs to be mantained
#### Binary Search 
This Algorithm is applicable in <b> Sorted </b> arrays or Lists, This Algorithm splits the Data in the middle, and checks the middle term:

```Java
    int[] array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
    int searchkey = 7;
    int middle = array[(array.length-1)/2]
    if(searchkey > middle){
        //Search from the middle upwards
    }
    else if(searchkey < middle>)[
        //Search from the middle to the lower bound
    ]
    else if( searchkey == middle){
        //return index of the middle value
    }
```
The basic idea of this algorithm is that we use sorted Arrays or lists, so with this in mind, we know that it has the lowest value(Considering numbers) at the lowest index, and has a highest value at the highest index.
- Example Code for this :
```Java 
public class BinarySearch{

    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; // Base case: target not found
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid; // Target found
        } else if (array[mid] < target) {
            return binarySearch(array, target, mid + 1, right); // Search in the right half
        } else {
            return binarySearch(array, target, left, mid - 1); // Search in the left half
        }
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;
        int index = binarySearch(sortedArray, target, 0, sortedArray.length - 1);

        if (index != -1) {
            System.out.println("Target " + target + " found at index " + index);
        } else {
            System.out.println("Target " + target + " not found");
        }
    }
}
```
- Conceptualising this is complicated, needs sometime so watch a few Youtube Videos for how to implement it
### Big O/ Time Complexity
- Big O indicates the worst-case run-time for an algorithm-that is, how hard an algorithm may have to work to solve a problem.
- In this toolkit we are basically inspecting the performance of the algorithm and the efficiency of the algorithm.
- As the program executes, more memory is likely allocated to the program, the more you initialise variables, more memory is allocated to the program, this is called the stack of the process. The more memory allocated to the program, the more time required by the cpu scheduler to allocate memory hence, <b font-size= 10px>The Less memory the algorithm needs, the more efficient the algorithm gets</b>
- Big O - is concerned with how an algorithm’s runtime grows in relation to number of items processed
    - The worse case scenario means we want the case whereby the key we are looking for is at the last index for Linear searches, this means that we have a possibility of finding the key in the first index 
- Three Main Characterisations 
    - O(1) complexity - This algorithm  does not depend on the amount of data sets in an  array or list, example is 
    - O(n) complexity - The Proportion is linear between the time taken to complete the task and the amount of Dataset, 
    - O(n^2) complexity - The relationship between the time taken to complete the task and the data set is quadratically relarted, This means that the more data set we get, the greater the time it takes to complete the task.
    - O(log(n)) Complexity -  Relationship between time and data sets, is logarithmically related
    - O(nlog(n)) Complexity -  Linearithmic relationship, This complexity is far slower compared to the actual logarithmic complexity.
    - And Many more
### Sorting Algorithms
- <b> Sorting</b> - Placing some data in a specific order
- Algorithms that have loops, has (loop1)(\times)(loop2)(\times)....(\times)(loopn) complexity
- Types of Sorting
    - Merging 
    - Insertion 
    - Selection 
#### Selection 
- Iterates through a list or an array, searching for the smallest element and then swapping its position.
- This algorithm uses the following instructions, go through a dataset, find the smallest value, and then put it in the first index, repeat this step until all the data is sorted, but go through the data set multiple times to check.
```Java
int array = {7, 1, 10, 2, 9, 3, 5, 6};
//Iteration 1: array = [1, 7, 10, 2, 9, 3, 5, 6]
//Iteration 2: arra = [1, 2, 7, 10, 9, 3, 5, 6]
//Iteration 3: arra = [1, 2, 3 ,7, 10, 9, 5, 6]
//Iteration 3: arra = [1, 2, 3 ,5 ,7, 10, 9, 6]
//And so on....
```
- Time Complexity for this algorithm = O(n^2)
- This algorithm is simple to implement but very Slow and Inefficient.

## Insertion 
- Simple to implement but inefficient
- Compares the two consecutive elements, checks if the first one is lesser than the second, if true then go to the next 2 pairs
- This is much better than the selectin sorting because we are not searching the whole array but just comparing the two consecutive elements
- Will xplain later

## Merge 
- Much much efficient but very complicated
- Splits the array into two, and tries to sort each sub-array using recursive methods, until it reaches a base case whereby the arrays are now sorted!
- Uses the same approach as Binary Searching Algorithm
- Operation of this algorithm
    - Divide - Split the array into two almost equal halves.
    - conquier - Solve Each sub-array recursively 
    - Merge - Merge the results and form one single array.
