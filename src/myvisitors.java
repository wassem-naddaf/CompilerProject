import org.antlr.v4.codegen.model.Loop;

 import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class myvisitors extends gBaseVisitor<Object>{

    public static List<List<DataType>> datatypes = new ArrayList<>();
    public static SymbolTable symboletable = new SymbolTable();
    public static String CurrentType = "" ;
    public static  List<String> ToCheckList;
    public int Level ;
    public static void init(){

        ToCheckList = new ArrayList<>();
        symboletable.RootScope = new Scope();
        symboletable.RootScope.SetType("Root");
        symboletable.CurrScope = symboletable.RootScope;

        List<DataType>dt = new ArrayList<>();
        dt.add(new DataType("age","int"));
        datatypes.add(dt);
        dt = new ArrayList<>();
        dt.add(new DataType("name","String"));
        datatypes.add(dt);
        dt = new ArrayList<>();
        dt.add(new DataType("isStudent","boolean"));
        datatypes.add(dt);
        dt = new ArrayList<>();
        dt.add(new DataType("weight","float"));
        datatypes.add(dt);
    }
    public static void PrintDataTypes(){
        for(int i=0;i<datatypes.size();i++){
           System.out.print("Type : " + datatypes.get(i).get(0).type
                                                        + ", Name : " + datatypes.get(i).get(0).name);
            if(datatypes.get(i).size() > 1)System.out.println(", It's Variables : ");
            for(int j=1;j<datatypes.get(i).size();j++){

                System.out.println("  - Name : " + datatypes.get(i).get(j).type
                        + ", Type : " + datatypes.get(i).get(j).name);
            }
            System.out.println();
        }
    }

    public static void printlist(List<DataType> dt){
        for(int j=0;j<dt.size();j++){

            System.out.println("Type : " + dt.get(j).type
                    + ", Name : " + dt.get(j).name);
        }
    }

    public static void get(String name){

        for(int i=0;i<datatypes.size();i++){
            if(datatypes.get(i).get(0).name.equals(name))
            {
                printlist(datatypes.get(i));
            }
        }
        return  ;
    }

    public static void flat(String type,String last){
        for(int i=0;i<datatypes.size();i++){

            if(datatypes.get(i).get(0).type.equals(type))
                for(int j=1;j<datatypes.get(i).size();j++){
                    System.out.println(datatypes.get(i).get(j).type);
                    if(!datatypes.get(i).get(j).type.equals("int")
                            &&!datatypes.get(i).get(j).type.equals("float")
                            &&!datatypes.get(i).get(j).type.equals("string")
                            &&!datatypes.get(i).get(j).type.equals("boolean")){
                        flat(datatypes.get(i).get(j).type,datatypes.get(i).get(j).name);
                    }
                    else {
                        if(!last.equals(""))
                            System.out.println("Type : " + datatypes.get(i).get(j).type + " Name : " + last + "_" + datatypes.get(i).get(j).name);
                        else System.out.println("Type : " + datatypes.get(i).get(j).type + " Name : "   + datatypes.get(i).get(j).name);

                    }


                }

        }

    }

    private void AddTableToDataType(gParser.Create_table_stmtContext ctx) {
        List<DataType> dtable = new ArrayList<>();
        // Set Table Name
        dtable.add(new DataType(ctx.table_name().ident().start.getText(),"Table"));

        for(int i=0;i<ctx.create_table_definition().create_table_columns().create_table_columns_item().size();i++){
            // Get Column Name
            String ColumnName = ctx.create_table_definition().create_table_columns().create_table_columns_item(i).column_name().start.getText();

            // Get Column Type
            String ColumnType = ctx.create_table_definition().create_table_columns().create_table_columns_item(i).dtype().start.getText();

            // Add This Column To The New Table
            dtable.add(new DataType(ColumnName , ColumnType ) );
        }
        datatypes.add(dtable);
        //  PrintDataTypes();

    }

    @Override public Object visitOpenscope(gParser.OpenscopeContext ctx) {
        symboletable.CurrScope.Level++;
        return visitChildren(ctx);
    }

    @Override public Object visitClosescope(gParser.ClosescopeContext ctx) {
        symboletable.CurrScope.Level--;
        symboletable.CurrScope = symboletable.CurrScope.Parent;
        return visitChildren(ctx);
    }

    @Override public Object visitProgram(gParser.ProgramContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitBlock(gParser.BlockContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitBegin_end_block(gParser.Begin_end_blockContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSingle_block_stmt(gParser.Single_block_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitBlock_end(gParser.Block_endContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitProc_block(gParser.Proc_blockContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitStmt(gParser.StmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSemicolon_stmt(gParser.Semicolon_stmtContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFunc_cpp_stmt(gParser.Func_cpp_stmtContext ctx) {

        symboletable.AddFunctionScope(ctx);
        return visitChildren(ctx);
    }



    @Override public Object visitDeclare_stmt_cpp(gParser.Declare_stmt_cppContext ctx) {
        if(symboletable.CurrScope.GetType().equals("Root"))
            symboletable.AddVariables(ctx.declare_cpp());

         return visitChildren(ctx);
    }

    @Override public Object visitDeclare_cpp(gParser.Declare_cppContext ctx) {

        return visitChildren(ctx);
    }

    @Override public Object visitCpp_body(gParser.Cpp_bodyContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCpp_stmt(gParser.Cpp_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitParamsection(gParser.ParamsectionContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitParameters(gParser.ParametersContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitAssignment_stmt_cpp(gParser.Assignment_stmt_cppContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitAssignment_cpp(gParser.Assignment_cppContext ctx) {

       /* System.out.println(symboletable.CurrScope.GetType());

        if(symboletable.CurrScope.GetVariable(symboletable.CurrScope,ctx.ident(0).start.getText()) == null)
            System.out.println("Error !! "+ctx.ident(0).start.getText()+" is not defined");

        if(ctx.ident(1) != null && symboletable.CurrScope.GetVariable(symboletable.CurrScope,ctx.ident(1).start.getText()) == null)
            ToCheckList.add(ctx.ident(1).start.getText());

        //   System.out.println("Error !! "+ctx.ident(1).start.getText()+" is not defined");
        */
        return visitChildren(ctx);
    }
     
    @Override public Object visitIf_cpp_stmt(gParser.If_cpp_stmtContext ctx) {

        symboletable.AddConditionScope(ctx.cpp_body().cpp_stmt());
        return visitChildren(ctx);
    }
     
    @Override public Object visitFor_cpp_stmt(gParser.For_cpp_stmtContext ctx) {

        symboletable.AddLoopScope(ctx);
        return visitChildren(ctx);

         }



     
    @Override public Object visitInc_cpp(gParser.Inc_cppContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitElseif_cpp_block(gParser.Elseif_cpp_blockContext ctx) {

        symboletable.AddConditionScope(ctx.cpp_body().cpp_stmt());
        return visitChildren(ctx);
    }



    @Override public Object visitElse_cpp_block(gParser.Else_cpp_blockContext ctx) {

        // Define new Scope (if)
        symboletable.AddConditionScope(ctx.cpp_body().cpp_stmt());

        return visitChildren(ctx);
    }

    @Override public Object visitException_block(gParser.Exception_blockContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitException_block_item(gParser.Exception_block_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitNull_stmt(gParser.Null_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_stmt(gParser.Expr_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitAssignment_stmt(gParser.Assignment_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitAssignment_stmt_item(gParser.Assignment_stmt_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitAssignment_stmt_single_item(gParser.Assignment_stmt_single_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitAssignment_stmt_multiple_item(gParser.Assignment_stmt_multiple_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitAssignment_stmt_select_item(gParser.Assignment_stmt_select_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSet_session_option(gParser.Set_session_optionContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSet_current_schema_option(gParser.Set_current_schema_optionContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSet_teradata_session_option(gParser.Set_teradata_session_optionContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSet_mssql_session_option(gParser.Set_mssql_session_optionContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitBegin_transaction_stmt(gParser.Begin_transaction_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitBreak_stmt(gParser.Break_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCall_stmt(gParser.Call_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDeclare_stmt(gParser.Declare_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDeclare_block(gParser.Declare_blockContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDeclare_block_inplace(gParser.Declare_block_inplaceContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDeclare_stmt_item(gParser.Declare_stmt_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDeclare_var_item(gParser.Declare_var_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDeclare_condition_item(gParser.Declare_condition_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDeclare_cursor_item(gParser.Declare_cursor_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCursor_with_return(gParser.Cursor_with_returnContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCursor_without_return(gParser.Cursor_without_returnContext ctx) {

        return visitChildren(ctx); }
     
    @Override public Object visitDeclare_handler_item(gParser.Declare_handler_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDeclare_temporary_table_item(gParser.Declare_temporary_table_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_stmt(gParser.Create_table_stmtContext ctx) {

        AddTableToDataType(ctx);

        return visitChildren(ctx);
    }



    @Override public Object visitCreate_local_temp_table_stmt(gParser.Create_local_temp_table_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_definition(gParser.Create_table_definitionContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_columns(gParser.Create_table_columnsContext ctx) {

        return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_columns_item(gParser.Create_table_columns_itemContext ctx) {


        return visitChildren(ctx); }
     
    @Override public Object visitColumn_name(gParser.Column_nameContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_column_inline_cons(gParser.Create_table_column_inline_consContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_column_cons(gParser.Create_table_column_consContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_fk_action(gParser.Create_table_fk_actionContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_preoptions(gParser.Create_table_preoptionsContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_preoptions_item(gParser.Create_table_preoptions_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_preoptions_td_item(gParser.Create_table_preoptions_td_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_options(gParser.Create_table_optionsContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_options_item(gParser.Create_table_options_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_options_ora_item(gParser.Create_table_options_ora_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_options_db2_item(gParser.Create_table_options_db2_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_options_td_item(gParser.Create_table_options_td_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_options_hive_item(gParser.Create_table_options_hive_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_hive_row_format(gParser.Create_table_hive_row_formatContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_hive_row_format_fields(gParser.Create_table_hive_row_format_fieldsContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_options_mssql_item(gParser.Create_table_options_mssql_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_table_options_mysql_item(gParser.Create_table_options_mysql_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDtype(gParser.DtypeContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDtype_len(gParser.Dtype_lenContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDtype_attr(gParser.Dtype_attrContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDtype_default(gParser.Dtype_defaultContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_database_stmt(gParser.Create_database_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_database_option(gParser.Create_database_optionContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_function_stmt(gParser.Create_function_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_function_return(gParser.Create_function_returnContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_package_stmt(gParser.Create_package_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitPackage_spec(gParser.Package_specContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitPackage_spec_item(gParser.Package_spec_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_package_body_stmt(gParser.Create_package_body_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitPackage_body(gParser.Package_bodyContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitPackage_body_item(gParser.Package_body_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_procedure_stmt(gParser.Create_procedure_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_routine_params(gParser.Create_routine_paramsContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_routine_param_item(gParser.Create_routine_param_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_routine_options(gParser.Create_routine_optionsContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_routine_option(gParser.Create_routine_optionContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitIf_stmt(gParser.If_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitIf_plsql_stmt(gParser.If_plsql_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitIf_tsql_stmt(gParser.If_tsql_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitIf_bteq_stmt(gParser.If_bteq_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitElseif_block(gParser.Elseif_blockContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitElse_block(gParser.Else_blockContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExit_stmt(gParser.Exit_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitOpen_stmt(gParser.Open_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitClose_stmt(gParser.Close_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCmp_stmt(gParser.Cmp_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCmp_source(gParser.Cmp_sourceContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_index_stmt(gParser.Create_index_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCreate_index_col(gParser.Create_index_colContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitIndex_storage_clause(gParser.Index_storage_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitIndex_mssql_storage_clause(gParser.Index_mssql_storage_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitReturn_stmt(gParser.Return_stmtContext ctx) {
        if(ctx.expr() != null && ctx.expr().expr_atom().ident() != null) {
            String Name = ctx.expr().expr_atom().ident().start.getText();
            if (symboletable.CurrScope.GetVariable(symboletable.CurrScope, Name) == null)
                System.out.println("Error !! " + Name + " is not defined");
        }
        return visitChildren(ctx);
    }


    @Override public Object visitValues_into_stmt(gParser.Values_into_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitFor_cursor_stmt(gParser.For_cursor_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitFor_range_stmt(gParser.For_range_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitLabel(gParser.LabelContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSelect_stmt(gParser.Select_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCte_select_stmt(gParser.Cte_select_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCte_select_stmt_item(gParser.Cte_select_stmt_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitCte_select_cols(gParser.Cte_select_colsContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitFullselect_stmt(gParser.Fullselect_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitFullselect_stmt_item(gParser.Fullselect_stmt_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitFullselect_set_clause(gParser.Fullselect_set_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSubselect_stmt(gParser.Subselect_stmtContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSelect_list(gParser.Select_listContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitMissing_coma(gParser.Missing_comaContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSelect_list_set(gParser.Select_list_setContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSelect_list_limit(gParser.Select_list_limitContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSelect_list_item(gParser.Select_list_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSelect_list_alias(gParser.Select_list_aliasContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSelect_list_asterisk(gParser.Select_list_asteriskContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitInto_clause(gParser.Into_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitFrom_clause(gParser.From_clauseContext ctx) {


        return visitChildren(ctx);
    }
     

    @Override public Object visitFrom_table_clause(gParser.From_table_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitFrom_table_name_clause(gParser.From_table_name_clauseContext ctx) {


        return visitChildren(ctx);
    }
     
    @Override public Object visitFrom_subselect_clause(gParser.From_subselect_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitFrom_join_clause(gParser.From_join_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitFrom_join_type_clause(gParser.From_join_type_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitFrom_table_values_clause(gParser.From_table_values_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitFrom_table_values_row(gParser.From_table_values_rowContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitFrom_alias_clause(gParser.From_alias_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitTable_name(gParser.Table_nameContext ctx) {
        // Check For Table If Exist in Data Type Array
        boolean found = false;
        String Name = ctx.ident().start.getText();

        for(int i=0;i<datatypes.size();i++){
            if(datatypes.get(i).get(0).name.equals(Name)){
                found = true;
                break;
            }
        }
        if(symboletable.CurrScope.GetVariable(symboletable.CurrScope,Name) != null)
            found = true;

        if(!found)
            System.out.println("Error !! Table " + ctx.ident().start.getText() + " is not defined");


        return visitChildren(ctx); }
     
    @Override public Object visitWhere_clause(gParser.Where_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitGroup_by_clause(gParser.Group_by_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitHaving_clause(gParser.Having_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitQualify_clause(gParser.Qualify_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitOrder_by_clause(gParser.Order_by_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSelect_options(gParser.Select_optionsContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSelect_options_item(gParser.Select_options_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitBool_expr(gParser.Bool_exprContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitBool_expr_atom(gParser.Bool_expr_atomContext ctx) {

        // Store All Variables that used in condition to check if it is declared
        List<gParser.ExprContext> ctx2;
        if(ctx.bool_expr_binary() != null)
            ctx2 = ctx.bool_expr_binary().expr();
        else
            ctx2 = ctx.bool_expr_unary().expr();

       for(int i=0;i<ctx2.size();i++) {

           if (ctx2.get(i).expr_atom().ident() != null && !symboletable.CurrScope.GetType().equals("Root")) {
             //  System.out.println("Start :" + ctx2.get(i).expr_atom().ident().start.getText());
             //  System.out.println("Stop :" + ctx2.get(i).expr_atom().ident().stop.getText());
               if (symboletable.CurrScope.GetVariable(symboletable.CurrScope, ctx2.get(i).expr_atom().ident().start.getText()) == null) {
                   if(ctx2.get(i).expr_atom().ident().start.getText().equals(ctx2.get(i).expr_atom().ident().stop.getText()))
                   System.out.println("Error !! " + ctx2.get(i).expr_atom().ident().start.getText() + " is not defined");
               }
           }
       }

        return visitChildren(ctx); }
     
    @Override public Object visitBool_expr_unary(gParser.Bool_expr_unaryContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitBool_expr_single_in(gParser.Bool_expr_single_inContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitBool_expr_multi_in(gParser.Bool_expr_multi_inContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitBool_expr_binary(gParser.Bool_expr_binaryContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitBool_expr_logical_operator(gParser.Bool_expr_logical_operatorContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitBool_expr_binary_operator(gParser.Bool_expr_binary_operatorContext ctx) { return visitChildren(ctx); }
     

    @Override public Object visitExpr(gParser.ExprContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_atom(gParser.Expr_atomContext ctx) {



        return visitChildren(ctx); }
     
    @Override public Object visitExpr_interval(gParser.Expr_intervalContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitInterval_item(gParser.Interval_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_concat(gParser.Expr_concatContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_concat_item(gParser.Expr_concat_itemContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_case(gParser.Expr_caseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_case_simple(gParser.Expr_case_simpleContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_case_searched(gParser.Expr_case_searchedContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_cursor_attribute(gParser.Expr_cursor_attributeContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_agg_window_func(gParser.Expr_agg_window_funcContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_func_all_distinct(gParser.Expr_func_all_distinctContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_func_over_clause(gParser.Expr_func_over_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_func_partition_by_clause(gParser.Expr_func_partition_by_clauseContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_spec_func(gParser.Expr_spec_funcContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_func(gParser.Expr_funcContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitExpr_func_params(gParser.Expr_func_paramsContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitFunc_param(gParser.Func_paramContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDate_literal(gParser.Date_literalContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitTimestamp_literal(gParser.Timestamp_literalContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitIdent(gParser.IdentContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitSingle_quotedString(gParser.Single_quotedStringContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDouble_quotedString(gParser.Double_quotedStringContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitInt_number(gParser.Int_numberContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitDec_number(gParser.Dec_numberContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitBool_literal(gParser.Bool_literalContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitNull_const(gParser.Null_constContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitMissing_semicolon(gParser.Missing_semicolonContext ctx) { return visitChildren(ctx); }
     
    @Override public Object visitNon_reserved_words(gParser.Non_reserved_wordsContext ctx) { return visitChildren(ctx); }


}
