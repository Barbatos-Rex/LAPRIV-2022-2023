// Generated from D:/Repos/LAPRIV-2022-23/Lang/langs/grading\SimpleGradingGrammar.g4 by ANTLR 4.12.0
package barbatos_rex1.grading.antlr4.lang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleGradingGrammarParser}.
 */
public interface SimpleGradingGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SimpleGradingGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SimpleGradingGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#grade_presentation}.
	 * @param ctx the parse tree
	 */
	void enterGrade_presentation(SimpleGradingGrammarParser.Grade_presentationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#grade_presentation}.
	 * @param ctx the parse tree
	 */
	void exitGrade_presentation(SimpleGradingGrammarParser.Grade_presentationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(SimpleGradingGrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(SimpleGradingGrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#questions}.
	 * @param ctx the parse tree
	 */
	void enterQuestions(SimpleGradingGrammarParser.QuestionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#questions}.
	 * @param ctx the parse tree
	 */
	void exitQuestions(SimpleGradingGrammarParser.QuestionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#matching}.
	 * @param ctx the parse tree
	 */
	void enterMatching(SimpleGradingGrammarParser.MatchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#matching}.
	 * @param ctx the parse tree
	 */
	void exitMatching(SimpleGradingGrammarParser.MatchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#parcial_awardal}.
	 * @param ctx the parse tree
	 */
	void enterParcial_awardal(SimpleGradingGrammarParser.Parcial_awardalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#parcial_awardal}.
	 * @param ctx the parse tree
	 */
	void exitParcial_awardal(SimpleGradingGrammarParser.Parcial_awardalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#parcial_awardal_atomic}.
	 * @param ctx the parse tree
	 */
	void enterParcial_awardal_atomic(SimpleGradingGrammarParser.Parcial_awardal_atomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#parcial_awardal_atomic}.
	 * @param ctx the parse tree
	 */
	void exitParcial_awardal_atomic(SimpleGradingGrammarParser.Parcial_awardal_atomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#multiple}.
	 * @param ctx the parse tree
	 */
	void enterMultiple(SimpleGradingGrammarParser.MultipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#multiple}.
	 * @param ctx the parse tree
	 */
	void exitMultiple(SimpleGradingGrammarParser.MultipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#short}.
	 * @param ctx the parse tree
	 */
	void enterShort(SimpleGradingGrammarParser.ShortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#short}.
	 * @param ctx the parse tree
	 */
	void exitShort(SimpleGradingGrammarParser.ShortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#attach_text_options}.
	 * @param ctx the parse tree
	 */
	void enterAttach_text_options(SimpleGradingGrammarParser.Attach_text_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#attach_text_options}.
	 * @param ctx the parse tree
	 */
	void exitAttach_text_options(SimpleGradingGrammarParser.Attach_text_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#attach_text_options_atomic}.
	 * @param ctx the parse tree
	 */
	void enterAttach_text_options_atomic(SimpleGradingGrammarParser.Attach_text_options_atomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#attach_text_options_atomic}.
	 * @param ctx the parse tree
	 */
	void exitAttach_text_options_atomic(SimpleGradingGrammarParser.Attach_text_options_atomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#numerical}.
	 * @param ctx the parse tree
	 */
	void enterNumerical(SimpleGradingGrammarParser.NumericalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#numerical}.
	 * @param ctx the parse tree
	 */
	void exitNumerical(SimpleGradingGrammarParser.NumericalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#attach_real_options}.
	 * @param ctx the parse tree
	 */
	void enterAttach_real_options(SimpleGradingGrammarParser.Attach_real_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#attach_real_options}.
	 * @param ctx the parse tree
	 */
	void exitAttach_real_options(SimpleGradingGrammarParser.Attach_real_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#attach_real_options_atomic}.
	 * @param ctx the parse tree
	 */
	void enterAttach_real_options_atomic(SimpleGradingGrammarParser.Attach_real_options_atomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#attach_real_options_atomic}.
	 * @param ctx the parse tree
	 */
	void exitAttach_real_options_atomic(SimpleGradingGrammarParser.Attach_real_options_atomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#missing}.
	 * @param ctx the parse tree
	 */
	void enterMissing(SimpleGradingGrammarParser.MissingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#missing}.
	 * @param ctx the parse tree
	 */
	void exitMissing(SimpleGradingGrammarParser.MissingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleGradingGrammarParser#true_false}.
	 * @param ctx the parse tree
	 */
	void enterTrue_false(SimpleGradingGrammarParser.True_falseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleGradingGrammarParser#true_false}.
	 * @param ctx the parse tree
	 */
	void exitTrue_false(SimpleGradingGrammarParser.True_falseContext ctx);
}