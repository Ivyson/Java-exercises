# Day 4 Lecture Recursive Functions

## Outline Of Today's lecture 
 - Basic concept of Recursive Functions
    - Break pu problem, having a replica of self
    - Every recursive method has a base case eg ``` java
    int recursive(int x)
    {
        if(x ==  0) //The if statement is a base case so that the recursive is not infinite
    {
        return;
    }
        recursive(x-1);
    }
        ````