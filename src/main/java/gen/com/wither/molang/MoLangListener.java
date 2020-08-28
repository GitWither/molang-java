// Generated from A:/Projects/Programming/Java/molang/src/main/java/com/wither/molang\MoLang.g4 by ANTLR 4.8
package gen.com.wither.molang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MoLangParser}.
 */
public interface MoLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MoLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MoLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MoLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MoLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MoLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoLangParser#binary_conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_conditional_operator(MoLangParser.Binary_conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoLangParser#binary_conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_conditional_operator(MoLangParser.Binary_conditional_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoLangParser#trinary_conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterTrinary_conditional_operator(MoLangParser.Trinary_conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoLangParser#trinary_conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitTrinary_conditional_operator(MoLangParser.Trinary_conditional_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MoLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MoLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoLangParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(MoLangParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoLangParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(MoLangParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoLangParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(MoLangParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoLangParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(MoLangParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoLangParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(MoLangParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoLangParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(MoLangParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoLangParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(MoLangParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoLangParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(MoLangParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoLangParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(MoLangParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoLangParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(MoLangParser.IndexContext ctx);
}