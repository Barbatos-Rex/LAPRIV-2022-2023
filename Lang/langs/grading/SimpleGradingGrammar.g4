grammar SimpleGradingGrammar;


start: questions grade_presentation ;

grade_presentation: PRESENT GRADING IN GRADING_PRESENTATION MARK;

question: matching
        | multiple
        | short
        | numerical
        | missing
        | true_false
        ;

questions: question questions
         | question
         ;


matching: DEFINE GRADING FOR MATCHING QUESTION STRING MARK IF ALL ARE CORRECT THEN AWARD maxPoints=INT parcial_awardal? MARK (IF ALL ARE WRONG AWARD minPoints=INT MARK)?;

parcial_awardal: COMA parcial_awardal_atomic parcial_awardal |  COMA parcial_awardal_atomic;

parcial_awardal_atomic: IF number=INT ARE CORRECT THEN AWARD points=INT;



multiple: DEFINE GRADING FOR MULTIPLE_CHOICE QUESTION STRING MARK IF ALL ARE CORRECT THEN AWARD maxPoints=INT parcial_awardal? MARK (IF ALL ARE WRONG AWARD minPoints=INT MARK)?;


short:  DEFINE GRADING FOR SHORT_AWNSER QUESTION id=STRING MARK (MAY ACCEPT COL attach_text_options AS CORRECT MARK)? (OVERRIDE ANSWERS WITH REGEX regex=STRING)? IF CORRECT THEN AWARD maxPoints=INT MARK ( IF WRONG AWARD minPoints=INT MARK)?;

attach_text_options: attach_text_options_atomic attach_text_options | attach_text_options_atomic;

attach_text_options_atomic: DASH STRING;

numerical: DEFINE GRADING FOR NUMERICAL QUESTION STRING MARK (MAY ACCEPT COL attach_real_options AS CORRECT MARK)? (OVERRIDE ANSWERS WITH BOUNDARY BETWEEN lv=INT AND hV=INT)? IF CORRECT THEN AWARD maxPoints=INT MARK (IF ALL WRONG AWARD minPoints=INT MARK)?;

attach_real_options: attach_real_options_atomic attach_real_options | attach_real_options_atomic;

attach_real_options_atomic: DASH REAL;

missing: DEFINE GRADING FOR MISSING_WORDS QUESTION STRING MARK IF ALL ARE CORRECT THEN AWARD max=INT parcial_awardal? MARK ( IF ALL ARE WRONG AWARD min=INT MARK)?;

true_false: DEFINE GRADING FOR TRUE_FALSE QUESTION STRING MARK AWARD max=INT MARK ( IF ALL ARE WRONG AWARD min=INT MARK)?;



//PRIMITIVES

fragment Digit : [0-9];

STRING               : '"' ~'"'+ '"';
REAL                 : '-'?([1-9]Digit* | '0')?'.'(Digit*[1-9]|'0');
INT                  : '-'?[1-9]Digit* | '0';
GRADING_PRESENTATION :  'decimal'|'percentage'|'fraction';

// TOKENS
ACCEPT          : 'accept';
ALL             : 'all';
AND             : 'and';
ARE             : 'are';
AS              : 'as';
AWARD           : 'award';
ANSWERS         : 'answers';
BETWEEN         : 'between';
BOUNDARY        : 'boundary';
CORRECT         : 'correct';
DEFINE          : 'define';
EXAM            : 'exam';
FOR             : 'for';
FROM            : 'from';
GRADING         : 'grading';
IF              : 'if';
IN              : 'in';
IMPORT          : 'import';
MAY             : 'may';
MATCHING        : 'matching';
MISSING_WORDS   : 'missing words';
MULTIPLE_CHOICE : 'multiple choice';
NUMERICAL       : 'numerical';
OVERRIDE        : 'override';
PRESENT         : 'present';
QUESTION        : 'question';
REGEX           : 'regex';
SHORT_AWNSER    : 'short answer';
THEN            : 'then';
TRUE_FALSE      : 'true or false';
WITH            : 'with';
WRONG           : 'wrong';

//PONTUATION
COMA : ',';
MARK : '.';
DASH : '->';
COL  : ':';



WS: [ \t\r\n]->skip;
