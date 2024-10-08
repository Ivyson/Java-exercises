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
#### Common Regular Expression Symbols
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
  - To use Pattern Matching we need to firstly ensure that we have imported the following libraries: 
    ```java
      import java.util.regex.Matcher;
      import java.util.regex.Pattern;
      public class WordBoundaryExample {
      public static void main(String[] args) {
        // Define the pattern
        String patternString = "\\bword\\b";  // Matches the word 'word' as a whole word
        Pattern pattern = Pattern.compile(patternString);
        // Search the string
        String text = "This is a word in a sentence.";
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        } else {
            System.out.println("No match found.");
        }
        }
        }
## REGEX Operators
<table>
<tr>
<th>Usage</th>
<th>Example</th>
<th>Explanation</th>
</tr>
<tr>
<td>abc</th>
<td>abc</th>
<td>Matches any string = "abc"</th>
</tr>
<tr>
<td>Dot (<b>.</b)</th>
<td>a.c</th>
<td>Matches String "abc", "atc" etc, but not "ac"</th>
</tr>
<tr>
<td>Square Brackets (<b>[]</b>)</th>
<td><b>[aeiou]</b></th>
<td>Matches any vowel, basically matching at least one of the characters in the square brackets</th>
</tr>
<tr>
<td><b>[^]</b></th>
<td><b>[^aeiou]</b></th>
<td>Negating, Matches any character that is not a vowel or not included in that square brackets</th>
</tr>
<tr>
<td>Dollar Sign <b> $ </b></th>
<td><b>abc$</b></th>
<td>Matches any String that ends with "...abc"</th>
</tr>
<tr>
<td>Caret <b>^</b></th>
<td><b>^abc</b></th>
<td>Any String that starts with "abc..."</th>
</tr>
<tr>
<td>Word Boundary <b>\b</b></th>
<td>\bword\b</th>
<td>Any wprd that has "word" in it, whole "word" string as it is</th>
</tr>
<tr>
<td>Asterisk <b> * </b></th>
<td><b>a*</b></th>
<td>Matches 0 or more occurences of the preceding word, "a" for this instance.</th>
</tr>
<tr>
<td>plus Sign <b>+</b></th>
<td>a+</th>
<td>Matches 1 or more of the occurances of the preceding words</th>
</tr>
<tr>
<td>Question Mark <b> ? </b></th>
<td><b> a? </b></th>
<td>Matches 0 or 1 occurences of the preceeding words</th>
</tr>
<tr>
<td>Braces <b> {} </b></th>
<td>a{n,m}</th>
<td>Matches between n and , occurances of the preceding element, If a occurs at least n times or the maximum m times</th>
</tr>
</table>
## Examples and Exercises
The Exercise questions are provided on the actual PDF on the last page,the subfolders here are having my own answers
