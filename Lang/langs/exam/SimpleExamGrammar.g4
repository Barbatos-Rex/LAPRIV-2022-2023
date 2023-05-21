grammar SimpleExamGrammar;



start : pool+ section+ exam;


pool: DEFINE QUESTION POOL STRING COL pool_body;


pool_body: pool_body_atomic pool_body
         | pool_body_atomic
         ;

pool_body_atomic: matching|multiple|short|missing|num|true_false;






matching: MATCHING QUESTION STRING QUESTIONS COL matching_map ANSWERS COL matching_map DIFFICULTY COL INT;

matching_map: matching_map_atomic matching_map
            | matching_map_atomic
            ;

matching_map_atomic: INT RELATOR STRING;


multiple: 'multiple choice' QUESTION STRING multiple_map DIFFICULTY COL INT;

multiple_map: multiple_map_atomic multiple_map | multiple_map_atomic;

multiple_map_atomic: STRING RELATOR BOOLEAN;


short: 'short answer' QUESTION prompt=STRING answer=STRING DIFFICULTY COL INT ;


missing: 'missing words' QUESTION prompt=STRING text=STRING KEYS COL key_map DIFFICULTY COL INT;

key_map: key_map_atomic key_map | key_map_atomic;

key_map_atomic: INT RELATOR STRING;


num: 'numerical' QUESTION STRING REAL DIFFICULTY COL INT;


true_false: 'true or false' QUESTION STRING BOOLEAN DIFFICULTY COL INT;





section: DEFINE SOME SECTION WITH ID id=STRING COMA DESCRIPTION desc=STRING COMA
MAXIMUM DIFFICULTY OF mDif=INT COMA section_maximum_number_of_questions? USING POOL npool=STRING;


section_maximum_number_of_questions: MAXIMUM NUMBER OF QUESTIONS OF INT COMA;

exam: EXPORT EXAM WITH titl=TITLE STRING COMA desc=DESCRIPTION STRING COMA GRADING g=HEADER_OPTION
COMA FEEDBACK f=HEADER_OPTION AND SECTIONS LARR sections_arr RARR AS fname=STRING;

sections_arr: STRING COMA sections_arr | STRING;






//TOKENS
MATCHING: 'matching';
RELATOR: '<->';
DEFINE: 'define';
SOME: 'some';
SECTION: 'section';
ID: 'id';
MAXIMUM: 'maximum';
DIFFICULTY: 'difficulty';
OF: 'of';
USING: 'using';
POOL: 'pool';
EXPORT: 'export';
EXAM : 'exam';
WITH : 'with';
TITLE : 'title';
COMA : ',';
DESCRIPTION : 'description';
GRADING : 'grading';
FEEDBACK : 'feedback';
AND : 'and';
SECTIONS : 'sections';
LARR : '[';
RARR : ']';
NUMBER: 'number';
QUESTIONS: 'questions';
QUESTION: 'question';
ANSWERS: 'answers';
KEYS : 'keys';
COL : ':';
AS : 'as';

//PRIMITIVES
STRING : '"' ~'"'+ '"';
HEADER_OPTION : 'none'|'on submission'|'after closing';
INT: [1-9][0-9]* | '0';
BOOLEAN: 'true'|'false';
REAL : ([1-9][0-9]*|'0')?'.'([0-9]*[1-9]|'0');

//SKIP
WS: [ \t\r\n]->skip;


