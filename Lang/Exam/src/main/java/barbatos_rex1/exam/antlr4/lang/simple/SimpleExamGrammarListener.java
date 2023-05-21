// Generated from D:/Repos/LAPRIV-2022-23/Lang/langs/exam\SimpleExamGrammar.g4 by ANTLR 4.12.0
package barbatos_rex1.exam.antlr4.lang.simple;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleExamGrammarParser}.
 */
public interface SimpleExamGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SimpleExamGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SimpleExamGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#pool}.
	 * @param ctx the parse tree
	 */
	void enterPool(SimpleExamGrammarParser.PoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#pool}.
	 * @param ctx the parse tree
	 */
	void exitPool(SimpleExamGrammarParser.PoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#pool_body}.
	 * @param ctx the parse tree
	 */
	void enterPool_body(SimpleExamGrammarParser.Pool_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#pool_body}.
	 * @param ctx the parse tree
	 */
	void exitPool_body(SimpleExamGrammarParser.Pool_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#pool_body_atomic}.
	 * @param ctx the parse tree
	 */
	void enterPool_body_atomic(SimpleExamGrammarParser.Pool_body_atomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#pool_body_atomic}.
	 * @param ctx the parse tree
	 */
	void exitPool_body_atomic(SimpleExamGrammarParser.Pool_body_atomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#matching}.
	 * @param ctx the parse tree
	 */
	void enterMatching(SimpleExamGrammarParser.MatchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#matching}.
	 * @param ctx the parse tree
	 */
	void exitMatching(SimpleExamGrammarParser.MatchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#matching_map}.
	 * @param ctx the parse tree
	 */
	void enterMatching_map(SimpleExamGrammarParser.Matching_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#matching_map}.
	 * @param ctx the parse tree
	 */
	void exitMatching_map(SimpleExamGrammarParser.Matching_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#matching_map_atomic}.
	 * @param ctx the parse tree
	 */
	void enterMatching_map_atomic(SimpleExamGrammarParser.Matching_map_atomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#matching_map_atomic}.
	 * @param ctx the parse tree
	 */
	void exitMatching_map_atomic(SimpleExamGrammarParser.Matching_map_atomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#multiple}.
	 * @param ctx the parse tree
	 */
	void enterMultiple(SimpleExamGrammarParser.MultipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#multiple}.
	 * @param ctx the parse tree
	 */
	void exitMultiple(SimpleExamGrammarParser.MultipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#multiple_map}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_map(SimpleExamGrammarParser.Multiple_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#multiple_map}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_map(SimpleExamGrammarParser.Multiple_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#multiple_map_atomic}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_map_atomic(SimpleExamGrammarParser.Multiple_map_atomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#multiple_map_atomic}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_map_atomic(SimpleExamGrammarParser.Multiple_map_atomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#short}.
	 * @param ctx the parse tree
	 */
	void enterShort(SimpleExamGrammarParser.ShortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#short}.
	 * @param ctx the parse tree
	 */
	void exitShort(SimpleExamGrammarParser.ShortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#missing}.
	 * @param ctx the parse tree
	 */
	void enterMissing(SimpleExamGrammarParser.MissingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#missing}.
	 * @param ctx the parse tree
	 */
	void exitMissing(SimpleExamGrammarParser.MissingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#key_map}.
	 * @param ctx the parse tree
	 */
	void enterKey_map(SimpleExamGrammarParser.Key_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#key_map}.
	 * @param ctx the parse tree
	 */
	void exitKey_map(SimpleExamGrammarParser.Key_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#key_map_atomic}.
	 * @param ctx the parse tree
	 */
	void enterKey_map_atomic(SimpleExamGrammarParser.Key_map_atomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#key_map_atomic}.
	 * @param ctx the parse tree
	 */
	void exitKey_map_atomic(SimpleExamGrammarParser.Key_map_atomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(SimpleExamGrammarParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(SimpleExamGrammarParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#true_false}.
	 * @param ctx the parse tree
	 */
	void enterTrue_false(SimpleExamGrammarParser.True_falseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#true_false}.
	 * @param ctx the parse tree
	 */
	void exitTrue_false(SimpleExamGrammarParser.True_falseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(SimpleExamGrammarParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(SimpleExamGrammarParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#section_maximum_number_of_questions}.
	 * @param ctx the parse tree
	 */
	void enterSection_maximum_number_of_questions(SimpleExamGrammarParser.Section_maximum_number_of_questionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#section_maximum_number_of_questions}.
	 * @param ctx the parse tree
	 */
	void exitSection_maximum_number_of_questions(SimpleExamGrammarParser.Section_maximum_number_of_questionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#exam}.
	 * @param ctx the parse tree
	 */
	void enterExam(SimpleExamGrammarParser.ExamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#exam}.
	 * @param ctx the parse tree
	 */
	void exitExam(SimpleExamGrammarParser.ExamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExamGrammarParser#sections_arr}.
	 * @param ctx the parse tree
	 */
	void enterSections_arr(SimpleExamGrammarParser.Sections_arrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExamGrammarParser#sections_arr}.
	 * @param ctx the parse tree
	 */
	void exitSections_arr(SimpleExamGrammarParser.Sections_arrContext ctx);
}