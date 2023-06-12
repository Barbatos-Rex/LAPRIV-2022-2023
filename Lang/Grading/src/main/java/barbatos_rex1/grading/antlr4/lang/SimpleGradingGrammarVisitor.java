// Generated from D:/Repos/LAPRIV-2022-23/Lang/langs/grading\SimpleGradingGrammar.g4 by ANTLR 4.12.0
package barbatos_rex1.grading.antlr4.lang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleGradingGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleGradingGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SimpleGradingGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#grade_presentation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrade_presentation(SimpleGradingGrammarParser.Grade_presentationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(SimpleGradingGrammarParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#questions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestions(SimpleGradingGrammarParser.QuestionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#matching}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatching(SimpleGradingGrammarParser.MatchingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#parcial_awardal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcial_awardal(SimpleGradingGrammarParser.Parcial_awardalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#parcial_awardal_atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcial_awardal_atomic(SimpleGradingGrammarParser.Parcial_awardal_atomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#multiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple(SimpleGradingGrammarParser.MultipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShort(SimpleGradingGrammarParser.ShortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#attach_text_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach_text_options(SimpleGradingGrammarParser.Attach_text_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#attach_text_options_atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach_text_options_atomic(SimpleGradingGrammarParser.Attach_text_options_atomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#numerical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumerical(SimpleGradingGrammarParser.NumericalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#attach_real_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach_real_options(SimpleGradingGrammarParser.Attach_real_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#attach_real_options_atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach_real_options_atomic(SimpleGradingGrammarParser.Attach_real_options_atomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#missing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissing(SimpleGradingGrammarParser.MissingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleGradingGrammarParser#true_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_false(SimpleGradingGrammarParser.True_falseContext ctx);
}