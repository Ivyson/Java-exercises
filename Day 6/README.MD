# Generic Collection 
Interface and Class Collection
Lists 
Collectiopns methods 
Class stacks 
Class Priority 
## Collection 
- What is a datat struicure - A collection of data ordanised to enable efficient procesing (Example includes Lists, Set, map, stack , queuem tree etc)
- Generics provide the type checking of a variable during compile-Time.
The common generic Interfaces in Java are : 
    - Lists - An ordered collection that can contain the duplicated elements
    - Set - A collection of data that does not allow duplication, Also unordered
    - Collection - The root interface in the collections of hierachy from which interfaces Set, Queue and List are derived
    - Map - Used for keeping track of the frequency or a count of an occurance of a specific value, 
         - Example: 
         
```Java 
            int[] array =  {1,1, 2, 5}
            Map = {2, 1} // There are two 1's in array 
                  {1, 2} // There are 1 2's in the array 
                  {1, 5}// There is only 1 5 in the array,
```
- Know the Collections Type wrapper classes, Auto-boxing and auto - unboxing

```Java
int[] array1 = {1,2,3,4,5}; //=> Type Primitive
Integer[] array2 = {1,2,3,4,5}; // => Type Reference, Type Wrapper class
```
- Test is up to Recursion, Inclusive of Recursion