// Generated from D:/Repos/LAPRIV-2022-23/Lang/langs/exam\ExamGrammar.g4 by ANTLR 4.12.0
package barbatos_rex1.exam.antlr4.lang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExamGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExamGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ExamGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#pools}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPools(ExamGrammarParser.PoolsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#pools_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPools_body(ExamGrammarParser.Pools_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPool(ExamGrammarParser.PoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#questions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestions(ExamGrammarParser.QuestionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#questions_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestions_body(ExamGrammarParser.Questions_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#question_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_body(ExamGrammarParser.Question_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(ExamGrammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#true_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_false(ExamGrammarParser.True_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#missing_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissing_words(ExamGrammarParser.Missing_wordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#key_map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_map(ExamGrammarParser.Key_mapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#numerical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumerical(ExamGrammarParser.NumericalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#short_awnser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShort_awnser(ExamGrammarParser.Short_awnserContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#multiple_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_choice(ExamGrammarParser.Multiple_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#multiple_choice_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_choice_options(ExamGrammarParser.Multiple_choice_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#multiple_choice_options_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_choice_options_body(ExamGrammarParser.Multiple_choice_options_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#matching}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatching(ExamGrammarParser.MatchingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#matching_awnsers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatching_awnsers(ExamGrammarParser.Matching_awnsersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#matching_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatching_token(ExamGrammarParser.Matching_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#matching_questions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatching_questions(ExamGrammarParser.Matching_questionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#true_false_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_false_option(ExamGrammarParser.True_false_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#exam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExam(ExamGrammarParser.ExamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#exam_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExam_body(ExamGrammarParser.Exam_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#sections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSections(ExamGrammarParser.SectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#sections_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSections_body(ExamGrammarParser.Sections_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#section_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection_object(ExamGrammarParser.Section_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(ExamGrammarParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExamGrammarParser#header_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_body(ExamGrammarParser.Header_bodyContext ctx);
}