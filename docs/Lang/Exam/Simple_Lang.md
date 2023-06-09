# Exam Creation Language (Simple)

## Introduction

The language created for this requirement is based on SQL (Structured Query Language), which is
well known in the programming industry, and it is easy to understand.

For the creation of an exam, the specifications of the requirements of the exam (i.e headers, sections and question
pools)
are necessary.

Finally, the given format is designed for easy alteration, adding or removing questions from each pool,
and for pool reutilization.

## Basics

### Key-Words

A Key-Word is a field in the language that is reserved for usage during an exam specification.

Key-Words serve to impose meaning and designate which entity (in SQL it would be a statement) is
being created.

The following example will show how keywords can impose meaning into a creation of a section:

```text
define some section with id "Algorithm", description "Imperative Programming in Java", maximum
difficulty of 35, using pool "pool1"
```

As is possible to see in this example, the key-words impose meaning and coordenate
how an entity is formed.

The example shows the creation of a section with id, description, maximum difficulty and which
question pool will be used to populate the section's questions.

A list of all Keywords:

* and
* answers
* as
* define
* description
* difficulty
* exam
* export
* feedback
* grading
* id
* keys
* matching
* maximum
* number
* of
* pool
* question
* questions
* section
* sections
* some
* title
* using
* with


### Primitives and Entities

Primitives are the building blocks of the entities in question.
The entities are the large and complex concepts.

#### Entities 

* Exam
* Section
* Pool

#### Primitives

* Text
* Integer
* Real
* Boolean
* Header Option

#### Primitive Format
* Text -> Must be surronded by '"'. Example: **"This is an example of a text block!"**
* Integer -> Any Positive Integer number. Example: **5** or **0**
* Real -> Any number that is decimal (may contain, or not, integer part, may be negative). Examples: **10.0** or **-.23**.
* Boolean -> Can be either **true** or **false**.
* Header Option -> Can be any of the following 3 options: **none**, **on submission**, **after closing**


## Exam Creation

To create an exam in a valid state, the following template can be used:

```text
export exam with title ${Text}, description ${Text}, grading ${Header Option}
      , feedback ${Header Option} and sections [${Text},...] as ${Text}
```


Replace the **${}** with the appropriate primitive listed inside the token 


## Section Creation



To create a section in a valid state, the following template can be used:

```text
define some section with id ${Text}, description ${Text}, maximum difficulty of
      ${Integer}, using pool ${Text}
```

This template is used to create a section without a limit on the number of questions that ca appear,
however, the following template will adress that possibility:

```text
define some section with id ${Text}, description ${Text}, maximum difficulty of
      ${Integer}, maximum number of questions of ${Integer}, using pool ${Text}
```

## Pool Creation and Questions types


To create a pool, use the following template:
```text
define question pool ${Text}:
${Questions}
```


The ${Questions} must be replaced with atleast one of the following question templates:

### Matching

```text
matching question
${Text}
questions:
${Integer} <-> ${Text}
            .
            .
            .
answers:
${Integer} <-> ${Text}
            .
            .
            .          
difficulty: ${Integer}            
```



### Multiple Choice

```text
multiple-choice question
${Text}
${Text} <-> ${Boolean}
         .
         .
         .
difficulty: ${Integer}
```

### Short Answer

```text
short-answer question
${Text}
${Text}
```

### Missing Words
```text
missing-words question
${Text}
${Text}
keys:
${Integer} <-> ${Text}
     .
     .
     .
difficulty: ${Integer}
```
### Numerical

```text
numerical question
${Text}
${Real}
difficulty: ${Integer}
```


### True or False

```text
true or false question
${Text}
${Boolean}
difficulty: ${Integer}
```

## Example

```text
define question pool "pool1":

matching question
"Match the following questions to their respective awnser"
questions :
0<->"What is the difference between fori and foreach in Java?"
1<->"What is polymorphism?"
2<->"What is the defference between static and no static members?"
3<->"What is the diffference between generic algorithms and non generic algorithms?"
answers:
1<->"The property of replacing the implementation of a give protion of code with multiple implementation, given they have the same signature."
0<->"The first uses a counter to progess the looping logic while the other iterates over a collection of elements."
3<->"While the first focus on behaviour that is commun to any data type, the secound restricts to a public interface of a given data type."
2<->"While the first is not implementation specific, the secound is implementation specific."
difficulty : 8

numerical question
"What is the result printed to the standard output of the following code:\n
           public static int mystery(int n){\n
           \tif(n==0){\n
           \t\treturn 1;\n
           \t}\n
           \treturn mystery(n-1);\n
           }\n
           \n
           public static void main(String[] args){\n
           \tSystem.out.println(mystery(5));\n
           }"
120.0
difficulty: 6

missing words question
"Complete the following code in such way that the output to the standard output is correct:"
"public static @1@ countRepeatedElements(int[] arr, int elem){\n
            \t@2@;\n
            \tfor(@3@;i<@4@;i++){\n
                \t\tif(@5@){\n
                \t\t\t@6@;\n
            \t\t}\n
            @7@;
            }\n
            public static void main(String[] args){\n
            \tSystem.out.println(countRepeatedElements(new int[]{1,5,2,2,4,3,5,5,6,7,8,1},@8@));
            }\n\n
            Standard Output:\n3"
keys:
1 <-> "int"
2 <-> "int sum=0"
4<-> "arr.length()"
3<-> "int i=0"
                8<-> "5"
                5<-> "arr[i]==elem"
                7<-> "return sum"
                6<-> "sum++"

difficulty: 16

short answer question
"Replace ??? with the correct awnser (use spaces between tokens):\n\n
            public static void main(String[] args){\n
            \tList<Integer> l = new ArrayList<>();
            \tint n = 1;\n
            \tfor(int i = 1 ; ???){\n
            \t\tn*=i;\n

            \t}
            \tSystem.out.println(n);\n
            }\n
            Standard Output: [1,2,6,24,120,720]\n"
"i < 7 ; i++"
difficulty: 2

multiple choice question
"Is there any defferences between For loops and While loops?"
"For loops are goal driven while While loops can make use of the Iterable interface" <-> false
"While loops are goal driven while For loops can make use of the Iterable interface" <-> true
"There is no difference. Both are goal driven" <-> false
"There is no difference. Both can make use of the Iterable interface" <-> false
difficulty: 4

true or false question
"The complexity of binary search is O(log(n)) being the fastest searching algorithm in any array."
false
difficulty: 6

true or false question
"Generally speaking, O(n) algorithms are always faster than O(n^2)"
false
difficulty: 4

true or false question
"The Map interface is a Collection"
false
difficulty: 3

true or false question
"The List interface is a Collecation"
true
difficulty: 1

true or false question
"Scanner is one way of reading from a Input Stream"
true
difficulty: 2

true or false question
"Generally, O(n) algorithms will out-perform O(n^2) when the ammount of inputs are very large"
true
difficulty: 2

multiple choice question
"Choose the correct option:"
"Both List and Set interfaces are Collections." <-> true
"List is a Collection while Set is not" <-> false
"Neither Set nor List are Collections" <-> false
"Set is a Collection while List is not" <-> false
difficulty: 4




define question pool "pool2":
multiple choice question
"Which is a valid main declaration in Java?"
"public static main(String[] args)" <-> false
"public void main(String[] args)" <-> false
"public static void main()" <-> false
"public staic void main(String maria[])" <-> true
difficulty: 4


missing words question
"Complete the following text:"
"Like many languages Java is a @0@ language, which means that Java @1@ is @2@ into @3@, in Java's case, @4@.
                However, other languages can be @5@ languages, which means that said languages, like Python, @6@.
                 Having said that, Java is @7@ typed, allowing for @8@ between data types at @12@. In adition to that, Java alows the @9@ of
                 methods and functions, alowing multiple of them have the same @10@, as long as their @11@ is diferent."
keys:
0 <-> "Compiled"
1<-> "Source Code"
                    2<-> "Converted"
                    3<-> "Machine Code"
                    4<-> "Byte Code"
                    5<-> "Interpreted"
                    6<-> "Execute code line by line"
                    7<-> "Strongly"
                    8<-> "Distinguish"
                    12<-> "Compile Time"
                    9<-> "Overloading"
                    10<-> "Name"
                    11<-> "Signature"
difficulty: 11

multiple choice question
"Which of the following contain one (or more) words that are not Java keywords?"
"abstract, public, byte, volatile" <-> false
"do, final, native, strictftp" <-> false
"val, class, new, assert" <-> true
"catch, enum, continue, transcient" <-> false

difficulty: 5
multiple choice question
"Which of the following are not primitive java values?"
"integer numbers" <-> false
"text" <-> true
"objects" <-> true
"chars" <-> false

difficulty: 2

true or false question
"The command 'arr[2] = 3' will replace the value in the second position of the array for the value '3'"
false
difficulty: 1

true or false question
"Any array, independent of their dimension, can be used as as a bi-dimensional array"
true
difficulty: 3

true or false question
"PrintWriter and Scanner are both examples of ways to alter the contents of a Stream"
false
difficulty: 2

true or false question
"When reading the following String: 'Hello\n My name is Java!' using a scanner, if scanner.next() is used twice, the last result will be 'My'"
false
difficulty: 10


true or false question
"Binary files can be used to presist data from a program"
true
difficulty: 1



define some section with id "Algorithm", description "Imperative Programming in Java", maximum
difficulty of 35, using pool "pool1"

define some section with id "Syntax", description "Java like syntax", maximum difficulty of 20, maximum
number of questions of 5, using pool "pool2"

export exam with title "Introduction of Java - First Quarter Exam",
description "The first of two exams of introduction for the Java language",
grading on submission, feedback none and sections ["Algorithm","Syntax"] as "Intro-Java-Sem01-02"
```