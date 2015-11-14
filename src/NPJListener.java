// Generated from NPJ.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NPJParser}.
 */
public interface NPJListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NPJParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(NPJParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(NPJParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPJParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(NPJParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(NPJParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPJParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NPJParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NPJParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPJParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(NPJParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(NPJParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPJParser#variableDeclarationT}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationT(NPJParser.VariableDeclarationTContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#variableDeclarationT}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationT(NPJParser.VariableDeclarationTContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPJParser#variableDeclarationSConstant}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationSConstant(NPJParser.VariableDeclarationSConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#variableDeclarationSConstant}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationSConstant(NPJParser.VariableDeclarationSConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPJParser#variableDeclarationSNull}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationSNull(NPJParser.VariableDeclarationSNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#variableDeclarationSNull}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationSNull(NPJParser.VariableDeclarationSNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPJParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(NPJParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(NPJParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPJParser#lValue}.
	 * @param ctx the parse tree
	 */
	void enterLValue(NPJParser.LValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#lValue}.
	 * @param ctx the parse tree
	 */
	void exitLValue(NPJParser.LValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPJParser#rValue}.
	 * @param ctx the parse tree
	 */
	void enterRValue(NPJParser.RValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#rValue}.
	 * @param ctx the parse tree
	 */
	void exitRValue(NPJParser.RValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPJParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(NPJParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(NPJParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPJParser#printStringMessage}.
	 * @param ctx the parse tree
	 */
	void enterPrintStringMessage(NPJParser.PrintStringMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#printStringMessage}.
	 * @param ctx the parse tree
	 */
	void exitPrintStringMessage(NPJParser.PrintStringMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPJParser#printStringConstant}.
	 * @param ctx the parse tree
	 */
	void enterPrintStringConstant(NPJParser.PrintStringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#printStringConstant}.
	 * @param ctx the parse tree
	 */
	void exitPrintStringConstant(NPJParser.PrintStringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPJParser#heapAnalyze}.
	 * @param ctx the parse tree
	 */
	void enterHeapAnalyze(NPJParser.HeapAnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#heapAnalyze}.
	 * @param ctx the parse tree
	 */
	void exitHeapAnalyze(NPJParser.HeapAnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NPJParser#collect}.
	 * @param ctx the parse tree
	 */
	void enterCollect(NPJParser.CollectContext ctx);
	/**
	 * Exit a parse tree produced by {@link NPJParser#collect}.
	 * @param ctx the parse tree
	 */
	void exitCollect(NPJParser.CollectContext ctx);
}