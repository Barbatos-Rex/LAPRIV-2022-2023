# Grading Creation Language

## Introduction

The language created for this requirement is based on SQL (Structured Query Language), which is
well known in the programming industry, and it is easy to understand.

For the creation of the grading rules, the specifications of each rule for each question is necessary.

Finally, the given format is designed for easy alteration, adding or removing grading rules and
presentation format.

## Basics

### Key-Words

A Key-Word is a field in the language that is reserved for usage during grading rules specification.

Key-Words serve to impose meaning and designate which entity (in SQL it would be a statement) is
being created.

The following example will show how keywords can impose meaning into a creation of a misisng words grading rule:

```text
define grading for missing words question "3".
if all are correct then award 5, if 4 are correct then award 2, if 2 are correct then award 1.
if all are wrong award -2.
```

As is possible to see in this example, the key-words impose meaning and coordenate
how an entity is formed.

The example shows the creation of a missing words grading rule with id 3, maximum points of 5, minimum points of -2, 
partial awardal for 4 correct, 2 points and partial awardal for 2 correct, 1 point.

A list of all Keywords:
* accept
* all
* and
* are
* as
* award
* answers
* between
* boundary
* correct
* define
* exam
* for
* from
* grading
* if
* in
* import
* may
* matching
* missing words
* multiple choice
* numerical
* override
* present
* question
* regex
* short answer
* then
* true or false
* with
* wrong

### Primitives

* Text
* Integer
* Real
* Boolean
* Grading Presentation

#### Primitive Format
* Text -> Must be surronded by '"'. Example: **"This is an example of a text block!"**
* Integer -> Any Integer number. Example: **5** or **0**
* Real -> Any number that is decimal (may contain, or not, integer part, may be negative). Examples: **10.0** or **-.23**.
* Boolean -> Can be either **true** or **false**.
* Grading Presentation -> Can be any of the following 3 options: **decimal**, **fraction**, **percentage**

## Rule Creation


By default, if not specified, wrong awardal will produce 0 points.
To create a rule in a valid state, the following templates can be used:

### Matching

**Simple matching definition**

```text
define grading for matching question ${TEXT}.
if all are correct then award ${INTEGER}.
```

**Matching definition with wrong awardal**
```text
define grading for matching question ${TEXT}.
if all are correct then award ${INTEGER}.
if all are wrong award ${INTEGER}.
```

**Matching definition with partial awardal and wrong awardal**
```text
define grading for matching question ${TEXT}.
if all are correct then award ${INTEGER},
if ${INTEGER} are correct then award ${INTEGER}, if ${INTEGER} are correct then award ${INTEGER}
,[...].
if all are wrong award ${INTEGER}.
```
> Wrong awardal can be removed

### Multiple

**Simple multiple definition**

```text
define grading for multiple choice question ${TEXT}.
if all are correct then award ${INTEGER}.
```
**Multiple definition with wrong awardal**

```text
define grading for multiple choice question ${TEXT}.
if all are correct then award ${INTEGER}. 
if all are wrong award ${INTEGER}.
```

**Multiple definition with partial awardal and wrong awardal**
```text
define grading for multiple choice question ${TEXT}.
if all are correct then award ${INTEGER},
if ${INTEGER} are correct then award ${INTEGER}, if ${INTEGER} are correct then award ${INTEGER}
,[...].
if all are wrong award ${INTEGER}.
```
> Wrong awardal can be removed

### Short Answer

**Simple short answer definition**

```text
define grading for short answer question ${TEXT}.
may accept:
-> ${TEXT}
-> ${TEXT}
-> ${TEXT}
-> ${TEXT}
as correct.
if correct then award ${INTEGER}.
```
> Eventhough the may accept clause can be removed, its removal is ill-advised.


**Override with regex short answer definition**
```text
define grading for short answer question ${TEXT}.
override answers with regex ${TEXT}.
if correct then award ${INTEGER}.
```


**Override with regex and multiple acceptance short answer definition**
```text
define grading for short answer question ${TEXT}.
may accept:
-> ${TEXT}
-> ${TEXT}
-> ${TEXT}
-> ${TEXT}
as correct.
override answers with regex ${TEXT}.
if correct then award ${INTEGER}.
```

>If the student hits the may accept and not the regex, a penalization will be raised.
> 
>The penalization is always obtained by adding the maximum and minimum possible scores and dividing by 2 
(The geometric distance between the maximum and minimum scores).
> 
>Example: Maximum = 5 and Minimum = -3. Penalized Score = (5+(-3))/2= 1
So if the student succeds by entering the may accept instead of regex, it will earn 1 point.

**Wrong awardal short awnser definition**

```text
define grading for short answer question ${TEXT}.
may accept:
-> ${TEXT}
-> ${TEXT}
-> ${TEXT}
-> ${TEXT}
as correct.
if correct then award ${INTEGER}.
```
> Wrong awardal can be used in  all of the above templates


### Numerical

**Simple numerical definition**

```text
define grading for numerical question ${TEXT}.
may accept:
-> ${REAL}
-> ${REAL}
-> ${REAL}
-> ${REAL}
if correct then award ${INTEGER}.
```

> Eventhough the may accept clause can be removed, its removal is ill-advised.


**Override with boundaries numerical definition**

```text
define grading for numerical question ${TEXT}.
override answers with boundary between ${REAL} and ${REAL}.
if correct then award ${INTEGER}.
if all are wrong award ${INTEGER}.
```

> The boundary is not created from the left real to the right real, but from the lowest of those numbers to the highest of both.


### Missing

**Simple missing definition**

```text
define grading for missing words question ${TEXT}.
if all are correct then award ${INTEGER}.
```

**Matching definition with wrong awardal**
```text
define grading for missing words question ${TEXT}.
if all are correct then award ${INTEGER}.
if all are wrong award ${INTEGER}.
```

**Matching definition with partial awardal and wrong awardal**
```text
define grading for missing words question ${TEXT}.
if all are correct then award ${INTEGER},
if ${INTEGER} are correct then award ${INTEGER}, if ${INTEGER} are correct then award ${INTEGER}
,[...].
if all are wrong award ${INTEGER}.
```
> Wrong awardal can be removed


### True or False

**Simple missing definition**

```text
define grading for missing words question ${TEXT}.
if all are correct then award ${INTEGER}.
```

**Matching definition with wrong awardal**
```text
define grading for missing words question ${TEXT}.
if all are correct then award ${INTEGER}.
if all are wrong award ${INTEGER}.
```

____________

## Example

```text
define grading for matching question "1".
if all are correct then award 5,
if 2 are correct then award 2. if all are wrong award -2.

define grading for numerical question "2". may accept:
-> 120.0
as correct.
if correct then award 2.

define grading for missing words question "3".
if all are correct then award 5, if 4 are correct then award 2, if 2 are correct then award 1.
if all are wrong award -2.

define grading for short answer question "4".
may accept:
-> "i < 7 ; i++"
as correct.
if correct then award 2.

define grading for multiple choice question "5".
if all are correct then award 4. if all are wrong award -4.

define grading for true or false question "6".
award 1. if all are wrong award -1.

define grading for true or false question "23".
award 1. if all are wrong award -1.

define grading for true or false question "7".
award 1. if all are wrong award -1.

define grading for true or false question "8".
award 1. if all are wrong award -1.

define grading for true or false question "9".
award 1. if all are wrong award -1.

define grading for true or false question "10".
award 1. if all are wrong award -1.

define grading for multiple choice question "11".
if all are correct then award 4. if all are wrong award -4.

define grading for multiple choice question "13".
if all are correct then award 4. if all are wrong award -4.

define grading for missing words question "14".
if all are correct then award 5, if 4 are correct then award 2, if 2 are correct then award 1.
if all are wrong award -2.

define grading for multiple choice question "15".
if all are correct then award 4. if all are wrong award -4.

define grading for multiple choice question "16".
if all are correct then award 4. if all are wrong award -4.

define grading for true or false question "17".
award 1. if all are wrong award -1.

define grading for true or false question "18".
award 1. if all are wrong award -1.

define grading for true or false question "19".
award 1. if all are wrong award -1.

define grading for true or false question "20".
award 1. if all are wrong award -1.

define grading for true or false question "21".
award 1. if all are wrong award -1.

present grading in fraction.
```

