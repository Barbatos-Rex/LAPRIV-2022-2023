grammar SimpleExamGrammar;



start : pool+ section+ exam;


pool: DEFINE QUESTION POOL STRING COL pool_body;


pool_body: pool_body_atomic pool_body
         | pool_body_atomic
         ;

pool_body_atomic: matching|multiple|short|missing|num|true_false;






matching: MATCHING QUESTION WITH ID id=STRING COMA prompt=STRING QUESTIONS COL ques=matching_map ANSWERS COL asnw=matching_map DIFFICULTY COL INT;

matching_map: matching_map_atomic matching_map
            | matching_map_atomic
            ;

matching_map_atomic: INT RELATOR STRING;


multiple: 'multiple choice' QUESTION WITH ID id=STRING COMA prompt=STRING multiple_map DIFFICULTY COL INT;

multiple_map: multiple_map_atomic multiple_map | multiple_map_atomic;

multiple_map_atomic: STRING RELATOR BOOLEAN;


short: 'short answer' QUESTION WITH ID id=STRING COMA prompt=STRING answer=STRING DIFFICULTY COL INT ;


missing: 'missing words' QUESTION WITH ID id=STRING COMA prompt=STRING text=STRING KEYS COL key_map DIFFICULTY COL INT;

key_map: key_map_atomic key_map | key_map_atomic;

key_map_atomic: INT RELATOR STRING;


num: 'numerical' QUESTION WITH ID id=STRING COMA prompt=STRING REAL DIFFICULTY COL INT;


true_false: 'true or false' QUESTION WITH ID id=STRING COMA prompt=STRING BOOLEAN DIFFICULTY COL INT;





section: DEFINE SOME SECTION WITH ID id=STRING COMA DESCRIPTION desc=STRING COMA
MAXIMUM DIFFICULTY OF mDif=INT COMA section_maximum_number_of_questions? USING POOL npool=STRING;


section_maximum_number_of_questions: MAXIMUM NUMBER OF QUESTIONS OF INT COMA;

exam: EXPORT EXAM WITH TITLE titl=STRING COMA desc=DESCRIPTION STRING COMA GRADING g=HEADER_OPTION
COMA FEEDBACK f=HEADER_OPTION AND SECTIONS LARR sections_arr RARR AS fname=STRING;

sections_arr: STRING COMA sections_arr #section_arr
            | STRING                   #section_atomic
            ;






//TOKENS
AND : 'and';
ANSWERS: 'answers';
AS : 'as';
COL : ':';
COMA : ',';
DEFINE: 'define';
DESCRIPTION : 'description';
DIFFICULTY: 'difficulty';
EXAM : 'exam';
EXPORT: 'export';
FEEDBACK : 'feedback';
GRADING : 'grading';
ID: 'id';
KEYS : 'keys';
LARR : '[';
MATCHING: 'matching';
MAXIMUM: 'maximum';
NUMBER: 'number';
OF: 'of';
POOL: 'pool';
QUESTION: 'question';
QUESTIONS: 'questions';
RARR : ']';
RELATOR: '<->';
SECTION: 'section';
SECTIONS : 'sections';
SOME: 'some';
TITLE : 'title';
USING: 'using';
WITH : 'with';

//PRIMITIVES
STRING : '"' ~'"'+ '"';
HEADER_OPTION : 'none'|'on submission'|'after closing';
INT: [1-9][0-9]* | '0';
BOOLEAN: 'true'|'false';
REAL : '-'?([1-9][0-9]*|'0')?'.'([0-9]*[1-9]|'0');

//SKIP
WS: [ \t\r\n]->skip;


