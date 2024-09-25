Day 8 Lecture

# Custom Generic data structures

- Implementing a custom data structure instead of using the prebuilt data structure
- Two Main aspects of a computer program
    - Data that is used
    - Instructions or Logic implemented on a Code
- The emphasise on the generics is the actual Data of the program
- Raw data alone is not useful, We need to transform data into useful input. So that we can learn and use that data. Data structures enable us to achieve this
- Data structure help determine the nature in whiich the data is stored in memory , allowing us to manipulate it and use it
## Types of data structures
### Things that we need to concern ourselves when dealing with Data structures
- Efficiency - Doing more with less, Less time and less memory 
    - Efficiency when modifying the data.
    - "Dynamic Data" - the data structures that are modifiable. Being able to insert the new data, remove data and read the data
- Arrays - A collection of elements that stored in a sequencial order a. They are less efficient when inserting and deleting the elements stored in it. However, accessing data stored within an array is very fast and easy
- Linked List - Consists of nodes that are efficient for insertion and deleting  but they are typically slower when referring to the access time
- Stacks - Last in - first out
- Tree - Hierachy data structure with root node and child node. Searching is efficient for searching and sorting


## Importance of data structures
1. Efficiency : They allow us to come up with efficeint programs.
2. Problem solving : So many problems in a software field are open-ended, Meaning that there is no one solution answer to the problem. Data structures provide a systematic approach to these problems and devise efficient solutions. If you are familiar with these data structures, they will aid you to come up with efficient problem solving code.
3. Code Re-usability - Well designed data structure can be reused across different projects
4. Mmeory Management - Mitigate memory leaks and ensure efficient memory access
5. Algorithm design
6. Scalability - 

## Key characteristics of data structure
1. Linear and non Linear - Data elements can b arranged sequencially/linearly or non sequencially.  - The linearity in this case refers to the arrangement of data elements within the data structure - This arrangement can either be linear or non - linear. Example of non Linear data structures - ``` tree ```, ``` graph ```.
Linear -  ```List``` , ``` Array ```, ``` Queue ``` etc..
    - Data structure - stores the data type
    - Data type - Example is a class, It defines the data type
2. Static and dynamic - ```Static ``` refers to something that is not moving, therefore, the size of the static data does not grow or shrink, memory is fixed and the memory location is fixed. Dynamic is the opposite of the Static data structure
Example: Arrays are immutable, meaning, you cannot add or remove content within that.. 
    - Dynamic memory allocatin refers to the run-time memory allocation, meaning the memory size can increase 
    - Static memory allocation - The memory is allocated at compile time and is limited, does not change
3. Homogeneity - Arrays store the elements of the same type, making them homegeneous. Lists can store data of any-type, making them non homogeneous
4. Time and Space Compexity - Fixed set of data, data acess is the most important operation , You can either use Arrays or LinkedLists. - Now the factor becomes the ``` time complexity``` 
    -If we will be acessing the data frequently, You decide which data structure will be a better choice for intense data access - which will be ` Arrays ` here
    - Time complexity - Time required to execute a certain operations on the data structure (example is: Inserting/Deletion)
    - Space Complexity - Some data structures can use memory more efficiently more than others, if you will have to delete the data in the future, then you can use the LinkedList to remove and add elements
## Main Application of Data structure
1. Storing Data - Example includes Databases. 
2. Managing resources and services - 

# Main Content of Today

## Self - Referencial class 
- Example: 
```Java
Class Account {
    Account initialAccount; // Instance variable (Reference class)
}
```
- Self referencial class is a class that references itself within the scope of that class! As shown above, this is a similar idea with recursion methods!

# tREE
- Breadth First Search
- Depth First Search
- Traversal method -
    - Pre-order Traveversal
    - In-order traversal 
    - Post Order Traversal 