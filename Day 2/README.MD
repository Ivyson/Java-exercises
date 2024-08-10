# Day 2 Lecture
This Class mainly focused on understanding and practicing with strings, string builders, and regular expressions. Basically Covering Fundamental concepts for text processing, validation, and manipulation.
## Covered Content
1. Strings
2. Characters 
3. Regular Expressions
## Objective Of the class
- Understand the basics of strings and characters in programming.
- Learn how to manipulate strings using various methods, Using StringBuilders, Buffers etc.
- Explore the use of `StringBuilder` for efficient string manipulation.
- Gain proficiency in using regular expressions for text matching and text validation.
## Folder Structure 

```
/Day 2/
|-- Exercise 1/
|   |-- Comparing.java 
|-- Exercise 2/
|   |-- Cportion.java
|-- Exercise 3/
|   |-- RandomSentence.java 
|-- README.md
```

## Content

### 1. Strings and Characters

- **Basics of Strings**: Learn about string initialization, immutability, and basic operations such as concatenation, slicing, and formatting.
- **Character Handling**: Understand how to work with individual characters within a string, including ASCII and Unicode characters.

### 2. String Manipulation

- **String Methods**: Explore various string methods such as `length()`, `charAt()`, `substring()`, `toLowerCase()`, `toUpperCase()`, `replace()`, and more.
- **Advanced Manipulation**: Learn about more advanced string operations like trimming, splitting, joining, and reversing strings.

### 3. String Builder

- **Introduction to StringBuilder**: Understand the limitations of string immutability and how `StringBuilder` can help in creating and manipulating dynamic strings efficiently.
- **StringBuilder Methods**: Learn about methods like `append()`, `insert()`, `delete()`, `reverse()`, `toString()`, and others.

### 4. Regular Expressions

- **Basics of Regular Expressions**: Introduction to regex syntax and basic concepts like literals, character classes, quantifiers, and anchors.
  -Some special predifined symbols used in Regular Expression 
    1. Digit: [` \d `]  Used to search if a string contains any Digit [0-9]
    2. Non - Digit: [` \D `] 
    3. Word: If any string matches any letter, underscore or any digit, ``` "[w]" ```, If its ``` "[\W]" ```, then it means Not words, or anything covered in this line!
    4. White space: If a string contains Any White spacing or tab or new line ``` "[\s]" ```, If ``` "[\S]" ``` Then it means the opposite
<div style="text-align: center;">
<table style="display:flex; align-items:center; justify-content:center;">
  <tr>
    <th>Character</th>
    <th>Matches</th>
  </tr>
  <tr>
    <td>[\d]</td>
    <td>Any Digit</td>
  </tr>
  <tr>
    <td>[\D]</td>
    <td>Any Non-digit</td>
  </tr>
  <tr>
    <td>[\w]</td>
    <td>Any alphabet, digit or underscore</td>
  </tr>
  <tr>
    <td>[\W]</td>
    <td>Not alphabet, digit or underscore</td>
  </tr>
  <tr>
    <td>[\s]</td>
    <td>Any white space, tab or new line</td>
  </tr>
  <tr>
    <td>[\S]</td>
    <td>Not white space, tab or new line</td>
  </tr>
</table>
</div>



- **Pattern Matching**: Learn how to use regular expressions to search, match, and replace patterns in strings.
- **Advanced Regular Expressions**: Explore more advanced topics like lookaheads, lookbehinds, capturing groups, and non-capturing groups.

## Examples and Exercises
The Exercise questions are provided on the actual PDF on the last page,the subfolders here are having my own answers
