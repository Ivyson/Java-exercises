# Generic Collection 
Interface and Class Collection
Lists 
Collections methods 
Class stacks 
Class Priority 

## Collection 
- A data structure is a collection of data organized to enable efficient processing. Examples include Lists, Set, Map, Stack, Queue, Tree, etc.
- Generics provide type checking of a variable during compile-time.
The common generic interfaces in Java are: 
    - Lists: An ordered collection that can contain duplicated elements.
    - Set: A collection of data that does not allow duplication and is unordered.
    - Collection: The root interface in the collections hierarchy from which interfaces Set, Queue, and List are derived.
    - Map: Used for keeping track of the frequency or count of a specific value. 
         - Example: 
         
```Java 
            int[] array =  {1,1, 2, 5}
            Map = {2, 1} // There are two 1's in the array 
                  {1, 2} // There is one 2 in the array 
                  {1, 5} // There is only one 5 in the array
```
- Understand the Collections Type wrapper classes, Auto-boxing, and auto-unboxing

```Java
int[] array1 = {1,2,3,4,5}; //=> Type Primitive
Integer[] array2 = {1,2,3,4,5}; // => Type Reference, Type Wrapper class
```
- Two terms you need to understand and ensure that the difference between them makes sense:
    - Collection: Interface - It represents a group of objects, known as elements, and is a root interface in the Java Collections Framework. It provides basic operations such as adding, removing, and checking for elements. Container for a reference type, Example, List is a type, it contains a Reference type
        - Example - 
        ```Java
        List<String> list = new ArrayList<String>();
        // This list type is encapsulating a string type 
        // ArrayList is a sub-class of List, Meaning that, The Arraylis exists within List Class, so 
        ```
    - Collections: Class - It provides static methods that operate on or return collections. It is essentially a helper class with methods to perform operations such as sorting, searching, and creating synchronized (thread-safe) collections.
        - Examples of this include: 
        ```Java 
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");

        Collections.sort(list); // Sorts the list in natural order
        ```
- Usage of ArrayList and Arrays in Java
Synchronization - Synchronization means that only one thread can access a particular piece of code or data at a time, ensuring that operations on that data are performed atomically and consistently. 
Synchronization is important in multi-threading, but it also includes overhead, meaning it affects performance!
## Collection Methods
- `add(E element)`: Adds the specified element to the collection.
- `addAll(Collection<? extends E> collection)`: Adds all of the elements in the specified collection to this collection.
- `remove(Object element)`: Removes a single instance of the specified element from this collection, if it is present.
- `removeAll(Collection<?> collection)`: Removes all of this collection's elements that are also contained in the specified collection.
- `clear()`: Removes all elements from this collection.

## List Methods
- `get(int index)`: Returns the element at the specified position in this list.
- `set(int index, E element)`: Replaces the element at the specified position in this list with the specified element.
- `indexOf(Object element)`: Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
- `subList(int fromIndex, int toIndex)`: Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.

## Iterator Methods
- `hasNext()`: Returns true if the iteration has more elements.
- `next()`: Returns the next element in the iteration.
- `remove()`: Removes from the underlying collection the last element returned by this iterator.

Example usage:
```java
List<String> list = new ArrayList<>(); //This needs to be imported frist 
list.add("Apple");
list.add("Banana");
list.add("Orange");

// Collection methods
list.remove("Banana");
System.out.println(list); // Output: [Apple, Orange]

// List methods
String fruit = list.get(0);
System.out.println(fruit); // Output: Apple

// Iterator methods
Iterator<String> iterator = list.iterator(); //This needs to be imported frist 
while (iterator.hasNext()) {
    String element = iterator.next();
    if (element.equals("Orange")) {
        iterator.remove();
    }
}
System.out.println(list); // Output: [Apple]
```
- Test is up to Recursion, inclusive of $SELECTION_PLACEHOLDER$RecursionRecursion
- Go through the Bubble sort algorithm -- check this out -- https://github.com/microsoft/AI-For-Beginners/tree/main/lessons/4-ComputerVision/06-IntroCV