# Day 3 Of the Lecture

## Covered Concepts

1. **Files and Streams**
    1. **Java File Reading as Streams**
        - In Java, file reading is treated as a stream of bytes. This means data from a file is read in a continuous flow rather than as discrete chunks.
        - Java provides abstractions for both byte-based and character-based streams.
        
    2. **Different Types of Data**
        - **Temporary Data**: Data that exists only during the execution of a program. It is lost when the program terminates. Examples include local variables.
        - **Persistent Data**: Data that is stored permanently on disk. Examples include files, which remain on the disk until explicitly deleted. Persistent data is stored on secondary storage like hard drives.

    3. **File Stream**
        - **Definition**: A file stream in Java is an abstract mechanism to handle file input and output as a sequence of bytes or characters.
        - **Byte Streams**: Handle raw binary data. Examples include `FileInputStream` and `FileOutputStream`.
        - **Character Streams**: Handle data as characters and are useful for reading and writing text. Examples include `FileReader` and `FileWriter`.
        - **Example Usage**:
            ```java
            // Reading bytes from a file
            FileInputStream fileInputStream = new FileInputStream("example.txt");
            int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }
            fileInputStream.close();
            
            // Writing bytes to a file
            FileOutputStream fileOutputStream = new FileOutputStream("example.txt");
            fileOutputStream.write("Hello, World!".getBytes());
            fileOutputStream.close();
            ```

    4. **Three Types of Streams**
        - **`System.in`**: Standard input stream, which reads bytes from the keyboard.
        - **`System.out`**: Standard output stream, which outputs character data to the screen.
        - **`System.err`**: Standard error stream, which outputs error messages to the screen.
        - **Other Methods**: `System` class methods like `setIn()`, `setOut()`, and `setErr()` can redirect input and output streams to different sources like files or network connections.

### Main Stream Classes

1. **FileInputStream**
    - Provides byte-based input from a file.
    - Useful for reading binary data such as image files.
    
2. **FileOutputStream**
    - Provides byte-based output to a file.
    - Useful for writing binary data.

3. **FileReader**
    - Provides character-based input from a file.
    - Suitable for reading text files.
    - Example:
        ```java
        FileReader fileReader = new FileReader("example.txt");
        int character;
        while ((character = fileReader.read()) != -1) {
            System.out.print((char) character);
        }
        fileReader.close();
        ```

4. **FileWriter**
    - Provides character-based output to a file.
    - Suitable for writing text files.
    - Example:
        ```java
        FileWriter fileWriter = new FileWriter("example.txt");
        fileWriter.write("Hello, World!");
        fileWriter.close();
        ```

    - **ObjectOutputStream** and **ObjectInputStream**: Used for serializing and deserializing objects, respectively.
    - **Scanner**: A utility for parsing input data.
    - **Formatter**: Used for formatting output.

### File Constructors in the File Class

- **Relative/Absolute Path**
    - **Relative Path**: Path relative to the current working directory of the program.
    - **Absolute Path**: Full path from the root of the file system (e.g., `C:\Users\User\Downloads\file.txt`).

    - **Example**:
        ```java
        File file = new File("example.txt"); // Relative path
        File file = new File("C:\\Users\\User\\Downloads\\example.txt"); // Absolute path
        ```

    - Refer to [this document](SDN260S_2024_files_streams_object_serialization.pdf) for more details on file manipulation methods.

## Exceptions for File Manipulations

1. **SecurityException**
    - Thrown if the application does not have permission to access a file.

2. **FileNotFoundException**
    - Thrown if the file specified cannot be found.

3. **FormatterClosedException**
    - Thrown if operations are attempted on a formatter after it has been closed.

4. **NoSuchElementException**
    - Thrown if an element is requested from a scanner that is not present.

5. **IllegalStateException**
    - Thrown if an operation is performed on a scanner after it has been closed.

6. **SystemExit**
    - `System.exit(1)` can be used to terminate a program and indicate an error status.

## Object Serialization

- **Serialization**: The process of converting an object into a byte stream for storage or transmission.
    - **Example**:
        ```java
        FileOutputStream fileOut = new FileOutputStream("data.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(object);
        out.close();
        fileOut.close();
        ```

- **Deserialization**: The process of converting a byte stream back into an object.
    - **Example**:
        ```java
        FileInputStream fileIn = new FileInputStream("data.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        MyObject object = (MyObject) in.readObject();
        in.close();
        fileIn.close();
        ```

- **Serializable Interface**: A class must implement `Serializable` to be serialized.
    - **Example**:
        ```java
        public class MyObject implements Serializable {
            private static final long serialVersionUID = 1L;
            private String name;
            // other fields and methods
        }
        ```

- **Transient Variables**: Variables marked as `transient` are not serialized. They are ignored during the serialization process.

- **Example of Transient**:
    ```java
    public class MyObject implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name;
        private transient int tempData; // This will not be serialized
    }
    ```

- **Refer to Page 18** for more details on serialization.

- **Binary File Example**: Try out the code on page 19 to read files with binary content (e.g., `clients.ser`).

## Message for Today

- Review and understand the code examples provided on the slides.

## Things Learned Through Today's Practices

1. **`super()` Keyword**: Used to call a constructor of the parent class. It allows access to parent class methods and fields.
    - **Example**:
        ```java
        public class Parent {
            public Parent() {
                System.out.println("Parent constructor");
            }
        }

        public class Child extends Parent {
            public Child() {
                super(); // Calls Parent constructor
                System.out.println("Child constructor");
            }
        }
        ```

## Consultation

Check this project to see how I integrated both GUI and file reading: [Notepad Example](https://github.com/Ivyson/Notepad-Example)

```html
<pre style="color: blue; background-color: lightgray;">
System.out.println("Hello World");
</pre>
