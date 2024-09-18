Lecture 7
- Key elements
    - Polymorphism 
    - Interfaces and Objects
    - Type safety 
    - Redundancy
    - Method overloading
    - Signature of a method
+ Type safety - A  code that is explicitly declared type : Eg ` String name; `, Type unsafe codes are the once that do not have specific types ` List values = new ArrayList();`, The value "Values" can store any type of Variable, same with ` Object values = new Object() `
+ Reduntancy - The code that is redundant is having unnecesarry code, which is likely to introduce bugs, increase the time and memory due to unnecesarry code included here.
+ Difference between Generic Methods and Method overloading
    - Generic methods are methods that can work with any data type
    ```Java
    public <T> add(T[] array){ // <T> is the return type
        //Code belongs Here
    }
    public <T> int add(T[] array){ // <T> is the type of Generic method, telling the comiler that this is a special methods.
        //Code belongs Here
    }
    public static void main(String[] args){
        String[] array = {'HERE', "Is", "That"}
        add<String> obj = new add<String>(array)
    }
    ```
    - Method Overloading - Methods that have the same name but might either have different return types or Parameters
    ```Java
    public Double add(Double a, Double b){
        return a+b;
    }
    public int add(int a, int b){
        return a+b; // This function has the same name as the one above, but the return type is different, This is called method over loading
    }
    ```
    Example 2 : 
    ```Java 
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
    ```
    - Difference between Non - Generic Methods and Generic methods Is that Generic methods can accept any data type whereas the Non - Generic Methods are data type fixed, The Generic methods are flexible as they can be used in every Data type, String, Integer etc..
        + The generic methods, they data type is resolved at run time.. 
        - This introduces complexity due to errors being realised at run time instead of compile time..
