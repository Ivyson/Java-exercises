# Day 3 Of the lecture
## Covered concepts
1. Files and streams
    1. How Java file reading is treated as streams of bytes
    2. Different types of Data - Temporary v.s Persistent data
        - Temporary Data - Data that is stored and lost within the code. when the code is done executing, the information of that variable is then lost
        - Persistent Data - Data that remains for a long period on the drive, Example includes files, this data is normally stored on the secondary disk drives like Hard drive 
    3. File Stream - What is a file stream and the methods at which java uses to read file as a stream ** need to fix this **
        - File Stream is used to input/output data as either a character or bytes, whereby bytes refer to binary and character refers to a text that a human brain can read
    4. Three Types of Stream 
        -  ``` System.in ``` : Standard input stream, reads bytes from the keyboard
        -  ``` System.out ```: Standard output stream, outputting character  data on the screen.
        -  ``` System.err ``` : Standard Error stream, outputs a character based error message to screen.
    - Other streams include methods from the ``` System ``` Class,  methods include ``` setIn ```, ``` setOut ``` , ``` setErr ```. These redirect inputs and outputs to different to to other devices or files etc..
### Main Stream classes
1. FileInputStream - provides a byte based input to a file.
2. FileOutputStream - provides a byte based output to a file
3. FileReader - Provides a character based input from a file ** Need to go through this ** Reads content  from a file
4. FileWritter - Provides a character output from a file ** Writes data to a file **
    - Need to go through ObjectOutputSteam and ObjectInputSteam  Scanner and Formatter
### File constructors that are available form the File Class
- Relative/Absolute Path - Obtaining the path of the file, absolute being the actual path starting with ``` C:\Users\User\Downloads.... ```
1. Code ``` New File(...) ``` Can accept a few argumetents, one important that is always mendatory is the path.
    - File path can be relative when the file we are trying to access is in the same directory as our Java project
    - Absolute can be used to read file from anywhere in the system, Normally displayed as follows for windows OS ``` C:\Users\User\Downloads.... ```
2. Refer to Page 7 to see the methods we can use to manipulate files <a href="SDN260S_2024_files_streams_object_serialization.pdf" target="_balnk">Click here </a>
## Exceptions for File Manipulations
1. Security Exception - ```SecurityException ``` from the ``` java.lang.* ``` import, This is for when a user has no permission to read. write the file
2. File Not Found Exception -  Self explainotary
3. Formatter Closed Exception - If the file was closed, a user should should not be able to read/write the file, hence this exception!
4. No Such Element Exception - If the data being read by the scanner method is in a wrong format , eg:- expected an integer but the user entered a string
5. Illegal State Exception - The Scanner was closed but the user wants to write to that file
6. System Exit - When you want to terminate the program then ``` System.Exit(1) ``` will become handy
## Object Serialization
- This is a process whereby the file is being read/writing 
    - Writing from a file is referred as serialisation - When writing to a file, information can only be appended on the last sentence or we clear the whole sentence and appending data serially, meaning if you are having a string ``` Name = "My name is Sam" ``` , the string will be appended or written in the same order as specified.
    - Reading from a file is referred as deserialisation - When reading Data from a file, you can read from any line irregardless where it starts.
- I need to understand to understand hwo this whole idea fits into FileOutputStream conjoins ObjectOutputStream, Same idea applies to FileInputStream and ObjectInputStream
- Understand the tags ``` public class Main implements Serializable ```, this tag makes reading to a file be serial!
- Go to page 18 
- Transient Variables, A variable that cannot be serialised, therefore this variable can be ignored by the serial functionality
- Try out the code at page 19 where by we read file that has a binary content ``` clients.ser ```     
## Message for today
- Go through the codes on the slides and understand them!
## Things learnt through today's Practices
1. The keyword ``` super() ``` is used to refer to a parent class of an object, The parent class is the one we inherit its content, If you have a code that has a tag ```Java
public class Child extends Parent ``` the keywors ``` super() ``` will call the constructor of ``` Parent ```.
2. 
## Consultation
Check this project to see how i worked on integrating both GUI and File reading in this <a href="https://github.com/Ivyson/Notepad-Example">Project</a>
