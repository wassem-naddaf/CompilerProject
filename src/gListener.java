// Generated from C:/Users/Mohamad-PC/IdeaProjects/untitled13\g.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(gParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(gParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end_block(gParser.Begin_end_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end_block(gParser.Begin_end_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSingle_block_stmt(gParser.Single_block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSingle_block_stmt(gParser.Single_block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#block_end}.
	 * @param ctx the parse tree
	 */
	void enterBlock_end(gParser.Block_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#block_end}.
	 * @param ctx the parse tree
	 */
	void exitBlock_end(gParser.Block_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void enterProc_block(gParser.Proc_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void exitProc_block(gParser.Proc_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(gParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(gParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon_stmt(gParser.Semicolon_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon_stmt(gParser.Semicolon_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cpp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCpp_stmt(gParser.Cpp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cpp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCpp_stmt(gParser.Cpp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#func_cpp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunc_cpp_stmt(gParser.Func_cpp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#func_cpp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunc_cpp_stmt(gParser.Func_cpp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#paramsection}.
	 * @param ctx the parse tree
	 */
	void enterParamsection(gParser.ParamsectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#paramsection}.
	 * @param ctx the parse tree
	 */
	void exitParamsection(gParser.ParamsectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(gParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(gParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#openscope}.
	 * @param ctx the parse tree
	 */
	void enterOpenscope(gParser.OpenscopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#openscope}.
	 * @param ctx the parse tree
	 */
	void exitOpenscope(gParser.OpenscopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#closescope}.
	 * @param ctx the parse tree
	 */
	void enterClosescope(gParser.ClosescopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#closescope}.
	 * @param ctx the parse tree
	 */
	void exitClosescope(gParser.ClosescopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cpp_body}.
	 * @param ctx the parse tree
	 */
	void enterCpp_body(gParser.Cpp_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cpp_body}.
	 * @param ctx the parse tree
	 */
	void exitCpp_body(gParser.Cpp_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignment_stmt_cpp}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_cpp(gParser.Assignment_stmt_cppContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignment_stmt_cpp}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_cpp(gParser.Assignment_stmt_cppContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignment_cpp}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_cpp(gParser.Assignment_cppContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignment_cpp}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_cpp(gParser.Assignment_cppContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declare_stmt_cpp}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt_cpp(gParser.Declare_stmt_cppContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declare_stmt_cpp}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt_cpp(gParser.Declare_stmt_cppContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declare_cpp}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cpp(gParser.Declare_cppContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declare_cpp}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cpp(gParser.Declare_cppContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#if_cpp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_cpp_stmt(gParser.If_cpp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#if_cpp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_cpp_stmt(gParser.If_cpp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elseif_cpp_block}.
	 * @param ctx the parse tree
	 */
	void enterElseif_cpp_block(gParser.Elseif_cpp_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elseif_cpp_block}.
	 * @param ctx the parse tree
	 */
	void exitElseif_cpp_block(gParser.Elseif_cpp_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#else_cpp_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_cpp_block(gParser.Else_cpp_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#else_cpp_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_cpp_block(gParser.Else_cpp_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#for_cpp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_cpp_stmt(gParser.For_cpp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#for_cpp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_cpp_stmt(gParser.For_cpp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#inc_cpp}.
	 * @param ctx the parse tree
	 */
	void enterInc_cpp(gParser.Inc_cppContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#inc_cpp}.
	 * @param ctx the parse tree
	 */
	void exitInc_cpp(gParser.Inc_cppContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void enterException_block(gParser.Exception_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void exitException_block(gParser.Exception_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void enterException_block_item(gParser.Exception_block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void exitException_block_item(gParser.Exception_block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNull_stmt(gParser.Null_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNull_stmt(gParser.Null_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(gParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(gParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(gParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(gParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_item(gParser.Assignment_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_item(gParser.Assignment_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_single_item(gParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_single_item(gParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_multiple_item(gParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_multiple_item(gParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_select_item(gParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_select_item(gParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_option(gParser.Set_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_option(gParser.Set_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_current_schema_option(gParser.Set_current_schema_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_current_schema_option(gParser.Set_current_schema_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_teradata_session_option(gParser.Set_teradata_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_teradata_session_option(gParser.Set_teradata_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_mssql_session_option(gParser.Set_mssql_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_mssql_session_option(gParser.Set_mssql_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_transaction_stmt(gParser.Begin_transaction_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_transaction_stmt(gParser.Begin_transaction_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(gParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(gParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(gParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(gParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt(gParser.Declare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt(gParser.Declare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block(gParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(gParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block_inplace(gParser.Declare_block_inplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block_inplace(gParser.Declare_block_inplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt_item(gParser.Declare_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt_item(gParser.Declare_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var_item(gParser.Declare_var_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var_item(gParser.Declare_var_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_condition_item(gParser.Declare_condition_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_condition_item(gParser.Declare_condition_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor_item(gParser.Declare_cursor_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor_item(gParser.Declare_cursor_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_with_return(gParser.Cursor_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_with_return(gParser.Cursor_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_without_return(gParser.Cursor_without_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_without_return(gParser.Cursor_without_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_handler_item(gParser.Declare_handler_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_handler_item(gParser.Declare_handler_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_temporary_table_item(gParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_temporary_table_item(gParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(gParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(gParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_local_temp_table_stmt(gParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_local_temp_table_stmt(gParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_definition(gParser.Create_table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_definition(gParser.Create_table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns(gParser.Create_table_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns(gParser.Create_table_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns_item(gParser.Create_table_columns_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns_item(gParser.Create_table_columns_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(gParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(gParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_inline_cons(gParser.Create_table_column_inline_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_inline_cons(gParser.Create_table_column_inline_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_cons(gParser.Create_table_column_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_cons(gParser.Create_table_column_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_fk_action(gParser.Create_table_fk_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_fk_action(gParser.Create_table_fk_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions(gParser.Create_table_preoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions(gParser.Create_table_preoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_item(gParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_item(gParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_td_item(gParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_td_item(gParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options(gParser.Create_table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options(gParser.Create_table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_item(gParser.Create_table_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_item(gParser.Create_table_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_ora_item(gParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_ora_item(gParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_db2_item(gParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_db2_item(gParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_td_item(gParser.Create_table_options_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_td_item(gParser.Create_table_options_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_hive_item(gParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_hive_item(gParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format(gParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format(gParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format_fields(gParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format_fields(gParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mssql_item(gParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mssql_item(gParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mysql_item(gParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mysql_item(gParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(gParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(gParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void enterDtype_len(gParser.Dtype_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void exitDtype_len(gParser.Dtype_lenContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void enterDtype_attr(gParser.Dtype_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void exitDtype_attr(gParser.Dtype_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void enterDtype_default(gParser.Dtype_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void exitDtype_default(gParser.Dtype_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_stmt(gParser.Create_database_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_stmt(gParser.Create_database_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(gParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(gParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_stmt(gParser.Create_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_stmt(gParser.Create_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_return(gParser.Create_function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_return(gParser.Create_function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_stmt(gParser.Create_package_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_stmt(gParser.Create_package_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(gParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(gParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec_item(gParser.Package_spec_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec_item(gParser.Package_spec_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body_stmt(gParser.Create_package_body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body_stmt(gParser.Create_package_body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(gParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(gParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_item(gParser.Package_body_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_item(gParser.Package_body_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_stmt(gParser.Create_procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_stmt(gParser.Create_procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_params(gParser.Create_routine_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_params(gParser.Create_routine_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_param_item(gParser.Create_routine_param_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_param_item(gParser.Create_routine_param_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_options(gParser.Create_routine_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_options(gParser.Create_routine_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_option(gParser.Create_routine_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_option(gParser.Create_routine_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(gParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(gParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_plsql_stmt(gParser.If_plsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_plsql_stmt(gParser.If_plsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_tsql_stmt(gParser.If_tsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_tsql_stmt(gParser.If_tsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_bteq_stmt(gParser.If_bteq_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_bteq_stmt(gParser.If_bteq_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void enterElseif_block(gParser.Elseif_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void exitElseif_block(gParser.Elseif_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(gParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(gParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExit_stmt(gParser.Exit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExit_stmt(gParser.Exit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOpen_stmt(gParser.Open_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOpen_stmt(gParser.Open_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClose_stmt(gParser.Close_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClose_stmt(gParser.Close_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cmp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCmp_stmt(gParser.Cmp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cmp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCmp_stmt(gParser.Cmp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cmp_source}.
	 * @param ctx the parse tree
	 */
	void enterCmp_source(gParser.Cmp_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cmp_source}.
	 * @param ctx the parse tree
	 */
	void exitCmp_source(gParser.Cmp_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(gParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(gParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_col(gParser.Create_index_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_col(gParser.Create_index_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_storage_clause(gParser.Index_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_storage_clause(gParser.Index_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_mssql_storage_clause(gParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_mssql_storage_clause(gParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(gParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(gParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#values_into_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValues_into_stmt(gParser.Values_into_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#values_into_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValues_into_stmt(gParser.Values_into_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_cursor_stmt(gParser.For_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_cursor_stmt(gParser.For_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_range_stmt(gParser.For_range_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_range_stmt(gParser.For_range_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(gParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(gParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(gParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(gParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt(gParser.Cte_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt(gParser.Cte_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt_item(gParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt_item(gParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_cols(gParser.Cte_select_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_cols(gParser.Cte_select_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt(gParser.Fullselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt(gParser.Fullselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt_item(gParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt_item(gParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_set_clause(gParser.Fullselect_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_set_clause(gParser.Fullselect_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSubselect_stmt(gParser.Subselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSubselect_stmt(gParser.Subselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(gParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(gParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#missing_coma}.
	 * @param ctx the parse tree
	 */
	void enterMissing_coma(gParser.Missing_comaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#missing_coma}.
	 * @param ctx the parse tree
	 */
	void exitMissing_coma(gParser.Missing_comaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_set(gParser.Select_list_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_set(gParser.Select_list_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_limit(gParser.Select_list_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_limit(gParser.Select_list_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_item(gParser.Select_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_item(gParser.Select_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_alias(gParser.Select_list_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_alias(gParser.Select_list_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_asterisk(gParser.Select_list_asteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_asterisk(gParser.Select_list_asteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(gParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(gParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(gParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(gParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_clause(gParser.From_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_clause(gParser.From_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_name_clause(gParser.From_table_name_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_name_clause(gParser.From_table_name_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_subselect_clause(gParser.From_subselect_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_subselect_clause(gParser.From_subselect_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_clause(gParser.From_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_clause(gParser.From_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_type_clause(gParser.From_join_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_type_clause(gParser.From_join_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_clause(gParser.From_table_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_clause(gParser.From_table_values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_row(gParser.From_table_values_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_row(gParser.From_table_values_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_alias_clause(gParser.From_alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_alias_clause(gParser.From_alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(gParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(gParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(gParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(gParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(gParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(gParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(gParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(gParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void enterQualify_clause(gParser.Qualify_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void exitQualify_clause(gParser.Qualify_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(gParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(gParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#select_options}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options(gParser.Select_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#select_options}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options(gParser.Select_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options_item(gParser.Select_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options_item(gParser.Select_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(gParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(gParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_atom(gParser.Bool_expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_atom(gParser.Bool_expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_unary(gParser.Bool_expr_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_unary(gParser.Bool_expr_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_single_in(gParser.Bool_expr_single_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_single_in(gParser.Bool_expr_single_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_multi_in(gParser.Bool_expr_multi_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_multi_in(gParser.Bool_expr_multi_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary(gParser.Bool_expr_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary(gParser.Bool_expr_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_logical_operator(gParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_logical_operator(gParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary_operator(gParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary_operator(gParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(gParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(gParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(gParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(gParser.Expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void enterExpr_interval(gParser.Expr_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void exitExpr_interval(gParser.Expr_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void enterInterval_item(gParser.Interval_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void exitInterval_item(gParser.Interval_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat(gParser.Expr_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat(gParser.Expr_concatContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat_item(gParser.Expr_concat_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat_item(gParser.Expr_concat_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case(gParser.Expr_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case(gParser.Expr_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_simple(gParser.Expr_case_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_simple(gParser.Expr_case_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_searched(gParser.Expr_case_searchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_searched(gParser.Expr_case_searchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cursor_attribute(gParser.Expr_cursor_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cursor_attribute(gParser.Expr_cursor_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_agg_window_func(gParser.Expr_agg_window_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_agg_window_func(gParser.Expr_agg_window_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_all_distinct(gParser.Expr_func_all_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_all_distinct(gParser.Expr_func_all_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_over_clause(gParser.Expr_func_over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_over_clause(gParser.Expr_func_over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_partition_by_clause(gParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_partition_by_clause(gParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_spec_func(gParser.Expr_spec_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_spec_func(gParser.Expr_spec_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func(gParser.Expr_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func(gParser.Expr_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_params(gParser.Expr_func_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_params(gParser.Expr_func_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#func_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param(gParser.Func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#func_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param(gParser.Func_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(gParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(gParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_literal(gParser.Timestamp_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_literal(gParser.Timestamp_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(gParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(gParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link gParser#string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quotedString(gParser.Single_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link gParser#string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quotedString(gParser.Single_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link gParser#string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quotedString(gParser.Double_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link gParser#string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quotedString(gParser.Double_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#int_number}.
	 * @param ctx the parse tree
	 */
	void enterInt_number(gParser.Int_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#int_number}.
	 * @param ctx the parse tree
	 */
	void exitInt_number(gParser.Int_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void enterDec_number(gParser.Dec_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void exitDec_number(gParser.Dec_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(gParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(gParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#null_const}.
	 * @param ctx the parse tree
	 */
	void enterNull_const(gParser.Null_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#null_const}.
	 * @param ctx the parse tree
	 */
	void exitNull_const(gParser.Null_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#missing_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterMissing_semicolon(gParser.Missing_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#missing_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitMissing_semicolon(gParser.Missing_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_words(gParser.Non_reserved_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_words(gParser.Non_reserved_wordsContext ctx);
}