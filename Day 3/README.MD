# Day 3 Of the Lecture

## Covered Concepts

1. **Files and Streams**
    1. How Java file reading is treated as streams of bytes.
    2. Different Types of Data
        - **Temporary Data**: Data that is stored and lost within the code. When the code finishes executing, the information is lost.
        - **Persistent Data**: Data that remains for a long period on the drive. Examples include files, which are typically stored on secondary storage like hard drives.
    3. **File Stream**: Understanding file streams and methods Java uses to read files as streams.
        - File streams handle input/output data as either characters or bytes. Bytes refer to binary data, while characters refer to human-readable text.
    4. **Three Types of Streams**
        - `System.in`: Standard input stream, reads bytes from the keyboard.
        - `System.out`: Standard output stream, outputs character data to the screen.
        - `System.err`: Standard error stream, outputs character-based error messages to the screen.
        - Other streams include methods from the `System` class, such as `setIn`, `setOut`, and `setErr`, which redirect inputs and outputs to different devices or files.

### Main Stream Classes

1. **FileInputStream**: Provides byte-based input from a file.
2. **FileOutputStream**: Provides byte-based output to a file.
3. **FileReader**: Provides character-based input from a file. Reads content from a file.
4. **FileWriter**: Provides character-based output to a file. Writes data to a file.
    - Need to explore `ObjectOutputStream` and `ObjectInputStream`, as well as `Scanner` and `Formatter`.

### File Constructors in the File Class

- **Relative/Absolute Path**: Obtaining the path of a file. Absolute paths start with `C:\Users\User\Downloads...`.
    1. **Code** `new File(...)` accepts several arguments, with the path being mandatory.
        - A relative path is used when the file is in the same directory as the Java project.
        - An absolute path is used to access files from anywhere in the system, typically displayed as `C:\Users\User\Downloads...`.
    2. Refer to Page 7 for methods to manipulate files. [Click here](SDN260S_2024_files_streams_object_serialization.pdf) for the document.

## Exceptions for File Manipulations

1. **SecurityException**: Thrown when there is no permission to read or write the file.
2. **FileNotFoundException**: Thrown when the file is not found.
3. **FormatterClosedException**: Thrown if the file was closed and a read/write operation is attempted.
4. **NoSuchElementException**: Thrown if data being read by the scanner is in the wrong format (e.g., expecting an integer but a string is provided).
5. **IllegalStateException**: Thrown if the scanner is closed but a write operation is attempted.
6. **SystemExit**: Use `System.exit(1)` to terminate the program.

## Object Serialization

- **Serialization**: The process of writing data to a file. When writing to a file, data is appended or written in the specified order.
- **Deserialization**: The process of reading data from a file. You can read data from any line regardless of where it starts.
- Understand how `FileOutputStream` and `ObjectOutputStream` work together, as well as `FileInputStream` and `ObjectInputStream`.
- The tag `public class Main implements Serializable` makes the class serializable.
- Refer to page 18 for more details.
- **Transient Variables**: Variables that cannot be serialized and are ignored by the serialization process.
- Try out the code on page 19 with binary content (e.g., `clients.ser`).

## Message for Today

- Go through the code on the slides and understand it!

## Things Learned Through Today's Practices

1. The keyword `super()` is used to refer to a parent class of an object. If you have a class with `public class Child extends Parent`, the keyword `super()` will call the constructor of `Parent`.

## Consultation

Check this project to see how I integrated both GUI and file reading: [Notepad Example](https://github.com/Ivyson/Notepad-Example)

