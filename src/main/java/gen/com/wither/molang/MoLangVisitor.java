// Generated from A:/Projects/Programming/Java/molang/src/main/java/com/wither/molang\MoLang.g4 by ANTLR 4.8
package gen.com.wither.molang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MoLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MoLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MoLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MoLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MoLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoLangParser#binary_conditional_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_conditional_operator(MoLangParser.Binary_conditional_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoLangParser#trinary_conditional_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrinary_conditional_operator(MoLangParser.Trinary_conditional_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MoLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoLangParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(MoLangParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoLangParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(MoLangParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoLangParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(MoLangParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoLangParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(MoLangParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoLangParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(MoLangParser.IndexContext ctx);
}