# Exam Creation Language (Complex)

## Introduction

The language created for this requirement is based on JSON (JavaScript Object Notation), which is
well known in the programming industry, and it is easy to understand.

For the creation of an exam, the specifications of the requirements of the exam (i.e headers, sections and question
pools)
are necessary.

Finally, the given format is designed for easy alteration, adding or removing questions from each pool,
and for pool reutilization.

## Basics

### Designator

A designator is a field in the language that identifies the entry, followed by a semi-column (unless in the exam case,
which is special) to which the property
will retain value, which is a type.

The following example will show the "id" designator:

```text
id: "STRING"
```

A table of all valid designators and their usage:

|   **Designator**    | **Type(s) that accepts** |                                   **Usage**                                   |
|:-------------------:|:------------------------:|:-----------------------------------------------------------------------------:|
|     ***pools***     |          Array           |     Contains all the questions that may be used by one (or more) sections     |
|     ***name***      |          String          |                              The naame of a pool                              |
|   ***questions***   |          Array           | Contains all the questions of a given pool that may be used to create an exam |
|    ***prompt***     |          String          |  Referes to the question prompt that will be asked if the question is asked   |
|     ***code***      |        Code Type         |  The code type of the question (matching, multiple choice, numerical, etc.)   |
|      ***iid***      |         Integer          |     The identifier of the questions and awnsers on the matching questions     |
|    ***awnsers***    |          Array           |           Contains all the awnsers of the multiple choice questions           |
|  ***difficulty***   |         Integer          |                        The difficulty of the question                         |
|     ***body***      |          Object          |                      The body of the question of a pool                       |
|     ***text***      |          String          |                        The text with the missing words                        |
|     ***keys***      |          Object          |                   A map corresponding an integer to a text                    |
|     ***title***     |          String          |                             The title of the exam                             |
|    ***header***     |          Object          |                               The header object                               |
|  ***description***  |          String          |                         The description of an object                          |
|    ***grading***    |       Grading Type       |                       Defines when the grading happens                        |
|   ***feedback***    |       Grading Type       |                       Defines when the feedback happens                       |
| ***limitQuestion*** |         Integer          |                        The maximum number of questions                        |
|     ***pool***      |          String          |                          The name of the pool to use                          |

### Types

Types are generic constraints to values that are used to simplify the undestanding of the language.

List of all types and their explanation:

|    ***Name***    |                                   ***Designation***                                    |
|:----------------:|:--------------------------------------------------------------------------------------:|
|    **Array**     |              A collection of elements. Starts with '[' and ends with ']'               |
|    **String**    |                                A representation of text                                |
|  **Code Type**   | Can be true-false, missing-words, numerical, short-awnser, multiple-choice or matching |
|   **Integer**    |                                        A number                                        |
| **Grading Type** |                      Can be none, on-submission, or after-closing                      |
|    **Object**    |                         A specialized container for properties                         |

### Comments

Comments are accepted and may be used to annex context for each part without interfering with the
creation of the exam itself.

```text
// The definition of a pool, it contains all the necessary pools for the exam.
pools: [...]
```

## Exam Body

The exam body starts with the designator "exam" (without the ':').
The exam body represents the prototype exam to which every gradable exam will derive from.

### Id

The exam id serves to identify each exam in the application, for the purpose of the language,
it may be deprecated in the future; for now, though, it is required.

The field is of a *STRING* type, identified by the designator 'id'.



## Pools

Pools are the bank of questions that are usedto generate each exam.