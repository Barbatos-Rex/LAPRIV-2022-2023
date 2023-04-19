grammar ExamGrammar;


start: pools exam | exam pools;


pools: POOLS COLLUMN '[' pools_body ']';

pools_body: pool COMA pools_body | pool;

pool: '{'NAME COLLUMN STRING COMA QUESTIONS COLLUMN questions '}';

questions: '[' questions_body ']';
questions_body: question_body COMA questions_body | question_body;

question_body: '{' PROMPT COLLUMN prompt_string=STRING COMA BODY COLLUMN '{' body '}' COMA DIFFICULTY COLLUMN INT '}';

body: matching | multiple_choice | short_awnser| numerical | missing_words | true_false;




true_false: CODE COLLUMN 'true-false' COMA AWNSER COLLUMN true_false_option;

missing_words: CODE COLLUMN 'missing-words' COMA TEXT COLLUMN text_string=STRING COMA KEYS COLLUMN '{' key_map '}';

key_map: INT COLLUMN STRING COMA key_map| INT COLLUMN STRING;

numerical: CODE COLLUMN 'numerical' COMA AWNSER COLLUMN (REAL|INT);

short_awnser: CODE COLLUMN 'short-awnser' COMA AWNSER COLLUMN STRING;

multiple_choice: CODE COLLUMN 'multiple-choice' COMA OPTIONS COLLUMN '[' multiple_choice_options ']';

multiple_choice_options: opt1=multiple_choice_options_body COMA opt2=multiple_choice_options_body COMA opt3=multiple_choice_options_body COMA opt4=multiple_choice_options_body;

multiple_choice_options_body: '{' PROMPT COLLUMN STRING COMA VALID COLLUMN true_false_option '}';

matching: CODE COLLUMN 'matching' COMA QUESTIONS COLLUMN '[' matching_questions ']' COMA AWNSERS COLLUMN '[' matching_awnsers']';

matching_awnsers: matching_token COMA matching_awnsers | matching_token;

matching_token: '{' IID COLLUMN INT COMA PROMPT COLLUMN STRING '}' ;


matching_questions: matching_token COMA matching_questions | matching_token;

true_false_option: 'true' | 'false';

exam: EXAM '{' exam_body '}';

exam_body: ID COLLUMN exam_id=STRING COMA TITLE COLLUMN exam_title=STRING COMA header COMA sections;

sections: SECTIONS COLLUMN '[' sections_body ']';

sections_body: section_object COMA sections_body | section_object;

section_object: '{' ID COLLUMN sec_id=STRING COMA DESCRIPTION COLLUMN sec_des=STRING COMA DIFFICULTY COLLUMN dif=INT COMA LIMIT_QUESTION COLLUMN limit=INT COMA POOL COLLUMN pol_name=STRING '}';

header: HEADER COLLUMN '{' header_body '}';

header_body: DESCRIPTION COLLUMN des=STRING COMA GRADING COLLUMN grad=HEADER_TYPE COMA FEEDBACK COLLUMN feed=HEADER_TYPE;



fragment Integer: [1-9][0-9]*|'0';
fragment COMMENT_END: '*/';
fragment COMMENT_START: '/*';


HEADER_TYPE: 'none'|'on-submission'|'after-closing';
COLLUMN: ':';
COMA: ',';
EXAM: 'exam';
PROMPT: 'prompt';
POOLS: 'pools';
NAME: 'name';
QUESTIONS: 'questions';
BODY: 'body';
CODE: 'code';
AWNSERS: 'awnsers';
DIFFICULTY:'difficulty';
OPTIONS: 'options';
VALID: 'valid';
IID: 'iid';
AWNSER: 'awnser';
TEXT: 'text';
KEYS: 'keys';
ID: 'id';
TITLE: 'title';
HEADER: 'header';
GRADING: 'grading';
DESCRIPTION: 'description';
FEEDBACK: 'feedback';
SECTIONS: 'sections';
LIMIT_QUESTION: 'limitQuestion';
POOL: 'pool';
REAL: Integer?'.'[0-9]+ ;
INT: Integer;
STRING: '"' ~'"'* '"';
COMMENT: '//' ~([\n\r\u2028\u2029])* -> skip;
WS: [ \t\r\n] -> skip;