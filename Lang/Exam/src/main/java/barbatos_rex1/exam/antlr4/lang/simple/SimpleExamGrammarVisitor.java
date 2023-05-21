// Generated from D:/Repos/LAPRIV-2022-23/Lang/langs/exam\SimpleExamGrammar.g4 by ANTLR 4.12.0
package barbatos_rex1.exam.antlr4.lang.simple;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleExamGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleExamGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SimpleExamGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPool(SimpleExamGrammarParser.PoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#pool_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPool_body(SimpleExamGrammarParser.Pool_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#pool_body_atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPool_body_atomic(SimpleExamGrammarParser.Pool_body_atomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#matching}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatching(SimpleExamGrammarParser.MatchingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#matching_map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatching_map(SimpleExamGrammarParser.Matching_mapContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#matching_map_atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatching_map_atomic(SimpleExamGrammarParser.Matching_map_atomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#multiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple(SimpleExamGrammarParser.MultipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#multiple_map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_map(SimpleExamGrammarParser.Multiple_mapContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#multiple_map_atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_map_atomic(SimpleExamGrammarParser.Multiple_map_atomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShort(SimpleExamGrammarParser.ShortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#missing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissing(SimpleExamGrammarParser.MissingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#key_map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_map(SimpleExamGrammarParser.Key_mapContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#key_map_atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_map_atomic(SimpleExamGrammarParser.Key_map_atomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(SimpleExamGrammarParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#true_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_false(SimpleExamGrammarParser.True_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(SimpleExamGrammarParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#section_maximum_number_of_questions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection_maximum_number_of_questions(SimpleExamGrammarParser.Section_maximum_number_of_questionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#exam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExam(SimpleExamGrammarParser.ExamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleExamGrammarParser#sections_arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSections_arr(SimpleExamGrammarParser.Sections_arrContext ctx);
}