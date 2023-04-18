// Generated from D:/Repos/LAPRIV-2022-23/Lang/langs/exam\ExamGrammar.g4 by ANTLR 4.12.0
package barbatos_rex1.exam.antlr4.lang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExamGrammarParser}.
 */
public interface ExamGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ExamGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ExamGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#pools}.
	 * @param ctx the parse tree
	 */
	void enterPools(ExamGrammarParser.PoolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#pools}.
	 * @param ctx the parse tree
	 */
	void exitPools(ExamGrammarParser.PoolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#pools_body}.
	 * @param ctx the parse tree
	 */
	void enterPools_body(ExamGrammarParser.Pools_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#pools_body}.
	 * @param ctx the parse tree
	 */
	void exitPools_body(ExamGrammarParser.Pools_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#pool}.
	 * @param ctx the parse tree
	 */
	void enterPool(ExamGrammarParser.PoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#pool}.
	 * @param ctx the parse tree
	 */
	void exitPool(ExamGrammarParser.PoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#questions}.
	 * @param ctx the parse tree
	 */
	void enterQuestions(ExamGrammarParser.QuestionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#questions}.
	 * @param ctx the parse tree
	 */
	void exitQuestions(ExamGrammarParser.QuestionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#questions_body}.
	 * @param ctx the parse tree
	 */
	void enterQuestions_body(ExamGrammarParser.Questions_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#questions_body}.
	 * @param ctx the parse tree
	 */
	void exitQuestions_body(ExamGrammarParser.Questions_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#question_body}.
	 * @param ctx the parse tree
	 */
	void enterQuestion_body(ExamGrammarParser.Question_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#question_body}.
	 * @param ctx the parse tree
	 */
	void exitQuestion_body(ExamGrammarParser.Question_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ExamGrammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ExamGrammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#true_false}.
	 * @param ctx the parse tree
	 */
	void enterTrue_false(ExamGrammarParser.True_falseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#true_false}.
	 * @param ctx the parse tree
	 */
	void exitTrue_false(ExamGrammarParser.True_falseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#missing_words}.
	 * @param ctx the parse tree
	 */
	void enterMissing_words(ExamGrammarParser.Missing_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#missing_words}.
	 * @param ctx the parse tree
	 */
	void exitMissing_words(ExamGrammarParser.Missing_wordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#key_map}.
	 * @param ctx the parse tree
	 */
	void enterKey_map(ExamGrammarParser.Key_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#key_map}.
	 * @param ctx the parse tree
	 */
	void exitKey_map(ExamGrammarParser.Key_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#numerical}.
	 * @param ctx the parse tree
	 */
	void enterNumerical(ExamGrammarParser.NumericalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#numerical}.
	 * @param ctx the parse tree
	 */
	void exitNumerical(ExamGrammarParser.NumericalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#short_awnser}.
	 * @param ctx the parse tree
	 */
	void enterShort_awnser(ExamGrammarParser.Short_awnserContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#short_awnser}.
	 * @param ctx the parse tree
	 */
	void exitShort_awnser(ExamGrammarParser.Short_awnserContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#multiple_choice}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_choice(ExamGrammarParser.Multiple_choiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#multiple_choice}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_choice(ExamGrammarParser.Multiple_choiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#multiple_choice_options}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_choice_options(ExamGrammarParser.Multiple_choice_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#multiple_choice_options}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_choice_options(ExamGrammarParser.Multiple_choice_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#multiple_choice_options_body}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_choice_options_body(ExamGrammarParser.Multiple_choice_options_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#multiple_choice_options_body}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_choice_options_body(ExamGrammarParser.Multiple_choice_options_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#matching}.
	 * @param ctx the parse tree
	 */
	void enterMatching(ExamGrammarParser.MatchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#matching}.
	 * @param ctx the parse tree
	 */
	void exitMatching(ExamGrammarParser.MatchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#matching_awnsers}.
	 * @param ctx the parse tree
	 */
	void enterMatching_awnsers(ExamGrammarParser.Matching_awnsersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#matching_awnsers}.
	 * @param ctx the parse tree
	 */
	void exitMatching_awnsers(ExamGrammarParser.Matching_awnsersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#matching_token}.
	 * @param ctx the parse tree
	 */
	void enterMatching_token(ExamGrammarParser.Matching_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#matching_token}.
	 * @param ctx the parse tree
	 */
	void exitMatching_token(ExamGrammarParser.Matching_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#matching_questions}.
	 * @param ctx the parse tree
	 */
	void enterMatching_questions(ExamGrammarParser.Matching_questionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#matching_questions}.
	 * @param ctx the parse tree
	 */
	void exitMatching_questions(ExamGrammarParser.Matching_questionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#true_false_option}.
	 * @param ctx the parse tree
	 */
	void enterTrue_false_option(ExamGrammarParser.True_false_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#true_false_option}.
	 * @param ctx the parse tree
	 */
	void exitTrue_false_option(ExamGrammarParser.True_false_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#exam}.
	 * @param ctx the parse tree
	 */
	void enterExam(ExamGrammarParser.ExamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#exam}.
	 * @param ctx the parse tree
	 */
	void exitExam(ExamGrammarParser.ExamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#exam_body}.
	 * @param ctx the parse tree
	 */
	void enterExam_body(ExamGrammarParser.Exam_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#exam_body}.
	 * @param ctx the parse tree
	 */
	void exitExam_body(ExamGrammarParser.Exam_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#sections}.
	 * @param ctx the parse tree
	 */
	void enterSections(ExamGrammarParser.SectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#sections}.
	 * @param ctx the parse tree
	 */
	void exitSections(ExamGrammarParser.SectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#sections_body}.
	 * @param ctx the parse tree
	 */
	void enterSections_body(ExamGrammarParser.Sections_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#sections_body}.
	 * @param ctx the parse tree
	 */
	void exitSections_body(ExamGrammarParser.Sections_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#section_object}.
	 * @param ctx the parse tree
	 */
	void enterSection_object(ExamGrammarParser.Section_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#section_object}.
	 * @param ctx the parse tree
	 */
	void exitSection_object(ExamGrammarParser.Section_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(ExamGrammarParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(ExamGrammarParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#header_body}.
	 * @param ctx the parse tree
	 */
	void enterHeader_body(ExamGrammarParser.Header_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#header_body}.
	 * @param ctx the parse tree
	 */
	void exitHeader_body(ExamGrammarParser.Header_bodyContext ctx);
}