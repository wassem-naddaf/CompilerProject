// Generated from C:/Users/Mohamad-PC/IdeaProjects/untitled13\g.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T_ERROR=5, T_ACTION=6, T_ADD2=7, T_ALL=8, 
		T_ALTER=9, T_AND=10, T_ANSI_NULLS=11, T_ANSI_PADDING=12, T_AS=13, T_ASC=14, 
		T_AT=15, T_AUTO_INCREMENT=16, T_AVG=17, T_BATCHSIZE=18, T_BEGIN=19, T_BETWEEN=20, 
		T_BIGINT=21, T_BINARY_DOUBLE=22, T_BINARY_FLOAT=23, T_BINARY_INTEGER=24, 
		T_BIT=25, T_BODY=26, T_BREAK=27, T_BY=28, T_BYTE=29, T_CALL=30, T_CALLER=31, 
		T_CASCADE=32, T_CASE=33, T_CASESPECIFIC=34, T_CAST=35, T_CHAR=36, T_CHARACTER=37, 
		T_CHARSET=38, T_CLIENT=39, T_CLOSE=40, T_CLUSTERED=41, T_CMP=42, T_COLLECTION=43, 
		T_COLUMN=44, T_COMMENT=45, T_CONSTANT=46, T_COMMIT=47, T_COMPRESS=48, 
		T_CONCAT=49, T_CONDITION=50, T_CONSTRAINT=51, T_CONTINUE=52, T_COPY=53, 
		T_COUNT=54, T_COUNT_BIG=55, T_CREATE=56, T_CREATION=57, T_CREATOR=58, 
		T_CS=59, T_CURRENT=60, T_CURRENT_SCHEMA=61, T_CURSOR=62, T_DATABASE=63, 
		T_DATA=64, T_DATE=65, T_DATETIME=66, T_DAY=67, T_DAYS=68, T_DEC=69, T_DECIMAL=70, 
		T_DECLARE=71, T_DEFAULT=72, T_DEFERRED=73, T_DEFINED=74, T_DEFINER=75, 
		T_DEFINITION=76, T_DELETE=77, T_DELIMITED=78, T_DELIMITER=79, T_DESC=80, 
		T_DIAGNOSTICS=81, T_DIR=82, T_DIRECTORY=83, T_DISTINCT=84, T_DISTRIBUTE=85, 
		T_DOUBLE=86, T_DROP=87, T_DYNAMIC=88, T_ELSE=89, T_ELSEIF=90, T_ELSIF=91, 
		T_ENABLE=92, T_END=93, T_ENGINE=94, T_ESCAPED=95, T_EXCEPT=96, T_EXCEPTION=97, 
		T_EXCLUSIVE=98, T_EXISTS=99, T_EXIT=100, T_FALLBACK=101, T_FALSE=102, 
		T_FIELDS=103, T_FILE=104, T_FILES=105, T_FLOAT=106, T_FOR=107, T_FOREIGN=108, 
		T_FORMAT=109, T_FOUND=110, T_FROM=111, T_FULL=112, T_FUNCTION=113, T_GET=114, 
		T_GLOBAL=115, T_GO=116, T_GRANT=117, T_GROUP=118, T_HANDLER=119, T_HASH=120, 
		T_HAVING=121, T_HDFS=122, T_HIVE=123, T_HOST=124, T_IDENTITY=125, T_IF=126, 
		T_IGNORE=127, T_IMMEDIATE=128, T_IN=129, T_INCLUDE=130, T_INDEX=131, T_INITRANS=132, 
		T_INNER=133, T_INOUT=134, T_INT=135, T_INT2=136, T_INT4=137, T_INT8=138, 
		T_INTEGER=139, T_INTERSECT=140, T_INTERVAL=141, T_INTO=142, T_INVOKER=143, 
		T_IS=144, T_ISOPEN=145, T_ITEMS=146, T_JOIN=147, T_KEEP=148, T_KEY=149, 
		T_KEYS=150, T_LANGUAGE=151, T_LEAVE=152, T_LEFT=153, T_LIKE=154, T_LIMIT=155, 
		T_LINES=156, T_LOCAL=157, T_LOCATION=158, T_LOCKS=159, T_LOG=160, T_LOGGED=161, 
		T_LOGGING=162, T_LOOP=163, T_MAP=164, T_MATCHED=165, T_MAX=166, T_MAXTRANS=167, 
		T_MERGE=168, T_MESSAGE_TEXT=169, T_MICROSECOND=170, T_MICROSECONDS=171, 
		T_MIN=172, T_MULTISET=173, T_NCHAR=174, T_NEW=175, T_NVARCHAR=176, T_NO=177, 
		T_NOCOUNT=178, T_NOCOMPRESS=179, T_NOLOGGING=180, T_NONE=181, T_NOT=182, 
		T_NOTFOUND=183, T_NULL=184, T_NUMERIC=185, T_NUMBER=186, T_OBJECT=187, 
		T_OFF=188, T_ON=189, T_ONLY=190, T_OPEN=191, T_OR=192, T_ORDER=193, T_OUT=194, 
		T_OUTER=195, T_OVER=196, T_OVERWRITE=197, T_OWNER=198, T_PACKAGE=199, 
		T_PARTITION=200, T_PCTFREE=201, T_PCTUSED=202, T_PLS_INTEGER=203, T_PRECISION=204, 
		T_PRESERVE=205, T_PRIMARY=206, T_PRINT=207, T_PROC=208, T_PROCEDURE=209, 
		T_QUALIFY=210, T_QUERY_BAND=211, T_QUIT=212, T_QUOTED_IDENTIFIER=213, 
		T_RAISE=214, T_REAL=215, T_REFERENCES=216, T_REGEXP=217, T_REPLACE=218, 
		T_RESIGNAL=219, T_RESTRICT=220, T_RESULT=221, T_RESULT_SET_LOCATOR=222, 
		T_RETURN=223, T_RETURNS=224, T_REVERSE=225, T_RIGHT=226, T_RLIKE=227, 
		T_ROLE=228, T_ROLLBACK=229, T_ROW=230, T_ROWS=231, T_ROWTYPE=232, T_ROW_COUNT=233, 
		T_RR=234, T_RS=235, T_PWD=236, T_TRIM=237, T_SCHEMA=238, T_SECOND=239, 
		T_SECONDS=240, T_SECURITY=241, T_SEGMENT=242, T_SEL=243, T_SELECT=244, 
		T_SET=245, T_SESSION=246, T_SESSIONS=247, T_SETS=248, T_SHARE=249, T_SIGNAL=250, 
		T_SIMPLE_DOUBLE=251, T_SIMPLE_FLOAT=252, T_SIMPLE_INTEGER=253, T_SMALLDATETIME=254, 
		T_SMALLINT=255, T_SQL=256, T_SQLEXCEPTION=257, T_SQLINSERT=258, T_SQLSTATE=259, 
		T_SQLWARNING=260, T_STEP=261, T_STORAGE=262, T_STORED=263, T_STRING=264, 
		T_SUBDIR=265, T_SUBSTRING=266, T_SUM=267, T_SUMMARY=268, T_SYS_REFCURSOR=269, 
		T_TABLE=270, T_TABLESPACE=271, T_TEMPORARY=272, T_TERMINATED=273, T_TEXTIMAGE_ON=274, 
		T_THEN=275, T_TIMESTAMP=276, T_TINYINT=277, T_TITLE=278, T_TO=279, T_TOP=280, 
		T_TRANSACTION=281, T_TRUE=282, T_TRUNCATE=283, T_TYPE=284, T_UNION=285, 
		T_UNIQUE=286, T_UPDATE=287, T_UR=288, T_USE=289, T_USING=290, T_VALUE=291, 
		T_VALUES=292, T_VAR=293, T_VARCHAR=294, T_VARCHAR2=295, T_VARYING=296, 
		T_VOLATILE=297, T_WHEN=298, T_WHERE=299, T_WITH=300, T_WITHOUT=301, T_WORK=302, 
		T_XACT_ABORT=303, T_XML=304, T_YES=305, T_ACTIVITY_COUNT=306, T_CUME_DIST=307, 
		T_CURRENT_DATE=308, T_CURRENT_TIMESTAMP=309, T_CURRENT_USER=310, T_DENSE_RANK=311, 
		T_FIRST_VALUE=312, T_LAG=313, T_LAST_VALUE=314, T_LEAD=315, T_MAX_PART_STRING=316, 
		T_MIN_PART_STRING=317, T_MAX_PART_INT=318, T_MIN_PART_INT=319, T_MAX_PART_DATE=320, 
		T_MIN_PART_DATE=321, T_PART_COUNT=322, T_PART_LOC=323, T_RANK=324, T_ROW_NUMBER=325, 
		T_STDEV=326, T_SYSDATE=327, T_VARIANCE=328, T_USER=329, T_ADD=330, T_COLON=331, 
		T_COMMA=332, T_PIPE=333, T_DIV=334, T_DOT2=335, T_EQUAL=336, T_EQUAL2=337, 
		T_NOTEQUAL=338, T_NOTEQUAL2=339, T_GREATER=340, T_GREATEREQUAL=341, T_LESS=342, 
		T_LESSEQUAL=343, T_MUL=344, T_OPEN_B=345, T_OPEN_P=346, T_OPEN_SB=347, 
		T_CLOSE_B=348, T_CLOSE_P=349, T_CLOSE_SB=350, T_SEMICOLON=351, T_SUB=352, 
		T_SUBSUB=353, L_ID=354, L_S_STRING=355, L_D_STRING=356, L_INT=357, L_DEC=358, 
		L_WS=359, L_M_COMMENT=360, L_S_COMMENT=361, L_FILE=362, L_LABEL=363;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_single_block_stmt = 3, 
		RULE_block_end = 4, RULE_proc_block = 5, RULE_stmt = 6, RULE_semicolon_stmt = 7, 
		RULE_func_cpp_stmt = 8, RULE_cpp_body = 9, RULE_cpp_stmt = 10, RULE_paramsection = 11, 
		RULE_parameters = 12, RULE_assignment_stmt_cpp = 13, RULE_assignment_cpp = 14, 
		RULE_if_cpp_stmt = 15, RULE_for_cpp_stmt = 16, RULE_cpp_loop_body = 17, 
		RULE_if_loop_cpp_stmt = 18, RULE_inc_cpp = 19, RULE_elseif_cpp_block = 20, 
		RULE_else_cpp_block = 21, RULE_elseif_loop_cpp_block = 22, RULE_else_loop_cpp_block = 23, 
		RULE_exception_block = 24, RULE_exception_block_item = 25, RULE_null_stmt = 26, 
		RULE_expr_stmt = 27, RULE_assignment_stmt = 28, RULE_assignment_stmt_item = 29, 
		RULE_assignment_stmt_single_item = 30, RULE_assignment_stmt_multiple_item = 31, 
		RULE_assignment_stmt_select_item = 32, RULE_set_session_option = 33, RULE_set_current_schema_option = 34, 
		RULE_set_teradata_session_option = 35, RULE_set_mssql_session_option = 36, 
		RULE_begin_transaction_stmt = 37, RULE_break_stmt = 38, RULE_call_stmt = 39, 
		RULE_declare_stmt = 40, RULE_declare_block = 41, RULE_declare_block_inplace = 42, 
		RULE_declare_stmt_item = 43, RULE_declare_var_item = 44, RULE_declare_condition_item = 45, 
		RULE_declare_cursor_item = 46, RULE_cursor_with_return = 47, RULE_cursor_without_return = 48, 
		RULE_declare_handler_item = 49, RULE_declare_temporary_table_item = 50, 
		RULE_create_table_stmt = 51, RULE_create_local_temp_table_stmt = 52, RULE_create_table_definition = 53, 
		RULE_create_table_columns = 54, RULE_create_table_columns_item = 55, RULE_column_name = 56, 
		RULE_create_table_column_inline_cons = 57, RULE_create_table_column_cons = 58, 
		RULE_create_table_fk_action = 59, RULE_create_table_preoptions = 60, RULE_create_table_preoptions_item = 61, 
		RULE_create_table_preoptions_td_item = 62, RULE_create_table_options = 63, 
		RULE_create_table_options_item = 64, RULE_create_table_options_ora_item = 65, 
		RULE_create_table_options_db2_item = 66, RULE_create_table_options_td_item = 67, 
		RULE_create_table_options_hive_item = 68, RULE_create_table_hive_row_format = 69, 
		RULE_create_table_hive_row_format_fields = 70, RULE_create_table_options_mssql_item = 71, 
		RULE_create_table_options_mysql_item = 72, RULE_dtype = 73, RULE_dtype_len = 74, 
		RULE_dtype_attr = 75, RULE_dtype_default = 76, RULE_create_database_stmt = 77, 
		RULE_create_database_option = 78, RULE_create_function_stmt = 79, RULE_create_function_return = 80, 
		RULE_create_package_stmt = 81, RULE_package_spec = 82, RULE_package_spec_item = 83, 
		RULE_create_package_body_stmt = 84, RULE_package_body = 85, RULE_package_body_item = 86, 
		RULE_create_procedure_stmt = 87, RULE_create_routine_params = 88, RULE_create_routine_param_item = 89, 
		RULE_create_routine_options = 90, RULE_create_routine_option = 91, RULE_if_stmt = 92, 
		RULE_if_plsql_stmt = 93, RULE_if_tsql_stmt = 94, RULE_if_bteq_stmt = 95, 
		RULE_elseif_block = 96, RULE_else_block = 97, RULE_exit_stmt = 98, RULE_open_stmt = 99, 
		RULE_close_stmt = 100, RULE_cmp_stmt = 101, RULE_cmp_source = 102, RULE_create_index_stmt = 103, 
		RULE_create_index_col = 104, RULE_index_storage_clause = 105, RULE_index_mssql_storage_clause = 106, 
		RULE_return_stmt = 107, RULE_values_into_stmt = 108, RULE_for_cursor_stmt = 109, 
		RULE_for_range_stmt = 110, RULE_label = 111, RULE_select_stmt = 112, RULE_cte_select_stmt = 113, 
		RULE_cte_select_stmt_item = 114, RULE_cte_select_cols = 115, RULE_fullselect_stmt = 116, 
		RULE_fullselect_stmt_item = 117, RULE_fullselect_set_clause = 118, RULE_subselect_stmt = 119, 
		RULE_select_list = 120, RULE_missing_coma = 121, RULE_select_list_set = 122, 
		RULE_select_list_limit = 123, RULE_select_list_item = 124, RULE_select_list_alias = 125, 
		RULE_select_list_asterisk = 126, RULE_into_clause = 127, RULE_from_clause = 128, 
		RULE_syntax_error = 129, RULE_from_table_clause = 130, RULE_from_table_name_clause = 131, 
		RULE_from_subselect_clause = 132, RULE_from_join_clause = 133, RULE_from_join_type_clause = 134, 
		RULE_from_table_values_clause = 135, RULE_from_table_values_row = 136, 
		RULE_from_alias_clause = 137, RULE_table_name = 138, RULE_where_clause = 139, 
		RULE_group_by_clause = 140, RULE_having_clause = 141, RULE_qualify_clause = 142, 
		RULE_order_by_clause = 143, RULE_select_options = 144, RULE_select_options_item = 145, 
		RULE_bool_expr = 146, RULE_bool_expr_atom = 147, RULE_bool_expr_unary = 148, 
		RULE_bool_expr_single_in = 149, RULE_bool_expr_multi_in = 150, RULE_bool_expr_binary = 151, 
		RULE_bool_expr_logical_operator = 152, RULE_bool_expr_binary_operator = 153, 
		RULE_logical_error = 154, RULE_expr = 155, RULE_expr_atom = 156, RULE_expr_interval = 157, 
		RULE_interval_item = 158, RULE_expr_concat = 159, RULE_expr_concat_item = 160, 
		RULE_expr_case = 161, RULE_expr_case_simple = 162, RULE_expr_case_searched = 163, 
		RULE_expr_cursor_attribute = 164, RULE_expr_agg_window_func = 165, RULE_expr_func_all_distinct = 166, 
		RULE_expr_func_over_clause = 167, RULE_expr_func_partition_by_clause = 168, 
		RULE_expr_spec_func = 169, RULE_expr_func = 170, RULE_expr_func_params = 171, 
		RULE_func_param = 172, RULE_date_literal = 173, RULE_timestamp_literal = 174, 
		RULE_ident = 175, RULE_string = 176, RULE_int_number = 177, RULE_dec_number = 178, 
		RULE_bool_literal = 179, RULE_null_const = 180, RULE_missing_semicolon = 181, 
		RULE_non_reserved_words = 182;
	public static final String[] ruleNames = {
		"program", "block", "begin_end_block", "single_block_stmt", "block_end", 
		"proc_block", "stmt", "semicolon_stmt", "func_cpp_stmt", "cpp_body", "cpp_stmt", 
		"paramsection", "parameters", "assignment_stmt_cpp", "assignment_cpp", 
		"if_cpp_stmt", "for_cpp_stmt", "cpp_loop_body", "if_loop_cpp_stmt", "inc_cpp", 
		"elseif_cpp_block", "else_cpp_block", "elseif_loop_cpp_block", "else_loop_cpp_block", 
		"exception_block", "exception_block_item", "null_stmt", "expr_stmt", "assignment_stmt", 
		"assignment_stmt_item", "assignment_stmt_single_item", "assignment_stmt_multiple_item", 
		"assignment_stmt_select_item", "set_session_option", "set_current_schema_option", 
		"set_teradata_session_option", "set_mssql_session_option", "begin_transaction_stmt", 
		"break_stmt", "call_stmt", "declare_stmt", "declare_block", "declare_block_inplace", 
		"declare_stmt_item", "declare_var_item", "declare_condition_item", "declare_cursor_item", 
		"cursor_with_return", "cursor_without_return", "declare_handler_item", 
		"declare_temporary_table_item", "create_table_stmt", "create_local_temp_table_stmt", 
		"create_table_definition", "create_table_columns", "create_table_columns_item", 
		"column_name", "create_table_column_inline_cons", "create_table_column_cons", 
		"create_table_fk_action", "create_table_preoptions", "create_table_preoptions_item", 
		"create_table_preoptions_td_item", "create_table_options", "create_table_options_item", 
		"create_table_options_ora_item", "create_table_options_db2_item", "create_table_options_td_item", 
		"create_table_options_hive_item", "create_table_hive_row_format", "create_table_hive_row_format_fields", 
		"create_table_options_mssql_item", "create_table_options_mysql_item", 
		"dtype", "dtype_len", "dtype_attr", "dtype_default", "create_database_stmt", 
		"create_database_option", "create_function_stmt", "create_function_return", 
		"create_package_stmt", "package_spec", "package_spec_item", "create_package_body_stmt", 
		"package_body", "package_body_item", "create_procedure_stmt", "create_routine_params", 
		"create_routine_param_item", "create_routine_options", "create_routine_option", 
		"if_stmt", "if_plsql_stmt", "if_tsql_stmt", "if_bteq_stmt", "elseif_block", 
		"else_block", "exit_stmt", "open_stmt", "close_stmt", "cmp_stmt", "cmp_source", 
		"create_index_stmt", "create_index_col", "index_storage_clause", "index_mssql_storage_clause", 
		"return_stmt", "values_into_stmt", "for_cursor_stmt", "for_range_stmt", 
		"label", "select_stmt", "cte_select_stmt", "cte_select_stmt_item", "cte_select_cols", 
		"fullselect_stmt", "fullselect_stmt_item", "fullselect_set_clause", "subselect_stmt", 
		"select_list", "missing_coma", "select_list_set", "select_list_limit", 
		"select_list_item", "select_list_alias", "select_list_asterisk", "into_clause", 
		"from_clause", "syntax_error", "from_table_clause", "from_table_name_clause", 
		"from_subselect_clause", "from_join_clause", "from_join_type_clause", 
		"from_table_values_clause", "from_table_values_row", "from_alias_clause", 
		"table_name", "where_clause", "group_by_clause", "having_clause", "qualify_clause", 
		"order_by_clause", "select_options", "select_options_item", "bool_expr", 
		"bool_expr_atom", "bool_expr_unary", "bool_expr_single_in", "bool_expr_multi_in", 
		"bool_expr_binary", "bool_expr_logical_operator", "bool_expr_binary_operator", 
		"logical_error", "expr", "expr_atom", "expr_interval", "interval_item", 
		"expr_concat", "expr_concat_item", "expr_case", "expr_case_simple", "expr_case_searched", 
		"expr_cursor_attribute", "expr_agg_window_func", "expr_func_all_distinct", 
		"expr_func_over_clause", "expr_func_partition_by_clause", "expr_spec_func", 
		"expr_func", "expr_func_params", "func_param", "date_literal", "timestamp_literal", 
		"ident", "string", "int_number", "dec_number", "bool_literal", "null_const", 
		"missing_semicolon", "non_reserved_words"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "'#'", "'%'", "'.'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'+'", "':'", "','", "'||'", 
		"'/'", "'..'", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='", "'<'", "'<='", 
		"'*'", "'{'", "'('", "'['", "'}'", "')'", "']'", "';'", "'-'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "T_ERROR", "T_ACTION", "T_ADD2", "T_ALL", 
		"T_ALTER", "T_AND", "T_ANSI_NULLS", "T_ANSI_PADDING", "T_AS", "T_ASC", 
		"T_AT", "T_AUTO_INCREMENT", "T_AVG", "T_BATCHSIZE", "T_BEGIN", "T_BETWEEN", 
		"T_BIGINT", "T_BINARY_DOUBLE", "T_BINARY_FLOAT", "T_BINARY_INTEGER", "T_BIT", 
		"T_BODY", "T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", "T_CASCADE", 
		"T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", "T_CHARSET", 
		"T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECTION", "T_COLUMN", 
		"T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", "T_CONCAT", "T_CONDITION", 
		"T_CONSTRAINT", "T_CONTINUE", "T_COPY", "T_COUNT", "T_COUNT_BIG", "T_CREATE", 
		"T_CREATION", "T_CREATOR", "T_CS", "T_CURRENT", "T_CURRENT_SCHEMA", "T_CURSOR", 
		"T_DATABASE", "T_DATA", "T_DATE", "T_DATETIME", "T_DAY", "T_DAYS", "T_DEC", 
		"T_DECIMAL", "T_DECLARE", "T_DEFAULT", "T_DEFERRED", "T_DEFINED", "T_DEFINER", 
		"T_DEFINITION", "T_DELETE", "T_DELIMITED", "T_DELIMITER", "T_DESC", "T_DIAGNOSTICS", 
		"T_DIR", "T_DIRECTORY", "T_DISTINCT", "T_DISTRIBUTE", "T_DOUBLE", "T_DROP", 
		"T_DYNAMIC", "T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ENABLE", "T_END", "T_ENGINE", 
		"T_ESCAPED", "T_EXCEPT", "T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", "T_EXIT", 
		"T_FALLBACK", "T_FALSE", "T_FIELDS", "T_FILE", "T_FILES", "T_FLOAT", "T_FOR", 
		"T_FOREIGN", "T_FORMAT", "T_FOUND", "T_FROM", "T_FULL", "T_FUNCTION", 
		"T_GET", "T_GLOBAL", "T_GO", "T_GRANT", "T_GROUP", "T_HANDLER", "T_HASH", 
		"T_HAVING", "T_HDFS", "T_HIVE", "T_HOST", "T_IDENTITY", "T_IF", "T_IGNORE", 
		"T_IMMEDIATE", "T_IN", "T_INCLUDE", "T_INDEX", "T_INITRANS", "T_INNER", 
		"T_INOUT", "T_INT", "T_INT2", "T_INT4", "T_INT8", "T_INTEGER", "T_INTERSECT", 
		"T_INTERVAL", "T_INTO", "T_INVOKER", "T_IS", "T_ISOPEN", "T_ITEMS", "T_JOIN", 
		"T_KEEP", "T_KEY", "T_KEYS", "T_LANGUAGE", "T_LEAVE", "T_LEFT", "T_LIKE", 
		"T_LIMIT", "T_LINES", "T_LOCAL", "T_LOCATION", "T_LOCKS", "T_LOG", "T_LOGGED", 
		"T_LOGGING", "T_LOOP", "T_MAP", "T_MATCHED", "T_MAX", "T_MAXTRANS", "T_MERGE", 
		"T_MESSAGE_TEXT", "T_MICROSECOND", "T_MICROSECONDS", "T_MIN", "T_MULTISET", 
		"T_NCHAR", "T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", "T_NOCOMPRESS", 
		"T_NOLOGGING", "T_NONE", "T_NOT", "T_NOTFOUND", "T_NULL", "T_NUMERIC", 
		"T_NUMBER", "T_OBJECT", "T_OFF", "T_ON", "T_ONLY", "T_OPEN", "T_OR", "T_ORDER", 
		"T_OUT", "T_OUTER", "T_OVER", "T_OVERWRITE", "T_OWNER", "T_PACKAGE", "T_PARTITION", 
		"T_PCTFREE", "T_PCTUSED", "T_PLS_INTEGER", "T_PRECISION", "T_PRESERVE", 
		"T_PRIMARY", "T_PRINT", "T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUERY_BAND", 
		"T_QUIT", "T_QUOTED_IDENTIFIER", "T_RAISE", "T_REAL", "T_REFERENCES", 
		"T_REGEXP", "T_REPLACE", "T_RESIGNAL", "T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", 
		"T_RETURN", "T_RETURNS", "T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", 
		"T_ROLLBACK", "T_ROW", "T_ROWS", "T_ROWTYPE", "T_ROW_COUNT", "T_RR", "T_RS", 
		"T_PWD", "T_TRIM", "T_SCHEMA", "T_SECOND", "T_SECONDS", "T_SECURITY", 
		"T_SEGMENT", "T_SEL", "T_SELECT", "T_SET", "T_SESSION", "T_SESSIONS", 
		"T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", 
		"T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", "T_SQL", "T_SQLEXCEPTION", 
		"T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", "T_STEP", "T_STORAGE", "T_STORED", 
		"T_STRING", "T_SUBDIR", "T_SUBSTRING", "T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", 
		"T_TABLE", "T_TABLESPACE", "T_TEMPORARY", "T_TERMINATED", "T_TEXTIMAGE_ON", 
		"T_THEN", "T_TIMESTAMP", "T_TINYINT", "T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", 
		"T_TRUE", "T_TRUNCATE", "T_TYPE", "T_UNION", "T_UNIQUE", "T_UPDATE", "T_UR", 
		"T_USE", "T_USING", "T_VALUE", "T_VALUES", "T_VAR", "T_VARCHAR", "T_VARCHAR2", 
		"T_VARYING", "T_VOLATILE", "T_WHEN", "T_WHERE", "T_WITH", "T_WITHOUT", 
		"T_WORK", "T_XACT_ABORT", "T_XML", "T_YES", "T_ACTIVITY_COUNT", "T_CUME_DIST", 
		"T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", "T_DENSE_RANK", 
		"T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", 
		"T_MIN_PART_STRING", "T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", 
		"T_MIN_PART_DATE", "T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", 
		"T_STDEV", "T_SYSDATE", "T_VARIANCE", "T_USER", "T_ADD", "T_COLON", "T_COMMA", 
		"T_PIPE", "T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", 
		"T_GREATER", "T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", 
		"T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", 
		"T_SUB", "T_SUBSUB", "L_ID", "L_S_STRING", "L_D_STRING", "L_INT", "L_DEC", 
		"L_WS", "L_M_COMMENT", "L_S_COMMENT", "L_FILE", "L_LABEL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			block();
			setState(367);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<Begin_end_blockContext> begin_end_block() {
			return getRuleContexts(Begin_end_blockContext.class);
		}
		public Begin_end_blockContext begin_end_block(int i) {
			return getRuleContext(Begin_end_blockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> T_GO() { return getTokens(gParser.T_GO); }
		public TerminalNode T_GO(int i) {
			return getToken(gParser.T_GO, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(369);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(370);
						stmt();
						}
						break;
					}
					setState(374);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(373);
						match(T_GO);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(378); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_end_blockContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(gParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Declare_blockContext declare_block() {
			return getRuleContext(Declare_blockContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBegin_end_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBegin_end_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBegin_end_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(380);
				declare_block();
				}
			}

			setState(383);
			match(T_BEGIN);
			setState(384);
			block();
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(385);
				exception_block();
				}
				break;
			}
			setState(388);
			block_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_block_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(gParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSingle_block_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSingle_block_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSingle_block_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_block_stmt);
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(T_BEGIN);
				setState(391);
				block();
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(392);
					exception_block();
					}
					break;
				}
				setState(395);
				block_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				stmt();
				setState(398);
				match(T_SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBlock_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBlock_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBlock_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(403);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proc_blockContext extends ParserRuleContext {
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode T_GO() { return getToken(gParser.T_GO, 0); }
		public Proc_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterProc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitProc_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitProc_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc_block);
		try {
			int _alt;
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(406);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(409); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(411);
					match(T_GO);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Begin_transaction_stmtContext begin_transaction_stmt() {
			return getRuleContext(Begin_transaction_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Call_stmtContext call_stmt() {
			return getRuleContext(Call_stmtContext.class,0);
		}
		public Close_stmtContext close_stmt() {
			return getRuleContext(Close_stmtContext.class,0);
		}
		public Cmp_stmtContext cmp_stmt() {
			return getRuleContext(Cmp_stmtContext.class,0);
		}
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
			return getRuleContext(Create_local_temp_table_stmtContext.class,0);
		}
		public Create_package_stmtContext create_package_stmt() {
			return getRuleContext(Create_package_stmtContext.class,0);
		}
		public Create_package_body_stmtContext create_package_body_stmt() {
			return getRuleContext(Create_package_body_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Declare_stmtContext declare_stmt() {
			return getRuleContext(Declare_stmtContext.class,0);
		}
		public Exit_stmtContext exit_stmt() {
			return getRuleContext(Exit_stmtContext.class,0);
		}
		public For_cursor_stmtContext for_cursor_stmt() {
			return getRuleContext(For_cursor_stmtContext.class,0);
		}
		public For_range_stmtContext for_range_stmt() {
			return getRuleContext(For_range_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Func_cpp_stmtContext func_cpp_stmt() {
			return getRuleContext(Func_cpp_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Open_stmtContext open_stmt() {
			return getRuleContext(Open_stmtContext.class,0);
		}
		public Values_into_stmtContext values_into_stmt() {
			return getRuleContext(Values_into_stmtContext.class,0);
		}
		public Null_stmtContext null_stmt() {
			return getRuleContext(Null_stmtContext.class,0);
		}
		public Assignment_stmt_cppContext assignment_stmt_cpp() {
			return getRuleContext(Assignment_stmt_cppContext.class,0);
		}
		public For_cpp_stmtContext for_cpp_stmt() {
			return getRuleContext(For_cpp_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Semicolon_stmtContext semicolon_stmt() {
			return getRuleContext(Semicolon_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				begin_transaction_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				break_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				call_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(420);
				close_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(421);
				cmp_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(422);
				create_database_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(423);
				create_function_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(424);
				create_index_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(425);
				create_local_temp_table_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(426);
				create_package_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(427);
				create_package_body_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(428);
				create_procedure_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(429);
				create_table_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(430);
				declare_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(431);
				exit_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(432);
				for_cursor_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(433);
				for_range_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(434);
				if_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(435);
				func_cpp_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(436);
				return_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(437);
				select_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(438);
				open_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(439);
				values_into_stmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(440);
				null_stmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(441);
				assignment_stmt_cpp();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(442);
				for_cpp_stmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(443);
				expr_stmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(444);
				semicolon_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Semicolon_stmtContext extends ParserRuleContext {
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public Semicolon_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSemicolon_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSemicolon_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSemicolon_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		Semicolon_stmtContext _localctx = new Semicolon_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1 || _la==T_DIV || _la==T_SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_cpp_stmtContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ParamsectionContext paramsection() {
			return getRuleContext(ParamsectionContext.class,0);
		}
		public Cpp_bodyContext cpp_body() {
			return getRuleContext(Cpp_bodyContext.class,0);
		}
		public Func_cpp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_cpp_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunc_cpp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunc_cpp_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunc_cpp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_cpp_stmtContext func_cpp_stmt() throws RecognitionException {
		Func_cpp_stmtContext _localctx = new Func_cpp_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_cpp_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			dtype();
			setState(450);
			ident();
			setState(451);
			paramsection();
			setState(452);
			cpp_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cpp_bodyContext extends ParserRuleContext {
		public TerminalNode T_OPEN_B() { return getToken(gParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(gParser.T_CLOSE_B, 0); }
		public List<Cpp_stmtContext> cpp_stmt() {
			return getRuleContexts(Cpp_stmtContext.class);
		}
		public Cpp_stmtContext cpp_stmt(int i) {
			return getRuleContext(Cpp_stmtContext.class,i);
		}
		public Cpp_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCpp_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCpp_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCpp_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cpp_bodyContext cpp_body() throws RecognitionException {
		Cpp_bodyContext _localctx = new Cpp_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cpp_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T_OPEN_B);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BINARY_INTEGER) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PLS_INTEGER - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SIMPLE_INTEGER - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TINYINT - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_PART_COUNT - 322)) | (1L << (T_PART_LOC - 322)) | (1L << (T_RANK - 322)) | (1L << (T_ROW_NUMBER - 322)) | (1L << (T_STDEV - 322)) | (1L << (T_SYSDATE - 322)) | (1L << (T_VARIANCE - 322)) | (1L << (T_USER - 322)) | (1L << (L_ID - 322)))) != 0)) {
				{
				{
				setState(455);
				cpp_stmt();
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
			match(T_CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cpp_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_cpp_stmtContext for_cpp_stmt() {
			return getRuleContext(For_cpp_stmtContext.class,0);
		}
		public Assignment_stmt_cppContext assignment_stmt_cpp() {
			return getRuleContext(Assignment_stmt_cppContext.class,0);
		}
		public Cpp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCpp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCpp_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCpp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cpp_stmtContext cpp_stmt() throws RecognitionException {
		Cpp_stmtContext _localctx = new Cpp_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cpp_stmt);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				if_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				for_cpp_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				assignment_stmt_cpp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsectionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public ParamsectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterParamsection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitParamsection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitParamsection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsectionContext paramsection() throws RecognitionException {
		ParamsectionContext _localctx = new ParamsectionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paramsection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T_OPEN_P);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BINARY_INTEGER) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PLS_INTEGER - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SIMPLE_INTEGER - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TINYINT - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_PART_COUNT - 322)) | (1L << (T_PART_LOC - 322)) | (1L << (T_RANK - 322)) | (1L << (T_ROW_NUMBER - 322)) | (1L << (T_STDEV - 322)) | (1L << (T_SYSDATE - 322)) | (1L << (T_VARIANCE - 322)) | (1L << (T_USER - 322)) | (1L << (L_ID - 322)))) != 0)) {
				{
				{
				setState(469);
				parameters(0);
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode T_COMMA() { return getToken(gParser.T_COMMA, 0); }
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		return parameters(0);
	}

	private ParametersContext parameters(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParametersContext _localctx = new ParametersContext(_ctx, _parentState);
		ParametersContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_parameters, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(478);
			dtype();
			setState(479);
			ident();
			}
			_ctx.stop = _input.LT(-1);
			setState(488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParametersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameters);
					setState(481);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(482);
					match(T_COMMA);
					setState(483);
					dtype();
					setState(484);
					ident();
					}
					} 
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Assignment_stmt_cppContext extends ParserRuleContext {
		public Assignment_cppContext assignment_cpp() {
			return getRuleContext(Assignment_cppContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public Assignment_stmt_cppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_cpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment_stmt_cpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment_stmt_cpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment_stmt_cpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_cppContext assignment_stmt_cpp() throws RecognitionException {
		Assignment_stmt_cppContext _localctx = new Assignment_stmt_cppContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_stmt_cpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			assignment_cpp(0);
			setState(492);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_cppContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public List<Int_numberContext> int_number() {
			return getRuleContexts(Int_numberContext.class);
		}
		public Int_numberContext int_number(int i) {
			return getRuleContext(Int_numberContext.class,i);
		}
		public List<Dec_numberContext> dec_number() {
			return getRuleContexts(Dec_numberContext.class);
		}
		public Dec_numberContext dec_number(int i) {
			return getRuleContext(Dec_numberContext.class,i);
		}
		public Assignment_cppContext assignment_cpp() {
			return getRuleContext(Assignment_cppContext.class,0);
		}
		public TerminalNode T_COMMA() { return getToken(gParser.T_COMMA, 0); }
		public Assignment_cppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_cpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment_cpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment_cpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment_cpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_cppContext assignment_cpp() throws RecognitionException {
		return assignment_cpp(0);
	}

	private Assignment_cppContext assignment_cpp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Assignment_cppContext _localctx = new Assignment_cppContext(_ctx, _parentState);
		Assignment_cppContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_assignment_cpp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(495);
			dtype();
			setState(496);
			ident();
			setState(497);
			match(T_EQUAL);
			setState(500); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(500);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(498);
						int_number();
						}
						break;
					case 2:
						{
						setState(499);
						dec_number();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(502); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
			_ctx.stop = _input.LT(-1);
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Assignment_cppContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_assignment_cpp);
					setState(504);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(505);
					match(T_COMMA);
					setState(506);
					ident();
					setState(507);
					match(T_EQUAL);
					setState(510); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(510);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
							case 1:
								{
								setState(508);
								int_number();
								}
								break;
							case 2:
								{
								setState(509);
								dec_number();
								}
								break;
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(512); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class If_cpp_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(gParser.T_IF, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Cpp_bodyContext cpp_body() {
			return getRuleContext(Cpp_bodyContext.class,0);
		}
		public List<Elseif_cpp_blockContext> elseif_cpp_block() {
			return getRuleContexts(Elseif_cpp_blockContext.class);
		}
		public Elseif_cpp_blockContext elseif_cpp_block(int i) {
			return getRuleContext(Elseif_cpp_blockContext.class,i);
		}
		public Else_cpp_blockContext else_cpp_block() {
			return getRuleContext(Else_cpp_blockContext.class,0);
		}
		public If_cpp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_cpp_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIf_cpp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIf_cpp_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIf_cpp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_cpp_stmtContext if_cpp_stmt() throws RecognitionException {
		If_cpp_stmtContext _localctx = new If_cpp_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_cpp_stmt);
		try {
			int _alt;
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(T_IF);
				setState(520);
				match(T_OPEN_P);
				setState(521);
				bool_expr(0);
				setState(522);
				match(T_CLOSE_P);
				setState(523);
				cpp_body();
				setState(527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(524);
						elseif_cpp_block();
						}
						} 
					}
					setState(529);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(530);
					else_cpp_block();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(T_IF);
				setState(534);
				match(T_OPEN_P);
				setState(535);
				bool_expr(0);
				setState(536);
				match(T_CLOSE_P);
				setState(537);
				cpp_body();
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(538);
						elseif_cpp_block();
						}
						} 
					}
					setState(543);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(544);
					else_cpp_block();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_cpp_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(gParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(gParser.T_SEMICOLON, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Inc_cppContext inc_cpp() {
			return getRuleContext(Inc_cppContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_OPEN_B() { return getToken(gParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(gParser.T_CLOSE_B, 0); }
		public List<Cpp_loop_bodyContext> cpp_loop_body() {
			return getRuleContexts(Cpp_loop_bodyContext.class);
		}
		public Cpp_loop_bodyContext cpp_loop_body(int i) {
			return getRuleContext(Cpp_loop_bodyContext.class,i);
		}
		public For_cpp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cpp_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFor_cpp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFor_cpp_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFor_cpp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cpp_stmtContext for_cpp_stmt() throws RecognitionException {
		For_cpp_stmtContext _localctx = new For_cpp_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_cpp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(T_FOR);
			setState(550);
			match(T_OPEN_P);
			setState(551);
			dtype();
			setState(552);
			ident();
			setState(553);
			match(T_EQUAL);
			setState(554);
			int_number();
			setState(555);
			match(T_SEMICOLON);
			setState(556);
			bool_expr(0);
			setState(557);
			match(T_SEMICOLON);
			setState(558);
			inc_cpp();
			setState(559);
			match(T_CLOSE_P);
			setState(560);
			match(T_OPEN_B);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BINARY_INTEGER) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PLS_INTEGER - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SIMPLE_INTEGER - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TINYINT - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_PART_COUNT - 322)) | (1L << (T_PART_LOC - 322)) | (1L << (T_RANK - 322)) | (1L << (T_ROW_NUMBER - 322)) | (1L << (T_STDEV - 322)) | (1L << (T_SYSDATE - 322)) | (1L << (T_VARIANCE - 322)) | (1L << (T_USER - 322)) | (1L << (L_ID - 322)))) != 0)) {
				{
				{
				setState(561);
				cpp_loop_body();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
			match(T_CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cpp_loop_bodyContext extends ParserRuleContext {
		public If_loop_cpp_stmtContext if_loop_cpp_stmt() {
			return getRuleContext(If_loop_cpp_stmtContext.class,0);
		}
		public For_cpp_stmtContext for_cpp_stmt() {
			return getRuleContext(For_cpp_stmtContext.class,0);
		}
		public Assignment_stmt_cppContext assignment_stmt_cpp() {
			return getRuleContext(Assignment_stmt_cppContext.class,0);
		}
		public TerminalNode T_BREAK() { return getToken(gParser.T_BREAK, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public TerminalNode T_CONTINUE() { return getToken(gParser.T_CONTINUE, 0); }
		public Cpp_loop_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_loop_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCpp_loop_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCpp_loop_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCpp_loop_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cpp_loop_bodyContext cpp_loop_body() throws RecognitionException {
		Cpp_loop_bodyContext _localctx = new Cpp_loop_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cpp_loop_body);
		try {
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				if_loop_cpp_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				for_cpp_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				assignment_stmt_cpp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(572);
				match(T_BREAK);
				setState(573);
				match(T_SEMICOLON);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(574);
				match(T_CONTINUE);
				setState(575);
				match(T_SEMICOLON);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_loop_cpp_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(gParser.T_IF, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_OPEN_B() { return getToken(gParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(gParser.T_CLOSE_B, 0); }
		public List<Cpp_loop_bodyContext> cpp_loop_body() {
			return getRuleContexts(Cpp_loop_bodyContext.class);
		}
		public Cpp_loop_bodyContext cpp_loop_body(int i) {
			return getRuleContext(Cpp_loop_bodyContext.class,i);
		}
		public List<Elseif_loop_cpp_blockContext> elseif_loop_cpp_block() {
			return getRuleContexts(Elseif_loop_cpp_blockContext.class);
		}
		public Elseif_loop_cpp_blockContext elseif_loop_cpp_block(int i) {
			return getRuleContext(Elseif_loop_cpp_blockContext.class,i);
		}
		public Else_loop_cpp_blockContext else_loop_cpp_block() {
			return getRuleContext(Else_loop_cpp_blockContext.class,0);
		}
		public If_loop_cpp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_loop_cpp_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIf_loop_cpp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIf_loop_cpp_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIf_loop_cpp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_loop_cpp_stmtContext if_loop_cpp_stmt() throws RecognitionException {
		If_loop_cpp_stmtContext _localctx = new If_loop_cpp_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_loop_cpp_stmt);
		int _la;
		try {
			int _alt;
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(T_IF);
				setState(579);
				match(T_OPEN_P);
				setState(580);
				bool_expr(0);
				setState(581);
				match(T_CLOSE_P);
				setState(582);
				match(T_OPEN_B);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BINARY_INTEGER) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PLS_INTEGER - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SIMPLE_INTEGER - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TINYINT - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_PART_COUNT - 322)) | (1L << (T_PART_LOC - 322)) | (1L << (T_RANK - 322)) | (1L << (T_ROW_NUMBER - 322)) | (1L << (T_STDEV - 322)) | (1L << (T_SYSDATE - 322)) | (1L << (T_VARIANCE - 322)) | (1L << (T_USER - 322)) | (1L << (L_ID - 322)))) != 0)) {
					{
					{
					setState(583);
					cpp_loop_body();
					}
					}
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(589);
				match(T_CLOSE_B);
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(590);
						elseif_loop_cpp_block();
						}
						} 
					}
					setState(595);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(596);
					else_loop_cpp_block();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				match(T_IF);
				setState(600);
				match(T_OPEN_P);
				setState(601);
				bool_expr(0);
				setState(602);
				match(T_CLOSE_P);
				setState(603);
				cpp_loop_body();
				setState(607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(604);
						elseif_loop_cpp_block();
						}
						} 
					}
					setState(609);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(611);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(610);
					else_loop_cpp_block();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inc_cppContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<TerminalNode> T_ADD() { return getTokens(gParser.T_ADD); }
		public TerminalNode T_ADD(int i) {
			return getToken(gParser.T_ADD, i);
		}
		public TerminalNode T_SUBSUB() { return getToken(gParser.T_SUBSUB, 0); }
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public TerminalNode T_SUB() { return getToken(gParser.T_SUB, 0); }
		public TerminalNode T_MUL() { return getToken(gParser.T_MUL, 0); }
		public Inc_cppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_cpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInc_cpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInc_cpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInc_cpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_cppContext inc_cpp() throws RecognitionException {
		Inc_cppContext _localctx = new Inc_cppContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inc_cpp);
		try {
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				ident();
				setState(616);
				match(T_ADD);
				setState(617);
				match(T_ADD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				ident();
				setState(620);
				match(T_SUBSUB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(622);
				ident();
				setState(623);
				match(T_ADD);
				setState(624);
				match(T_EQUAL);
				setState(625);
				int_number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(627);
				ident();
				setState(628);
				match(T_SUB);
				setState(629);
				match(T_EQUAL);
				setState(630);
				int_number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(632);
				ident();
				setState(633);
				match(T_MUL);
				setState(634);
				match(T_EQUAL);
				setState(635);
				int_number();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elseif_cpp_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSEIF() { return getToken(gParser.T_ELSEIF, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_OPEN_B() { return getToken(gParser.T_OPEN_B, 0); }
		public Cpp_stmtContext cpp_stmt() {
			return getRuleContext(Cpp_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_B() { return getToken(gParser.T_CLOSE_B, 0); }
		public Elseif_cpp_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_cpp_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElseif_cpp_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElseif_cpp_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElseif_cpp_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_cpp_blockContext elseif_cpp_block() throws RecognitionException {
		Elseif_cpp_blockContext _localctx = new Elseif_cpp_blockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseif_cpp_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(T_ELSEIF);
			setState(640);
			match(T_OPEN_P);
			setState(641);
			bool_expr(0);
			setState(642);
			match(T_CLOSE_P);
			setState(643);
			match(T_OPEN_B);
			setState(644);
			cpp_stmt();
			setState(645);
			match(T_CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_cpp_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(gParser.T_ELSE, 0); }
		public TerminalNode T_OPEN_B() { return getToken(gParser.T_OPEN_B, 0); }
		public Cpp_stmtContext cpp_stmt() {
			return getRuleContext(Cpp_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_B() { return getToken(gParser.T_CLOSE_B, 0); }
		public Else_cpp_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_cpp_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElse_cpp_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElse_cpp_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElse_cpp_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_cpp_blockContext else_cpp_block() throws RecognitionException {
		Else_cpp_blockContext _localctx = new Else_cpp_blockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_else_cpp_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(T_ELSE);
			setState(648);
			match(T_OPEN_B);
			setState(649);
			cpp_stmt();
			setState(650);
			match(T_CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elseif_loop_cpp_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSEIF() { return getToken(gParser.T_ELSEIF, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_OPEN_B() { return getToken(gParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(gParser.T_CLOSE_B, 0); }
		public List<Cpp_loop_bodyContext> cpp_loop_body() {
			return getRuleContexts(Cpp_loop_bodyContext.class);
		}
		public Cpp_loop_bodyContext cpp_loop_body(int i) {
			return getRuleContext(Cpp_loop_bodyContext.class,i);
		}
		public Elseif_loop_cpp_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_loop_cpp_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElseif_loop_cpp_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElseif_loop_cpp_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElseif_loop_cpp_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_loop_cpp_blockContext elseif_loop_cpp_block() throws RecognitionException {
		Elseif_loop_cpp_blockContext _localctx = new Elseif_loop_cpp_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elseif_loop_cpp_block);
		int _la;
		try {
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				match(T_ELSEIF);
				setState(653);
				match(T_OPEN_P);
				setState(654);
				bool_expr(0);
				setState(655);
				match(T_CLOSE_P);
				setState(656);
				match(T_OPEN_B);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BINARY_INTEGER) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PLS_INTEGER - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SIMPLE_INTEGER - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TINYINT - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_PART_COUNT - 322)) | (1L << (T_PART_LOC - 322)) | (1L << (T_RANK - 322)) | (1L << (T_ROW_NUMBER - 322)) | (1L << (T_STDEV - 322)) | (1L << (T_SYSDATE - 322)) | (1L << (T_VARIANCE - 322)) | (1L << (T_USER - 322)) | (1L << (L_ID - 322)))) != 0)) {
					{
					{
					setState(657);
					cpp_loop_body();
					}
					}
					setState(662);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(663);
				match(T_CLOSE_B);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				match(T_ELSEIF);
				setState(666);
				match(T_OPEN_P);
				setState(667);
				bool_expr(0);
				setState(668);
				match(T_CLOSE_P);
				setState(669);
				cpp_loop_body();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_loop_cpp_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(gParser.T_ELSE, 0); }
		public TerminalNode T_OPEN_B() { return getToken(gParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(gParser.T_CLOSE_B, 0); }
		public List<Cpp_loop_bodyContext> cpp_loop_body() {
			return getRuleContexts(Cpp_loop_bodyContext.class);
		}
		public Cpp_loop_bodyContext cpp_loop_body(int i) {
			return getRuleContext(Cpp_loop_bodyContext.class,i);
		}
		public Else_loop_cpp_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_loop_cpp_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElse_loop_cpp_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElse_loop_cpp_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElse_loop_cpp_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_loop_cpp_blockContext else_loop_cpp_block() throws RecognitionException {
		Else_loop_cpp_blockContext _localctx = new Else_loop_cpp_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_else_loop_cpp_block);
		int _la;
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				match(T_ELSE);
				setState(674);
				match(T_OPEN_B);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BINARY_INTEGER) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PLS_INTEGER - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SIMPLE_INTEGER - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TINYINT - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_PART_COUNT - 322)) | (1L << (T_PART_LOC - 322)) | (1L << (T_RANK - 322)) | (1L << (T_ROW_NUMBER - 322)) | (1L << (T_STDEV - 322)) | (1L << (T_SYSDATE - 322)) | (1L << (T_VARIANCE - 322)) | (1L << (T_USER - 322)) | (1L << (L_ID - 322)))) != 0)) {
					{
					{
					setState(675);
					cpp_loop_body();
					}
					}
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(681);
				match(T_CLOSE_B);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(T_ELSE);
				setState(683);
				cpp_loop_body();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_blockContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(gParser.T_EXCEPTION, 0); }
		public List<Exception_block_itemContext> exception_block_item() {
			return getRuleContexts(Exception_block_itemContext.class);
		}
		public Exception_block_itemContext exception_block_item(int i) {
			return getRuleContext(Exception_block_itemContext.class,i);
		}
		public Exception_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterException_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitException_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitException_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_blockContext exception_block() throws RecognitionException {
		Exception_blockContext _localctx = new Exception_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exception_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(T_EXCEPTION);
			setState(688); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(687);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(690); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_block_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_WHEN() { return getTokens(gParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(gParser.T_WHEN, i);
		}
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public TerminalNode T_THEN() { return getToken(gParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public Exception_block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterException_block_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitException_block_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitException_block_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_block_itemContext exception_block_item() throws RecognitionException {
		Exception_block_itemContext _localctx = new Exception_block_itemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exception_block_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(T_WHEN);
			setState(693);
			match(L_ID);
			setState(694);
			match(T_THEN);
			setState(695);
			block();
			setState(696);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T_END || _la==T_WHEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_stmtContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(gParser.T_NULL, 0); }
		public Null_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNull_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNull_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNull_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_stmtContext null_stmt() throws RecognitionException {
		Null_stmtContext _localctx = new Null_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_null_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			setState(701);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmtContext extends ParserRuleContext {
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public Set_session_optionContext set_session_option() {
			return getRuleContext(Set_session_optionContext.class,0);
		}
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignment_stmt);
		try {
			int _alt;
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(T_SET);
				setState(704);
				set_session_option();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(705);
					match(T_SET);
					}
					break;
				}
				setState(708);
				assignment_stmt_item();
				setState(713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(709);
						match(T_COMMA);
						setState(710);
						assignment_stmt_item();
						}
						} 
					}
					setState(715);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_itemContext extends ParserRuleContext {
		public Assignment_stmt_single_itemContext assignment_stmt_single_item() {
			return getRuleContext(Assignment_stmt_single_itemContext.class,0);
		}
		public Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() {
			return getRuleContext(Assignment_stmt_multiple_itemContext.class,0);
		}
		public Assignment_stmt_select_itemContext assignment_stmt_select_item() {
			return getRuleContext(Assignment_stmt_select_itemContext.class,0);
		}
		public Assignment_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_itemContext assignment_stmt_item() throws RecognitionException {
		Assignment_stmt_itemContext _localctx = new Assignment_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignment_stmt_item);
		try {
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
				assignment_stmt_select_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_single_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(gParser.T_COLON, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Assignment_stmt_single_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_single_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment_stmt_single_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment_stmt_single_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment_stmt_single_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_single_itemContext assignment_stmt_single_item() throws RecognitionException {
		Assignment_stmt_single_itemContext _localctx = new Assignment_stmt_single_itemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignment_stmt_single_item);
		int _la;
		try {
			setState(739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				ident();
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(724);
					match(T_COLON);
					}
				}

				setState(727);
				match(T_EQUAL);
				setState(728);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				match(T_OPEN_P);
				setState(731);
				ident();
				setState(732);
				match(T_CLOSE_P);
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(733);
					match(T_COLON);
					}
				}

				setState(736);
				match(T_EQUAL);
				setState(737);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_multiple_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(gParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(gParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(gParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(gParser.T_CLOSE_P, i);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_COLON() { return getToken(gParser.T_COLON, 0); }
		public Assignment_stmt_multiple_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_multiple_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment_stmt_multiple_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment_stmt_multiple_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment_stmt_multiple_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() throws RecognitionException {
		Assignment_stmt_multiple_itemContext _localctx = new Assignment_stmt_multiple_itemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_assignment_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(T_OPEN_P);
			setState(742);
			ident();
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(743);
				match(T_COMMA);
				setState(744);
				ident();
				}
				}
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(750);
			match(T_CLOSE_P);
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(751);
				match(T_COLON);
				}
			}

			setState(754);
			match(T_EQUAL);
			setState(755);
			match(T_OPEN_P);
			setState(756);
			expr(0);
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(757);
				match(T_COMMA);
				setState(758);
				expr(0);
				}
				}
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(764);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_select_itemContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(gParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(gParser.T_OPEN_P, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(gParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(gParser.T_CLOSE_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_COLON() { return getToken(gParser.T_COLON, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Assignment_stmt_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_select_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment_stmt_select_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment_stmt_select_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment_stmt_select_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_select_itemContext assignment_stmt_select_item() throws RecognitionException {
		Assignment_stmt_select_itemContext _localctx = new Assignment_stmt_select_itemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignment_stmt_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				{
				setState(766);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(767);
				match(T_OPEN_P);
				setState(768);
				ident();
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(769);
					match(T_COMMA);
					setState(770);
					ident();
					}
					}
					setState(775);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(776);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(780);
				match(T_COLON);
				}
			}

			setState(783);
			match(T_EQUAL);
			setState(784);
			match(T_OPEN_P);
			setState(785);
			select_stmt();
			setState(786);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_session_optionContext extends ParserRuleContext {
		public Set_current_schema_optionContext set_current_schema_option() {
			return getRuleContext(Set_current_schema_optionContext.class,0);
		}
		public Set_mssql_session_optionContext set_mssql_session_option() {
			return getRuleContext(Set_mssql_session_optionContext.class,0);
		}
		public Set_teradata_session_optionContext set_teradata_session_option() {
			return getRuleContext(Set_teradata_session_optionContext.class,0);
		}
		public Set_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSet_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSet_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSet_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_session_optionContext set_session_option() throws RecognitionException {
		Set_session_optionContext _localctx = new Set_session_optionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_set_session_option);
		try {
			setState(791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_SCHEMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				set_current_schema_option();
				}
				break;
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_NOCOUNT:
			case T_QUOTED_IDENTIFIER:
			case T_XACT_ABORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				set_mssql_session_option();
				}
				break;
			case T_QUERY_BAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(790);
				set_teradata_session_option();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_current_schema_optionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(gParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public TerminalNode T_SCHEMA() { return getToken(gParser.T_SCHEMA, 0); }
		public TerminalNode T_CURRENT() { return getToken(gParser.T_CURRENT, 0); }
		public Set_current_schema_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_current_schema_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSet_current_schema_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSet_current_schema_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSet_current_schema_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_current_schema_optionContext set_current_schema_option() throws RecognitionException {
		Set_current_schema_optionContext _localctx = new Set_current_schema_optionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_set_current_schema_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_SCHEMA:
				{
				{
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CURRENT) {
					{
					setState(793);
					match(T_CURRENT);
					}
				}

				setState(796);
				match(T_SCHEMA);
				}
				}
				break;
			case T_CURRENT_SCHEMA:
				{
				setState(797);
				match(T_CURRENT_SCHEMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(800);
				match(T_EQUAL);
				}
			}

			setState(803);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_teradata_session_optionContext extends ParserRuleContext {
		public TerminalNode T_QUERY_BAND() { return getToken(gParser.T_QUERY_BAND, 0); }
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(gParser.T_TRANSACTION, 0); }
		public TerminalNode T_SESSION() { return getToken(gParser.T_SESSION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_NONE() { return getToken(gParser.T_NONE, 0); }
		public TerminalNode T_UPDATE() { return getToken(gParser.T_UPDATE, 0); }
		public Set_teradata_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_teradata_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSet_teradata_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSet_teradata_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSet_teradata_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_teradata_session_optionContext set_teradata_session_option() throws RecognitionException {
		Set_teradata_session_optionContext _localctx = new Set_teradata_session_optionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_set_teradata_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(T_QUERY_BAND);
			setState(806);
			match(T_EQUAL);
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(807);
				expr(0);
				}
				break;
			case 2:
				{
				setState(808);
				match(T_NONE);
				}
				break;
			}
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UPDATE) {
				{
				setState(811);
				match(T_UPDATE);
				}
			}

			setState(814);
			match(T_FOR);
			setState(815);
			_la = _input.LA(1);
			if ( !(_la==T_SESSION || _la==T_TRANSACTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_mssql_session_optionContext extends ParserRuleContext {
		public TerminalNode T_ANSI_NULLS() { return getToken(gParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(gParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(gParser.T_NOCOUNT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(gParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(gParser.T_XACT_ABORT, 0); }
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public TerminalNode T_OFF() { return getToken(gParser.T_OFF, 0); }
		public Set_mssql_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_mssql_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSet_mssql_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSet_mssql_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSet_mssql_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_mssql_session_optionContext set_mssql_session_option() throws RecognitionException {
		Set_mssql_session_optionContext _localctx = new Set_mssql_session_optionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_set_mssql_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			_la = _input.LA(1);
			if ( !(_la==T_ANSI_NULLS || _la==T_ANSI_PADDING || _la==T_NOCOUNT || _la==T_QUOTED_IDENTIFIER || _la==T_XACT_ABORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(818);
			_la = _input.LA(1);
			if ( !(_la==T_OFF || _la==T_ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_transaction_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(gParser.T_BEGIN, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(gParser.T_TRANSACTION, 0); }
		public Begin_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_transaction_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBegin_transaction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBegin_transaction_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBegin_transaction_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_transaction_stmtContext begin_transaction_stmt() throws RecognitionException {
		Begin_transaction_stmtContext _localctx = new Begin_transaction_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_begin_transaction_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(T_BEGIN);
			setState(821);
			match(T_TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode T_BREAK() { return getToken(gParser.T_BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(T_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_stmtContext extends ParserRuleContext {
		public TerminalNode T_CALL() { return getToken(gParser.T_CALL, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(T_CALL);
			setState(826);
			ident();
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(827);
				match(T_OPEN_P);
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(828);
					expr_func_params();
					}
					break;
				}
				setState(831);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(832);
				expr_func_params();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmtContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(gParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(T_DECLARE);
			setState(836);
			declare_stmt_item();
			setState(841);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(837);
					match(T_COMMA);
					setState(838);
					declare_stmt_item();
					}
					} 
				}
				setState(843);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_blockContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(gParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(gParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(gParser.T_SEMICOLON, i);
		}
		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_declare_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(T_DECLARE);
			setState(845);
			declare_stmt_item();
			setState(846);
			match(T_SEMICOLON);
			setState(852);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(847);
					declare_stmt_item();
					setState(848);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(854);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_block_inplaceContext extends ParserRuleContext {
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(gParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(gParser.T_SEMICOLON, i);
		}
		public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block_inplace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_block_inplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_block_inplace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_block_inplace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			declare_stmt_item();
			setState(856);
			match(T_SEMICOLON);
			setState(862);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(857);
					declare_stmt_item();
					setState(858);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmt_itemContext extends ParserRuleContext {
		public Declare_cursor_itemContext declare_cursor_item() {
			return getRuleContext(Declare_cursor_itemContext.class,0);
		}
		public Declare_condition_itemContext declare_condition_item() {
			return getRuleContext(Declare_condition_itemContext.class,0);
		}
		public Declare_handler_itemContext declare_handler_item() {
			return getRuleContext(Declare_handler_itemContext.class,0);
		}
		public Declare_var_itemContext declare_var_item() {
			return getRuleContext(Declare_var_itemContext.class,0);
		}
		public Declare_temporary_table_itemContext declare_temporary_table_item() {
			return getRuleContext(Declare_temporary_table_itemContext.class,0);
		}
		public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_declare_stmt_item);
		try {
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				declare_cursor_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				declare_condition_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(867);
				declare_handler_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(868);
				declare_var_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(869);
				declare_temporary_table_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_var_itemContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_CONSTANT() { return getToken(gParser.T_CONSTANT, 0); }
		public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_var_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_var_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_var_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				ident();
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(873);
					match(T_COMMA);
					setState(874);
					ident();
					}
					}
					setState(879);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(881);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(880);
					match(T_AS);
					}
					break;
				}
				setState(883);
				dtype();
				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(884);
					dtype_len();
					}
					break;
				}
				setState(890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(887);
						dtype_attr();
						}
						} 
					}
					setState(892);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				setState(894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(893);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(896);
				ident();
				setState(897);
				match(T_CONSTANT);
				setState(899);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(898);
					match(T_AS);
					}
					break;
				}
				setState(901);
				dtype();
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(902);
					dtype_len();
					}
				}

				setState(905);
				dtype_default();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_condition_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CONDITION() { return getToken(gParser.T_CONDITION, 0); }
		public Declare_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_condition_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_condition_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_condition_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_condition_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		Declare_condition_itemContext _localctx = new Declare_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			ident();
			setState(910);
			match(T_CONDITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_cursor_itemContext extends ParserRuleContext {
		public TerminalNode T_IS() { return getToken(gParser.T_IS, 0); }
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode T_CURSOR() { return getToken(gParser.T_CURSOR, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cursor_with_returnContext cursor_with_return() {
			return getRuleContext(Cursor_with_returnContext.class,0);
		}
		public Cursor_without_returnContext cursor_without_return() {
			return getRuleContext(Cursor_without_returnContext.class,0);
		}
		public Declare_cursor_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_cursor_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_cursor_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_cursor_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_cursor_itemContext declare_cursor_item() throws RecognitionException {
		Declare_cursor_itemContext _localctx = new Declare_cursor_itemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_declare_cursor_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(912);
				match(T_CURSOR);
				setState(913);
				ident();
				}
				break;
			case 2:
				{
				setState(914);
				ident();
				setState(915);
				match(T_CURSOR);
				}
				break;
			}
			setState(921);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WITH:
				{
				setState(919);
				cursor_with_return();
				}
				break;
			case T_WITHOUT:
				{
				setState(920);
				cursor_without_return();
				}
				break;
			case T_AS:
			case T_FOR:
			case T_IS:
				break;
			default:
				break;
			}
			setState(923);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_FOR || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(924);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(925);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_with_returnContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public TerminalNode T_RETURN() { return getToken(gParser.T_RETURN, 0); }
		public TerminalNode T_ONLY() { return getToken(gParser.T_ONLY, 0); }
		public TerminalNode T_TO() { return getToken(gParser.T_TO, 0); }
		public TerminalNode T_CALLER() { return getToken(gParser.T_CALLER, 0); }
		public TerminalNode T_CLIENT() { return getToken(gParser.T_CLIENT, 0); }
		public Cursor_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCursor_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCursor_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCursor_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_with_returnContext cursor_with_return() throws RecognitionException {
		Cursor_with_returnContext _localctx = new Cursor_with_returnContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_cursor_with_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(T_WITH);
			setState(929);
			match(T_RETURN);
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ONLY) {
				{
				setState(930);
				match(T_ONLY);
				}
			}

			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TO) {
				{
				setState(933);
				match(T_TO);
				setState(934);
				_la = _input.LA(1);
				if ( !(_la==T_CALLER || _la==T_CLIENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_without_returnContext extends ParserRuleContext {
		public TerminalNode T_WITHOUT() { return getToken(gParser.T_WITHOUT, 0); }
		public TerminalNode T_RETURN() { return getToken(gParser.T_RETURN, 0); }
		public Cursor_without_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_without_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCursor_without_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCursor_without_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCursor_without_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_without_returnContext cursor_without_return() throws RecognitionException {
		Cursor_without_returnContext _localctx = new Cursor_without_returnContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_cursor_without_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(T_WITHOUT);
			setState(938);
			match(T_RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_handler_itemContext extends ParserRuleContext {
		public TerminalNode T_HANDLER() { return getToken(gParser.T_HANDLER, 0); }
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_CONTINUE() { return getToken(gParser.T_CONTINUE, 0); }
		public TerminalNode T_EXIT() { return getToken(gParser.T_EXIT, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(gParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(gParser.T_SQLWARNING, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_FOUND() { return getToken(gParser.T_FOUND, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Declare_handler_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_handler_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_handler_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_handler_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_handler_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		Declare_handler_itemContext _localctx = new Declare_handler_itemContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(941);
			match(T_HANDLER);
			setState(942);
			match(T_FOR);
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(943);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2:
				{
				setState(944);
				match(T_SQLWARNING);
				}
				break;
			case 3:
				{
				setState(945);
				match(T_NOT);
				setState(946);
				match(T_FOUND);
				}
				break;
			case 4:
				{
				setState(947);
				ident();
				}
				break;
			}
			setState(950);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_temporary_table_itemContext extends ParserRuleContext {
		public TerminalNode T_TEMPORARY() { return getToken(gParser.T_TEMPORARY, 0); }
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_GLOBAL() { return getToken(gParser.T_GLOBAL, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Declare_temporary_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_temporary_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_temporary_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_temporary_table_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_temporary_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
		Declare_temporary_table_itemContext _localctx = new Declare_temporary_table_itemContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(952);
				match(T_GLOBAL);
				}
			}

			setState(955);
			match(T_TEMPORARY);
			setState(956);
			match(T_TABLE);
			setState(957);
			ident();
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(958);
				create_table_preoptions();
				}
			}

			setState(961);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(gParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(gParser.T_EXISTS, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(T_CREATE);
			setState(964);
			match(T_TABLE);
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(965);
				match(T_IF);
				setState(966);
				match(T_NOT);
				setState(967);
				match(T_EXISTS);
				}
				break;
			}
			setState(970);
			table_name();
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(971);
				create_table_preoptions();
				}
			}

			setState(974);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(gParser.T_LOCAL, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(gParser.T_TEMPORARY, 0); }
		public TerminalNode T_VOLATILE() { return getToken(gParser.T_VOLATILE, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public TerminalNode T_MULTISET() { return getToken(gParser.T_MULTISET, 0); }
		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_local_temp_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_local_temp_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_local_temp_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_local_temp_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(T_CREATE);
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(977);
				match(T_LOCAL);
				setState(978);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(979);
					_la = _input.LA(1);
					if ( !(_la==T_MULTISET || _la==T_SET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(982);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(985);
			match(T_TABLE);
			setState(986);
			ident();
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(987);
				create_table_preoptions();
				}
			}

			setState(990);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_definitionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Create_table_columnsContext create_table_columns() {
			return getRuleContext(Create_table_columnsContext.class,0);
		}
		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(992);
					match(T_AS);
					}
				}

				setState(995);
				match(T_OPEN_P);
				setState(996);
				select_stmt();
				setState(997);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(999);
					match(T_AS);
					}
				}

				setState(1002);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(1003);
				match(T_OPEN_P);
				setState(1004);
				create_table_columns();
				setState(1005);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(1009);
				create_table_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columnsContext extends ParserRuleContext {
		public List<Create_table_columns_itemContext> create_table_columns_item() {
			return getRuleContexts(Create_table_columns_itemContext.class);
		}
		public Create_table_columns_itemContext create_table_columns_item(int i) {
			return getRuleContext(Create_table_columns_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_columns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			create_table_columns_item();
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1013);
				match(T_COMMA);
				setState(1014);
				create_table_columns_item();
				}
				}
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columns_itemContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public List<Create_table_column_inline_consContext> create_table_column_inline_cons() {
			return getRuleContexts(Create_table_column_inline_consContext.class);
		}
		public Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
			return getRuleContext(Create_table_column_inline_consContext.class,i);
		}
		public Create_table_column_consContext create_table_column_cons() {
			return getRuleContext(Create_table_column_consContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(gParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_columns_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_columns_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_columns_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				column_name();
				setState(1021);
				dtype();
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1022);
					dtype_len();
					}
				}

				setState(1028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1025);
						dtype_attr();
						}
						} 
					}
					setState(1030);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T_DEFAULT - 72)) | (1L << (T_ENABLE - 72)) | (1L << (T_IDENTITY - 72)))) != 0) || ((((_la - 182)) & ~0x3f) == 0 && ((1L << (_la - 182)) & ((1L << (T_NOT - 182)) | (1L << (T_NULL - 182)) | (1L << (T_PRIMARY - 182)) | (1L << (T_REFERENCES - 182)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (T_UNIQUE - 286)) | (1L << (T_WITH - 286)) | (1L << (T_COLON - 286)) | (1L << (T_EQUAL - 286)))) != 0)) {
					{
					{
					setState(1031);
					create_table_column_inline_cons();
					}
					}
					setState(1036);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(1037);
					match(T_CONSTRAINT);
					setState(1038);
					ident();
					}
				}

				setState(1041);
				create_table_column_cons();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_inline_consContext extends ParserRuleContext {
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_NULL() { return getToken(gParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_PRIMARY() { return getToken(gParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(gParser.T_KEY, 0); }
		public TerminalNode T_UNIQUE() { return getToken(gParser.T_UNIQUE, 0); }
		public TerminalNode T_REFERENCES() { return getToken(gParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_IDENTITY() { return getToken(gParser.T_IDENTITY, 0); }
		public List<TerminalNode> L_INT() { return getTokens(gParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(gParser.L_INT, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_AUTO_INCREMENT() { return getToken(gParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_ENABLE() { return getToken(gParser.T_ENABLE, 0); }
		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_inline_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_column_inline_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_column_inline_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_column_inline_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(1078);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1047);
					match(T_NOT);
					}
				}

				setState(1050);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1051);
				match(T_PRIMARY);
				setState(1052);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1053);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(1054);
				match(T_REFERENCES);
				setState(1055);
				table_name();
				setState(1056);
				match(T_OPEN_P);
				setState(1057);
				ident();
				setState(1058);
				match(T_CLOSE_P);
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(1059);
					create_table_fk_action();
					}
					}
					setState(1064);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(1065);
				match(T_IDENTITY);
				setState(1066);
				match(T_OPEN_P);
				setState(1067);
				match(L_INT);
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1068);
					match(T_COMMA);
					setState(1069);
					match(L_INT);
					}
					}
					setState(1074);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1075);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1076);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1077);
				match(T_ENABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_consContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(gParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(gParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(gParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(gParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(gParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(gParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(gParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(gParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(gParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(gParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(gParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(gParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(gParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(gParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_column_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_column_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_column_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_create_table_column_cons);
		int _la;
		try {
			setState(1137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				match(T_PRIMARY);
				setState(1081);
				match(T_KEY);
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(1082);
					match(T_CLUSTERED);
					}
				}

				setState(1085);
				match(T_OPEN_P);
				setState(1086);
				ident();
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(1087);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1090);
					match(T_COMMA);
					setState(1091);
					ident();
					setState(1093);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(1092);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(1099);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1100);
				match(T_CLOSE_P);
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(1101);
					match(T_ENABLE);
					}
				}

				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1104);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1107);
				match(T_FOREIGN);
				setState(1108);
				match(T_KEY);
				setState(1109);
				match(T_OPEN_P);
				setState(1110);
				ident();
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1111);
					match(T_COMMA);
					setState(1112);
					ident();
					}
					}
					setState(1117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1118);
				match(T_CLOSE_P);
				setState(1119);
				match(T_REFERENCES);
				setState(1120);
				table_name();
				setState(1121);
				match(T_OPEN_P);
				setState(1122);
				ident();
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1123);
					match(T_COMMA);
					setState(1124);
					ident();
					}
					}
					setState(1129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1130);
				match(T_CLOSE_P);
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(1131);
					create_table_fk_action();
					}
					}
					setState(1136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_fk_actionContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public TerminalNode T_UPDATE() { return getToken(gParser.T_UPDATE, 0); }
		public TerminalNode T_DELETE() { return getToken(gParser.T_DELETE, 0); }
		public TerminalNode T_NO() { return getToken(gParser.T_NO, 0); }
		public TerminalNode T_ACTION() { return getToken(gParser.T_ACTION, 0); }
		public TerminalNode T_RESTRICT() { return getToken(gParser.T_RESTRICT, 0); }
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public TerminalNode T_NULL() { return getToken(gParser.T_NULL, 0); }
		public TerminalNode T_DEFAULT() { return getToken(gParser.T_DEFAULT, 0); }
		public TerminalNode T_CASCADE() { return getToken(gParser.T_CASCADE, 0); }
		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_fk_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_fk_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_fk_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_fk_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(T_ON);
			setState(1140);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1141);
				match(T_NO);
				setState(1142);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(1143);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(1144);
				match(T_SET);
				setState(1145);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(1146);
				match(T_SET);
				setState(1147);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(1148);
				match(T_CASCADE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptionsContext extends ParserRuleContext {
		public List<Create_table_preoptions_itemContext> create_table_preoptions_item() {
			return getRuleContexts(Create_table_preoptions_itemContext.class);
		}
		public Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
			return getRuleContext(Create_table_preoptions_itemContext.class,i);
		}
		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_preoptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_preoptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_preoptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1151);
				create_table_preoptions_item();
				}
				}
				setState(1154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_ROW || _la==T_STORED || _la==T_COMMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_itemContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(gParser.T_COMMA, 0); }
		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
			return getRuleContext(Create_table_preoptions_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_preoptions_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_preoptions_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_preoptions_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_create_table_preoptions_item);
		try {
			setState(1159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				match(T_COMMA);
				setState(1157);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158);
				create_table_options_hive_item();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_td_itemContext extends ParserRuleContext {
		public TerminalNode T_LOG() { return getToken(gParser.T_LOG, 0); }
		public TerminalNode T_FALLBACK() { return getToken(gParser.T_FALLBACK, 0); }
		public TerminalNode T_NO() { return getToken(gParser.T_NO, 0); }
		public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_preoptions_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_preoptions_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_preoptions_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(1161);
				match(T_NO);
				}
			}

			setState(1164);
			_la = _input.LA(1);
			if ( !(_la==T_FALLBACK || _la==T_LOG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_optionsContext extends ParserRuleContext {
		public List<Create_table_options_itemContext> create_table_options_item() {
			return getRuleContexts(Create_table_options_itemContext.class);
		}
		public Create_table_options_itemContext create_table_options_item(int i) {
			return getRuleContext(Create_table_options_itemContext.class,i);
		}
		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1167); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1166);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1169); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public TerminalNode T_COMMIT() { return getToken(gParser.T_COMMIT, 0); }
		public TerminalNode T_ROWS() { return getToken(gParser.T_ROWS, 0); }
		public TerminalNode T_DELETE() { return getToken(gParser.T_DELETE, 0); }
		public TerminalNode T_PRESERVE() { return getToken(gParser.T_PRESERVE, 0); }
		public Create_table_options_ora_itemContext create_table_options_ora_item() {
			return getRuleContext(Create_table_options_ora_itemContext.class,0);
		}
		public Create_table_options_db2_itemContext create_table_options_db2_item() {
			return getRuleContext(Create_table_options_db2_itemContext.class,0);
		}
		public Create_table_options_td_itemContext create_table_options_td_item() {
			return getRuleContext(Create_table_options_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item() {
			return getRuleContext(Create_table_options_mssql_itemContext.class,0);
		}
		public Create_table_options_mysql_itemContext create_table_options_mysql_item() {
			return getRuleContext(Create_table_options_mysql_itemContext.class,0);
		}
		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_create_table_options_item);
		int _la;
		try {
			setState(1181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				match(T_ON);
				setState(1172);
				match(T_COMMIT);
				setState(1173);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1174);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1175);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1176);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1177);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1178);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1179);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1180);
				create_table_options_mysql_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_ora_itemContext extends ParserRuleContext {
		public TerminalNode T_SEGMENT() { return getToken(gParser.T_SEGMENT, 0); }
		public TerminalNode T_CREATION() { return getToken(gParser.T_CREATION, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(gParser.T_IMMEDIATE, 0); }
		public TerminalNode T_DEFERRED() { return getToken(gParser.T_DEFERRED, 0); }
		public List<TerminalNode> L_INT() { return getTokens(gParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(gParser.L_INT, i);
		}
		public TerminalNode T_PCTFREE() { return getToken(gParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(gParser.T_PCTUSED, 0); }
		public TerminalNode T_INITRANS() { return getToken(gParser.T_INITRANS, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(gParser.T_MAXTRANS, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(gParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_LOGGING() { return getToken(gParser.T_LOGGING, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(gParser.T_NOLOGGING, 0); }
		public TerminalNode T_STORAGE() { return getToken(gParser.T_STORAGE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_TABLESPACE() { return getToken(gParser.T_TABLESPACE, 0); }
		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_ora_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_ora_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_ora_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_ora_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(1201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				match(T_SEGMENT);
				setState(1184);
				match(T_CREATION);
				setState(1185);
				_la = _input.LA(1);
				if ( !(_la==T_DEFERRED || _la==T_IMMEDIATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_INITRANS:
			case T_MAXTRANS:
			case T_PCTFREE:
			case T_PCTUSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1187);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1188);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1189);
				_la = _input.LA(1);
				if ( !(_la==T_LOGGING || _la==T_NOLOGGING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1190);
				match(T_STORAGE);
				setState(1191);
				match(T_OPEN_P);
				setState(1194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1194);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WITH:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
					case L_ID:
						{
						setState(1192);
						ident();
						}
						break;
					case L_INT:
						{
						setState(1193);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1196); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_PART_COUNT - 322)) | (1L << (T_PART_LOC - 322)) | (1L << (T_RANK - 322)) | (1L << (T_ROW_NUMBER - 322)) | (1L << (T_STDEV - 322)) | (1L << (T_SYSDATE - 322)) | (1L << (T_VARIANCE - 322)) | (1L << (T_USER - 322)) | (1L << (L_ID - 322)) | (1L << (L_INT - 322)))) != 0) );
				setState(1198);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1199);
				match(T_TABLESPACE);
				setState(1200);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_db2_itemContext extends ParserRuleContext {
		public TerminalNode T_IN() { return getToken(gParser.T_IN, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_INDEX() { return getToken(gParser.T_INDEX, 0); }
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public TerminalNode T_REPLACE() { return getToken(gParser.T_REPLACE, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(gParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_BY() { return getToken(gParser.T_BY, 0); }
		public TerminalNode T_HASH() { return getToken(gParser.T_HASH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_LOGGED() { return getToken(gParser.T_LOGGED, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(gParser.T_COMPRESS, 0); }
		public TerminalNode T_YES() { return getToken(gParser.T_YES, 0); }
		public TerminalNode T_NO() { return getToken(gParser.T_NO, 0); }
		public TerminalNode T_DEFINITION() { return getToken(gParser.T_DEFINITION, 0); }
		public TerminalNode T_ONLY() { return getToken(gParser.T_ONLY, 0); }
		public TerminalNode T_RESTRICT() { return getToken(gParser.T_RESTRICT, 0); }
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public TerminalNode T_DROP() { return getToken(gParser.T_DROP, 0); }
		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_db2_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_db2_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_db2_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_db2_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(1203);
					match(T_INDEX);
					}
				}

				setState(1206);
				match(T_IN);
				setState(1207);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1208);
				match(T_WITH);
				setState(1209);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1210);
				match(T_DISTRIBUTE);
				setState(1211);
				match(T_BY);
				setState(1212);
				match(T_HASH);
				setState(1213);
				match(T_OPEN_P);
				setState(1214);
				ident();
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1215);
					match(T_COMMA);
					setState(1216);
					ident();
					}
					}
					setState(1221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1222);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1224);
					match(T_NOT);
					}
				}

				setState(1227);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1228);
				match(T_COMPRESS);
				setState(1229);
				_la = _input.LA(1);
				if ( !(_la==T_NO || _la==T_YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1230);
				match(T_DEFINITION);
				setState(1231);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1232);
				match(T_WITH);
				setState(1233);
				match(T_RESTRICT);
				setState(1234);
				match(T_ON);
				setState(1235);
				match(T_DROP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_td_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(gParser.T_PRIMARY, 0); }
		public TerminalNode T_INDEX() { return getToken(gParser.T_INDEX, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(gParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public TerminalNode T_DATA() { return getToken(gParser.T_DATA, 0); }
		public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(1256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(1238);
					match(T_UNIQUE);
					}
				}

				setState(1241);
				match(T_PRIMARY);
				setState(1242);
				match(T_INDEX);
				setState(1243);
				match(T_OPEN_P);
				setState(1244);
				ident();
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1245);
					match(T_COMMA);
					setState(1246);
					ident();
					}
					}
					setState(1251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1252);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1254);
				match(T_WITH);
				setState(1255);
				match(T_DATA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_hive_itemContext extends ParserRuleContext {
		public Create_table_hive_row_formatContext create_table_hive_row_format() {
			return getRuleContext(Create_table_hive_row_formatContext.class,0);
		}
		public TerminalNode T_STORED() { return getToken(gParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_hive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_hive_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_hive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_create_table_options_hive_item);
		try {
			setState(1262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1258);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1259);
				match(T_STORED);
				setState(1260);
				match(T_AS);
				setState(1261);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public TerminalNode T_ROW() { return getToken(gParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(gParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(gParser.T_DELIMITED, 0); }
		public List<Create_table_hive_row_format_fieldsContext> create_table_hive_row_format_fields() {
			return getRuleContexts(Create_table_hive_row_format_fieldsContext.class);
		}
		public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields(int i) {
			return getRuleContext(Create_table_hive_row_format_fieldsContext.class,i);
		}
		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_hive_row_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_hive_row_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_hive_row_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_create_table_hive_row_format);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			match(T_ROW);
			setState(1265);
			match(T_FORMAT);
			setState(1266);
			match(T_DELIMITED);
			setState(1270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1267);
					create_table_hive_row_format_fields();
					}
					} 
				}
				setState(1272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
		public TerminalNode T_FIELDS() { return getToken(gParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(gParser.T_TERMINATED, 0); }
		public List<TerminalNode> T_BY() { return getTokens(gParser.T_BY); }
		public TerminalNode T_BY(int i) {
			return getToken(gParser.T_BY, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ESCAPED() { return getToken(gParser.T_ESCAPED, 0); }
		public TerminalNode T_COLLECTION() { return getToken(gParser.T_COLLECTION, 0); }
		public TerminalNode T_ITEMS() { return getToken(gParser.T_ITEMS, 0); }
		public TerminalNode T_MAP() { return getToken(gParser.T_MAP, 0); }
		public TerminalNode T_KEYS() { return getToken(gParser.T_KEYS, 0); }
		public TerminalNode T_LINES() { return getToken(gParser.T_LINES, 0); }
		public TerminalNode T_NULL() { return getToken(gParser.T_NULL, 0); }
		public TerminalNode T_DEFINED() { return getToken(gParser.T_DEFINED, 0); }
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_hive_row_format_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_hive_row_format_fields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_hive_row_format_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_create_table_hive_row_format_fields);
		try {
			setState(1300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1273);
				match(T_FIELDS);
				setState(1274);
				match(T_TERMINATED);
				setState(1275);
				match(T_BY);
				setState(1276);
				expr(0);
				setState(1280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1277);
					match(T_ESCAPED);
					setState(1278);
					match(T_BY);
					setState(1279);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1282);
				match(T_COLLECTION);
				setState(1283);
				match(T_ITEMS);
				setState(1284);
				match(T_TERMINATED);
				setState(1285);
				match(T_BY);
				setState(1286);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1287);
				match(T_MAP);
				setState(1288);
				match(T_KEYS);
				setState(1289);
				match(T_TERMINATED);
				setState(1290);
				match(T_BY);
				setState(1291);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1292);
				match(T_LINES);
				setState(1293);
				match(T_TERMINATED);
				setState(1294);
				match(T_BY);
				setState(1295);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1296);
				match(T_NULL);
				setState(1297);
				match(T_DEFINED);
				setState(1298);
				match(T_AS);
				setState(1299);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(gParser.T_TEXTIMAGE_ON, 0); }
		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mssql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_mssql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_mssql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_mssql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_create_table_options_mssql_item);
		try {
			setState(1306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1302);
				match(T_ON);
				setState(1303);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1304);
				match(T_TEXTIMAGE_ON);
				setState(1305);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
		public TerminalNode T_AUTO_INCREMENT() { return getToken(gParser.T_AUTO_INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public TerminalNode T_COMMENT() { return getToken(gParser.T_COMMENT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(gParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public TerminalNode T_CHARSET() { return getToken(gParser.T_CHARSET, 0); }
		public TerminalNode T_DEFAULT() { return getToken(gParser.T_DEFAULT, 0); }
		public TerminalNode T_ENGINE() { return getToken(gParser.T_ENGINE, 0); }
		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mysql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_table_options_mysql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_table_options_mysql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_table_options_mysql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(1335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1308);
				match(T_AUTO_INCREMENT);
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1309);
					match(T_EQUAL);
					}
				}

				setState(1312);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1313);
				match(T_COMMENT);
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1314);
					match(T_EQUAL);
					}
				}

				setState(1317);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(1318);
					match(T_DEFAULT);
					}
				}

				setState(1324);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(1321);
					match(T_CHARACTER);
					setState(1322);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(1323);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1326);
					match(T_EQUAL);
					}
				}

				setState(1329);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1330);
				match(T_ENGINE);
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1331);
					match(T_EQUAL);
					}
				}

				setState(1334);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(gParser.T_CHAR, 0); }
		public TerminalNode T_BIGINT() { return getToken(gParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(gParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(gParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BINARY_INTEGER() { return getToken(gParser.T_BINARY_INTEGER, 0); }
		public TerminalNode T_BIT() { return getToken(gParser.T_BIT, 0); }
		public TerminalNode T_DATE() { return getToken(gParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(gParser.T_DATETIME, 0); }
		public TerminalNode T_DEC() { return getToken(gParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(gParser.T_DECIMAL, 0); }
		public TerminalNode T_DOUBLE() { return getToken(gParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(gParser.T_PRECISION, 0); }
		public TerminalNode T_FLOAT() { return getToken(gParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(gParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(gParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(gParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(gParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(gParser.T_INTEGER, 0); }
		public TerminalNode T_NCHAR() { return getToken(gParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(gParser.T_NVARCHAR, 0); }
		public TerminalNode T_NUMBER() { return getToken(gParser.T_NUMBER, 0); }
		public TerminalNode T_NUMERIC() { return getToken(gParser.T_NUMERIC, 0); }
		public TerminalNode T_PLS_INTEGER() { return getToken(gParser.T_PLS_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(gParser.T_REAL, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(gParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_VARYING() { return getToken(gParser.T_VARYING, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(gParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(gParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_INTEGER() { return getToken(gParser.T_SIMPLE_INTEGER, 0); }
		public TerminalNode T_SMALLINT() { return getToken(gParser.T_SMALLINT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(gParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_STRING() { return getToken(gParser.T_STRING, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(gParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(gParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TINYINT() { return getToken(gParser.T_TINYINT, 0); }
		public TerminalNode T_VARCHAR() { return getToken(gParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(gParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(gParser.T_XML, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TYPE() { return getToken(gParser.T_TYPE, 0); }
		public TerminalNode T_ROWTYPE() { return getToken(gParser.T_ROWTYPE, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_dtype);
		int _la;
		try {
			setState(1382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1338);
				match(T_BIGINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1339);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1340);
				match(T_BINARY_FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1341);
				match(T_BINARY_INTEGER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1342);
				match(T_BIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1343);
				match(T_DATE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1344);
				match(T_DATETIME);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1345);
				match(T_DEC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1346);
				match(T_DECIMAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1347);
				match(T_DOUBLE);
				setState(1349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1348);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1351);
				match(T_FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1352);
				match(T_INT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1353);
				match(T_INT2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1354);
				match(T_INT4);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1355);
				match(T_INT8);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1356);
				match(T_INTEGER);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1357);
				match(T_NCHAR);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1358);
				match(T_NVARCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1359);
				match(T_NUMBER);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1360);
				match(T_NUMERIC);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1361);
				match(T_PLS_INTEGER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1362);
				match(T_REAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1363);
				match(T_RESULT_SET_LOCATOR);
				setState(1364);
				match(T_VARYING);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1365);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1366);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1367);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1368);
				match(T_SMALLINT);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1369);
				match(T_SMALLDATETIME);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1370);
				match(T_STRING);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1371);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1372);
				match(T_TIMESTAMP);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1373);
				match(T_TINYINT);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1374);
				match(T_VARCHAR);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1375);
				match(T_VARCHAR2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1376);
				match(T_XML);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1377);
				ident();
				setState(1380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1378);
					match(T__2);
					setState(1379);
					_la = _input.LA(1);
					if ( !(_la==T_ROWTYPE || _la==T_TYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_lenContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(gParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(gParser.L_INT, i);
		}
		public TerminalNode T_MAX() { return getToken(gParser.T_MAX, 0); }
		public TerminalNode T_COMMA() { return getToken(gParser.T_COMMA, 0); }
		public TerminalNode T_CHAR() { return getToken(gParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(gParser.T_BYTE, 0); }
		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDtype_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDtype_len(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDtype_len(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			match(T_OPEN_P);
			setState(1385);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1386);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1389);
				match(T_COMMA);
				setState(1390);
				match(L_INT);
				}
			}

			setState(1393);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_attrContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(gParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(gParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CASESPECIFIC() { return getToken(gParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CS() { return getToken(gParser.T_CS, 0); }
		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDtype_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDtype_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDtype_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_dtype_attr);
		int _la;
		try {
			setState(1406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1395);
					match(T_NOT);
					}
				}

				setState(1398);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1399);
				match(T_CHARACTER);
				setState(1400);
				match(T_SET);
				setState(1401);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1402);
					match(T_NOT);
					}
				}

				setState(1405);
				_la = _input.LA(1);
				if ( !(_la==T_CASESPECIFIC || _la==T_CS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_defaultContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(gParser.T_COLON, 0); }
		public TerminalNode T_DEFAULT() { return getToken(gParser.T_DEFAULT, 0); }
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDtype_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDtype_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDtype_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_dtype_default);
		int _la;
		try {
			setState(1420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1408);
					match(T_COLON);
					}
				}

				setState(1411);
				match(T_EQUAL);
				setState(1412);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1413);
					match(T_WITH);
					}
				}

				setState(1416);
				match(T_DEFAULT);
				setState(1418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1417);
					expr(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(gParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(gParser.T_SCHEMA, 0); }
		public TerminalNode T_IF() { return getToken(gParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(gParser.T_EXISTS, 0); }
		public List<Create_database_optionContext> create_database_option() {
			return getRuleContexts(Create_database_optionContext.class);
		}
		public Create_database_optionContext create_database_option(int i) {
			return getRuleContext(Create_database_optionContext.class,i);
		}
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_database_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			match(T_CREATE);
			setState(1423);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1424);
				match(T_IF);
				setState(1425);
				match(T_NOT);
				setState(1426);
				match(T_EXISTS);
				}
				break;
			}
			setState(1429);
			expr(0);
			setState(1433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1430);
					create_database_option();
					}
					} 
				}
				setState(1435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_optionContext extends ParserRuleContext {
		public TerminalNode T_COMMENT() { return getToken(gParser.T_COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_LOCATION() { return getToken(gParser.T_LOCATION, 0); }
		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_database_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_database_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_database_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_create_database_option);
		try {
			setState(1440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1436);
				match(T_COMMENT);
				setState(1437);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1438);
				match(T_LOCATION);
				setState(1439);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_stmtContext extends ParserRuleContext {
		public TerminalNode T_FUNCTION() { return getToken(gParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_ALTER() { return getToken(gParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(gParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(gParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(gParser.T_OR, 0); }
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_function_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1442);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1443);
				match(T_CREATE);
				setState(1446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1444);
					match(T_OR);
					setState(1445);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1448);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
			}
			setState(1451);
			match(T_FUNCTION);
			setState(1452);
			ident();
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1453);
				create_routine_params();
				}
				break;
			}
			setState(1456);
			create_function_return();
			setState(1458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1457);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1460);
				declare_block_inplace();
				}
				break;
			}
			setState(1463);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_returnContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_RETURN() { return getToken(gParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(gParser.T_RETURNS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_function_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_function_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_function_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1466);
			dtype();
			setState(1468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1467);
				dtype_len();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_package_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(gParser.T_PACKAGE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_specContext package_spec() {
			return getRuleContext(Package_specContext.class,0);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(gParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(gParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(gParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(gParser.T_OR, 0); }
		public Missing_semicolonContext missing_semicolon() {
			return getRuleContext(Missing_semicolonContext.class,0);
		}
		public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_package_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_package_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_package_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_create_package_stmt);
		int _la;
		try {
			setState(1508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1477);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ALTER:
					{
					setState(1470);
					match(T_ALTER);
					}
					break;
				case T_CREATE:
					{
					setState(1471);
					match(T_CREATE);
					setState(1474);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_OR) {
						{
						setState(1472);
						match(T_OR);
						setState(1473);
						match(T_REPLACE);
						}
					}

					}
					break;
				case T_REPLACE:
					{
					setState(1476);
					match(T_REPLACE);
					}
					break;
				case T_PACKAGE:
					break;
				default:
					break;
				}
				setState(1479);
				match(T_PACKAGE);
				setState(1480);
				ident();
				setState(1481);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1482);
				package_spec();
				setState(1483);
				match(T_END);
				setState(1487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1484);
					ident();
					setState(1485);
					match(T_SEMICOLON);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1496);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ALTER:
					{
					setState(1489);
					match(T_ALTER);
					}
					break;
				case T_CREATE:
					{
					setState(1490);
					match(T_CREATE);
					setState(1493);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_OR) {
						{
						setState(1491);
						match(T_OR);
						setState(1492);
						match(T_REPLACE);
						}
					}

					}
					break;
				case T_REPLACE:
					{
					setState(1495);
					match(T_REPLACE);
					}
					break;
				case T_PACKAGE:
					break;
				default:
					break;
				}
				setState(1498);
				match(T_PACKAGE);
				setState(1499);
				ident();
				setState(1500);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1501);
				package_spec();
				setState(1502);
				match(T_END);
				setState(1506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1503);
					ident();
					setState(1504);
					missing_semicolon();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_specContext extends ParserRuleContext {
		public List<Package_spec_itemContext> package_spec_item() {
			return getRuleContexts(Package_spec_itemContext.class);
		}
		public Package_spec_itemContext package_spec_item(int i) {
			return getRuleContext(Package_spec_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(gParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(gParser.T_SEMICOLON, i);
		}
		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPackage_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPackage_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPackage_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_package_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			package_spec_item();
			setState(1511);
			match(T_SEMICOLON);
			setState(1517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_PART_COUNT - 322)) | (1L << (T_PART_LOC - 322)) | (1L << (T_RANK - 322)) | (1L << (T_ROW_NUMBER - 322)) | (1L << (T_STDEV - 322)) | (1L << (T_SYSDATE - 322)) | (1L << (T_VARIANCE - 322)) | (1L << (T_USER - 322)) | (1L << (L_ID - 322)))) != 0)) {
				{
				{
				setState(1512);
				package_spec_item();
				setState(1513);
				match(T_SEMICOLON);
				}
				}
				setState(1519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_spec_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public TerminalNode T_FUNCTION() { return getToken(gParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(gParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(gParser.T_PROC, 0); }
		public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPackage_spec_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPackage_spec_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPackage_spec_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_package_spec_item);
		int _la;
		try {
			setState(1533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1520);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1521);
				match(T_FUNCTION);
				setState(1522);
				ident();
				setState(1524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1523);
					create_routine_params();
					}
					break;
				}
				setState(1526);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1528);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1529);
				ident();
				setState(1531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1530);
					create_routine_params();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_package_body_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(gParser.T_PACKAGE, 0); }
		public TerminalNode T_BODY() { return getToken(gParser.T_BODY, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(gParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(gParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(gParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(gParser.T_OR, 0); }
		public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_body_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_package_body_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_package_body_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_package_body_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1535);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1536);
				match(T_CREATE);
				setState(1539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1537);
					match(T_OR);
					setState(1538);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1541);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1544);
			match(T_PACKAGE);
			setState(1545);
			match(T_BODY);
			setState(1546);
			ident();
			setState(1547);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1548);
			package_body();
			setState(1549);
			match(T_END);
			setState(1553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1550);
				ident();
				setState(1551);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_bodyContext extends ParserRuleContext {
		public List<Package_body_itemContext> package_body_item() {
			return getRuleContexts(Package_body_itemContext.class);
		}
		public Package_body_itemContext package_body_item(int i) {
			return getRuleContext(Package_body_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(gParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(gParser.T_SEMICOLON, i);
		}
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPackage_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPackage_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			package_body_item();
			setState(1556);
			match(T_SEMICOLON);
			setState(1562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_PART_COUNT - 322)) | (1L << (T_PART_LOC - 322)) | (1L << (T_RANK - 322)) | (1L << (T_ROW_NUMBER - 322)) | (1L << (T_STDEV - 322)) | (1L << (T_SYSDATE - 322)) | (1L << (T_VARIANCE - 322)) | (1L << (T_USER - 322)) | (1L << (L_ID - 322)))) != 0)) {
				{
				{
				setState(1557);
				package_body_item();
				setState(1558);
				match(T_SEMICOLON);
				}
				}
				setState(1564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_body_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPackage_body_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPackage_body_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPackage_body_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_package_body_item);
		try {
			setState(1568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1565);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1566);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1567);
				create_procedure_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_procedure_stmtContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Proc_blockContext proc_block() {
			return getRuleContext(Proc_blockContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(gParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(gParser.T_PROC, 0); }
		public TerminalNode T_ALTER() { return getToken(gParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(gParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Create_routine_optionsContext create_routine_options() {
			return getRuleContext(Create_routine_optionsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(gParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(gParser.T_OR, 0); }
		public Missing_semicolonContext missing_semicolon() {
			return getRuleContext(Missing_semicolonContext.class,0);
		}
		public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_procedure_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_procedure_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_procedure_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_create_procedure_stmt);
		int _la;
		try {
			setState(1634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1577);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ALTER:
					{
					setState(1570);
					match(T_ALTER);
					}
					break;
				case T_CREATE:
					{
					setState(1571);
					match(T_CREATE);
					setState(1574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_OR) {
						{
						setState(1572);
						match(T_OR);
						setState(1573);
						match(T_REPLACE);
						}
					}

					}
					break;
				case T_REPLACE:
					{
					setState(1576);
					match(T_REPLACE);
					}
					break;
				case T_PROC:
				case T_PROCEDURE:
					break;
				default:
					break;
				}
				setState(1579);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1580);
				ident();
				setState(1582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1581);
					create_routine_params();
					}
					break;
				}
				setState(1585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1584);
					create_routine_options();
					}
					break;
				}
				setState(1588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1587);
					_la = _input.LA(1);
					if ( !(_la==T_AS || _la==T_IS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1590);
					declare_block_inplace();
					}
					break;
				}
				setState(1594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1593);
					label();
					}
					break;
				}
				setState(1596);
				proc_block();
				setState(1600);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1597);
					ident();
					setState(1598);
					match(T_SEMICOLON);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1609);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ALTER:
					{
					setState(1602);
					match(T_ALTER);
					}
					break;
				case T_CREATE:
					{
					setState(1603);
					match(T_CREATE);
					setState(1606);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_OR) {
						{
						setState(1604);
						match(T_OR);
						setState(1605);
						match(T_REPLACE);
						}
					}

					}
					break;
				case T_REPLACE:
					{
					setState(1608);
					match(T_REPLACE);
					}
					break;
				case T_PROC:
				case T_PROCEDURE:
					break;
				default:
					break;
				}
				setState(1611);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1612);
				ident();
				setState(1614);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1613);
					create_routine_params();
					}
					break;
				}
				setState(1617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1616);
					create_routine_options();
					}
					break;
				}
				setState(1620);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1619);
					_la = _input.LA(1);
					if ( !(_la==T_AS || _la==T_IS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1622);
					declare_block_inplace();
					}
					break;
				}
				setState(1626);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1625);
					label();
					}
					break;
				}
				setState(1628);
				proc_block();
				setState(1632);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1629);
					ident();
					setState(1630);
					missing_semicolon();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_paramsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<Create_routine_param_itemContext> create_routine_param_item() {
			return getRuleContexts(Create_routine_param_itemContext.class);
		}
		public Create_routine_param_itemContext create_routine_param_item(int i) {
			return getRuleContext(Create_routine_param_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_routine_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_routine_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_routine_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_create_routine_params);
		int _la;
		try {
			int _alt;
			setState(1658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1636);
				match(T_OPEN_P);
				setState(1637);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1638);
				match(T_OPEN_P);
				setState(1639);
				create_routine_param_item();
				setState(1644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1640);
					match(T_COMMA);
					setState(1641);
					create_routine_param_item();
					}
					}
					setState(1646);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1647);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1649);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1650);
				create_routine_param_item();
				setState(1655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1651);
						match(T_COMMA);
						setState(1652);
						create_routine_param_item();
						}
						} 
					}
					setState(1657);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_param_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_IN() { return getToken(gParser.T_IN, 0); }
		public TerminalNode T_OUT() { return getToken(gParser.T_OUT, 0); }
		public TerminalNode T_INOUT() { return getToken(gParser.T_INOUT, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_param_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_routine_param_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_routine_param_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_routine_param_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_create_routine_param_item);
		try {
			int _alt;
			setState(1702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1660);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1661);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1662);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1663);
					match(T_IN);
					setState(1664);
					match(T_OUT);
					}
					break;
				}
				setState(1667);
				ident();
				setState(1668);
				dtype();
				setState(1670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1669);
					dtype_len();
					}
					break;
				}
				setState(1675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1672);
						dtype_attr();
						}
						} 
					}
					setState(1677);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				}
				setState(1679);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1678);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1681);
				ident();
				setState(1687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1682);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1683);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1684);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1685);
					match(T_IN);
					setState(1686);
					match(T_OUT);
					}
					break;
				}
				setState(1689);
				dtype();
				setState(1691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1690);
					dtype_len();
					}
					break;
				}
				setState(1696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1693);
						dtype_attr();
						}
						} 
					}
					setState(1698);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				}
				setState(1700);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1699);
					dtype_default();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_optionsContext extends ParserRuleContext {
		public List<Create_routine_optionContext> create_routine_option() {
			return getRuleContexts(Create_routine_optionContext.class);
		}
		public Create_routine_optionContext create_routine_option(int i) {
			return getRuleContext(Create_routine_optionContext.class,i);
		}
		public Create_routine_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_routine_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_routine_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_routine_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionsContext create_routine_options() throws RecognitionException {
		Create_routine_optionsContext _localctx = new Create_routine_optionsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_create_routine_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1705); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1704);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1707); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_optionContext extends ParserRuleContext {
		public TerminalNode T_LANGUAGE() { return getToken(gParser.T_LANGUAGE, 0); }
		public TerminalNode T_SQL() { return getToken(gParser.T_SQL, 0); }
		public TerminalNode T_SECURITY() { return getToken(gParser.T_SECURITY, 0); }
		public TerminalNode T_CREATOR() { return getToken(gParser.T_CREATOR, 0); }
		public TerminalNode T_DEFINER() { return getToken(gParser.T_DEFINER, 0); }
		public TerminalNode T_INVOKER() { return getToken(gParser.T_INVOKER, 0); }
		public TerminalNode T_OWNER() { return getToken(gParser.T_OWNER, 0); }
		public TerminalNode T_RESULT() { return getToken(gParser.T_RESULT, 0); }
		public TerminalNode T_SETS() { return getToken(gParser.T_SETS, 0); }
		public TerminalNode L_INT() { return getToken(gParser.L_INT, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(gParser.T_DYNAMIC, 0); }
		public Create_routine_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_routine_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_routine_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_routine_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionContext create_routine_option() throws RecognitionException {
		Create_routine_optionContext _localctx = new Create_routine_optionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_create_routine_option);
		int _la;
		try {
			setState(1720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1709);
				match(T_LANGUAGE);
				setState(1710);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1711);
				match(T_SQL);
				setState(1712);
				match(T_SECURITY);
				setState(1713);
				_la = _input.LA(1);
				if ( !(_la==T_CREATOR || _la==T_DEFINER || _la==T_INVOKER || _la==T_OWNER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_DYNAMIC:
			case T_RESULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1714);
					match(T_DYNAMIC);
					}
				}

				setState(1717);
				match(T_RESULT);
				setState(1718);
				match(T_SETS);
				setState(1719);
				match(L_INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public If_cpp_stmtContext if_cpp_stmt() {
			return getRuleContext(If_cpp_stmtContext.class,0);
		}
		public If_plsql_stmtContext if_plsql_stmt() {
			return getRuleContext(If_plsql_stmtContext.class,0);
		}
		public If_tsql_stmtContext if_tsql_stmt() {
			return getRuleContext(If_tsql_stmtContext.class,0);
		}
		public If_bteq_stmtContext if_bteq_stmt() {
			return getRuleContext(If_bteq_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_if_stmt);
		try {
			setState(1726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1722);
				if_cpp_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1723);
				if_plsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1724);
				if_tsql_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1725);
				if_bteq_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_plsql_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_IF() { return getTokens(gParser.T_IF); }
		public TerminalNode T_IF(int i) {
			return getToken(gParser.T_IF, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(gParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public List<Elseif_blockContext> elseif_block() {
			return getRuleContexts(Elseif_blockContext.class);
		}
		public Elseif_blockContext elseif_block(int i) {
			return getRuleContext(Elseif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_plsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIf_plsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIf_plsql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIf_plsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			match(T_IF);
			setState(1729);
			bool_expr(0);
			setState(1730);
			match(T_THEN);
			setState(1731);
			block();
			setState(1735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1732);
				elseif_block();
				}
				}
				setState(1737);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1738);
				else_block();
				}
			}

			setState(1741);
			match(T_END);
			setState(1742);
			match(T_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_tsql_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(gParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Single_block_stmtContext> single_block_stmt() {
			return getRuleContexts(Single_block_stmtContext.class);
		}
		public Single_block_stmtContext single_block_stmt(int i) {
			return getRuleContext(Single_block_stmtContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(gParser.T_ELSE, 0); }
		public If_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIf_tsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIf_tsql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIf_tsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			match(T_IF);
			setState(1745);
			bool_expr(0);
			setState(1746);
			single_block_stmt();
			setState(1749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1747);
				match(T_ELSE);
				setState(1748);
				single_block_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bteq_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(gParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(gParser.T_THEN, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public If_bteq_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_bteq_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIf_bteq_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIf_bteq_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIf_bteq_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			match(T__3);
			setState(1752);
			match(T_IF);
			setState(1753);
			bool_expr(0);
			setState(1754);
			match(T_THEN);
			setState(1755);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elseif_blockContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(gParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_ELSIF() { return getToken(gParser.T_ELSIF, 0); }
		public TerminalNode T_ELSEIF() { return getToken(gParser.T_ELSEIF, 0); }
		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElseif_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElseif_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElseif_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1758);
			bool_expr(0);
			setState(1759);
			match(T_THEN);
			setState(1760);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(gParser.T_ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			match(T_ELSE);
			setState(1763);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exit_stmtContext extends ParserRuleContext {
		public TerminalNode T_EXIT() { return getToken(gParser.T_EXIT, 0); }
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public TerminalNode T_WHEN() { return getToken(gParser.T_WHEN, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Exit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1765);
			match(T_EXIT);
			setState(1767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1766);
				match(L_ID);
				}
				break;
			}
			setState(1771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1769);
				match(T_WHEN);
				setState(1770);
				bool_expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Open_stmtContext extends ParserRuleContext {
		public TerminalNode T_OPEN() { return getToken(gParser.T_OPEN, 0); }
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Open_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOpen_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOpen_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOpen_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_stmtContext open_stmt() throws RecognitionException {
		Open_stmtContext _localctx = new Open_stmtContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_open_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			match(T_OPEN);
			setState(1774);
			match(L_ID);
			setState(1780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1775);
				match(T_FOR);
				setState(1778);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1776);
					select_stmt();
					}
					break;
				case 2:
					{
					setState(1777);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_stmtContext extends ParserRuleContext {
		public TerminalNode T_CLOSE() { return getToken(gParser.T_CLOSE, 0); }
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public Close_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterClose_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitClose_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitClose_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_stmtContext close_stmt() throws RecognitionException {
		Close_stmtContext _localctx = new Close_stmtContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_close_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			match(T_CLOSE);
			setState(1783);
			match(L_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmp_stmtContext extends ParserRuleContext {
		public TerminalNode T_CMP() { return getToken(gParser.T_CMP, 0); }
		public List<Cmp_sourceContext> cmp_source() {
			return getRuleContexts(Cmp_sourceContext.class);
		}
		public Cmp_sourceContext cmp_source(int i) {
			return getRuleContext(Cmp_sourceContext.class,i);
		}
		public TerminalNode T_COMMA() { return getToken(gParser.T_COMMA, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(gParser.T_ROW_COUNT, 0); }
		public TerminalNode T_SUM() { return getToken(gParser.T_SUM, 0); }
		public Cmp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCmp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCmp_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCmp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_stmtContext cmp_stmt() throws RecognitionException {
		Cmp_stmtContext _localctx = new Cmp_stmtContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_cmp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			match(T_CMP);
			setState(1786);
			_la = _input.LA(1);
			if ( !(_la==T_ROW_COUNT || _la==T_SUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1787);
			cmp_source();
			setState(1788);
			match(T_COMMA);
			setState(1789);
			cmp_source();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmp_sourceContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_AT() { return getToken(gParser.T_AT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Cmp_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCmp_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCmp_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCmp_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_sourceContext cmp_source() throws RecognitionException {
		Cmp_sourceContext _localctx = new Cmp_sourceContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_cmp_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				{
				setState(1791);
				table_name();
				setState(1793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1792);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(1795);
				match(T_OPEN_P);
				setState(1796);
				select_stmt();
				setState(1797);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1801);
				match(T_AT);
				setState(1802);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_INDEX() { return getToken(gParser.T_INDEX, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<Create_index_colContext> create_index_col() {
			return getRuleContexts(Create_index_colContext.class);
		}
		public Create_index_colContext create_index_col(int i) {
			return getRuleContext(Create_index_colContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(gParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			match(T_CREATE);
			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1806);
				match(T_UNIQUE);
				}
			}

			setState(1809);
			match(T_INDEX);
			setState(1810);
			ident();
			setState(1811);
			match(T_ON);
			setState(1812);
			table_name();
			setState(1813);
			match(T_OPEN_P);
			setState(1814);
			create_index_col();
			setState(1819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1815);
				match(T_COMMA);
				setState(1816);
				create_index_col();
				}
				}
				setState(1821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1822);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_colContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ASC() { return getToken(gParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(gParser.T_DESC, 0); }
		public Create_index_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCreate_index_col(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCreate_index_col(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCreate_index_col(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			ident();
			setState(1826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(1825);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_storage_clauseContext extends ParserRuleContext {
		public Index_mssql_storage_clauseContext index_mssql_storage_clause() {
			return getRuleContext(Index_mssql_storage_clauseContext.class,0);
		}
		public Index_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIndex_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIndex_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIndex_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		Index_storage_clauseContext _localctx = new Index_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			index_mssql_storage_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_mssql_storage_clauseContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(gParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(gParser.T_EQUAL, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public List<Create_table_options_mssql_itemContext> create_table_options_mssql_item() {
			return getRuleContexts(Create_table_options_mssql_itemContext.class);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item(int i) {
			return getRuleContext(Create_table_options_mssql_itemContext.class,i);
		}
		public Index_mssql_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_mssql_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIndex_mssql_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIndex_mssql_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIndex_mssql_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		Index_mssql_storage_clauseContext _localctx = new Index_mssql_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_index_mssql_storage_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			match(T_WITH);
			setState(1831);
			match(T_OPEN_P);
			setState(1832);
			ident();
			setState(1833);
			match(T_EQUAL);
			setState(1834);
			ident();
			setState(1842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1835);
				match(T_COMMA);
				setState(1836);
				ident();
				setState(1837);
				match(T_EQUAL);
				setState(1838);
				ident();
				}
				}
				setState(1844);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1845);
			match(T_CLOSE_P);
			setState(1849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ON || _la==T_TEXTIMAGE_ON) {
				{
				{
				setState(1846);
				create_table_options_mssql_item();
				}
				}
				setState(1851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode T_RETURN() { return getToken(gParser.T_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			match(T_RETURN);
			setState(1854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1853);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Values_into_stmtContext extends ParserRuleContext {
		public TerminalNode T_VALUES() { return getToken(gParser.T_VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_INTO() { return getToken(gParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_OPEN_P() { return getTokens(gParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(gParser.T_OPEN_P, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(gParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(gParser.T_CLOSE_P, i);
		}
		public Values_into_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_into_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterValues_into_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitValues_into_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitValues_into_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Values_into_stmtContext values_into_stmt() throws RecognitionException {
		Values_into_stmtContext _localctx = new Values_into_stmtContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_values_into_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
			match(T_VALUES);
			setState(1858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1857);
				match(T_OPEN_P);
				}
				break;
			}
			setState(1860);
			expr(0);
			setState(1865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1861);
				match(T_COMMA);
				setState(1862);
				expr(0);
				}
				}
				setState(1867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(1868);
				match(T_CLOSE_P);
				}
			}

			setState(1871);
			match(T_INTO);
			setState(1873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1872);
				match(T_OPEN_P);
				}
			}

			setState(1875);
			ident();
			setState(1880);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1876);
					match(T_COMMA);
					setState(1877);
					ident();
					}
					} 
				}
				setState(1882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			setState(1884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1883);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(gParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_LOOP() { return getTokens(gParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(gParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public For_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cursor_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFor_cursor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFor_cursor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFor_cursor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cursor_stmtContext for_cursor_stmt() throws RecognitionException {
		For_cursor_stmtContext _localctx = new For_cursor_stmtContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_for_cursor_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			match(T_FOR);
			setState(1887);
			match(L_ID);
			setState(1888);
			match(T_IN);
			setState(1890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1889);
				match(T_OPEN_P);
				}
				break;
			}
			setState(1892);
			select_stmt();
			setState(1894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(1893);
				match(T_CLOSE_P);
				}
			}

			setState(1896);
			match(T_LOOP);
			setState(1897);
			block();
			setState(1898);
			match(T_END);
			setState(1899);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_range_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(gParser.T_IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_DOT2() { return getToken(gParser.T_DOT2, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(gParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(gParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public TerminalNode T_REVERSE() { return getToken(gParser.T_REVERSE, 0); }
		public TerminalNode T_BY() { return getToken(gParser.T_BY, 0); }
		public TerminalNode T_STEP() { return getToken(gParser.T_STEP, 0); }
		public For_range_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFor_range_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFor_range_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFor_range_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			match(T_FOR);
			setState(1902);
			match(L_ID);
			setState(1903);
			match(T_IN);
			setState(1905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1904);
				match(T_REVERSE);
				}
				break;
			}
			setState(1907);
			expr(0);
			setState(1908);
			match(T_DOT2);
			setState(1909);
			expr(0);
			setState(1912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(1910);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1911);
				expr(0);
				}
			}

			setState(1914);
			match(T_LOOP);
			setState(1915);
			block();
			setState(1916);
			match(T_END);
			setState(1917);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode L_LABEL() { return getToken(gParser.L_LABEL, 0); }
		public List<TerminalNode> T_LESS() { return getTokens(gParser.T_LESS); }
		public TerminalNode T_LESS(int i) {
			return getToken(gParser.T_LESS, i);
		}
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public List<TerminalNode> T_GREATER() { return getTokens(gParser.T_GREATER); }
		public TerminalNode T_GREATER(int i) {
			return getToken(gParser.T_GREATER, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_label);
		try {
			setState(1925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1919);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1920);
				match(T_LESS);
				setState(1921);
				match(T_LESS);
				setState(1922);
				match(L_ID);
				setState(1923);
				match(T_GREATER);
				setState(1924);
				match(T_GREATER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public Cte_select_stmtContext cte_select_stmt() {
			return getRuleContext(Cte_select_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(1927);
				cte_select_stmt();
				}
			}

			setState(1930);
			fullselect_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public List<Cte_select_stmt_itemContext> cte_select_stmt_item() {
			return getRuleContexts(Cte_select_stmt_itemContext.class);
		}
		public Cte_select_stmt_itemContext cte_select_stmt_item(int i) {
			return getRuleContext(Cte_select_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Cte_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCte_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCte_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCte_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		Cte_select_stmtContext _localctx = new Cte_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
			match(T_WITH);
			setState(1933);
			cte_select_stmt_item();
			setState(1938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1934);
				match(T_COMMA);
				setState(1935);
				cte_select_stmt_item();
				}
				}
				setState(1940);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmt_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Cte_select_colsContext cte_select_cols() {
			return getRuleContext(Cte_select_colsContext.class,0);
		}
		public Cte_select_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCte_select_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCte_select_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCte_select_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		Cte_select_stmt_itemContext _localctx = new Cte_select_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			ident();
			setState(1943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1942);
				cte_select_cols();
				}
			}

			setState(1945);
			match(T_AS);
			setState(1946);
			match(T_OPEN_P);
			setState(1947);
			fullselect_stmt();
			setState(1948);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Cte_select_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCte_select_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCte_select_cols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCte_select_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_colsContext cte_select_cols() throws RecognitionException {
		Cte_select_colsContext _localctx = new Cte_select_colsContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1950);
			match(T_OPEN_P);
			setState(1951);
			ident();
			setState(1956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1952);
				match(T_COMMA);
				setState(1953);
				ident();
				}
				}
				setState(1958);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1959);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmtContext extends ParserRuleContext {
		public List<Fullselect_stmt_itemContext> fullselect_stmt_item() {
			return getRuleContexts(Fullselect_stmt_itemContext.class);
		}
		public Fullselect_stmt_itemContext fullselect_stmt_item(int i) {
			return getRuleContext(Fullselect_stmt_itemContext.class,i);
		}
		public List<Fullselect_set_clauseContext> fullselect_set_clause() {
			return getRuleContexts(Fullselect_set_clauseContext.class);
		}
		public Fullselect_set_clauseContext fullselect_set_clause(int i) {
			return getRuleContext(Fullselect_set_clauseContext.class,i);
		}
		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFullselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFullselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFullselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1961);
			fullselect_stmt_item();
			setState(1967);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1962);
					fullselect_set_clause();
					setState(1963);
					fullselect_stmt_item();
					}
					} 
				}
				setState(1969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmt_itemContext extends ParserRuleContext {
		public Subselect_stmtContext subselect_stmt() {
			return getRuleContext(Subselect_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFullselect_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFullselect_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFullselect_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_fullselect_stmt_item);
		try {
			setState(1975);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1970);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1971);
				match(T_OPEN_P);
				setState(1972);
				fullselect_stmt();
				setState(1973);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_set_clauseContext extends ParserRuleContext {
		public TerminalNode T_UNION() { return getToken(gParser.T_UNION, 0); }
		public TerminalNode T_ALL() { return getToken(gParser.T_ALL, 0); }
		public TerminalNode T_EXCEPT() { return getToken(gParser.T_EXCEPT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(gParser.T_INTERSECT, 0); }
		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFullselect_set_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFullselect_set_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFullselect_set_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(1989);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1977);
				match(T_UNION);
				setState(1979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1978);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1981);
				match(T_EXCEPT);
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1982);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1985);
				match(T_INTERSECT);
				setState(1987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1986);
					match(T_ALL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subselect_stmtContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode T_SELECT() { return getToken(gParser.T_SELECT, 0); }
		public TerminalNode T_SEL() { return getToken(gParser.T_SEL, 0); }
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSubselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSubselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSubselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1991);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1992);
			select_list();
			setState(1994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1993);
				into_clause();
				}
				break;
			}
			setState(1997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(1996);
				from_clause();
				}
				break;
			}
			setState(2000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(1999);
				where_clause();
				}
				break;
			}
			setState(2003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(2002);
				group_by_clause();
				}
				break;
			}
			setState(2007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2005);
				having_clause();
				}
				break;
			case 2:
				{
				setState(2006);
				qualify_clause();
				}
				break;
			}
			setState(2010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(2009);
				order_by_clause();
				}
				break;
			}
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(2012);
				select_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_itemContext> select_list_item() {
			return getRuleContexts(Select_list_itemContext.class);
		}
		public Select_list_itemContext select_list_item(int i) {
			return getRuleContext(Select_list_itemContext.class,i);
		}
		public Select_list_setContext select_list_set() {
			return getRuleContext(Select_list_setContext.class,0);
		}
		public Select_list_limitContext select_list_limit() {
			return getRuleContext(Select_list_limitContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(2015);
				select_list_set();
				}
				break;
			}
			setState(2019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2018);
				select_list_limit();
				}
				break;
			}
			setState(2021);
			select_list_item();
			setState(2026);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2022);
					match(T_COMMA);
					setState(2023);
					select_list_item();
					}
					} 
				}
				setState(2028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Missing_comaContext extends ParserRuleContext {
		public Missing_comaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missing_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMissing_coma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMissing_coma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMissing_coma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Missing_comaContext missing_coma() throws RecognitionException {
		Missing_comaContext _localctx = new Missing_comaContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_missing_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_setContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(gParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(gParser.T_DISTINCT, 0); }
		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_list_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_list_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_list_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_limitContext extends ParserRuleContext {
		public TerminalNode T_TOP() { return getToken(gParser.T_TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_list_limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_list_limit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_list_limit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2033);
			match(T_TOP);
			setState(2034);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_itemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_asteriskContext select_list_asterisk() {
			return getRuleContext(Select_list_asteriskContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(2039);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(2036);
					ident();
					setState(2037);
					match(T_EQUAL);
					}
					break;
				}
				setState(2041);
				expr(0);
				setState(2043);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(2042);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(2045);
				select_list_asterisk();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_TITLE() { return getToken(gParser.T_TITLE, 0); }
		public TerminalNode L_S_STRING() { return getToken(gParser.L_S_STRING, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_list_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_list_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_list_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_select_list_alias);
		try {
			setState(2057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2048);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(2050);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(2049);
					match(T_AS);
					}
					break;
				}
				setState(2052);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2053);
				match(T_OPEN_P);
				setState(2054);
				match(T_TITLE);
				setState(2055);
				match(L_S_STRING);
				setState(2056);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_asteriskContext extends ParserRuleContext {
		public TerminalNode L_ID() { return getToken(gParser.L_ID, 0); }
		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_list_asterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_list_asterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_list_asterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(2059);
				match(L_ID);
				setState(2060);
				match(T__3);
				}
			}

			setState(2063);
			match(T_MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() { return getToken(gParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInto_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInto_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInto_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2065);
			match(T_INTO);
			setState(2066);
			ident();
			setState(2071);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2067);
					match(T_COMMA);
					setState(2068);
					ident();
					}
					} 
				}
				setState(2073);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode T_FROM() { return getToken(gParser.T_FROM, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public List<From_join_clauseContext> from_join_clause() {
			return getRuleContexts(From_join_clauseContext.class);
		}
		public From_join_clauseContext from_join_clause(int i) {
			return getRuleContext(From_join_clauseContext.class,i);
		}
		public Syntax_errorContext syntax_error() {
			return getRuleContext(Syntax_errorContext.class,0);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_from_clause);
		try {
			int _alt;
			setState(2090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2074);
				match(T_FROM);
				setState(2075);
				from_table_clause();
				setState(2079);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2076);
						from_join_clause();
						}
						} 
					}
					setState(2081);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2082);
				syntax_error();
				setState(2083);
				from_table_clause();
				setState(2087);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2084);
						from_join_clause();
						}
						} 
					}
					setState(2089);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Syntax_errorContext extends ParserRuleContext {
		public Syntax_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSyntax_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSyntax_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSyntax_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syntax_errorContext syntax_error() throws RecognitionException {
		Syntax_errorContext _localctx = new Syntax_errorContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_syntax_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_clauseContext extends ParserRuleContext {
		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class,0);
		}
		public From_subselect_clauseContext from_subselect_clause() {
			return getRuleContext(From_subselect_clauseContext.class,0);
		}
		public From_table_values_clauseContext from_table_values_clause() {
			return getRuleContext(From_table_values_clauseContext.class,0);
		}
		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_table_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_table_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_table_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_from_table_clause);
		try {
			setState(2097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2094);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2095);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2096);
				from_table_values_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_name_clauseContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_name_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_table_name_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_table_name_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_table_name_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2099);
			table_name();
			setState(2101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(2100);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_subselect_clauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_subselect_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_subselect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_subselect_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_subselect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2103);
			match(T_OPEN_P);
			setState(2104);
			select_stmt();
			setState(2105);
			match(T_CLOSE_P);
			setState(2107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(2106);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_clauseContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(gParser.T_COMMA, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public From_join_type_clauseContext from_join_type_clause() {
			return getRuleContext(From_join_type_clauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_join_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_from_join_clause);
		try {
			setState(2116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2109);
				match(T_COMMA);
				setState(2110);
				from_table_clause();
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2111);
				from_join_type_clause();
				setState(2112);
				from_table_clause();
				setState(2113);
				match(T_ON);
				setState(2114);
				bool_expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_type_clauseContext extends ParserRuleContext {
		public TerminalNode T_JOIN() { return getToken(gParser.T_JOIN, 0); }
		public TerminalNode T_INNER() { return getToken(gParser.T_INNER, 0); }
		public TerminalNode T_LEFT() { return getToken(gParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(gParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(gParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(gParser.T_OUTER, 0); }
		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_type_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_join_type_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_join_type_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_join_type_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_from_join_type_clause);
		int _la;
		try {
			setState(2127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(2118);
					match(T_INNER);
					}
				}

				setState(2121);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2122);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(2123);
					match(T_OUTER);
					}
				}

				setState(2126);
				match(T_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_clauseContext extends ParserRuleContext {
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_VALUES() { return getToken(gParser.T_VALUES, 0); }
		public List<From_table_values_rowContext> from_table_values_row() {
			return getRuleContexts(From_table_values_rowContext.class);
		}
		public From_table_values_rowContext from_table_values_row(int i) {
			return getRuleContext(From_table_values_rowContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_table_values_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_table_values_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_table_values_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2129);
			match(T_TABLE);
			setState(2130);
			match(T_OPEN_P);
			setState(2131);
			match(T_VALUES);
			setState(2132);
			from_table_values_row();
			setState(2137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2133);
				match(T_COMMA);
				setState(2134);
				from_table_values_row();
				}
				}
				setState(2139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2140);
			match(T_CLOSE_P);
			setState(2142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(2141);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_rowContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_table_values_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_table_values_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_table_values_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_from_table_values_row);
		int _la;
		try {
			setState(2156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2144);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2145);
				match(T_OPEN_P);
				setState(2146);
				expr(0);
				setState(2151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2147);
					match(T_COMMA);
					setState(2148);
					expr(0);
					}
					}
					setState(2153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2154);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_alias_clauseContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<TerminalNode> L_ID() { return getTokens(gParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(gParser.L_ID, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_alias_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFrom_alias_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFrom_alias_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFrom_alias_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2158);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(2160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2159);
				match(T_AS);
				}
				break;
			}
			setState(2162);
			ident();
			setState(2173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(2163);
				match(T_OPEN_P);
				setState(2164);
				match(L_ID);
				setState(2169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2165);
					match(T_COMMA);
					setState(2166);
					match(L_ID);
					}
					}
					setState(2171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2172);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2175);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode T_WHERE() { return getToken(gParser.T_WHERE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2177);
			match(T_WHERE);
			setState(2178);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_GROUP() { return getToken(gParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(gParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitGroup_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitGroup_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2180);
			match(T_GROUP);
			setState(2181);
			match(T_BY);
			setState(2182);
			expr(0);
			setState(2187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2183);
					match(T_COMMA);
					setState(2184);
					expr(0);
					}
					} 
				}
				setState(2189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode T_HAVING() { return getToken(gParser.T_HAVING, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitHaving_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			match(T_HAVING);
			setState(2191);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualify_clauseContext extends ParserRuleContext {
		public TerminalNode T_QUALIFY() { return getToken(gParser.T_QUALIFY, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualify_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterQualify_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitQualify_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitQualify_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193);
			match(T_QUALIFY);
			setState(2194);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_ORDER() { return getToken(gParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(gParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public List<TerminalNode> T_ASC() { return getTokens(gParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(gParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(gParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(gParser.T_DESC, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOrder_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2196);
			match(T_ORDER);
			setState(2197);
			match(T_BY);
			setState(2198);
			expr(0);
			setState(2200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2199);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(2209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2202);
					match(T_COMMA);
					setState(2203);
					expr(0);
					setState(2205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
					case 1:
						{
						setState(2204);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(2211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_optionsContext extends ParserRuleContext {
		public List<Select_options_itemContext> select_options_item() {
			return getRuleContexts(Select_options_itemContext.class);
		}
		public Select_options_itemContext select_options_item(int i) {
			return getRuleContext(Select_options_itemContext.class,i);
		}
		public Select_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2213); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2212);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2215); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_options_itemContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() { return getToken(gParser.T_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public TerminalNode T_RR() { return getToken(gParser.T_RR, 0); }
		public TerminalNode T_RS() { return getToken(gParser.T_RS, 0); }
		public TerminalNode T_CS() { return getToken(gParser.T_CS, 0); }
		public TerminalNode T_UR() { return getToken(gParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(gParser.T_USE, 0); }
		public TerminalNode T_AND() { return getToken(gParser.T_AND, 0); }
		public TerminalNode T_KEEP() { return getToken(gParser.T_KEEP, 0); }
		public TerminalNode T_LOCKS() { return getToken(gParser.T_LOCKS, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(gParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_UPDATE() { return getToken(gParser.T_UPDATE, 0); }
		public TerminalNode T_SHARE() { return getToken(gParser.T_SHARE, 0); }
		public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelect_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelect_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelect_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_select_options_item);
		int _la;
		try {
			setState(2228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2217);
				match(T_LIMIT);
				setState(2218);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2219);
				match(T_WITH);
				setState(2220);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 234)) & ~0x3f) == 0 && ((1L << (_la - 234)) & ((1L << (T_RR - 234)) | (1L << (T_RS - 234)) | (1L << (T_UR - 234)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2221);
					match(T_USE);
					setState(2222);
					match(T_AND);
					setState(2223);
					match(T_KEEP);
					setState(2224);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2225);
					match(T_LOCKS);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public Bool_expr_atomContext bool_expr_atom() {
			return getRuleContext(Bool_expr_atomContext.class,0);
		}
		public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return getRuleContext(Bool_expr_logical_operatorContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 292;
		enterRecursionRule(_localctx, 292, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2231);
					match(T_NOT);
					}
				}

				setState(2234);
				match(T_OPEN_P);
				setState(2235);
				bool_expr(0);
				setState(2236);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2238);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(2241);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(2242);
					bool_expr_logical_operator();
					setState(2243);
					bool_expr(3);
					}
					} 
				}
				setState(2249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_expr_atomContext extends ParserRuleContext {
		public Bool_expr_unaryContext bool_expr_unary() {
			return getRuleContext(Bool_expr_unaryContext.class,0);
		}
		public Bool_expr_binaryContext bool_expr_binary() {
			return getRuleContext(Bool_expr_binaryContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_bool_expr_atom);
		try {
			setState(2253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2250);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2251);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2252);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_unaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IS() { return getToken(gParser.T_IS, 0); }
		public TerminalNode T_NULL() { return getToken(gParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_BETWEEN() { return getToken(gParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(gParser.T_AND, 0); }
		public TerminalNode T_EXISTS() { return getToken(gParser.T_EXISTS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Bool_expr_single_inContext bool_expr_single_in() {
			return getRuleContext(Bool_expr_single_inContext.class,0);
		}
		public Bool_expr_multi_inContext bool_expr_multi_in() {
			return getRuleContext(Bool_expr_multi_inContext.class,0);
		}
		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_bool_expr_unary);
		int _la;
		try {
			setState(2278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2255);
				expr(0);
				setState(2256);
				match(T_IS);
				setState(2258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2257);
					match(T_NOT);
					}
				}

				setState(2260);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2262);
				expr(0);
				setState(2263);
				match(T_BETWEEN);
				setState(2264);
				expr(0);
				setState(2265);
				match(T_AND);
				setState(2266);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2268);
					match(T_NOT);
					}
				}

				setState(2271);
				match(T_EXISTS);
				setState(2272);
				match(T_OPEN_P);
				setState(2273);
				select_stmt();
				setState(2274);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2276);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2277);
				bool_expr_multi_in();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IN() { return getToken(gParser.T_IN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_single_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr_single_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr_single_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr_single_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2280);
			expr(0);
			setState(2282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2281);
				match(T_NOT);
				}
			}

			setState(2284);
			match(T_IN);
			setState(2285);
			match(T_OPEN_P);
			setState(2295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				{
				setState(2286);
				expr(0);
				setState(2291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2287);
					match(T_COMMA);
					setState(2288);
					expr(0);
					}
					}
					setState(2293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(2294);
				select_stmt();
				}
				break;
			}
			setState(2297);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_multi_inContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(gParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(gParser.T_OPEN_P, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(gParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(gParser.T_CLOSE_P, i);
		}
		public TerminalNode T_IN() { return getToken(gParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_multi_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr_multi_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr_multi_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr_multi_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2299);
			match(T_OPEN_P);
			setState(2300);
			expr(0);
			setState(2305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2301);
				match(T_COMMA);
				setState(2302);
				expr(0);
				}
				}
				setState(2307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2308);
			match(T_CLOSE_P);
			setState(2310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2309);
				match(T_NOT);
				}
			}

			setState(2312);
			match(T_IN);
			setState(2313);
			match(T_OPEN_P);
			setState(2314);
			select_stmt();
			setState(2315);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr_binary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2317);
			expr(0);
			setState(2318);
			bool_expr_binary_operator();
			setState(2319);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
		public TerminalNode T_AND() { return getToken(gParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(gParser.T_OR, 0); }
		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr_logical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr_logical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr_logical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2321);
			_la = _input.LA(1);
			if ( !(_la==T_AND || _la==T_OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public TerminalNode T_EQUAL2() { return getToken(gParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(gParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(gParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(gParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(gParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(gParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(gParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LIKE() { return getToken(gParser.T_LIKE, 0); }
		public TerminalNode T_RLIKE() { return getToken(gParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(gParser.T_REGEXP, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public Logical_errorContext logical_error() {
			return getRuleContext(Logical_errorContext.class,0);
		}
		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_expr_binary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_expr_binary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_expr_binary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2323);
				match(T_EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2324);
				match(T_EQUAL2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2325);
				match(T_NOTEQUAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2326);
				match(T_NOTEQUAL2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2327);
				match(T_LESS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2328);
				match(T_LESSEQUAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2329);
				match(T_GREATER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2330);
				match(T_GREATEREQUAL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2331);
					match(T_NOT);
					}
				}

				setState(2334);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2335);
				logical_error();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_errorContext extends ParserRuleContext {
		public Logical_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLogical_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLogical_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLogical_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_errorContext logical_error() throws RecognitionException {
		Logical_errorContext _localctx = new Logical_errorContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_logical_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_intervalContext expr_interval() {
			return getRuleContext(Expr_intervalContext.class,0);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_cursor_attributeContext expr_cursor_attribute() {
			return getRuleContext(Expr_cursor_attributeContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(gParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(gParser.T_DIV, 0); }
		public TerminalNode T_ADD() { return getToken(gParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(gParser.T_SUB, 0); }
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 310;
		enterRecursionRule(_localctx, 310, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				{
				setState(2341);
				match(T_OPEN_P);
				setState(2342);
				select_stmt();
				setState(2343);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2345);
				match(T_OPEN_P);
				setState(2346);
				expr(0);
				setState(2347);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2349);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(2350);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(2351);
				expr_case();
				}
				break;
			case 6:
				{
				setState(2352);
				expr_cursor_attribute();
				}
				break;
			case 7:
				{
				setState(2353);
				expr_agg_window_func();
				}
				break;
			case 8:
				{
				setState(2354);
				expr_spec_func();
				}
				break;
			case 9:
				{
				setState(2355);
				expr_func();
				}
				break;
			case 10:
				{
				setState(2356);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2373);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2359);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2360);
						match(T_MUL);
						setState(2361);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2362);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2363);
						match(T_DIV);
						setState(2364);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2365);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2366);
						match(T_ADD);
						setState(2367);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2368);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2369);
						match(T_SUB);
						setState(2370);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2371);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2372);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(2377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_atomContext extends ParserRuleContext {
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Null_constContext null_const() {
			return getRuleContext(Null_constContext.class,0);
		}
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_expr_atom);
		try {
			setState(2386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2378);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2379);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2380);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2381);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2382);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2383);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2384);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2385);
				null_const();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_intervalContext extends ParserRuleContext {
		public TerminalNode T_INTERVAL() { return getToken(gParser.T_INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public Expr_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2388);
			match(T_INTERVAL);
			setState(2389);
			expr(0);
			setState(2390);
			interval_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_itemContext extends ParserRuleContext {
		public TerminalNode T_DAY() { return getToken(gParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(gParser.T_DAYS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(gParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(gParser.T_MICROSECONDS, 0); }
		public TerminalNode T_SECOND() { return getToken(gParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(gParser.T_SECONDS, 0); }
		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInterval_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInterval_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInterval_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2392);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || _la==T_MICROSECOND || _la==T_MICROSECONDS || _la==T_SECOND || _la==T_SECONDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concatContext extends ParserRuleContext {
		public List<Expr_concat_itemContext> expr_concat_item() {
			return getRuleContexts(Expr_concat_itemContext.class);
		}
		public Expr_concat_itemContext expr_concat_item(int i) {
			return getRuleContext(Expr_concat_itemContext.class,i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(gParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(gParser.T_PIPE, i);
		}
		public List<TerminalNode> T_CONCAT() { return getTokens(gParser.T_CONCAT); }
		public TerminalNode T_CONCAT(int i) {
			return getToken(gParser.T_CONCAT, i);
		}
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_concat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_concat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			expr_concat_item();
			setState(2395);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2396);
			expr_concat_item();
			setState(2401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2397);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2398);
					expr_concat_item();
					}
					} 
				}
				setState(2403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concat_itemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_concat_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_concat_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_concat_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_expr_concat_item);
		try {
			setState(2413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2404);
				match(T_OPEN_P);
				setState(2405);
				expr(0);
				setState(2406);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2408);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2409);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2410);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2411);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2412);
				expr_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_caseContext extends ParserRuleContext {
		public Expr_case_simpleContext expr_case_simple() {
			return getRuleContext(Expr_case_simpleContext.class,0);
		}
		public Expr_case_searchedContext expr_case_searched() {
			return getRuleContext(Expr_case_searchedContext.class,0);
		}
		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_expr_case);
		try {
			setState(2417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2415);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2416);
				expr_case_searched();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_simpleContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(gParser.T_CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(gParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(gParser.T_WHEN, i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(gParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(gParser.T_THEN, i);
		}
		public TerminalNode T_ELSE() { return getToken(gParser.T_ELSE, 0); }
		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_case_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_case_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_case_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2419);
			match(T_CASE);
			setState(2420);
			expr(0);
			setState(2426); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2421);
				match(T_WHEN);
				setState(2422);
				expr(0);
				setState(2423);
				match(T_THEN);
				setState(2424);
				expr(0);
				}
				}
				setState(2428); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2430);
				match(T_ELSE);
				setState(2431);
				expr(0);
				}
			}

			setState(2434);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_searchedContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(gParser.T_CASE, 0); }
		public TerminalNode T_END() { return getToken(gParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(gParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(gParser.T_WHEN, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(gParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(gParser.T_THEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(gParser.T_ELSE, 0); }
		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_searched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_case_searched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_case_searched(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_case_searched(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2436);
			match(T_CASE);
			setState(2442); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2437);
				match(T_WHEN);
				setState(2438);
				bool_expr(0);
				setState(2439);
				match(T_THEN);
				setState(2440);
				expr(0);
				}
				}
				setState(2444); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2446);
				match(T_ELSE);
				setState(2447);
				expr(0);
				}
			}

			setState(2450);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cursor_attributeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ISOPEN() { return getToken(gParser.T_ISOPEN, 0); }
		public TerminalNode T_FOUND() { return getToken(gParser.T_FOUND, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(gParser.T_NOTFOUND, 0); }
		public Expr_cursor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cursor_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_cursor_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_cursor_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_cursor_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		Expr_cursor_attributeContext _localctx = new Expr_cursor_attributeContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2452);
			ident();
			setState(2453);
			match(T__2);
			setState(2454);
			_la = _input.LA(1);
			if ( !(_la==T_FOUND || _la==T_ISOPEN || _la==T_NOTFOUND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_agg_window_funcContext extends ParserRuleContext {
		public TerminalNode T_AVG() { return getToken(gParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Expr_func_all_distinctContext expr_func_all_distinct() {
			return getRuleContext(Expr_func_all_distinctContext.class,0);
		}
		public Expr_func_over_clauseContext expr_func_over_clause() {
			return getRuleContext(Expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(gParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(gParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(gParser.T_CUME_DIST, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(gParser.T_DENSE_RANK, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(gParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_LAG() { return getToken(gParser.T_LAG, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public TerminalNode T_LAST_VALUE() { return getToken(gParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(gParser.T_LEAD, 0); }
		public TerminalNode T_MAX() { return getToken(gParser.T_MAX, 0); }
		public TerminalNode T_MIN() { return getToken(gParser.T_MIN, 0); }
		public TerminalNode T_RANK() { return getToken(gParser.T_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(gParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_STDEV() { return getToken(gParser.T_STDEV, 0); }
		public TerminalNode T_SUM() { return getToken(gParser.T_SUM, 0); }
		public TerminalNode T_VAR() { return getToken(gParser.T_VAR, 0); }
		public TerminalNode T_VARIANCE() { return getToken(gParser.T_VARIANCE, 0); }
		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_agg_window_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_agg_window_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_agg_window_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_agg_window_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2456);
				match(T_AVG);
				setState(2457);
				match(T_OPEN_P);
				setState(2459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
				case 1:
					{
					setState(2458);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2461);
				expr(0);
				setState(2462);
				match(T_CLOSE_P);
				setState(2464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
				case 1:
					{
					setState(2463);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2466);
				match(T_COUNT);
				setState(2467);
				match(T_OPEN_P);
				setState(2473);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2469);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						setState(2468);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2471);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2472);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2475);
				match(T_CLOSE_P);
				setState(2477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
				case 1:
					{
					setState(2476);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2479);
				match(T_COUNT_BIG);
				setState(2480);
				match(T_OPEN_P);
				setState(2486);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2482);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
					case 1:
						{
						setState(2481);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2484);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2485);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2488);
				match(T_CLOSE_P);
				setState(2490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2489);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2492);
				match(T_CUME_DIST);
				setState(2493);
				match(T_OPEN_P);
				setState(2494);
				match(T_CLOSE_P);
				setState(2495);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2496);
				match(T_DENSE_RANK);
				setState(2497);
				match(T_OPEN_P);
				setState(2498);
				match(T_CLOSE_P);
				setState(2499);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2500);
				match(T_FIRST_VALUE);
				setState(2501);
				match(T_OPEN_P);
				setState(2502);
				expr(0);
				setState(2503);
				match(T_CLOSE_P);
				setState(2504);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2506);
				match(T_LAG);
				setState(2507);
				match(T_OPEN_P);
				setState(2508);
				expr(0);
				setState(2515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2509);
					match(T_COMMA);
					setState(2510);
					expr(0);
					setState(2513);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2511);
						match(T_COMMA);
						setState(2512);
						expr(0);
						}
					}

					}
				}

				setState(2517);
				match(T_CLOSE_P);
				setState(2518);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2520);
				match(T_LAST_VALUE);
				setState(2521);
				match(T_OPEN_P);
				setState(2522);
				expr(0);
				setState(2523);
				match(T_CLOSE_P);
				setState(2524);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2526);
				match(T_LEAD);
				setState(2527);
				match(T_OPEN_P);
				setState(2528);
				expr(0);
				setState(2535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2529);
					match(T_COMMA);
					setState(2530);
					expr(0);
					setState(2533);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2531);
						match(T_COMMA);
						setState(2532);
						expr(0);
						}
					}

					}
				}

				setState(2537);
				match(T_CLOSE_P);
				setState(2538);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2540);
				match(T_MAX);
				setState(2541);
				match(T_OPEN_P);
				setState(2543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
				case 1:
					{
					setState(2542);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2545);
				expr(0);
				setState(2546);
				match(T_CLOSE_P);
				setState(2548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(2547);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2550);
				match(T_MIN);
				setState(2551);
				match(T_OPEN_P);
				setState(2553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
				case 1:
					{
					setState(2552);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2555);
				expr(0);
				setState(2556);
				match(T_CLOSE_P);
				setState(2558);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
				case 1:
					{
					setState(2557);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2560);
				match(T_RANK);
				setState(2561);
				match(T_OPEN_P);
				setState(2562);
				match(T_CLOSE_P);
				setState(2563);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2564);
				match(T_ROW_NUMBER);
				setState(2565);
				match(T_OPEN_P);
				setState(2566);
				match(T_CLOSE_P);
				setState(2567);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2568);
				match(T_STDEV);
				setState(2569);
				match(T_OPEN_P);
				setState(2571);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2570);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2573);
				expr(0);
				setState(2574);
				match(T_CLOSE_P);
				setState(2576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
				case 1:
					{
					setState(2575);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2578);
				match(T_SUM);
				setState(2579);
				match(T_OPEN_P);
				setState(2581);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(2580);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2583);
				expr(0);
				setState(2584);
				match(T_CLOSE_P);
				setState(2586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2585);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(2588);
				match(T_VAR);
				setState(2589);
				match(T_OPEN_P);
				setState(2591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
				case 1:
					{
					setState(2590);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2593);
				expr(0);
				setState(2594);
				match(T_CLOSE_P);
				setState(2596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
				case 1:
					{
					setState(2595);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(2598);
				match(T_VARIANCE);
				setState(2599);
				match(T_OPEN_P);
				setState(2601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
				case 1:
					{
					setState(2600);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2603);
				expr(0);
				setState(2604);
				match(T_CLOSE_P);
				setState(2606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
				case 1:
					{
					setState(2605);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(gParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(gParser.T_DISTINCT, 0); }
		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_all_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_func_all_distinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_func_all_distinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_func_all_distinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2610);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_over_clauseContext extends ParserRuleContext {
		public TerminalNode T_OVER() { return getToken(gParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_func_over_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_func_over_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_func_over_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2612);
			match(T_OVER);
			setState(2613);
			match(T_OPEN_P);
			setState(2615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2614);
				expr_func_partition_by_clause();
				}
			}

			setState(2618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2617);
				order_by_clause();
				}
			}

			setState(2620);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() { return getToken(gParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(gParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_partition_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_func_partition_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_func_partition_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_func_partition_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2622);
			match(T_PARTITION);
			setState(2623);
			match(T_BY);
			setState(2624);
			expr(0);
			setState(2629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2625);
				match(T_COMMA);
				setState(2626);
				expr(0);
				}
				}
				setState(2631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_spec_funcContext extends ParserRuleContext {
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(gParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_CAST() { return getToken(gParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(gParser.T_COUNT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(gParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT() { return getToken(gParser.T_CURRENT, 0); }
		public TerminalNode T_DATE() { return getToken(gParser.T_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(gParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(gParser.T_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(gParser.T_CURRENT_USER, 0); }
		public TerminalNode T_USER() { return getToken(gParser.T_USER, 0); }
		public TerminalNode T_MAX_PART_STRING() { return getToken(gParser.T_MAX_PART_STRING, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(gParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(gParser.T_EQUAL, i);
		}
		public TerminalNode T_MIN_PART_STRING() { return getToken(gParser.T_MIN_PART_STRING, 0); }
		public TerminalNode T_MAX_PART_INT() { return getToken(gParser.T_MAX_PART_INT, 0); }
		public TerminalNode T_MIN_PART_INT() { return getToken(gParser.T_MIN_PART_INT, 0); }
		public TerminalNode T_MAX_PART_DATE() { return getToken(gParser.T_MAX_PART_DATE, 0); }
		public TerminalNode T_MIN_PART_DATE() { return getToken(gParser.T_MIN_PART_DATE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(gParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(gParser.T_PART_LOC, 0); }
		public TerminalNode T_TRIM() { return getToken(gParser.T_TRIM, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(gParser.T_SUBSTRING, 0); }
		public TerminalNode T_FROM() { return getToken(gParser.T_FROM, 0); }
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode T_SYSDATE() { return getToken(gParser.T_SYSDATE, 0); }
		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_spec_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_spec_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_spec_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_spec_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2632);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2633);
				match(T_CAST);
				setState(2634);
				match(T_OPEN_P);
				setState(2635);
				expr(0);
				setState(2636);
				match(T_AS);
				setState(2637);
				dtype();
				setState(2639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2638);
					dtype_len();
					}
				}

				setState(2641);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2643);
				match(T_COUNT);
				setState(2644);
				match(T_OPEN_P);
				setState(2647);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					setState(2645);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(2646);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2649);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2650);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2651);
				match(T_CURRENT);
				setState(2652);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2656);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(2653);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(2654);
					match(T_CURRENT);
					setState(2655);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2662);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
				case 1:
					{
					setState(2658);
					match(T_OPEN_P);
					setState(2659);
					expr(0);
					setState(2660);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2664);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2665);
				match(T_CURRENT);
				setState(2666);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2667);
				match(T_MAX_PART_STRING);
				setState(2668);
				match(T_OPEN_P);
				setState(2669);
				expr(0);
				setState(2682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2670);
					match(T_COMMA);
					setState(2671);
					expr(0);
					setState(2679);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2672);
						match(T_COMMA);
						setState(2673);
						expr(0);
						setState(2674);
						match(T_EQUAL);
						setState(2675);
						expr(0);
						}
						}
						setState(2681);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2684);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2686);
				match(T_MIN_PART_STRING);
				setState(2687);
				match(T_OPEN_P);
				setState(2688);
				expr(0);
				setState(2701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2689);
					match(T_COMMA);
					setState(2690);
					expr(0);
					setState(2698);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2691);
						match(T_COMMA);
						setState(2692);
						expr(0);
						setState(2693);
						match(T_EQUAL);
						setState(2694);
						expr(0);
						}
						}
						setState(2700);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2703);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2705);
				match(T_MAX_PART_INT);
				setState(2706);
				match(T_OPEN_P);
				setState(2707);
				expr(0);
				setState(2720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2708);
					match(T_COMMA);
					setState(2709);
					expr(0);
					setState(2717);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2710);
						match(T_COMMA);
						setState(2711);
						expr(0);
						setState(2712);
						match(T_EQUAL);
						setState(2713);
						expr(0);
						}
						}
						setState(2719);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2722);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2724);
				match(T_MIN_PART_INT);
				setState(2725);
				match(T_OPEN_P);
				setState(2726);
				expr(0);
				setState(2739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2727);
					match(T_COMMA);
					setState(2728);
					expr(0);
					setState(2736);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2729);
						match(T_COMMA);
						setState(2730);
						expr(0);
						setState(2731);
						match(T_EQUAL);
						setState(2732);
						expr(0);
						}
						}
						setState(2738);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2741);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2743);
				match(T_MAX_PART_DATE);
				setState(2744);
				match(T_OPEN_P);
				setState(2745);
				expr(0);
				setState(2758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2746);
					match(T_COMMA);
					setState(2747);
					expr(0);
					setState(2755);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2748);
						match(T_COMMA);
						setState(2749);
						expr(0);
						setState(2750);
						match(T_EQUAL);
						setState(2751);
						expr(0);
						}
						}
						setState(2757);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2760);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2762);
				match(T_MIN_PART_DATE);
				setState(2763);
				match(T_OPEN_P);
				setState(2764);
				expr(0);
				setState(2777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2765);
					match(T_COMMA);
					setState(2766);
					expr(0);
					setState(2774);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2767);
						match(T_COMMA);
						setState(2768);
						expr(0);
						setState(2769);
						match(T_EQUAL);
						setState(2770);
						expr(0);
						}
						}
						setState(2776);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2779);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2781);
				match(T_PART_COUNT);
				setState(2782);
				match(T_OPEN_P);
				setState(2783);
				expr(0);
				setState(2791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2784);
					match(T_COMMA);
					setState(2785);
					expr(0);
					setState(2786);
					match(T_EQUAL);
					setState(2787);
					expr(0);
					}
					}
					setState(2793);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2794);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2796);
				match(T_PART_LOC);
				setState(2797);
				match(T_OPEN_P);
				setState(2798);
				expr(0);
				setState(2804); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2799);
						match(T_COMMA);
						setState(2800);
						expr(0);
						setState(2801);
						match(T_EQUAL);
						setState(2802);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2806); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,355,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2808);
					match(T_COMMA);
					setState(2809);
					expr(0);
					}
				}

				setState(2812);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2814);
				match(T_TRIM);
				setState(2815);
				match(T_OPEN_P);
				setState(2816);
				expr(0);
				setState(2817);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2819);
				match(T_SUBSTRING);
				setState(2820);
				match(T_OPEN_P);
				setState(2821);
				expr(0);
				setState(2822);
				match(T_FROM);
				setState(2823);
				expr(0);
				setState(2826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(2824);
					match(T_FOR);
					setState(2825);
					expr(0);
					}
				}

				setState(2828);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2830);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2831);
				match(T_USER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_funcContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2834);
			ident();
			setState(2835);
			match(T_OPEN_P);
			setState(2837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				{
				setState(2836);
				expr_func_params();
				}
				break;
			}
			setState(2839);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_paramsContext extends ParserRuleContext {
		public List<Func_paramContext> func_param() {
			return getRuleContexts(Func_paramContext.class);
		}
		public Func_paramContext func_param(int i) {
			return getRuleContext(Func_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(gParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(gParser.T_COMMA, i);
		}
		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpr_func_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpr_func_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpr_func_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2841);
			func_param();
			setState(2846);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2842);
					match(T_COMMA);
					setState(2843);
					func_param();
					}
					} 
				}
				setState(2848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_paramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(gParser.T_EQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(gParser.T_GREATER, 0); }
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunc_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunc_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunc_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2849);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(2855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				{
				setState(2850);
				ident();
				setState(2851);
				match(T_EQUAL);
				setState(2853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(2852);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(2857);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode T_DATE() { return getToken(gParser.T_DATE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDate_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2859);
			match(T_DATE);
			setState(2860);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_literalContext extends ParserRuleContext {
		public TerminalNode T_TIMESTAMP() { return getToken(gParser.T_TIMESTAMP, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTimestamp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTimestamp_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTimestamp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2862);
			match(T_TIMESTAMP);
			setState(2863);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> L_ID() { return getTokens(gParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(gParser.L_ID, i);
		}
		public List<Non_reserved_wordsContext> non_reserved_words() {
			return getRuleContexts(Non_reserved_wordsContext.class);
		}
		public Non_reserved_wordsContext non_reserved_words(int i) {
			return getRuleContext(Non_reserved_wordsContext.class,i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(2865);
				match(L_ID);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
				{
				setState(2866);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2876);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,365,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2869);
					match(T__3);
					setState(2872);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(2870);
						match(L_ID);
						}
						break;
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WITH:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
						{
						setState(2871);
						non_reserved_words();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(2878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,365,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Double_quotedStringContext extends StringContext {
		public TerminalNode L_D_STRING() { return getToken(gParser.L_D_STRING, 0); }
		public Double_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDouble_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDouble_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDouble_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single_quotedStringContext extends StringContext {
		public TerminalNode L_S_STRING() { return getToken(gParser.L_S_STRING, 0); }
		public Single_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSingle_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSingle_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSingle_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_string);
		try {
			setState(2881);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2879);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2880);
				match(L_D_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(gParser.L_INT, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInt_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInt_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInt_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2883);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2886);
			match(L_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_numberContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(gParser.L_DEC, 0); }
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDec_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDec_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDec_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2888);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2891);
			match(L_DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode T_TRUE() { return getToken(gParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(gParser.T_FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2893);
			_la = _input.LA(1);
			if ( !(_la==T_FALSE || _la==T_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_constContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(gParser.T_NULL, 0); }
		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNull_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNull_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNull_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2895);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Missing_semicolonContext extends ParserRuleContext {
		public TerminalNode L_WS() { return getToken(gParser.L_WS, 0); }
		public Missing_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missing_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMissing_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMissing_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMissing_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Missing_semicolonContext missing_semicolon() throws RecognitionException {
		Missing_semicolonContext _localctx = new Missing_semicolonContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_missing_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2897);
			match(L_WS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode T_ACTION() { return getToken(gParser.T_ACTION, 0); }
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(gParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_ADD2() { return getToken(gParser.T_ADD2, 0); }
		public TerminalNode T_ALL() { return getToken(gParser.T_ALL, 0); }
		public TerminalNode T_ALTER() { return getToken(gParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(gParser.T_AND, 0); }
		public TerminalNode T_ANSI_NULLS() { return getToken(gParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(gParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_AS() { return getToken(gParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(gParser.T_ASC, 0); }
		public TerminalNode T_AT() { return getToken(gParser.T_AT, 0); }
		public TerminalNode T_AUTO_INCREMENT() { return getToken(gParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_AVG() { return getToken(gParser.T_AVG, 0); }
		public TerminalNode T_BATCHSIZE() { return getToken(gParser.T_BATCHSIZE, 0); }
		public TerminalNode T_BEGIN() { return getToken(gParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(gParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(gParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(gParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(gParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BIT() { return getToken(gParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(gParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(gParser.T_BREAK, 0); }
		public TerminalNode T_BY() { return getToken(gParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(gParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(gParser.T_CALL, 0); }
		public TerminalNode T_CALLER() { return getToken(gParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(gParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(gParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(gParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CAST() { return getToken(gParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(gParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(gParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(gParser.T_CHARSET, 0); }
		public TerminalNode T_CLIENT() { return getToken(gParser.T_CLIENT, 0); }
		public TerminalNode T_CLOSE() { return getToken(gParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(gParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(gParser.T_CMP, 0); }
		public TerminalNode T_COLLECTION() { return getToken(gParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMN() { return getToken(gParser.T_COLUMN, 0); }
		public TerminalNode T_COMMENT() { return getToken(gParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(gParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(gParser.T_CONSTANT, 0); }
		public TerminalNode T_COPY() { return getToken(gParser.T_COPY, 0); }
		public TerminalNode T_COMMIT() { return getToken(gParser.T_COMMIT, 0); }
		public TerminalNode T_CONCAT() { return getToken(gParser.T_CONCAT, 0); }
		public TerminalNode T_CONDITION() { return getToken(gParser.T_CONDITION, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(gParser.T_CONSTRAINT, 0); }
		public TerminalNode T_CONTINUE() { return getToken(gParser.T_CONTINUE, 0); }
		public TerminalNode T_COUNT() { return getToken(gParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(gParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CREATE() { return getToken(gParser.T_CREATE, 0); }
		public TerminalNode T_CREATION() { return getToken(gParser.T_CREATION, 0); }
		public TerminalNode T_CREATOR() { return getToken(gParser.T_CREATOR, 0); }
		public TerminalNode T_CS() { return getToken(gParser.T_CS, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(gParser.T_CUME_DIST, 0); }
		public TerminalNode T_CURRENT() { return getToken(gParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(gParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(gParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(gParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(gParser.T_CURRENT_USER, 0); }
		public TerminalNode T_CURSOR() { return getToken(gParser.T_CURSOR, 0); }
		public TerminalNode T_DATA() { return getToken(gParser.T_DATA, 0); }
		public TerminalNode T_DATABASE() { return getToken(gParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(gParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(gParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(gParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(gParser.T_DAYS, 0); }
		public TerminalNode T_DEC() { return getToken(gParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(gParser.T_DECIMAL, 0); }
		public TerminalNode T_DECLARE() { return getToken(gParser.T_DECLARE, 0); }
		public TerminalNode T_DEFAULT() { return getToken(gParser.T_DEFAULT, 0); }
		public TerminalNode T_DEFERRED() { return getToken(gParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(gParser.T_DEFINED, 0); }
		public TerminalNode T_DEFINER() { return getToken(gParser.T_DEFINER, 0); }
		public TerminalNode T_DEFINITION() { return getToken(gParser.T_DEFINITION, 0); }
		public TerminalNode T_DELETE() { return getToken(gParser.T_DELETE, 0); }
		public TerminalNode T_DELIMITED() { return getToken(gParser.T_DELIMITED, 0); }
		public TerminalNode T_DELIMITER() { return getToken(gParser.T_DELIMITER, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(gParser.T_DENSE_RANK, 0); }
		public TerminalNode T_DESC() { return getToken(gParser.T_DESC, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(gParser.T_DIAGNOSTICS, 0); }
		public TerminalNode T_DIR() { return getToken(gParser.T_DIR, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(gParser.T_DIRECTORY, 0); }
		public TerminalNode T_DISTINCT() { return getToken(gParser.T_DISTINCT, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(gParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_DOUBLE() { return getToken(gParser.T_DOUBLE, 0); }
		public TerminalNode T_DROP() { return getToken(gParser.T_DROP, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(gParser.T_DYNAMIC, 0); }
		public TerminalNode T_ENABLE() { return getToken(gParser.T_ENABLE, 0); }
		public TerminalNode T_ENGINE() { return getToken(gParser.T_ENGINE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(gParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCEPT() { return getToken(gParser.T_EXCEPT, 0); }
		public TerminalNode T_EXCEPTION() { return getToken(gParser.T_EXCEPTION, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(gParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXISTS() { return getToken(gParser.T_EXISTS, 0); }
		public TerminalNode T_EXIT() { return getToken(gParser.T_EXIT, 0); }
		public TerminalNode T_FALLBACK() { return getToken(gParser.T_FALLBACK, 0); }
		public TerminalNode T_FALSE() { return getToken(gParser.T_FALSE, 0); }
		public TerminalNode T_FIELDS() { return getToken(gParser.T_FIELDS, 0); }
		public TerminalNode T_FILE() { return getToken(gParser.T_FILE, 0); }
		public TerminalNode T_FILES() { return getToken(gParser.T_FILES, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(gParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_FLOAT() { return getToken(gParser.T_FLOAT, 0); }
		public TerminalNode T_FOR() { return getToken(gParser.T_FOR, 0); }
		public TerminalNode T_FOREIGN() { return getToken(gParser.T_FOREIGN, 0); }
		public TerminalNode T_FORMAT() { return getToken(gParser.T_FORMAT, 0); }
		public TerminalNode T_FOUND() { return getToken(gParser.T_FOUND, 0); }
		public TerminalNode T_FROM() { return getToken(gParser.T_FROM, 0); }
		public TerminalNode T_FULL() { return getToken(gParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(gParser.T_FUNCTION, 0); }
		public TerminalNode T_GET() { return getToken(gParser.T_GET, 0); }
		public TerminalNode T_GLOBAL() { return getToken(gParser.T_GLOBAL, 0); }
		public TerminalNode T_GO() { return getToken(gParser.T_GO, 0); }
		public TerminalNode T_GRANT() { return getToken(gParser.T_GRANT, 0); }
		public TerminalNode T_GROUP() { return getToken(gParser.T_GROUP, 0); }
		public TerminalNode T_HANDLER() { return getToken(gParser.T_HANDLER, 0); }
		public TerminalNode T_HASH() { return getToken(gParser.T_HASH, 0); }
		public TerminalNode T_HAVING() { return getToken(gParser.T_HAVING, 0); }
		public TerminalNode T_HDFS() { return getToken(gParser.T_HDFS, 0); }
		public TerminalNode T_HIVE() { return getToken(gParser.T_HIVE, 0); }
		public TerminalNode T_HOST() { return getToken(gParser.T_HOST, 0); }
		public TerminalNode T_IDENTITY() { return getToken(gParser.T_IDENTITY, 0); }
		public TerminalNode T_IF() { return getToken(gParser.T_IF, 0); }
		public TerminalNode T_IGNORE() { return getToken(gParser.T_IGNORE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(gParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(gParser.T_IN, 0); }
		public TerminalNode T_INCLUDE() { return getToken(gParser.T_INCLUDE, 0); }
		public TerminalNode T_INDEX() { return getToken(gParser.T_INDEX, 0); }
		public TerminalNode T_INITRANS() { return getToken(gParser.T_INITRANS, 0); }
		public TerminalNode T_INNER() { return getToken(gParser.T_INNER, 0); }
		public TerminalNode T_INOUT() { return getToken(gParser.T_INOUT, 0); }
		public TerminalNode T_INT() { return getToken(gParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(gParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(gParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(gParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(gParser.T_INTEGER, 0); }
		public TerminalNode T_INTERSECT() { return getToken(gParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(gParser.T_INTERVAL, 0); }
		public TerminalNode T_INTO() { return getToken(gParser.T_INTO, 0); }
		public TerminalNode T_INVOKER() { return getToken(gParser.T_INVOKER, 0); }
		public TerminalNode T_ITEMS() { return getToken(gParser.T_ITEMS, 0); }
		public TerminalNode T_IS() { return getToken(gParser.T_IS, 0); }
		public TerminalNode T_ISOPEN() { return getToken(gParser.T_ISOPEN, 0); }
		public TerminalNode T_JOIN() { return getToken(gParser.T_JOIN, 0); }
		public TerminalNode T_KEEP() { return getToken(gParser.T_KEEP, 0); }
		public TerminalNode T_KEY() { return getToken(gParser.T_KEY, 0); }
		public TerminalNode T_KEYS() { return getToken(gParser.T_KEYS, 0); }
		public TerminalNode T_LAG() { return getToken(gParser.T_LAG, 0); }
		public TerminalNode T_LANGUAGE() { return getToken(gParser.T_LANGUAGE, 0); }
		public TerminalNode T_LAST_VALUE() { return getToken(gParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(gParser.T_LEAD, 0); }
		public TerminalNode T_LEAVE() { return getToken(gParser.T_LEAVE, 0); }
		public TerminalNode T_LEFT() { return getToken(gParser.T_LEFT, 0); }
		public TerminalNode T_LIKE() { return getToken(gParser.T_LIKE, 0); }
		public TerminalNode T_LIMIT() { return getToken(gParser.T_LIMIT, 0); }
		public TerminalNode T_LINES() { return getToken(gParser.T_LINES, 0); }
		public TerminalNode T_LOCAL() { return getToken(gParser.T_LOCAL, 0); }
		public TerminalNode T_LOCATION() { return getToken(gParser.T_LOCATION, 0); }
		public TerminalNode T_LOCKS() { return getToken(gParser.T_LOCKS, 0); }
		public TerminalNode T_LOG() { return getToken(gParser.T_LOG, 0); }
		public TerminalNode T_LOGGED() { return getToken(gParser.T_LOGGED, 0); }
		public TerminalNode T_LOGGING() { return getToken(gParser.T_LOGGING, 0); }
		public TerminalNode T_LOOP() { return getToken(gParser.T_LOOP, 0); }
		public TerminalNode T_MAP() { return getToken(gParser.T_MAP, 0); }
		public TerminalNode T_MATCHED() { return getToken(gParser.T_MATCHED, 0); }
		public TerminalNode T_MAX() { return getToken(gParser.T_MAX, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(gParser.T_MAXTRANS, 0); }
		public TerminalNode T_MERGE() { return getToken(gParser.T_MERGE, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(gParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(gParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(gParser.T_MICROSECONDS, 0); }
		public TerminalNode T_MIN() { return getToken(gParser.T_MIN, 0); }
		public TerminalNode T_MULTISET() { return getToken(gParser.T_MULTISET, 0); }
		public TerminalNode T_NCHAR() { return getToken(gParser.T_NCHAR, 0); }
		public TerminalNode T_NEW() { return getToken(gParser.T_NEW, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(gParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(gParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(gParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(gParser.T_NOCOUNT, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(gParser.T_NOLOGGING, 0); }
		public TerminalNode T_NONE() { return getToken(gParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(gParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(gParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(gParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(gParser.T_NUMBER, 0); }
		public TerminalNode T_OBJECT() { return getToken(gParser.T_OBJECT, 0); }
		public TerminalNode T_OFF() { return getToken(gParser.T_OFF, 0); }
		public TerminalNode T_ON() { return getToken(gParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(gParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(gParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(gParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(gParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(gParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(gParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(gParser.T_OVER, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(gParser.T_OVERWRITE, 0); }
		public TerminalNode T_OWNER() { return getToken(gParser.T_OWNER, 0); }
		public TerminalNode T_PACKAGE() { return getToken(gParser.T_PACKAGE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(gParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(gParser.T_PART_LOC, 0); }
		public TerminalNode T_PARTITION() { return getToken(gParser.T_PARTITION, 0); }
		public TerminalNode T_PCTFREE() { return getToken(gParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(gParser.T_PCTUSED, 0); }
		public TerminalNode T_PRECISION() { return getToken(gParser.T_PRECISION, 0); }
		public TerminalNode T_PRESERVE() { return getToken(gParser.T_PRESERVE, 0); }
		public TerminalNode T_PRIMARY() { return getToken(gParser.T_PRIMARY, 0); }
		public TerminalNode T_PRINT() { return getToken(gParser.T_PRINT, 0); }
		public TerminalNode T_PROC() { return getToken(gParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(gParser.T_PROCEDURE, 0); }
		public TerminalNode T_PWD() { return getToken(gParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(gParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(gParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(gParser.T_QUIT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(gParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_RAISE() { return getToken(gParser.T_RAISE, 0); }
		public TerminalNode T_RANK() { return getToken(gParser.T_RANK, 0); }
		public TerminalNode T_REAL() { return getToken(gParser.T_REAL, 0); }
		public TerminalNode T_REFERENCES() { return getToken(gParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(gParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(gParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(gParser.T_REPLACE, 0); }
		public TerminalNode T_RESIGNAL() { return getToken(gParser.T_RESIGNAL, 0); }
		public TerminalNode T_RESTRICT() { return getToken(gParser.T_RESTRICT, 0); }
		public TerminalNode T_RESULT() { return getToken(gParser.T_RESULT, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(gParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_RETURN() { return getToken(gParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(gParser.T_RETURNS, 0); }
		public TerminalNode T_REVERSE() { return getToken(gParser.T_REVERSE, 0); }
		public TerminalNode T_RIGHT() { return getToken(gParser.T_RIGHT, 0); }
		public TerminalNode T_RLIKE() { return getToken(gParser.T_RLIKE, 0); }
		public TerminalNode T_RS() { return getToken(gParser.T_RS, 0); }
		public TerminalNode T_ROLE() { return getToken(gParser.T_ROLE, 0); }
		public TerminalNode T_ROLLBACK() { return getToken(gParser.T_ROLLBACK, 0); }
		public TerminalNode T_ROW() { return getToken(gParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(gParser.T_ROWS, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(gParser.T_ROW_COUNT, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(gParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_SCHEMA() { return getToken(gParser.T_SCHEMA, 0); }
		public TerminalNode T_SECOND() { return getToken(gParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(gParser.T_SECONDS, 0); }
		public TerminalNode T_SECURITY() { return getToken(gParser.T_SECURITY, 0); }
		public TerminalNode T_SEGMENT() { return getToken(gParser.T_SEGMENT, 0); }
		public TerminalNode T_SEL() { return getToken(gParser.T_SEL, 0); }
		public TerminalNode T_SELECT() { return getToken(gParser.T_SELECT, 0); }
		public TerminalNode T_SESSION() { return getToken(gParser.T_SESSION, 0); }
		public TerminalNode T_SESSIONS() { return getToken(gParser.T_SESSIONS, 0); }
		public TerminalNode T_SET() { return getToken(gParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(gParser.T_SETS, 0); }
		public TerminalNode T_SHARE() { return getToken(gParser.T_SHARE, 0); }
		public TerminalNode T_SIGNAL() { return getToken(gParser.T_SIGNAL, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(gParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(gParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(gParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(gParser.T_SMALLINT, 0); }
		public TerminalNode T_SQL() { return getToken(gParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(gParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(gParser.T_SQLINSERT, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(gParser.T_SQLSTATE, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(gParser.T_SQLWARNING, 0); }
		public TerminalNode T_STEP() { return getToken(gParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(gParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(gParser.T_STORAGE, 0); }
		public TerminalNode T_STORED() { return getToken(gParser.T_STORED, 0); }
		public TerminalNode T_STRING() { return getToken(gParser.T_STRING, 0); }
		public TerminalNode T_SUBDIR() { return getToken(gParser.T_SUBDIR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(gParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(gParser.T_SUM, 0); }
		public TerminalNode T_SUMMARY() { return getToken(gParser.T_SUMMARY, 0); }
		public TerminalNode T_SYSDATE() { return getToken(gParser.T_SYSDATE, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(gParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TABLE() { return getToken(gParser.T_TABLE, 0); }
		public TerminalNode T_TABLESPACE() { return getToken(gParser.T_TABLESPACE, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(gParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(gParser.T_TERMINATED, 0); }
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(gParser.T_TEXTIMAGE_ON, 0); }
		public TerminalNode T_THEN() { return getToken(gParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(gParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TITLE() { return getToken(gParser.T_TITLE, 0); }
		public TerminalNode T_TO() { return getToken(gParser.T_TO, 0); }
		public TerminalNode T_TOP() { return getToken(gParser.T_TOP, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(gParser.T_TRANSACTION, 0); }
		public TerminalNode T_TRIM() { return getToken(gParser.T_TRIM, 0); }
		public TerminalNode T_TRUE() { return getToken(gParser.T_TRUE, 0); }
		public TerminalNode T_TRUNCATE() { return getToken(gParser.T_TRUNCATE, 0); }
		public TerminalNode T_UNIQUE() { return getToken(gParser.T_UNIQUE, 0); }
		public TerminalNode T_UPDATE() { return getToken(gParser.T_UPDATE, 0); }
		public TerminalNode T_UR() { return getToken(gParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(gParser.T_USE, 0); }
		public TerminalNode T_USER() { return getToken(gParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(gParser.T_USING, 0); }
		public TerminalNode T_VALUE() { return getToken(gParser.T_VALUE, 0); }
		public TerminalNode T_VALUES() { return getToken(gParser.T_VALUES, 0); }
		public TerminalNode T_VAR() { return getToken(gParser.T_VAR, 0); }
		public TerminalNode T_VARCHAR() { return getToken(gParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(gParser.T_VARCHAR2, 0); }
		public TerminalNode T_VARYING() { return getToken(gParser.T_VARYING, 0); }
		public TerminalNode T_VARIANCE() { return getToken(gParser.T_VARIANCE, 0); }
		public TerminalNode T_VOLATILE() { return getToken(gParser.T_VOLATILE, 0); }
		public TerminalNode T_WITH() { return getToken(gParser.T_WITH, 0); }
		public TerminalNode T_WITHOUT() { return getToken(gParser.T_WITHOUT, 0); }
		public TerminalNode T_WORK() { return getToken(gParser.T_WORK, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(gParser.T_XACT_ABORT, 0); }
		public TerminalNode T_XML() { return getToken(gParser.T_XML, 0); }
		public TerminalNode T_YES() { return getToken(gParser.T_YES, 0); }
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNon_reserved_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNon_reserved_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNon_reserved_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2899);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_PART_COUNT - 322)) | (1L << (T_PART_LOC - 322)) | (1L << (T_RANK - 322)) | (1L << (T_ROW_NUMBER - 322)) | (1L << (T_STDEV - 322)) | (1L << (T_SYSDATE - 322)) | (1L << (T_VARIANCE - 322)) | (1L << (T_USER - 322)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return block_end_sempred((Block_endContext)_localctx, predIndex);
		case 12:
			return parameters_sempred((ParametersContext)_localctx, predIndex);
		case 14:
			return assignment_cpp_sempred((Assignment_cppContext)_localctx, predIndex);
		case 27:
			return expr_stmt_sempred((Expr_stmtContext)_localctx, predIndex);
		case 88:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 125:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 137:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 146:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 155:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 172:
			return func_param_sempred((Func_paramContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_end_sempred(Block_endContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
		}
		return true;
	}
	private boolean parameters_sempred(ParametersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignment_cpp_sempred(Assignment_cppContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_stmt_sempred(Expr_stmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_input.LT(1).getText().equalsIgnoreCase("GO");
		}
		return true;
	}
	private boolean create_routine_params_sempred(Create_routine_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return !_input.LT(1).getText().equalsIgnoreCase("IS") &&
		        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean select_list_alias_sempred(Select_list_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM");
		}
		return true;
	}
	private boolean from_alias_clause_sempred(From_alias_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return !_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
		        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
		        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
		        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("WITH");
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 11);
		case 12:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean func_param_sempred(Func_paramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u016d\u0b58\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\3\2\3\2\3\2\3\3\3\3\5\3\u0176\n\3\3\3"+
		"\5\3\u0179\n\3\6\3\u017b\n\3\r\3\16\3\u017c\3\4\5\4\u0180\n\4\3\4\3\4"+
		"\3\4\5\4\u0185\n\4\3\4\3\4\3\5\3\5\3\5\5\5\u018c\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u0193\n\5\3\6\3\6\3\6\3\7\3\7\6\7\u019a\n\7\r\7\16\7\u019b\3\7"+
		"\5\7\u019f\n\7\5\7\u01a1\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u01c0\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13\u01cb\n"+
		"\13\f\13\16\13\u01ce\13\13\3\13\3\13\3\f\3\f\3\f\5\f\u01d5\n\f\3\r\3\r"+
		"\7\r\u01d9\n\r\f\r\16\r\u01dc\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u01e9\n\16\f\16\16\16\u01ec\13\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u01f7\n\20\r\20\16\20\u01f8\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\6\20\u0201\n\20\r\20\16\20\u0202\7\20\u0205"+
		"\n\20\f\20\16\20\u0208\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0210"+
		"\n\21\f\21\16\21\u0213\13\21\3\21\5\21\u0216\n\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u021e\n\21\f\21\16\21\u0221\13\21\3\21\5\21\u0224\n\21"+
		"\5\21\u0226\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u0235\n\22\f\22\16\22\u0238\13\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0243\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u024b\n\24\f\24\16\24\u024e\13\24\3\24\3\24\7\24\u0252\n\24\f\24"+
		"\16\24\u0255\13\24\3\24\5\24\u0258\n\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u0260\n\24\f\24\16\24\u0263\13\24\3\24\5\24\u0266\n\24\5\24\u0268"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0280\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u0295\n\30\f\30\16\30\u0298\13\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u02a2\n\30\3\31\3\31\3\31\7\31\u02a7\n"+
		"\31\f\31\16\31\u02aa\13\31\3\31\3\31\3\31\5\31\u02af\n\31\3\32\3\32\6"+
		"\32\u02b3\n\32\r\32\16\32\u02b4\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u02c5\n\36\3\36\3\36\3\36\7\36\u02ca"+
		"\n\36\f\36\16\36\u02cd\13\36\5\36\u02cf\n\36\3\37\3\37\3\37\5\37\u02d4"+
		"\n\37\3 \3 \5 \u02d8\n \3 \3 \3 \3 \3 \3 \3 \5 \u02e1\n \3 \3 \3 \5 \u02e6"+
		"\n \3!\3!\3!\3!\7!\u02ec\n!\f!\16!\u02ef\13!\3!\3!\5!\u02f3\n!\3!\3!\3"+
		"!\3!\3!\7!\u02fa\n!\f!\16!\u02fd\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u0306"+
		"\n\"\f\"\16\"\u0309\13\"\3\"\3\"\5\"\u030d\n\"\3\"\5\"\u0310\n\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\5#\u031a\n#\3$\5$\u031d\n$\3$\3$\5$\u0321\n$\3"+
		"$\5$\u0324\n$\3$\3$\3%\3%\3%\3%\5%\u032c\n%\3%\5%\u032f\n%\3%\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\5)\u0340\n)\3)\3)\5)\u0344\n)\3"+
		"*\3*\3*\3*\7*\u034a\n*\f*\16*\u034d\13*\3+\3+\3+\3+\3+\3+\7+\u0355\n+"+
		"\f+\16+\u0358\13+\3,\3,\3,\3,\3,\7,\u035f\n,\f,\16,\u0362\13,\3-\3-\3"+
		"-\3-\3-\5-\u0369\n-\3.\3.\3.\7.\u036e\n.\f.\16.\u0371\13.\3.\5.\u0374"+
		"\n.\3.\3.\5.\u0378\n.\3.\7.\u037b\n.\f.\16.\u037e\13.\3.\5.\u0381\n.\3"+
		".\3.\3.\5.\u0386\n.\3.\3.\5.\u038a\n.\3.\3.\5.\u038e\n.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u0398\n\60\3\60\3\60\5\60\u039c\n\60\3\60\3"+
		"\60\3\60\5\60\u03a1\n\60\3\61\3\61\3\61\5\61\u03a6\n\61\3\61\3\61\5\61"+
		"\u03aa\n\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u03b7\n\63\3\63\3\63\3\64\5\64\u03bc\n\64\3\64\3\64\3\64\3\64\5\64\u03c2"+
		"\n\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u03cb\n\65\3\65\3\65\5\65"+
		"\u03cf\n\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u03d7\n\66\3\66\5\66\u03da"+
		"\n\66\3\66\3\66\3\66\5\66\u03df\n\66\3\66\3\66\3\67\5\67\u03e4\n\67\3"+
		"\67\3\67\3\67\3\67\3\67\5\67\u03eb\n\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u03f2\n\67\3\67\5\67\u03f5\n\67\38\38\38\78\u03fa\n8\f8\168\u03fd\13"+
		"8\39\39\39\59\u0402\n9\39\79\u0405\n9\f9\169\u0408\139\39\79\u040b\n9"+
		"\f9\169\u040e\139\39\39\59\u0412\n9\39\59\u0415\n9\3:\3:\3;\3;\5;\u041b"+
		"\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\7;\u0427\n;\f;\16;\u042a\13;\3;\3;\3"+
		";\3;\3;\7;\u0431\n;\f;\16;\u0434\13;\3;\3;\3;\5;\u0439\n;\3<\3<\3<\5<"+
		"\u043e\n<\3<\3<\3<\5<\u0443\n<\3<\3<\3<\5<\u0448\n<\7<\u044a\n<\f<\16"+
		"<\u044d\13<\3<\3<\5<\u0451\n<\3<\5<\u0454\n<\3<\3<\3<\3<\3<\3<\7<\u045c"+
		"\n<\f<\16<\u045f\13<\3<\3<\3<\3<\3<\3<\3<\7<\u0468\n<\f<\16<\u046b\13"+
		"<\3<\3<\7<\u046f\n<\f<\16<\u0472\13<\5<\u0474\n<\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\5=\u0480\n=\3>\6>\u0483\n>\r>\16>\u0484\3?\3?\3?\5?\u048a\n"+
		"?\3@\5@\u048d\n@\3@\3@\3A\6A\u0492\nA\rA\16A\u0493\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\5B\u04a0\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\6C\u04ad\nC\r"+
		"C\16C\u04ae\3C\3C\3C\5C\u04b4\nC\3D\5D\u04b7\nD\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\7D\u04c4\nD\fD\16D\u04c7\13D\3D\3D\3D\5D\u04cc\nD\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\5D\u04d7\nD\3E\5E\u04da\nE\3E\3E\3E\3E\3E\3E\7E\u04e2"+
		"\nE\fE\16E\u04e5\13E\3E\3E\3E\3E\5E\u04eb\nE\3F\3F\3F\3F\5F\u04f1\nF\3"+
		"G\3G\3G\3G\7G\u04f7\nG\fG\16G\u04fa\13G\3H\3H\3H\3H\3H\3H\3H\5H\u0503"+
		"\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0517\nH"+
		"\3I\3I\3I\3I\5I\u051d\nI\3J\3J\5J\u0521\nJ\3J\3J\3J\5J\u0526\nJ\3J\3J"+
		"\5J\u052a\nJ\3J\3J\3J\5J\u052f\nJ\3J\5J\u0532\nJ\3J\3J\3J\5J\u0537\nJ"+
		"\3J\5J\u053a\nJ\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u0548\nK\3K\3K"+
		"\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\5K\u0567\nK\5K\u0569\nK\3L\3L\3L\5L\u056e\nL\3L\3L\5L\u0572"+
		"\nL\3L\3L\3M\5M\u0577\nM\3M\3M\3M\3M\3M\5M\u057e\nM\3M\5M\u0581\nM\3N"+
		"\5N\u0584\nN\3N\3N\3N\5N\u0589\nN\3N\3N\5N\u058d\nN\5N\u058f\nN\3O\3O"+
		"\3O\3O\3O\5O\u0596\nO\3O\3O\7O\u059a\nO\fO\16O\u059d\13O\3P\3P\3P\3P\5"+
		"P\u05a3\nP\3Q\3Q\3Q\3Q\5Q\u05a9\nQ\3Q\5Q\u05ac\nQ\3Q\3Q\3Q\5Q\u05b1\n"+
		"Q\3Q\3Q\5Q\u05b5\nQ\3Q\5Q\u05b8\nQ\3Q\3Q\3R\3R\3R\5R\u05bf\nR\3S\3S\3"+
		"S\3S\5S\u05c5\nS\3S\5S\u05c8\nS\3S\3S\3S\3S\3S\3S\3S\3S\5S\u05d2\nS\3"+
		"S\3S\3S\3S\5S\u05d8\nS\3S\5S\u05db\nS\3S\3S\3S\3S\3S\3S\3S\3S\5S\u05e5"+
		"\nS\5S\u05e7\nS\3T\3T\3T\3T\3T\7T\u05ee\nT\fT\16T\u05f1\13T\3U\3U\3U\3"+
		"U\5U\u05f7\nU\3U\3U\3U\3U\3U\5U\u05fe\nU\5U\u0600\nU\3V\3V\3V\3V\5V\u0606"+
		"\nV\3V\5V\u0609\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0614\nV\3W\3W\3W\3W"+
		"\3W\7W\u061b\nW\fW\16W\u061e\13W\3X\3X\3X\5X\u0623\nX\3Y\3Y\3Y\3Y\5Y\u0629"+
		"\nY\3Y\5Y\u062c\nY\3Y\3Y\3Y\5Y\u0631\nY\3Y\5Y\u0634\nY\3Y\5Y\u0637\nY"+
		"\3Y\5Y\u063a\nY\3Y\5Y\u063d\nY\3Y\3Y\3Y\3Y\5Y\u0643\nY\3Y\3Y\3Y\3Y\5Y"+
		"\u0649\nY\3Y\5Y\u064c\nY\3Y\3Y\3Y\5Y\u0651\nY\3Y\5Y\u0654\nY\3Y\5Y\u0657"+
		"\nY\3Y\5Y\u065a\nY\3Y\5Y\u065d\nY\3Y\3Y\3Y\3Y\5Y\u0663\nY\5Y\u0665\nY"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u066d\nZ\fZ\16Z\u0670\13Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u0678"+
		"\nZ\fZ\16Z\u067b\13Z\5Z\u067d\nZ\3[\3[\3[\3[\3[\5[\u0684\n[\3[\3[\3[\5"+
		"[\u0689\n[\3[\7[\u068c\n[\f[\16[\u068f\13[\3[\5[\u0692\n[\3[\3[\3[\3["+
		"\3[\3[\5[\u069a\n[\3[\3[\5[\u069e\n[\3[\7[\u06a1\n[\f[\16[\u06a4\13[\3"+
		"[\5[\u06a7\n[\5[\u06a9\n[\3\\\6\\\u06ac\n\\\r\\\16\\\u06ad\3]\3]\3]\3"+
		"]\3]\3]\5]\u06b6\n]\3]\3]\3]\5]\u06bb\n]\3^\3^\3^\3^\5^\u06c1\n^\3_\3"+
		"_\3_\3_\3_\7_\u06c8\n_\f_\16_\u06cb\13_\3_\5_\u06ce\n_\3_\3_\3_\3`\3`"+
		"\3`\3`\3`\5`\u06d8\n`\3a\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3c\3c\3c\3d\3d"+
		"\5d\u06ea\nd\3d\3d\5d\u06ee\nd\3e\3e\3e\3e\3e\5e\u06f5\ne\5e\u06f7\ne"+
		"\3f\3f\3f\3g\3g\3g\3g\3g\3g\3h\3h\5h\u0704\nh\3h\3h\3h\3h\5h\u070a\nh"+
		"\3h\3h\5h\u070e\nh\3i\3i\5i\u0712\ni\3i\3i\3i\3i\3i\3i\3i\3i\7i\u071c"+
		"\ni\fi\16i\u071f\13i\3i\3i\3j\3j\5j\u0725\nj\3k\3k\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\7l\u0733\nl\fl\16l\u0736\13l\3l\3l\7l\u073a\nl\fl\16l\u073d"+
		"\13l\3m\3m\5m\u0741\nm\3n\3n\5n\u0745\nn\3n\3n\3n\7n\u074a\nn\fn\16n\u074d"+
		"\13n\3n\5n\u0750\nn\3n\3n\5n\u0754\nn\3n\3n\3n\7n\u0759\nn\fn\16n\u075c"+
		"\13n\3n\5n\u075f\nn\3o\3o\3o\3o\5o\u0765\no\3o\3o\5o\u0769\no\3o\3o\3"+
		"o\3o\3o\3p\3p\3p\3p\5p\u0774\np\3p\3p\3p\3p\3p\5p\u077b\np\3p\3p\3p\3"+
		"p\3p\3q\3q\3q\3q\3q\3q\5q\u0788\nq\3r\5r\u078b\nr\3r\3r\3s\3s\3s\3s\7"+
		"s\u0793\ns\fs\16s\u0796\13s\3t\3t\5t\u079a\nt\3t\3t\3t\3t\3t\3u\3u\3u"+
		"\3u\7u\u07a5\nu\fu\16u\u07a8\13u\3u\3u\3v\3v\3v\3v\7v\u07b0\nv\fv\16v"+
		"\u07b3\13v\3w\3w\3w\3w\3w\5w\u07ba\nw\3x\3x\5x\u07be\nx\3x\3x\5x\u07c2"+
		"\nx\3x\3x\5x\u07c6\nx\5x\u07c8\nx\3y\3y\3y\5y\u07cd\ny\3y\5y\u07d0\ny"+
		"\3y\5y\u07d3\ny\3y\5y\u07d6\ny\3y\3y\5y\u07da\ny\3y\5y\u07dd\ny\3y\5y"+
		"\u07e0\ny\3z\5z\u07e3\nz\3z\5z\u07e6\nz\3z\3z\3z\7z\u07eb\nz\fz\16z\u07ee"+
		"\13z\3{\3{\3|\3|\3}\3}\3}\3~\3~\3~\5~\u07fa\n~\3~\3~\5~\u07fe\n~\3~\5"+
		"~\u0801\n~\3\177\3\177\5\177\u0805\n\177\3\177\3\177\3\177\3\177\3\177"+
		"\5\177\u080c\n\177\3\u0080\3\u0080\5\u0080\u0810\n\u0080\3\u0080\3\u0080"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u0818\n\u0081\f\u0081\16\u0081"+
		"\u081b\13\u0081\3\u0082\3\u0082\3\u0082\7\u0082\u0820\n\u0082\f\u0082"+
		"\16\u0082\u0823\13\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u0828\n\u0082"+
		"\f\u0082\16\u0082\u082b\13\u0082\5\u0082\u082d\n\u0082\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0084\5\u0084\u0834\n\u0084\3\u0085\3\u0085\5\u0085"+
		"\u0838\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u083e\n\u0086\3"+
		"\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0847\n"+
		"\u0087\3\u0088\5\u0088\u084a\n\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u084f"+
		"\n\u0088\3\u0088\5\u0088\u0852\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\7\u0089\u085a\n\u0089\f\u0089\16\u0089\u085d\13\u0089"+
		"\3\u0089\3\u0089\5\u0089\u0861\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\7\u008a\u0868\n\u008a\f\u008a\16\u008a\u086b\13\u008a\3\u008a"+
		"\3\u008a\5\u008a\u086f\n\u008a\3\u008b\3\u008b\5\u008b\u0873\n\u008b\3"+
		"\u008b\3\u008b\3\u008b\3\u008b\3\u008b\7\u008b\u087a\n\u008b\f\u008b\16"+
		"\u008b\u087d\13\u008b\3\u008b\5\u008b\u0880\n\u008b\3\u008c\3\u008c\3"+
		"\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e"+
		"\u088c\n\u008e\f\u008e\16\u008e\u088f\13\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u089b"+
		"\n\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08a0\n\u0091\7\u0091\u08a2\n"+
		"\u0091\f\u0091\16\u0091\u08a5\13\u0091\3\u0092\6\u0092\u08a8\n\u0092\r"+
		"\u0092\16\u0092\u08a9\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\5\u0093\u08b5\n\u0093\5\u0093\u08b7\n\u0093\3"+
		"\u0094\3\u0094\5\u0094\u08bb\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3"+
		"\u0094\5\u0094\u08c2\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u08c8"+
		"\n\u0094\f\u0094\16\u0094\u08cb\13\u0094\3\u0095\3\u0095\3\u0095\5\u0095"+
		"\u08d0\n\u0095\3\u0096\3\u0096\3\u0096\5\u0096\u08d5\n\u0096\3\u0096\3"+
		"\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096"+
		"\u08e0\n\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u08e9\n\u0096\3\u0097\3\u0097\5\u0097\u08ed\n\u0097\3\u0097\3"+
		"\u0097\3\u0097\3\u0097\3\u0097\7\u0097\u08f4\n\u0097\f\u0097\16\u0097"+
		"\u08f7\13\u0097\3\u0097\5\u0097\u08fa\n\u0097\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\7\u0098\u0902\n\u0098\f\u0098\16\u0098\u0905"+
		"\13\u0098\3\u0098\3\u0098\5\u0098\u0909\n\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b"+
		"\u091f\n\u009b\3\u009b\3\u009b\5\u009b\u0923\n\u009b\3\u009c\3\u009c\3"+
		"\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d"+
		"\u0938\n\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d\u0948"+
		"\n\u009d\f\u009d\16\u009d\u094b\13\u009d\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u0955\n\u009e\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\7\u00a1\u0962\n\u00a1\f\u00a1\16\u00a1\u0965\13\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0970"+
		"\n\u00a2\3\u00a3\3\u00a3\5\u00a3\u0974\n\u00a3\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\6\u00a4\u097d\n\u00a4\r\u00a4\16\u00a4"+
		"\u097e\3\u00a4\3\u00a4\5\u00a4\u0983\n\u00a4\3\u00a4\3\u00a4\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\6\u00a5\u098d\n\u00a5\r\u00a5\16"+
		"\u00a5\u098e\3\u00a5\3\u00a5\5\u00a5\u0993\n\u00a5\3\u00a5\3\u00a5\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u099e\n\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u09a3\n\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\5\u00a7\u09a8\n\u00a7\3\u00a7\3\u00a7\5\u00a7\u09ac\n\u00a7\3\u00a7\3"+
		"\u00a7\5\u00a7\u09b0\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u09b5\n\u00a7"+
		"\3\u00a7\3\u00a7\5\u00a7\u09b9\n\u00a7\3\u00a7\3\u00a7\5\u00a7\u09bd\n"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u09d4\n\u00a7\5\u00a7\u09d6\n"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7"+
		"\u09e8\n\u00a7\5\u00a7\u09ea\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3"+
		"\u00a7\3\u00a7\5\u00a7\u09f2\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u09f7"+
		"\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u09fc\n\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\5\u00a7\u0a01\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0a0e\n\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0a13\n\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\5\u00a7\u0a18\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0a1d\n\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a7\5\u00a7\u0a22\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5"+
		"\u00a7\u0a27\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0a2c\n\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\5\u00a7\u0a31\n\u00a7\5\u00a7\u0a33\n\u00a7\3\u00a8\3"+
		"\u00a8\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0a3a\n\u00a9\3\u00a9\5\u00a9\u0a3d"+
		"\n\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\7\u00aa"+
		"\u0a46\n\u00aa\f\u00aa\16\u00aa\u0a49\13\u00aa\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0a52\n\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0a5a\n\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0a63\n\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0a69\n\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\7\u00ab\u0a78\n\u00ab\f\u00ab\16\u00ab\u0a7b\13\u00ab\5\u00ab"+
		"\u0a7d\n\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0a8b\n\u00ab\f\u00ab"+
		"\16\u00ab\u0a8e\13\u00ab\5\u00ab\u0a90\n\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\7\u00ab\u0a9e\n\u00ab\f\u00ab\16\u00ab\u0aa1\13\u00ab\5\u00ab\u0aa3\n"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0ab1\n\u00ab\f\u00ab\16\u00ab"+
		"\u0ab4\13\u00ab\5\u00ab\u0ab6\n\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab"+
		"\u0ac4\n\u00ab\f\u00ab\16\u00ab\u0ac7\13\u00ab\5\u00ab\u0ac9\n\u00ab\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0ad7\n\u00ab\f\u00ab\16\u00ab\u0ada"+
		"\13\u00ab\5\u00ab\u0adc\n\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0ae8\n\u00ab\f\u00ab"+
		"\16\u00ab\u0aeb\13\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\6\u00ab\u0af7\n\u00ab\r\u00ab\16\u00ab"+
		"\u0af8\3\u00ab\3\u00ab\5\u00ab\u0afd\n\u00ab\3\u00ab\3\u00ab\3\u00ab\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\5\u00ab\u0b0d\n\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\5\u00ab\u0b13\n\u00ab\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0b18\n\u00ac\3"+
		"\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u0b1f\n\u00ad\f\u00ad\16"+
		"\u00ad\u0b22\13\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0b28\n"+
		"\u00ae\5\u00ae\u0b2a\n\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\5\u00b1\u0b36\n\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b1\5\u00b1\u0b3b\n\u00b1\7\u00b1\u0b3d\n\u00b1\f\u00b1\16"+
		"\u00b1\u0b40\13\u00b1\3\u00b2\3\u00b2\5\u00b2\u0b44\n\u00b2\3\u00b3\5"+
		"\u00b3\u0b47\n\u00b3\3\u00b3\3\u00b3\3\u00b4\5\u00b4\u0b4c\n\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8"+
		"\3\u00b8\2\6\32\36\u0126\u0138\u00b9\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\2,"+
		"\5\2\3\4\u0150\u0150\u0161\u0161\4\2__\u012c\u012c\4\2\u00f8\u00f8\u011b"+
		"\u011b\6\2\r\16\u00b4\u00b4\u00d7\u00d7\u0131\u0131\3\2\u00be\u00bf\5"+
		"\2\17\17mm\u0092\u0092\4\2!!))\4\2\66\66ff\4\2\u00af\u00af\u00f7\u00f7"+
		"\4\2\20\20RR\4\2OO\u0121\u0121\4\2gg\u00a2\u00a2\4\2OO\u00cf\u00cf\4\2"+
		"KK\u0082\u0082\5\2\u0086\u0086\u00a9\u00a9\u00cb\u00cc\4\2\u00a4\u00a4"+
		"\u00b6\u00b6\4\2\u00b3\u00b3\u0133\u0133\4\2\u00ea\u00ea\u011e\u011e\4"+
		"\2\u00a8\u00a8\u0167\u0167\4\2\37\37&&\4\2$$==\4\2AA\u00f0\u00f0\4\2\17"+
		"\17\u0092\u0092\3\2\u00e1\u00e2\3\2\u00d2\u00d3\6\2<<MM\u0091\u0091\u00c8"+
		"\u00c8\3\2\\]\4\2\u00eb\u00eb\u010d\u010d\4\2\36\36\u0107\u0107\3\2\u00f5"+
		"\u00f6\4\2\n\nVV\5\2rr\u009b\u009b\u00e4\u00e4\5\2==\u00ec\u00ed\u0122"+
		"\u0122\5\2dd\u00fb\u00fb\u0121\u0121\4\2\f\f\u00c2\u00c2\5\2\u009c\u009c"+
		"\u00db\u00db\u00e5\u00e5\5\2EF\u00ac\u00ad\u00f1\u00f2\4\2\63\63\u014f"+
		"\u014f\5\2pp\u0093\u0093\u00b9\u00b9\4\2\u014c\u014c\u0162\u0162\4\2h"+
		"h\u011c\u011c\16\2\b\31\33Z^^`\u00b9\u00bb\u00cc\u00ce\u00e9\u00eb\u00fe"+
		"\u0100\u0116\u0118\u011d\u0120\u012b\u012e\u013d\u0144\u014b\2\u0cda\2"+
		"\u0170\3\2\2\2\4\u017a\3\2\2\2\6\u017f\3\2\2\2\b\u0192\3\2\2\2\n\u0194"+
		"\3\2\2\2\f\u01a0\3\2\2\2\16\u01bf\3\2\2\2\20\u01c1\3\2\2\2\22\u01c3\3"+
		"\2\2\2\24\u01c8\3\2\2\2\26\u01d4\3\2\2\2\30\u01d6\3\2\2\2\32\u01df\3\2"+
		"\2\2\34\u01ed\3\2\2\2\36\u01f0\3\2\2\2 \u0225\3\2\2\2\"\u0227\3\2\2\2"+
		"$\u0242\3\2\2\2&\u0267\3\2\2\2(\u027f\3\2\2\2*\u0281\3\2\2\2,\u0289\3"+
		"\2\2\2.\u02a1\3\2\2\2\60\u02ae\3\2\2\2\62\u02b0\3\2\2\2\64\u02b6\3\2\2"+
		"\2\66\u02bc\3\2\2\28\u02be\3\2\2\2:\u02ce\3\2\2\2<\u02d3\3\2\2\2>\u02e5"+
		"\3\2\2\2@\u02e7\3\2\2\2B\u030c\3\2\2\2D\u0319\3\2\2\2F\u0320\3\2\2\2H"+
		"\u0327\3\2\2\2J\u0333\3\2\2\2L\u0336\3\2\2\2N\u0339\3\2\2\2P\u033b\3\2"+
		"\2\2R\u0345\3\2\2\2T\u034e\3\2\2\2V\u0359\3\2\2\2X\u0368\3\2\2\2Z\u038d"+
		"\3\2\2\2\\\u038f\3\2\2\2^\u0397\3\2\2\2`\u03a2\3\2\2\2b\u03ab\3\2\2\2"+
		"d\u03ae\3\2\2\2f\u03bb\3\2\2\2h\u03c5\3\2\2\2j\u03d2\3\2\2\2l\u03f1\3"+
		"\2\2\2n\u03f6\3\2\2\2p\u0414\3\2\2\2r\u0416\3\2\2\2t\u0438\3\2\2\2v\u0473"+
		"\3\2\2\2x\u0475\3\2\2\2z\u0482\3\2\2\2|\u0489\3\2\2\2~\u048c\3\2\2\2\u0080"+
		"\u0491\3\2\2\2\u0082\u049f\3\2\2\2\u0084\u04b3\3\2\2\2\u0086\u04d6\3\2"+
		"\2\2\u0088\u04ea\3\2\2\2\u008a\u04f0\3\2\2\2\u008c\u04f2\3\2\2\2\u008e"+
		"\u0516\3\2\2\2\u0090\u051c\3\2\2\2\u0092\u0539\3\2\2\2\u0094\u0568\3\2"+
		"\2\2\u0096\u056a\3\2\2\2\u0098\u0580\3\2\2\2\u009a\u058e\3\2\2\2\u009c"+
		"\u0590\3\2\2\2\u009e\u05a2\3\2\2\2\u00a0\u05ab\3\2\2\2\u00a2\u05bb\3\2"+
		"\2\2\u00a4\u05e6\3\2\2\2\u00a6\u05e8\3\2\2\2\u00a8\u05ff\3\2\2\2\u00aa"+
		"\u0608\3\2\2\2\u00ac\u0615\3\2\2\2\u00ae\u0622\3\2\2\2\u00b0\u0664\3\2"+
		"\2\2\u00b2\u067c\3\2\2\2\u00b4\u06a8\3\2\2\2\u00b6\u06ab\3\2\2\2\u00b8"+
		"\u06ba\3\2\2\2\u00ba\u06c0\3\2\2\2\u00bc\u06c2\3\2\2\2\u00be\u06d2\3\2"+
		"\2\2\u00c0\u06d9\3\2\2\2\u00c2\u06df\3\2\2\2\u00c4\u06e4\3\2\2\2\u00c6"+
		"\u06e7\3\2\2\2\u00c8\u06ef\3\2\2\2\u00ca\u06f8\3\2\2\2\u00cc\u06fb\3\2"+
		"\2\2\u00ce\u0709\3\2\2\2\u00d0\u070f\3\2\2\2\u00d2\u0722\3\2\2\2\u00d4"+
		"\u0726\3\2\2\2\u00d6\u0728\3\2\2\2\u00d8\u073e\3\2\2\2\u00da\u0742\3\2"+
		"\2\2\u00dc\u0760\3\2\2\2\u00de\u076f\3\2\2\2\u00e0\u0787\3\2\2\2\u00e2"+
		"\u078a\3\2\2\2\u00e4\u078e\3\2\2\2\u00e6\u0797\3\2\2\2\u00e8\u07a0\3\2"+
		"\2\2\u00ea\u07ab\3\2\2\2\u00ec\u07b9\3\2\2\2\u00ee\u07c7\3\2\2\2\u00f0"+
		"\u07c9\3\2\2\2\u00f2\u07e2\3\2\2\2\u00f4\u07ef\3\2\2\2\u00f6\u07f1\3\2"+
		"\2\2\u00f8\u07f3\3\2\2\2\u00fa\u0800\3\2\2\2\u00fc\u080b\3\2\2\2\u00fe"+
		"\u080f\3\2\2\2\u0100\u0813\3\2\2\2\u0102\u082c\3\2\2\2\u0104\u082e\3\2"+
		"\2\2\u0106\u0833\3\2\2\2\u0108\u0835\3\2\2\2\u010a\u0839\3\2\2\2\u010c"+
		"\u0846\3\2\2\2\u010e\u0851\3\2\2\2\u0110\u0853\3\2\2\2\u0112\u086e\3\2"+
		"\2\2\u0114\u0870\3\2\2\2\u0116\u0881\3\2\2\2\u0118\u0883\3\2\2\2\u011a"+
		"\u0886\3\2\2\2\u011c\u0890\3\2\2\2\u011e\u0893\3\2\2\2\u0120\u0896\3\2"+
		"\2\2\u0122\u08a7\3\2\2\2\u0124\u08b6\3\2\2\2\u0126\u08c1\3\2\2\2\u0128"+
		"\u08cf\3\2\2\2\u012a\u08e8\3\2\2\2\u012c\u08ea\3\2\2\2\u012e\u08fd\3\2"+
		"\2\2\u0130\u090f\3\2\2\2\u0132\u0913\3\2\2\2\u0134\u0922\3\2\2\2\u0136"+
		"\u0924\3\2\2\2\u0138\u0937\3\2\2\2\u013a\u0954\3\2\2\2\u013c\u0956\3\2"+
		"\2\2\u013e\u095a\3\2\2\2\u0140\u095c\3\2\2\2\u0142\u096f\3\2\2\2\u0144"+
		"\u0973\3\2\2\2\u0146\u0975\3\2\2\2\u0148\u0986\3\2\2\2\u014a\u0996\3\2"+
		"\2\2\u014c\u0a32\3\2\2\2\u014e\u0a34\3\2\2\2\u0150\u0a36\3\2\2\2\u0152"+
		"\u0a40\3\2\2\2\u0154\u0b12\3\2\2\2\u0156\u0b14\3\2\2\2\u0158\u0b1b\3\2"+
		"\2\2\u015a\u0b23\3\2\2\2\u015c\u0b2d\3\2\2\2\u015e\u0b30\3\2\2\2\u0160"+
		"\u0b35\3\2\2\2\u0162\u0b43\3\2\2\2\u0164\u0b46\3\2\2\2\u0166\u0b4b\3\2"+
		"\2\2\u0168\u0b4f\3\2\2\2\u016a\u0b51\3\2\2\2\u016c\u0b53\3\2\2\2\u016e"+
		"\u0b55\3\2\2\2\u0170\u0171\5\4\3\2\u0171\u0172\7\2\2\3\u0172\3\3\2\2\2"+
		"\u0173\u0176\5\6\4\2\u0174\u0176\5\16\b\2\u0175\u0173\3\2\2\2\u0175\u0174"+
		"\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0179\7v\2\2\u0178\u0177\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0175\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\5\3\2\2\2\u017e\u0180"+
		"\5T+\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0182\7\25\2\2\u0182\u0184\5\4\3\2\u0183\u0185\5\62\32\2\u0184\u0183"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\5\n\6\2\u0187"+
		"\7\3\2\2\2\u0188\u0189\7\25\2\2\u0189\u018b\5\4\3\2\u018a\u018c\5\62\32"+
		"\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e"+
		"\5\n\6\2\u018e\u0193\3\2\2\2\u018f\u0190\5\16\b\2\u0190\u0191\7\u0161"+
		"\2\2\u0191\u0193\3\2\2\2\u0192\u0188\3\2\2\2\u0192\u018f\3\2\2\2\u0193"+
		"\t\3\2\2\2\u0194\u0195\6\6\2\2\u0195\u0196\7_\2\2\u0196\13\3\2\2\2\u0197"+
		"\u01a1\5\6\4\2\u0198\u019a\5\16\b\2\u0199\u0198\3\2\2\2\u019a\u019b\3"+
		"\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d"+
		"\u019f\7v\2\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2"+
		"\2\2\u01a0\u0197\3\2\2\2\u01a0\u0199\3\2\2\2\u01a1\r\3\2\2\2\u01a2\u01c0"+
		"\5:\36\2\u01a3\u01c0\5L\'\2\u01a4\u01c0\5N(\2\u01a5\u01c0\5P)\2\u01a6"+
		"\u01c0\5\u00caf\2\u01a7\u01c0\5\u00ccg\2\u01a8\u01c0\5\u009cO\2\u01a9"+
		"\u01c0\5\u00a0Q\2\u01aa\u01c0\5\u00d0i\2\u01ab\u01c0\5j\66\2\u01ac\u01c0"+
		"\5\u00a4S\2\u01ad\u01c0\5\u00aaV\2\u01ae\u01c0\5\u00b0Y\2\u01af\u01c0"+
		"\5h\65\2\u01b0\u01c0\5R*\2\u01b1\u01c0\5\u00c6d\2\u01b2\u01c0\5\u00dc"+
		"o\2\u01b3\u01c0\5\u00dep\2\u01b4\u01c0\5\u00ba^\2\u01b5\u01c0\5\22\n\2"+
		"\u01b6\u01c0\5\u00d8m\2\u01b7\u01c0\5\u00e2r\2\u01b8\u01c0\5\u00c8e\2"+
		"\u01b9\u01c0\5\u00dan\2\u01ba\u01c0\5\66\34\2\u01bb\u01c0\5\34\17\2\u01bc"+
		"\u01c0\5\"\22\2\u01bd\u01c0\58\35\2\u01be\u01c0\5\20\t\2\u01bf\u01a2\3"+
		"\2\2\2\u01bf\u01a3\3\2\2\2\u01bf\u01a4\3\2\2\2\u01bf\u01a5\3\2\2\2\u01bf"+
		"\u01a6\3\2\2\2\u01bf\u01a7\3\2\2\2\u01bf\u01a8\3\2\2\2\u01bf\u01a9\3\2"+
		"\2\2\u01bf\u01aa\3\2\2\2\u01bf\u01ab\3\2\2\2\u01bf\u01ac\3\2\2\2\u01bf"+
		"\u01ad\3\2\2\2\u01bf\u01ae\3\2\2\2\u01bf\u01af\3\2\2\2\u01bf\u01b0\3\2"+
		"\2\2\u01bf\u01b1\3\2\2\2\u01bf\u01b2\3\2\2\2\u01bf\u01b3\3\2\2\2\u01bf"+
		"\u01b4\3\2\2\2\u01bf\u01b5\3\2\2\2\u01bf\u01b6\3\2\2\2\u01bf\u01b7\3\2"+
		"\2\2\u01bf\u01b8\3\2\2\2\u01bf\u01b9\3\2\2\2\u01bf\u01ba\3\2\2\2\u01bf"+
		"\u01bb\3\2\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2"+
		"\2\2\u01c0\17\3\2\2\2\u01c1\u01c2\t\2\2\2\u01c2\21\3\2\2\2\u01c3\u01c4"+
		"\5\u0094K\2\u01c4\u01c5\5\u0160\u00b1\2\u01c5\u01c6\5\30\r\2\u01c6\u01c7"+
		"\5\24\13\2\u01c7\23\3\2\2\2\u01c8\u01cc\7\u015b\2\2\u01c9\u01cb\5\26\f"+
		"\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd"+
		"\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\7\u015e\2"+
		"\2\u01d0\25\3\2\2\2\u01d1\u01d5\5\u00ba^\2\u01d2\u01d5\5\"\22\2\u01d3"+
		"\u01d5\5\34\17\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3"+
		"\2\2\2\u01d5\27\3\2\2\2\u01d6\u01da\7\u015c\2\2\u01d7\u01d9\5\32\16\2"+
		"\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db"+
		"\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\7\u015f\2"+
		"\2\u01de\31\3\2\2\2\u01df\u01e0\b\16\1\2\u01e0\u01e1\5\u0094K\2\u01e1"+
		"\u01e2\5\u0160\u00b1\2\u01e2\u01ea\3\2\2\2\u01e3\u01e4\f\3\2\2\u01e4\u01e5"+
		"\7\u014e\2\2\u01e5\u01e6\5\u0094K\2\u01e6\u01e7\5\u0160\u00b1\2\u01e7"+
		"\u01e9\3\2\2\2\u01e8\u01e3\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01ea\u01eb\3\2\2\2\u01eb\33\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee"+
		"\5\36\20\2\u01ee\u01ef\7\u0161\2\2\u01ef\35\3\2\2\2\u01f0\u01f1\b\20\1"+
		"\2\u01f1\u01f2\5\u0094K\2\u01f2\u01f3\5\u0160\u00b1\2\u01f3\u01f6\7\u0152"+
		"\2\2\u01f4\u01f7\5\u0164\u00b3\2\u01f5\u01f7\5\u0166\u00b4\2\u01f6\u01f4"+
		"\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u0206\3\2\2\2\u01fa\u01fb\f\3\2\2\u01fb\u01fc\7\u014e"+
		"\2\2\u01fc\u01fd\5\u0160\u00b1\2\u01fd\u0200\7\u0152\2\2\u01fe\u0201\5"+
		"\u0164\u00b3\2\u01ff\u0201\5\u0166\u00b4\2\u0200\u01fe\3\2\2\2\u0200\u01ff"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0205\3\2\2\2\u0204\u01fa\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0206\u0207\3\2\2\2\u0207\37\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a"+
		"\7\u0080\2\2\u020a\u020b\7\u015c\2\2\u020b\u020c\5\u0126\u0094\2\u020c"+
		"\u020d\7\u015f\2\2\u020d\u0211\5\24\13\2\u020e\u0210\5*\26\2\u020f\u020e"+
		"\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0216\5,\27\2\u0215\u0214\3\2"+
		"\2\2\u0215\u0216\3\2\2\2\u0216\u0226\3\2\2\2\u0217\u0218\7\u0080\2\2\u0218"+
		"\u0219\7\u015c\2\2\u0219\u021a\5\u0126\u0094\2\u021a\u021b\7\u015f\2\2"+
		"\u021b\u021f\5\24\13\2\u021c\u021e\5*\26\2\u021d\u021c\3\2\2\2\u021e\u0221"+
		"\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0223\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0222\u0224\5,\27\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0226\3\2\2\2\u0225\u0209\3\2\2\2\u0225\u0217\3\2\2\2\u0226"+
		"!\3\2\2\2\u0227\u0228\7m\2\2\u0228\u0229\7\u015c\2\2\u0229\u022a\5\u0094"+
		"K\2\u022a\u022b\5\u0160\u00b1\2\u022b\u022c\7\u0152\2\2\u022c\u022d\5"+
		"\u0164\u00b3\2\u022d\u022e\7\u0161\2\2\u022e\u022f\5\u0126\u0094\2\u022f"+
		"\u0230\7\u0161\2\2\u0230\u0231\5(\25\2\u0231\u0232\7\u015f\2\2\u0232\u0236"+
		"\7\u015b\2\2\u0233\u0235\5$\23\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2"+
		"\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236"+
		"\3\2\2\2\u0239\u023a\7\u015e\2\2\u023a#\3\2\2\2\u023b\u0243\5&\24\2\u023c"+
		"\u0243\5\"\22\2\u023d\u0243\5\34\17\2\u023e\u023f\7\35\2\2\u023f\u0243"+
		"\7\u0161\2\2\u0240\u0241\7\66\2\2\u0241\u0243\7\u0161\2\2\u0242\u023b"+
		"\3\2\2\2\u0242\u023c\3\2\2\2\u0242\u023d\3\2\2\2\u0242\u023e\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0243%\3\2\2\2\u0244\u0245\7\u0080\2\2\u0245\u0246\7\u015c"+
		"\2\2\u0246\u0247\5\u0126\u0094\2\u0247\u0248\7\u015f\2\2\u0248\u024c\7"+
		"\u015b\2\2\u0249\u024b\5$\23\2\u024a\u0249\3\2\2\2\u024b\u024e\3\2\2\2"+
		"\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e\u024c"+
		"\3\2\2\2\u024f\u0253\7\u015e\2\2\u0250\u0252\5.\30\2\u0251\u0250\3\2\2"+
		"\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0257"+
		"\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0258\5\60\31\2\u0257\u0256\3\2\2\2"+
		"\u0257\u0258\3\2\2\2\u0258\u0268\3\2\2\2\u0259\u025a\7\u0080\2\2\u025a"+
		"\u025b\7\u015c\2\2\u025b\u025c\5\u0126\u0094\2\u025c\u025d\7\u015f\2\2"+
		"\u025d\u0261\5$\23\2\u025e\u0260\5.\30\2\u025f\u025e\3\2\2\2\u0260\u0263"+
		"\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0265\3\2\2\2\u0263"+
		"\u0261\3\2\2\2\u0264\u0266\5\60\31\2\u0265\u0264\3\2\2\2\u0265\u0266\3"+
		"\2\2\2\u0266\u0268\3\2\2\2\u0267\u0244\3\2\2\2\u0267\u0259\3\2\2\2\u0268"+
		"\'\3\2\2\2\u0269\u026a\5\u0160\u00b1\2\u026a\u026b\7\u014c\2\2\u026b\u026c"+
		"\7\u014c\2\2\u026c\u0280\3\2\2\2\u026d\u026e\5\u0160\u00b1\2\u026e\u026f"+
		"\7\u0163\2\2\u026f\u0280\3\2\2\2\u0270\u0271\5\u0160\u00b1\2\u0271\u0272"+
		"\7\u014c\2\2\u0272\u0273\7\u0152\2\2\u0273\u0274\5\u0164\u00b3\2\u0274"+
		"\u0280\3\2\2\2\u0275\u0276\5\u0160\u00b1\2\u0276\u0277\7\u0162\2\2\u0277"+
		"\u0278\7\u0152\2\2\u0278\u0279\5\u0164\u00b3\2\u0279\u0280\3\2\2\2\u027a"+
		"\u027b\5\u0160\u00b1\2\u027b\u027c\7\u015a\2\2\u027c\u027d\7\u0152\2\2"+
		"\u027d\u027e\5\u0164\u00b3\2\u027e\u0280\3\2\2\2\u027f\u0269\3\2\2\2\u027f"+
		"\u026d\3\2\2\2\u027f\u0270\3\2\2\2\u027f\u0275\3\2\2\2\u027f\u027a\3\2"+
		"\2\2\u0280)\3\2\2\2\u0281\u0282\7\\\2\2\u0282\u0283\7\u015c\2\2\u0283"+
		"\u0284\5\u0126\u0094\2\u0284\u0285\7\u015f\2\2\u0285\u0286\7\u015b\2\2"+
		"\u0286\u0287\5\26\f\2\u0287\u0288\7\u015e\2\2\u0288+\3\2\2\2\u0289\u028a"+
		"\7[\2\2\u028a\u028b\7\u015b\2\2\u028b\u028c\5\26\f\2\u028c\u028d\7\u015e"+
		"\2\2\u028d-\3\2\2\2\u028e\u028f\7\\\2\2\u028f\u0290\7\u015c\2\2\u0290"+
		"\u0291\5\u0126\u0094\2\u0291\u0292\7\u015f\2\2\u0292\u0296\7\u015b\2\2"+
		"\u0293\u0295\5$\23\2\u0294\u0293\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294"+
		"\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u0296\3\2\2\2\u0299"+
		"\u029a\7\u015e\2\2\u029a\u02a2\3\2\2\2\u029b\u029c\7\\\2\2\u029c\u029d"+
		"\7\u015c\2\2\u029d\u029e\5\u0126\u0094\2\u029e\u029f\7\u015f\2\2\u029f"+
		"\u02a0\5$\23\2\u02a0\u02a2\3\2\2\2\u02a1\u028e\3\2\2\2\u02a1\u029b\3\2"+
		"\2\2\u02a2/\3\2\2\2\u02a3\u02a4\7[\2\2\u02a4\u02a8\7\u015b\2\2\u02a5\u02a7"+
		"\5$\23\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02af\7\u015e"+
		"\2\2\u02ac\u02ad\7[\2\2\u02ad\u02af\5$\23\2\u02ae\u02a3\3\2\2\2\u02ae"+
		"\u02ac\3\2\2\2\u02af\61\3\2\2\2\u02b0\u02b2\7c\2\2\u02b1\u02b3\5\64\33"+
		"\2\u02b2\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5"+
		"\3\2\2\2\u02b5\63\3\2\2\2\u02b6\u02b7\7\u012c\2\2\u02b7\u02b8\7\u0164"+
		"\2\2\u02b8\u02b9\7\u0115\2\2\u02b9\u02ba\5\4\3\2\u02ba\u02bb\n\3\2\2\u02bb"+
		"\65\3\2\2\2\u02bc\u02bd\7\u00ba\2\2\u02bd\67\3\2\2\2\u02be\u02bf\6\35"+
		"\5\2\u02bf\u02c0\5\u0138\u009d\2\u02c09\3\2\2\2\u02c1\u02c2\7\u00f7\2"+
		"\2\u02c2\u02cf\5D#\2\u02c3\u02c5\7\u00f7\2\2\u02c4\u02c3\3\2\2\2\u02c4"+
		"\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02cb\5<\37\2\u02c7\u02c8\7\u014e"+
		"\2\2\u02c8\u02ca\5<\37\2\u02c9\u02c7\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb"+
		"\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2"+
		"\2\2\u02ce\u02c1\3\2\2\2\u02ce\u02c4\3\2\2\2\u02cf;\3\2\2\2\u02d0\u02d4"+
		"\5> \2\u02d1\u02d4\5@!\2\u02d2\u02d4\5B\"\2\u02d3\u02d0\3\2\2\2\u02d3"+
		"\u02d1\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4=\3\2\2\2\u02d5\u02d7\5\u0160"+
		"\u00b1\2\u02d6\u02d8\7\u014d\2\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2"+
		"\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\7\u0152\2\2\u02da\u02db\5\u0138\u009d"+
		"\2\u02db\u02e6\3\2\2\2\u02dc\u02dd\7\u015c\2\2\u02dd\u02de\5\u0160\u00b1"+
		"\2\u02de\u02e0\7\u015f\2\2\u02df\u02e1\7\u014d\2\2\u02e0\u02df\3\2\2\2"+
		"\u02e0\u02e1\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\7\u0152\2\2\u02e3"+
		"\u02e4\5\u0138\u009d\2\u02e4\u02e6\3\2\2\2\u02e5\u02d5\3\2\2\2\u02e5\u02dc"+
		"\3\2\2\2\u02e6?\3\2\2\2\u02e7\u02e8\7\u015c\2\2\u02e8\u02ed\5\u0160\u00b1"+
		"\2\u02e9\u02ea\7\u014e\2\2\u02ea\u02ec\5\u0160\u00b1\2\u02eb\u02e9\3\2"+
		"\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02f0\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f2\7\u015f\2\2\u02f1\u02f3"+
		"\7\u014d\2\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3\2\2"+
		"\2\u02f4\u02f5\7\u0152\2\2\u02f5\u02f6\7\u015c\2\2\u02f6\u02fb\5\u0138"+
		"\u009d\2\u02f7\u02f8\7\u014e\2\2\u02f8\u02fa\5\u0138\u009d\2\u02f9\u02f7"+
		"\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"\u02fe\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u02ff\7\u015f\2\2\u02ffA\3\2"+
		"\2\2\u0300\u030d\5\u0160\u00b1\2\u0301\u0302\7\u015c\2\2\u0302\u0307\5"+
		"\u0160\u00b1\2\u0303\u0304\7\u014e\2\2\u0304\u0306\5\u0160\u00b1\2\u0305"+
		"\u0303\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2"+
		"\2\2\u0308\u030a\3\2\2\2\u0309\u0307\3\2\2\2\u030a\u030b\7\u015f\2\2\u030b"+
		"\u030d\3\2\2\2\u030c\u0300\3\2\2\2\u030c\u0301\3\2\2\2\u030d\u030f\3\2"+
		"\2\2\u030e\u0310\7\u014d\2\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311\u0312\7\u0152\2\2\u0312\u0313\7\u015c\2\2\u0313\u0314"+
		"\5\u00e2r\2\u0314\u0315\7\u015f\2\2\u0315C\3\2\2\2\u0316\u031a\5F$\2\u0317"+
		"\u031a\5J&\2\u0318\u031a\5H%\2\u0319\u0316\3\2\2\2\u0319\u0317\3\2\2\2"+
		"\u0319\u0318\3\2\2\2\u031aE\3\2\2\2\u031b\u031d\7>\2\2\u031c\u031b\3\2"+
		"\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0321\7\u00f0\2\2\u031f"+
		"\u0321\7?\2\2\u0320\u031c\3\2\2\2\u0320\u031f\3\2\2\2\u0321\u0323\3\2"+
		"\2\2\u0322\u0324\7\u0152\2\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u0325\3\2\2\2\u0325\u0326\5\u0138\u009d\2\u0326G\3\2\2\2\u0327\u0328"+
		"\7\u00d5\2\2\u0328\u032b\7\u0152\2\2\u0329\u032c\5\u0138\u009d\2\u032a"+
		"\u032c\7\u00b7\2\2\u032b\u0329\3\2\2\2\u032b\u032a\3\2\2\2\u032c\u032e"+
		"\3\2\2\2\u032d\u032f\7\u0121\2\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2"+
		"\2\u032f\u0330\3\2\2\2\u0330\u0331\7m\2\2\u0331\u0332\t\4\2\2\u0332I\3"+
		"\2\2\2\u0333\u0334\t\5\2\2\u0334\u0335\t\6\2\2\u0335K\3\2\2\2\u0336\u0337"+
		"\7\25\2\2\u0337\u0338\7\u011b\2\2\u0338M\3\2\2\2\u0339\u033a\7\35\2\2"+
		"\u033aO\3\2\2\2\u033b\u033c\7 \2\2\u033c\u0343\5\u0160\u00b1\2\u033d\u033f"+
		"\7\u015c\2\2\u033e\u0340\5\u0158\u00ad\2\u033f\u033e\3\2\2\2\u033f\u0340"+
		"\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0344\7\u015f\2\2\u0342\u0344\5\u0158"+
		"\u00ad\2\u0343\u033d\3\2\2\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344"+
		"Q\3\2\2\2\u0345\u0346\7I\2\2\u0346\u034b\5X-\2\u0347\u0348\7\u014e\2\2"+
		"\u0348\u034a\5X-\2\u0349\u0347\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349"+
		"\3\2\2\2\u034b\u034c\3\2\2\2\u034cS\3\2\2\2\u034d\u034b\3\2\2\2\u034e"+
		"\u034f\7I\2\2\u034f\u0350\5X-\2\u0350\u0356\7\u0161\2\2\u0351\u0352\5"+
		"X-\2\u0352\u0353\7\u0161\2\2\u0353\u0355\3\2\2\2\u0354\u0351\3\2\2\2\u0355"+
		"\u0358\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357U\3\2\2\2"+
		"\u0358\u0356\3\2\2\2\u0359\u035a\5X-\2\u035a\u0360\7\u0161\2\2\u035b\u035c"+
		"\5X-\2\u035c\u035d\7\u0161\2\2\u035d\u035f\3\2\2\2\u035e\u035b\3\2\2\2"+
		"\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361W\3"+
		"\2\2\2\u0362\u0360\3\2\2\2\u0363\u0369\5^\60\2\u0364\u0369\5\\/\2\u0365"+
		"\u0369\5d\63\2\u0366\u0369\5Z.\2\u0367\u0369\5f\64\2\u0368\u0363\3\2\2"+
		"\2\u0368\u0364\3\2\2\2\u0368\u0365\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0367"+
		"\3\2\2\2\u0369Y\3\2\2\2\u036a\u036f\5\u0160\u00b1\2\u036b\u036c\7\u014e"+
		"\2\2\u036c\u036e\5\u0160\u00b1\2\u036d\u036b\3\2\2\2\u036e\u0371\3\2\2"+
		"\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0373\3\2\2\2\u0371\u036f"+
		"\3\2\2\2\u0372\u0374\7\17\2\2\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2\2"+
		"\u0374\u0375\3\2\2\2\u0375\u0377\5\u0094K\2\u0376\u0378\5\u0096L\2\u0377"+
		"\u0376\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037c\3\2\2\2\u0379\u037b\5\u0098"+
		"M\2\u037a\u0379\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037c"+
		"\u037d\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037f\u0381\5\u009a"+
		"N\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u038e\3\2\2\2\u0382"+
		"\u0383\5\u0160\u00b1\2\u0383\u0385\7\60\2\2\u0384\u0386\7\17\2\2\u0385"+
		"\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0389\5\u0094"+
		"K\2\u0388\u038a\5\u0096L\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u038c\5\u009aN\2\u038c\u038e\3\2\2\2\u038d\u036a"+
		"\3\2\2\2\u038d\u0382\3\2\2\2\u038e[\3\2\2\2\u038f\u0390\5\u0160\u00b1"+
		"\2\u0390\u0391\7\64\2\2\u0391]\3\2\2\2\u0392\u0393\7@\2\2\u0393\u0398"+
		"\5\u0160\u00b1\2\u0394\u0395\5\u0160\u00b1\2\u0395\u0396\7@\2\2\u0396"+
		"\u0398\3\2\2\2\u0397\u0392\3\2\2\2\u0397\u0394\3\2\2\2\u0398\u039b\3\2"+
		"\2\2\u0399\u039c\5`\61\2\u039a\u039c\5b\62\2\u039b\u0399\3\2\2\2\u039b"+
		"\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u03a0\t\7"+
		"\2\2\u039e\u03a1\5\u00e2r\2\u039f\u03a1\5\u0138\u009d\2\u03a0\u039e\3"+
		"\2\2\2\u03a0\u039f\3\2\2\2\u03a1_\3\2\2\2\u03a2\u03a3\7\u012e\2\2\u03a3"+
		"\u03a5\7\u00e1\2\2\u03a4\u03a6\7\u00c0\2\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6"+
		"\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a8\7\u0119\2\2\u03a8\u03aa\t\b\2"+
		"\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aaa\3\2\2\2\u03ab\u03ac"+
		"\7\u012f\2\2\u03ac\u03ad\7\u00e1\2\2\u03adc\3\2\2\2\u03ae\u03af\t\t\2"+
		"\2\u03af\u03b0\7y\2\2\u03b0\u03b6\7m\2\2\u03b1\u03b7\7\u0103\2\2\u03b2"+
		"\u03b7\7\u0106\2\2\u03b3\u03b4\7\u00b8\2\2\u03b4\u03b7\7p\2\2\u03b5\u03b7"+
		"\5\u0160\u00b1\2\u03b6\u03b1\3\2\2\2\u03b6\u03b2\3\2\2\2\u03b6\u03b3\3"+
		"\2\2\2\u03b6\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\5\b\5\2\u03b9"+
		"e\3\2\2\2\u03ba\u03bc\7u\2\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc"+
		"\u03bd\3\2\2\2\u03bd\u03be\7\u0112\2\2\u03be\u03bf\7\u0110\2\2\u03bf\u03c1"+
		"\5\u0160\u00b1\2\u03c0\u03c2\5z>\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2"+
		"\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\5l\67\2\u03c4g\3\2\2\2\u03c5\u03c6"+
		"\7:\2\2\u03c6\u03ca\7\u0110\2\2\u03c7\u03c8\7\u0080\2\2\u03c8\u03c9\7"+
		"\u00b8\2\2\u03c9\u03cb\7e\2\2\u03ca\u03c7\3\2\2\2\u03ca\u03cb\3\2\2\2"+
		"\u03cb\u03cc\3\2\2\2\u03cc\u03ce\5\u0116\u008c\2\u03cd\u03cf\5z>\2\u03ce"+
		"\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\5l"+
		"\67\2\u03d1i\3\2\2\2\u03d2\u03d9\7:\2\2\u03d3\u03d4\7\u009f\2\2\u03d4"+
		"\u03da\7\u0112\2\2\u03d5\u03d7\t\n\2\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7"+
		"\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\7\u012b\2\2\u03d9\u03d3\3\2\2"+
		"\2\u03d9\u03d6\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\7\u0110\2\2\u03dc"+
		"\u03de\5\u0160\u00b1\2\u03dd\u03df\5z>\2\u03de\u03dd\3\2\2\2\u03de\u03df"+
		"\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\5l\67\2\u03e1k\3\2\2\2\u03e2"+
		"\u03e4\7\17\2\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\3"+
		"\2\2\2\u03e5\u03e6\7\u015c\2\2\u03e6\u03e7\5\u00e2r\2\u03e7\u03e8\7\u015f"+
		"\2\2\u03e8\u03f2\3\2\2\2\u03e9\u03eb\7\17\2\2\u03ea\u03e9\3\2\2\2\u03ea"+
		"\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03f2\5\u00e2r\2\u03ed\u03ee"+
		"\7\u015c\2\2\u03ee\u03ef\5n8\2\u03ef\u03f0\7\u015f\2\2\u03f0\u03f2\3\2"+
		"\2\2\u03f1\u03e3\3\2\2\2\u03f1\u03ea\3\2\2\2\u03f1\u03ed\3\2\2\2\u03f2"+
		"\u03f4\3\2\2\2\u03f3\u03f5\5\u0080A\2\u03f4\u03f3\3\2\2\2\u03f4\u03f5"+
		"\3\2\2\2\u03f5m\3\2\2\2\u03f6\u03fb\5p9\2\u03f7\u03f8\7\u014e\2\2\u03f8"+
		"\u03fa\5p9\2\u03f9\u03f7\3\2\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2\2"+
		"\2\u03fb\u03fc\3\2\2\2\u03fco\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u03ff"+
		"\5r:\2\u03ff\u0401\5\u0094K\2\u0400\u0402\5\u0096L\2\u0401\u0400\3\2\2"+
		"\2\u0401\u0402\3\2\2\2\u0402\u0406\3\2\2\2\u0403\u0405\5\u0098M\2\u0404"+
		"\u0403\3\2\2\2\u0405\u0408\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2"+
		"\2\2\u0407\u040c\3\2\2\2\u0408\u0406\3\2\2\2\u0409\u040b\5t;\2\u040a\u0409"+
		"\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d\3\2\2\2\u040d"+
		"\u0415\3\2\2\2\u040e\u040c\3\2\2\2\u040f\u0410\7\65\2\2\u0410\u0412\5"+
		"\u0160\u00b1\2\u0411\u040f\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413\3\2"+
		"\2\2\u0413\u0415\5v<\2\u0414\u03fe\3\2\2\2\u0414\u0411\3\2\2\2\u0415q"+
		"\3\2\2\2\u0416\u0417\5\u0160\u00b1\2\u0417s\3\2\2\2\u0418\u0439\5\u009a"+
		"N\2\u0419\u041b\7\u00b8\2\2\u041a\u0419\3\2\2\2\u041a\u041b\3\2\2\2\u041b"+
		"\u041c\3\2\2\2\u041c\u0439\7\u00ba\2\2\u041d\u041e\7\u00d0\2\2\u041e\u0439"+
		"\7\u0097\2\2\u041f\u0439\7\u0120\2\2\u0420\u0421\7\u00da\2\2\u0421\u0422"+
		"\5\u0116\u008c\2\u0422\u0423\7\u015c\2\2\u0423\u0424\5\u0160\u00b1\2\u0424"+
		"\u0428\7\u015f\2\2\u0425\u0427\5x=\2\u0426\u0425\3\2\2\2\u0427\u042a\3"+
		"\2\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u0439\3\2\2\2\u042a"+
		"\u0428\3\2\2\2\u042b\u042c\7\177\2\2\u042c\u042d\7\u015c\2\2\u042d\u0432"+
		"\7\u0167\2\2\u042e\u042f\7\u014e\2\2\u042f\u0431\7\u0167\2\2\u0430\u042e"+
		"\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"\u0435\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0439\7\u015f\2\2\u0436\u0439"+
		"\7\22\2\2\u0437\u0439\7^\2\2\u0438\u0418\3\2\2\2\u0438\u041a\3\2\2\2\u0438"+
		"\u041d\3\2\2\2\u0438\u041f\3\2\2\2\u0438\u0420\3\2\2\2\u0438\u042b\3\2"+
		"\2\2\u0438\u0436\3\2\2\2\u0438\u0437\3\2\2\2\u0439u\3\2\2\2\u043a\u043b"+
		"\7\u00d0\2\2\u043b\u043d\7\u0097\2\2\u043c\u043e\7+\2\2\u043d\u043c\3"+
		"\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\7\u015c\2\2"+
		"\u0440\u0442\5\u0160\u00b1\2\u0441\u0443\t\13\2\2\u0442\u0441\3\2\2\2"+
		"\u0442\u0443\3\2\2\2\u0443\u044b\3\2\2\2\u0444\u0445\7\u014e\2\2\u0445"+
		"\u0447\5\u0160\u00b1\2\u0446\u0448\t\13\2\2\u0447\u0446\3\2\2\2\u0447"+
		"\u0448\3\2\2\2\u0448\u044a\3\2\2\2\u0449\u0444\3\2\2\2\u044a\u044d\3\2"+
		"\2\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044e\3\2\2\2\u044d"+
		"\u044b\3\2\2\2\u044e\u0450\7\u015f\2\2\u044f\u0451\7^\2\2\u0450\u044f"+
		"\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0453\3\2\2\2\u0452\u0454\5\u00d4k"+
		"\2\u0453\u0452\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0474\3\2\2\2\u0455\u0456"+
		"\7n\2\2\u0456\u0457\7\u0097\2\2\u0457\u0458\7\u015c\2\2\u0458\u045d\5"+
		"\u0160\u00b1\2\u0459\u045a\7\u014e\2\2\u045a\u045c\5\u0160\u00b1\2\u045b"+
		"\u0459\3\2\2\2\u045c\u045f\3\2\2\2\u045d\u045b\3\2\2\2\u045d\u045e\3\2"+
		"\2\2\u045e\u0460\3\2\2\2\u045f\u045d\3\2\2\2\u0460\u0461\7\u015f\2\2\u0461"+
		"\u0462\7\u00da\2\2\u0462\u0463\5\u0116\u008c\2\u0463\u0464\7\u015c\2\2"+
		"\u0464\u0469\5\u0160\u00b1\2\u0465\u0466\7\u014e\2\2\u0466\u0468\5\u0160"+
		"\u00b1\2\u0467\u0465\3\2\2\2\u0468\u046b\3\2\2\2\u0469\u0467\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\u046c\3\2\2\2\u046b\u0469\3\2\2\2\u046c\u0470\7\u015f"+
		"\2\2\u046d\u046f\5x=\2\u046e\u046d\3\2\2\2\u046f\u0472\3\2\2\2\u0470\u046e"+
		"\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0474\3\2\2\2\u0472\u0470\3\2\2\2\u0473"+
		"\u043a\3\2\2\2\u0473\u0455\3\2\2\2\u0474w\3\2\2\2\u0475\u0476\7\u00bf"+
		"\2\2\u0476\u047f\t\f\2\2\u0477\u0478\7\u00b3\2\2\u0478\u0480\7\b\2\2\u0479"+
		"\u0480\7\u00de\2\2\u047a\u047b\7\u00f7\2\2\u047b\u0480\7\u00ba\2\2\u047c"+
		"\u047d\7\u00f7\2\2\u047d\u0480\7J\2\2\u047e\u0480\7\"\2\2\u047f\u0477"+
		"\3\2\2\2\u047f\u0479\3\2\2\2\u047f\u047a\3\2\2\2\u047f\u047c\3\2\2\2\u047f"+
		"\u047e\3\2\2\2\u0480y\3\2\2\2\u0481\u0483\5|?\2\u0482\u0481\3\2\2\2\u0483"+
		"\u0484\3\2\2\2\u0484\u0482\3\2\2\2\u0484\u0485\3\2\2\2\u0485{\3\2\2\2"+
		"\u0486\u0487\7\u014e\2\2\u0487\u048a\5~@\2\u0488\u048a\5\u008aF\2\u0489"+
		"\u0486\3\2\2\2\u0489\u0488\3\2\2\2\u048a}\3\2\2\2\u048b\u048d\7\u00b3"+
		"\2\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e"+
		"\u048f\t\r\2\2\u048f\177\3\2\2\2\u0490\u0492\5\u0082B\2\u0491\u0490\3"+
		"\2\2\2\u0492\u0493\3\2\2\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"\u0081\3\2\2\2\u0495\u0496\7\u00bf\2\2\u0496\u0497\7\61\2\2\u0497\u0498"+
		"\t\16\2\2\u0498\u04a0\7\u00e9\2\2\u0499\u04a0\5\u0084C\2\u049a\u04a0\5"+
		"\u0086D\2\u049b\u04a0\5\u0088E\2\u049c\u04a0\5\u008aF\2\u049d\u04a0\5"+
		"\u0090I\2\u049e\u04a0\5\u0092J\2\u049f\u0495\3\2\2\2\u049f\u0499\3\2\2"+
		"\2\u049f\u049a\3\2\2\2\u049f\u049b\3\2\2\2\u049f\u049c\3\2\2\2\u049f\u049d"+
		"\3\2\2\2\u049f\u049e\3\2\2\2\u04a0\u0083\3\2\2\2\u04a1\u04a2\7\u00f4\2"+
		"\2\u04a2\u04a3\7;\2\2\u04a3\u04b4\t\17\2\2\u04a4\u04a5\t\20\2\2\u04a5"+
		"\u04b4\7\u0167\2\2\u04a6\u04b4\7\u00b5\2\2\u04a7\u04b4\t\21\2\2\u04a8"+
		"\u04a9\7\u0108\2\2\u04a9\u04ac\7\u015c\2\2\u04aa\u04ad\5\u0160\u00b1\2"+
		"\u04ab\u04ad\7\u0167\2\2\u04ac\u04aa\3\2\2\2\u04ac\u04ab\3\2\2\2\u04ad"+
		"\u04ae\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2"+
		"\2\2\u04b0\u04b4\7\u015f\2\2\u04b1\u04b2\7\u0111\2\2\u04b2\u04b4\5\u0160"+
		"\u00b1\2\u04b3\u04a1\3\2\2\2\u04b3\u04a4\3\2\2\2\u04b3\u04a6\3\2\2\2\u04b3"+
		"\u04a7\3\2\2\2\u04b3\u04a8\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b4\u0085\3\2"+
		"\2\2\u04b5\u04b7\7\u0085\2\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7"+
		"\u04b8\3\2\2\2\u04b8\u04b9\7\u0083\2\2\u04b9\u04d7\5\u0160\u00b1\2\u04ba"+
		"\u04bb\7\u012e\2\2\u04bb\u04d7\7\u00dc\2\2\u04bc\u04bd\7W\2\2\u04bd\u04be"+
		"\7\36\2\2\u04be\u04bf\7z\2\2\u04bf\u04c0\7\u015c\2\2\u04c0\u04c5\5\u0160"+
		"\u00b1\2\u04c1\u04c2\7\u014e\2\2\u04c2\u04c4\5\u0160\u00b1\2\u04c3\u04c1"+
		"\3\2\2\2\u04c4\u04c7\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6"+
		"\u04c8\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c8\u04c9\7\u015f\2\2\u04c9\u04d7"+
		"\3\2\2\2\u04ca\u04cc\7\u00b8\2\2\u04cb\u04ca\3\2\2\2\u04cb\u04cc\3\2\2"+
		"\2\u04cc\u04cd\3\2\2\2\u04cd\u04d7\7\u00a3\2\2\u04ce\u04cf\7\62\2\2\u04cf"+
		"\u04d7\t\22\2\2\u04d0\u04d1\7N\2\2\u04d1\u04d7\7\u00c0\2\2\u04d2\u04d3"+
		"\7\u012e\2\2\u04d3\u04d4\7\u00de\2\2\u04d4\u04d5\7\u00bf\2\2\u04d5\u04d7"+
		"\7Y\2\2\u04d6\u04b6\3\2\2\2\u04d6\u04ba\3\2\2\2\u04d6\u04bc\3\2\2\2\u04d6"+
		"\u04cb\3\2\2\2\u04d6\u04ce\3\2\2\2\u04d6\u04d0\3\2\2\2\u04d6\u04d2\3\2"+
		"\2\2\u04d7\u0087\3\2\2\2\u04d8\u04da\7\u0120\2\2\u04d9\u04d8\3\2\2\2\u04d9"+
		"\u04da\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\7\u00d0\2\2\u04dc\u04dd"+
		"\7\u0085\2\2\u04dd\u04de\7\u015c\2\2\u04de\u04e3\5\u0160\u00b1\2\u04df"+
		"\u04e0\7\u014e\2\2\u04e0\u04e2\5\u0160\u00b1\2\u04e1\u04df\3\2\2\2\u04e2"+
		"\u04e5\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e6\3\2"+
		"\2\2\u04e5\u04e3\3\2\2\2\u04e6\u04e7\7\u015f\2\2\u04e7\u04eb\3\2\2\2\u04e8"+
		"\u04e9\7\u012e\2\2\u04e9\u04eb\7B\2\2\u04ea\u04d9\3\2\2\2\u04ea\u04e8"+
		"\3\2\2\2\u04eb\u0089\3\2\2\2\u04ec\u04f1\5\u008cG\2\u04ed\u04ee\7\u0109"+
		"\2\2\u04ee\u04ef\7\17\2\2\u04ef\u04f1\5\u0160\u00b1\2\u04f0\u04ec\3\2"+
		"\2\2\u04f0\u04ed\3\2\2\2\u04f1\u008b\3\2\2\2\u04f2\u04f3\7\u00e8\2\2\u04f3"+
		"\u04f4\7o\2\2\u04f4\u04f8\7P\2\2\u04f5\u04f7\5\u008eH\2\u04f6\u04f5\3"+
		"\2\2\2\u04f7\u04fa\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"+
		"\u008d\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fb\u04fc\7i\2\2\u04fc\u04fd\7\u0113"+
		"\2\2\u04fd\u04fe\7\36\2\2\u04fe\u0502\5\u0138\u009d\2\u04ff\u0500\7a\2"+
		"\2\u0500\u0501\7\36\2\2\u0501\u0503\5\u0138\u009d\2\u0502\u04ff\3\2\2"+
		"\2\u0502\u0503\3\2\2\2\u0503\u0517\3\2\2\2\u0504\u0505\7-\2\2\u0505\u0506"+
		"\7\u0094\2\2\u0506\u0507\7\u0113\2\2\u0507\u0508\7\36\2\2\u0508\u0517"+
		"\5\u0138\u009d\2\u0509\u050a\7\u00a6\2\2\u050a\u050b\7\u0098\2\2\u050b"+
		"\u050c\7\u0113\2\2\u050c\u050d\7\36\2\2\u050d\u0517\5\u0138\u009d\2\u050e"+
		"\u050f\7\u009e\2\2\u050f\u0510\7\u0113\2\2\u0510\u0511\7\36\2\2\u0511"+
		"\u0517\5\u0138\u009d\2\u0512\u0513\7\u00ba\2\2\u0513\u0514\7L\2\2\u0514"+
		"\u0515\7\17\2\2\u0515\u0517\5\u0138\u009d\2\u0516\u04fb\3\2\2\2\u0516"+
		"\u0504\3\2\2\2\u0516\u0509\3\2\2\2\u0516\u050e\3\2\2\2\u0516\u0512\3\2"+
		"\2\2\u0517\u008f\3\2\2\2\u0518\u0519\7\u00bf\2\2\u0519\u051d\5\u0160\u00b1"+
		"\2\u051a\u051b\7\u0114\2\2\u051b\u051d\5\u0160\u00b1\2\u051c\u0518\3\2"+
		"\2\2\u051c\u051a\3\2\2\2\u051d\u0091\3\2\2\2\u051e\u0520\7\22\2\2\u051f"+
		"\u0521\7\u0152\2\2\u0520\u051f\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522"+
		"\3\2\2\2\u0522\u053a\5\u0138\u009d\2\u0523\u0525\7/\2\2\u0524\u0526\7"+
		"\u0152\2\2\u0525\u0524\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\3\2\2\2"+
		"\u0527\u053a\5\u0138\u009d\2\u0528\u052a\7J\2\2\u0529\u0528\3\2\2\2\u0529"+
		"\u052a\3\2\2\2\u052a\u052e\3\2\2\2\u052b\u052c\7\'\2\2\u052c\u052f\7\u00f7"+
		"\2\2\u052d\u052f\7(\2\2\u052e\u052b\3\2\2\2\u052e\u052d\3\2\2\2\u052f"+
		"\u0531\3\2\2\2\u0530\u0532\7\u0152\2\2\u0531\u0530\3\2\2\2\u0531\u0532"+
		"\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u053a\5\u0138\u009d\2\u0534\u0536\7"+
		"`\2\2\u0535\u0537\7\u0152\2\2\u0536\u0535\3\2\2\2\u0536\u0537\3\2\2\2"+
		"\u0537\u0538\3\2\2\2\u0538\u053a\5\u0138\u009d\2\u0539\u051e\3\2\2\2\u0539"+
		"\u0523\3\2\2\2\u0539\u0529\3\2\2\2\u0539\u0534\3\2\2\2\u053a\u0093\3\2"+
		"\2\2\u053b\u0569\7&\2\2\u053c\u0569\7\27\2\2\u053d\u0569\7\30\2\2\u053e"+
		"\u0569\7\31\2\2\u053f\u0569\7\32\2\2\u0540\u0569\7\33\2\2\u0541\u0569"+
		"\7C\2\2\u0542\u0569\7D\2\2\u0543\u0569\7G\2\2\u0544\u0569\7H\2\2\u0545"+
		"\u0547\7X\2\2\u0546\u0548\7\u00ce\2\2\u0547\u0546\3\2\2\2\u0547\u0548"+
		"\3\2\2\2\u0548\u0569\3\2\2\2\u0549\u0569\7l\2\2\u054a\u0569\7\u0089\2"+
		"\2\u054b\u0569\7\u008a\2\2\u054c\u0569\7\u008b\2\2\u054d\u0569\7\u008c"+
		"\2\2\u054e\u0569\7\u008d\2\2\u054f\u0569\7\u00b0\2\2\u0550\u0569\7\u00b2"+
		"\2\2\u0551\u0569\7\u00bc\2\2\u0552\u0569\7\u00bb\2\2\u0553\u0569\7\u00cd"+
		"\2\2\u0554\u0569\7\u00d9\2\2\u0555\u0556\7\u00e0\2\2\u0556\u0569\7\u012a"+
		"\2\2\u0557\u0569\7\u00fe\2\2\u0558\u0569\7\u00fd\2\2\u0559\u0569\7\u00ff"+
		"\2\2\u055a\u0569\7\u0101\2\2\u055b\u0569\7\u0100\2\2\u055c\u0569\7\u010a"+
		"\2\2\u055d\u0569\7\u010f\2\2\u055e\u0569\7\u0116\2\2\u055f\u0569\7\u0117"+
		"\2\2\u0560\u0569\7\u0128\2\2\u0561\u0569\7\u0129\2\2\u0562\u0569\7\u0132"+
		"\2\2\u0563\u0566\5\u0160\u00b1\2\u0564\u0565\7\5\2\2\u0565\u0567\t\23"+
		"\2\2\u0566\u0564\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0569\3\2\2\2\u0568"+
		"\u053b\3\2\2\2\u0568\u053c\3\2\2\2\u0568\u053d\3\2\2\2\u0568\u053e\3\2"+
		"\2\2\u0568\u053f\3\2\2\2\u0568\u0540\3\2\2\2\u0568\u0541\3\2\2\2\u0568"+
		"\u0542\3\2\2\2\u0568\u0543\3\2\2\2\u0568\u0544\3\2\2\2\u0568\u0545\3\2"+
		"\2\2\u0568\u0549\3\2\2\2\u0568\u054a\3\2\2\2\u0568\u054b\3\2\2\2\u0568"+
		"\u054c\3\2\2\2\u0568\u054d\3\2\2\2\u0568\u054e\3\2\2\2\u0568\u054f\3\2"+
		"\2\2\u0568\u0550\3\2\2\2\u0568\u0551\3\2\2\2\u0568\u0552\3\2\2\2\u0568"+
		"\u0553\3\2\2\2\u0568\u0554\3\2\2\2\u0568\u0555\3\2\2\2\u0568\u0557\3\2"+
		"\2\2\u0568\u0558\3\2\2\2\u0568\u0559\3\2\2\2\u0568\u055a\3\2\2\2\u0568"+
		"\u055b\3\2\2\2\u0568\u055c\3\2\2\2\u0568\u055d\3\2\2\2\u0568\u055e\3\2"+
		"\2\2\u0568\u055f\3\2\2\2\u0568\u0560\3\2\2\2\u0568\u0561\3\2\2\2\u0568"+
		"\u0562\3\2\2\2\u0568\u0563\3\2\2\2\u0569\u0095\3\2\2\2\u056a\u056b\7\u015c"+
		"\2\2\u056b\u056d\t\24\2\2\u056c\u056e\t\25\2\2\u056d\u056c\3\2\2\2\u056d"+
		"\u056e\3\2\2\2\u056e\u0571\3\2\2\2\u056f\u0570\7\u014e\2\2\u0570\u0572"+
		"\7\u0167\2\2\u0571\u056f\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0573\3\2\2"+
		"\2\u0573\u0574\7\u015f\2\2\u0574\u0097\3\2\2\2\u0575\u0577\7\u00b8\2\2"+
		"\u0576\u0575\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u0581"+
		"\7\u00ba\2\2\u0579\u057a\7\'\2\2\u057a\u057b\7\u00f7\2\2\u057b\u0581\5"+
		"\u0160\u00b1\2\u057c\u057e\7\u00b8\2\2\u057d\u057c\3\2\2\2\u057d\u057e"+
		"\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0581\t\26\2\2\u0580\u0576\3\2\2\2"+
		"\u0580\u0579\3\2\2\2\u0580\u057d\3\2\2\2\u0581\u0099\3\2\2\2\u0582\u0584"+
		"\7\u014d\2\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0585\3\2\2"+
		"\2\u0585\u0586\7\u0152\2\2\u0586\u058f\5\u0138\u009d\2\u0587\u0589\7\u012e"+
		"\2\2\u0588\u0587\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\3\2\2\2\u058a"+
		"\u058c\7J\2\2\u058b\u058d\5\u0138\u009d\2\u058c\u058b\3\2\2\2\u058c\u058d"+
		"\3\2\2\2\u058d\u058f\3\2\2\2\u058e\u0583\3\2\2\2\u058e\u0588\3\2\2\2\u058f"+
		"\u009b\3\2\2\2\u0590\u0591\7:\2\2\u0591\u0595\t\27\2\2\u0592\u0593\7\u0080"+
		"\2\2\u0593\u0594\7\u00b8\2\2\u0594\u0596\7e\2\2\u0595\u0592\3\2\2\2\u0595"+
		"\u0596\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u059b\5\u0138\u009d\2\u0598\u059a"+
		"\5\u009eP\2\u0599\u0598\3\2\2\2\u059a\u059d\3\2\2\2\u059b\u0599\3\2\2"+
		"\2\u059b\u059c\3\2\2\2\u059c\u009d\3\2\2\2\u059d\u059b\3\2\2\2\u059e\u059f"+
		"\7/\2\2\u059f\u05a3\5\u0138\u009d\2\u05a0\u05a1\7\u00a0\2\2\u05a1\u05a3"+
		"\5\u0138\u009d\2\u05a2\u059e\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a3\u009f\3"+
		"\2\2\2\u05a4\u05ac\7\13\2\2\u05a5\u05a8\7:\2\2\u05a6\u05a7\7\u00c2\2\2"+
		"\u05a7\u05a9\7\u00dc\2\2\u05a8\u05a6\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9"+
		"\u05ac\3\2\2\2\u05aa\u05ac\7\u00dc\2\2\u05ab\u05a4\3\2\2\2\u05ab\u05a5"+
		"\3\2\2\2\u05ab\u05aa\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad"+
		"\u05ae\7s\2\2\u05ae\u05b0\5\u0160\u00b1\2\u05af\u05b1\5\u00b2Z\2\u05b0"+
		"\u05af\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b4\5\u00a2"+
		"R\2\u05b3\u05b5\t\30\2\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5"+
		"\u05b7\3\2\2\2\u05b6\u05b8\5V,\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8\3\2\2"+
		"\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\5\b\5\2\u05ba\u00a1\3\2\2\2\u05bb\u05bc"+
		"\t\31\2\2\u05bc\u05be\5\u0094K\2\u05bd\u05bf\5\u0096L\2\u05be\u05bd\3"+
		"\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u00a3\3\2\2\2\u05c0\u05c8\7\13\2\2\u05c1"+
		"\u05c4\7:\2\2\u05c2\u05c3\7\u00c2\2\2\u05c3\u05c5\7\u00dc\2\2\u05c4\u05c2"+
		"\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c8\3\2\2\2\u05c6\u05c8\7\u00dc\2"+
		"\2\u05c7\u05c0\3\2\2\2\u05c7\u05c1\3\2\2\2\u05c7\u05c6\3\2\2\2\u05c7\u05c8"+
		"\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca\7\u00c9\2\2\u05ca\u05cb\5\u0160"+
		"\u00b1\2\u05cb\u05cc\t\30\2\2\u05cc\u05cd\5\u00a6T\2\u05cd\u05d1\7_\2"+
		"\2\u05ce\u05cf\5\u0160\u00b1\2\u05cf\u05d0\7\u0161\2\2\u05d0\u05d2\3\2"+
		"\2\2\u05d1\u05ce\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05e7\3\2\2\2\u05d3"+
		"\u05db\7\13\2\2\u05d4\u05d7\7:\2\2\u05d5\u05d6\7\u00c2\2\2\u05d6\u05d8"+
		"\7\u00dc\2\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05db\3\2\2"+
		"\2\u05d9\u05db\7\u00dc\2\2\u05da\u05d3\3\2\2\2\u05da\u05d4\3\2\2\2\u05da"+
		"\u05d9\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05dd\7\u00c9"+
		"\2\2\u05dd\u05de\5\u0160\u00b1\2\u05de\u05df\t\30\2\2\u05df\u05e0\5\u00a6"+
		"T\2\u05e0\u05e4\7_\2\2\u05e1\u05e2\5\u0160\u00b1\2\u05e2\u05e3\5\u016c"+
		"\u00b7\2\u05e3\u05e5\3\2\2\2\u05e4\u05e1\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5"+
		"\u05e7\3\2\2\2\u05e6\u05c7\3\2\2\2\u05e6\u05da\3\2\2\2\u05e7\u00a5\3\2"+
		"\2\2\u05e8\u05e9\5\u00a8U\2\u05e9\u05ef\7\u0161\2\2\u05ea\u05eb\5\u00a8"+
		"U\2\u05eb\u05ec\7\u0161\2\2\u05ec\u05ee\3\2\2\2\u05ed\u05ea\3\2\2\2\u05ee"+
		"\u05f1\3\2\2\2\u05ef\u05ed\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u00a7\3\2"+
		"\2\2\u05f1\u05ef\3\2\2\2\u05f2\u0600\5X-\2\u05f3\u05f4\7s\2\2\u05f4\u05f6"+
		"\5\u0160\u00b1\2\u05f5\u05f7\5\u00b2Z\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7"+
		"\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f9\5\u00a2R\2\u05f9\u0600\3\2\2"+
		"\2\u05fa\u05fb\t\32\2\2\u05fb\u05fd\5\u0160\u00b1\2\u05fc\u05fe\5\u00b2"+
		"Z\2\u05fd\u05fc\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u0600\3\2\2\2\u05ff"+
		"\u05f2\3\2\2\2\u05ff\u05f3\3\2\2\2\u05ff\u05fa\3\2\2\2\u0600\u00a9\3\2"+
		"\2\2\u0601\u0609\7\13\2\2\u0602\u0605\7:\2\2\u0603\u0604\7\u00c2\2\2\u0604"+
		"\u0606\7\u00dc\2\2\u0605\u0603\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0609"+
		"\3\2\2\2\u0607\u0609\7\u00dc\2\2\u0608\u0601\3\2\2\2\u0608\u0602\3\2\2"+
		"\2\u0608\u0607\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060b"+
		"\7\u00c9\2\2\u060b\u060c\7\34\2\2\u060c\u060d\5\u0160\u00b1\2\u060d\u060e"+
		"\t\30\2\2\u060e\u060f\5\u00acW\2\u060f\u0613\7_\2\2\u0610\u0611\5\u0160"+
		"\u00b1\2\u0611\u0612\7\u0161\2\2\u0612\u0614\3\2\2\2\u0613\u0610\3\2\2"+
		"\2\u0613\u0614\3\2\2\2\u0614\u00ab\3\2\2\2\u0615\u0616\5\u00aeX\2\u0616"+
		"\u061c\7\u0161\2\2\u0617\u0618\5\u00aeX\2\u0618\u0619\7\u0161\2\2\u0619"+
		"\u061b\3\2\2\2\u061a\u0617\3\2\2\2\u061b\u061e\3\2\2\2\u061c\u061a\3\2"+
		"\2\2\u061c\u061d\3\2\2\2\u061d\u00ad\3\2\2\2\u061e\u061c\3\2\2\2\u061f"+
		"\u0623\5X-\2\u0620\u0623\5\u00a0Q\2\u0621\u0623\5\u00b0Y\2\u0622\u061f"+
		"\3\2\2\2\u0622\u0620\3\2\2\2\u0622\u0621\3\2\2\2\u0623\u00af\3\2\2\2\u0624"+
		"\u062c\7\13\2\2\u0625\u0628\7:\2\2\u0626\u0627\7\u00c2\2\2\u0627\u0629"+
		"\7\u00dc\2\2\u0628\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062c\3\2\2"+
		"\2\u062a\u062c\7\u00dc\2\2\u062b\u0624\3\2\2\2\u062b\u0625\3\2\2\2\u062b"+
		"\u062a\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062e\t\32"+
		"\2\2\u062e\u0630\5\u0160\u00b1\2\u062f\u0631\5\u00b2Z\2\u0630\u062f\3"+
		"\2\2\2\u0630\u0631\3\2\2\2\u0631\u0633\3\2\2\2\u0632\u0634\5\u00b6\\\2"+
		"\u0633\u0632\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0636\3\2\2\2\u0635\u0637"+
		"\t\30\2\2\u0636\u0635\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0639\3\2\2\2"+
		"\u0638\u063a\5V,\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063c"+
		"\3\2\2\2\u063b\u063d\5\u00e0q\2\u063c\u063b\3\2\2\2\u063c\u063d\3\2\2"+
		"\2\u063d\u063e\3\2\2\2\u063e\u0642\5\f\7\2\u063f\u0640\5\u0160\u00b1\2"+
		"\u0640\u0641\7\u0161\2\2\u0641\u0643\3\2\2\2\u0642\u063f\3\2\2\2\u0642"+
		"\u0643\3\2\2\2\u0643\u0665\3\2\2\2\u0644\u064c\7\13\2\2\u0645\u0648\7"+
		":\2\2\u0646\u0647\7\u00c2\2\2\u0647\u0649\7\u00dc\2\2\u0648\u0646\3\2"+
		"\2\2\u0648\u0649\3\2\2\2\u0649\u064c\3\2\2\2\u064a\u064c\7\u00dc\2\2\u064b"+
		"\u0644\3\2\2\2\u064b\u0645\3\2\2\2\u064b\u064a\3\2\2\2\u064b\u064c\3\2"+
		"\2\2\u064c\u064d\3\2\2\2\u064d\u064e\t\32\2\2\u064e\u0650\5\u0160\u00b1"+
		"\2\u064f\u0651\5\u00b2Z\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651"+
		"\u0653\3\2\2\2\u0652\u0654\5\u00b6\\\2\u0653\u0652\3\2\2\2\u0653\u0654"+
		"\3\2\2\2\u0654\u0656\3\2\2\2\u0655\u0657\t\30\2\2\u0656\u0655\3\2\2\2"+
		"\u0656\u0657\3\2\2\2\u0657\u0659\3\2\2\2\u0658\u065a\5V,\2\u0659\u0658"+
		"\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u065c\3\2\2\2\u065b\u065d\5\u00e0q"+
		"\2\u065c\u065b\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0662"+
		"\5\f\7\2\u065f\u0660\5\u0160\u00b1\2\u0660\u0661\5\u016c\u00b7\2\u0661"+
		"\u0663\3\2\2\2\u0662\u065f\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0665\3\2"+
		"\2\2\u0664\u062b\3\2\2\2\u0664\u064b\3\2\2\2\u0665\u00b1\3\2\2\2\u0666"+
		"\u0667\7\u015c\2\2\u0667\u067d\7\u015f\2\2\u0668\u0669\7\u015c\2\2\u0669"+
		"\u066e\5\u00b4[\2\u066a\u066b\7\u014e\2\2\u066b\u066d\5\u00b4[\2\u066c"+
		"\u066a\3\2\2\2\u066d\u0670\3\2\2\2\u066e\u066c\3\2\2\2\u066e\u066f\3\2"+
		"\2\2\u066f\u0671\3\2\2\2\u0670\u066e\3\2\2\2\u0671\u0672\7\u015f\2\2\u0672"+
		"\u067d\3\2\2\2\u0673\u0674\6Z\6\2\u0674\u0679\5\u00b4[\2\u0675\u0676\7"+
		"\u014e\2\2\u0676\u0678\5\u00b4[\2\u0677\u0675\3\2\2\2\u0678\u067b\3\2"+
		"\2\2\u0679\u0677\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067d\3\2\2\2\u067b"+
		"\u0679\3\2\2\2\u067c\u0666\3\2\2\2\u067c\u0668\3\2\2\2\u067c\u0673\3\2"+
		"\2\2\u067d\u00b3\3\2\2\2\u067e\u0684\7\u0083\2\2\u067f\u0684\7\u00c4\2"+
		"\2\u0680\u0684\7\u0088\2\2\u0681\u0682\7\u0083\2\2\u0682\u0684\7\u00c4"+
		"\2\2\u0683\u067e\3\2\2\2\u0683\u067f\3\2\2\2\u0683\u0680\3\2\2\2\u0683"+
		"\u0681\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0686\5\u0160"+
		"\u00b1\2\u0686\u0688\5\u0094K\2\u0687\u0689\5\u0096L\2\u0688\u0687\3\2"+
		"\2\2\u0688\u0689\3\2\2\2\u0689\u068d\3\2\2\2\u068a\u068c\5\u0098M\2\u068b"+
		"\u068a\3\2\2\2\u068c\u068f\3\2\2\2\u068d\u068b\3\2\2\2\u068d\u068e\3\2"+
		"\2\2\u068e\u0691\3\2\2\2\u068f\u068d\3\2\2\2\u0690\u0692\5\u009aN\2\u0691"+
		"\u0690\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u06a9\3\2\2\2\u0693\u0699\5\u0160"+
		"\u00b1\2\u0694\u069a\7\u0083\2\2\u0695\u069a\7\u00c4\2\2\u0696\u069a\7"+
		"\u0088\2\2\u0697\u0698\7\u0083\2\2\u0698\u069a\7\u00c4\2\2\u0699\u0694"+
		"\3\2\2\2\u0699\u0695\3\2\2\2\u0699\u0696\3\2\2\2\u0699\u0697\3\2\2\2\u0699"+
		"\u069a\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069d\5\u0094K\2\u069c\u069e"+
		"\5\u0096L\2\u069d\u069c\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u06a2\3\2\2"+
		"\2\u069f\u06a1\5\u0098M\2\u06a0\u069f\3\2\2\2\u06a1\u06a4\3\2\2\2\u06a2"+
		"\u06a0\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a6\3\2\2\2\u06a4\u06a2\3\2"+
		"\2\2\u06a5\u06a7\5\u009aN\2\u06a6\u06a5\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7"+
		"\u06a9\3\2\2\2\u06a8\u0683\3\2\2\2\u06a8\u0693\3\2\2\2\u06a9\u00b5\3\2"+
		"\2\2\u06aa\u06ac\5\u00b8]\2\u06ab\u06aa\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad"+
		"\u06ab\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u00b7\3\2\2\2\u06af\u06b0\7\u0099"+
		"\2\2\u06b0\u06bb\7\u0102\2\2\u06b1\u06b2\7\u0102\2\2\u06b2\u06b3\7\u00f3"+
		"\2\2\u06b3\u06bb\t\33\2\2\u06b4\u06b6\7Z\2\2\u06b5\u06b4\3\2\2\2\u06b5"+
		"\u06b6\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b8\7\u00df\2\2\u06b8\u06b9"+
		"\7\u00fa\2\2\u06b9\u06bb\7\u0167\2\2\u06ba\u06af\3\2\2\2\u06ba\u06b1\3"+
		"\2\2\2\u06ba\u06b5\3\2\2\2\u06bb\u00b9\3\2\2\2\u06bc\u06c1\5 \21\2\u06bd"+
		"\u06c1\5\u00bc_\2\u06be\u06c1\5\u00be`\2\u06bf\u06c1\5\u00c0a\2\u06c0"+
		"\u06bc\3\2\2\2\u06c0\u06bd\3\2\2\2\u06c0\u06be\3\2\2\2\u06c0\u06bf\3\2"+
		"\2\2\u06c1\u00bb\3\2\2\2\u06c2\u06c3\7\u0080\2\2\u06c3\u06c4\5\u0126\u0094"+
		"\2\u06c4\u06c5\7\u0115\2\2\u06c5\u06c9\5\4\3\2\u06c6\u06c8\5\u00c2b\2"+
		"\u06c7\u06c6\3\2\2\2\u06c8\u06cb\3\2\2\2\u06c9\u06c7\3\2\2\2\u06c9\u06ca"+
		"\3\2\2\2\u06ca\u06cd\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cc\u06ce\5\u00c4c"+
		"\2\u06cd\u06cc\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d0"+
		"\7_\2\2\u06d0\u06d1\7\u0080\2\2\u06d1\u00bd\3\2\2\2\u06d2\u06d3\7\u0080"+
		"\2\2\u06d3\u06d4\5\u0126\u0094\2\u06d4\u06d7\5\b\5\2\u06d5\u06d6\7[\2"+
		"\2\u06d6\u06d8\5\b\5\2\u06d7\u06d5\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u00bf"+
		"\3\2\2\2\u06d9\u06da\7\6\2\2\u06da\u06db\7\u0080\2\2\u06db\u06dc\5\u0126"+
		"\u0094\2\u06dc\u06dd\7\u0115\2\2\u06dd\u06de\5\b\5\2\u06de\u00c1\3\2\2"+
		"\2\u06df\u06e0\t\34\2\2\u06e0\u06e1\5\u0126\u0094\2\u06e1\u06e2\7\u0115"+
		"\2\2\u06e2\u06e3\5\4\3\2\u06e3\u00c3\3\2\2\2\u06e4\u06e5\7[\2\2\u06e5"+
		"\u06e6\5\4\3\2\u06e6\u00c5\3\2\2\2\u06e7\u06e9\7f\2\2\u06e8\u06ea\7\u0164"+
		"\2\2\u06e9\u06e8\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06ed\3\2\2\2\u06eb"+
		"\u06ec\7\u012c\2\2\u06ec\u06ee\5\u0126\u0094\2\u06ed\u06eb\3\2\2\2\u06ed"+
		"\u06ee\3\2\2\2\u06ee\u00c7\3\2\2\2\u06ef\u06f0\7\u00c1\2\2\u06f0\u06f6"+
		"\7\u0164\2\2\u06f1\u06f4\7m\2\2\u06f2\u06f5\5\u00e2r\2\u06f3\u06f5\5\u0138"+
		"\u009d\2\u06f4\u06f2\3\2\2\2\u06f4\u06f3\3\2\2\2\u06f5\u06f7\3\2\2\2\u06f6"+
		"\u06f1\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u00c9\3\2\2\2\u06f8\u06f9\7*"+
		"\2\2\u06f9\u06fa\7\u0164\2\2\u06fa\u00cb\3\2\2\2\u06fb\u06fc\7,\2\2\u06fc"+
		"\u06fd\t\35\2\2\u06fd\u06fe\5\u00ceh\2\u06fe\u06ff\7\u014e\2\2\u06ff\u0700"+
		"\5\u00ceh\2\u0700\u00cd\3\2\2\2\u0701\u0703\5\u0116\u008c\2\u0702\u0704"+
		"\5\u0118\u008d\2\u0703\u0702\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u070a\3"+
		"\2\2\2\u0705\u0706\7\u015c\2\2\u0706\u0707\5\u00e2r\2\u0707\u0708\7\u015f"+
		"\2\2\u0708\u070a\3\2\2\2\u0709\u0701\3\2\2\2\u0709\u0705\3\2\2\2\u070a"+
		"\u070d\3\2\2\2\u070b\u070c\7\21\2\2\u070c\u070e\5\u0160\u00b1\2\u070d"+
		"\u070b\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u00cf\3\2\2\2\u070f\u0711\7:"+
		"\2\2\u0710\u0712\7\u0120\2\2\u0711\u0710\3\2\2\2\u0711\u0712\3\2\2\2\u0712"+
		"\u0713\3\2\2\2\u0713\u0714\7\u0085\2\2\u0714\u0715\5\u0160\u00b1\2\u0715"+
		"\u0716\7\u00bf\2\2\u0716\u0717\5\u0116\u008c\2\u0717\u0718\7\u015c\2\2"+
		"\u0718\u071d\5\u00d2j\2\u0719\u071a\7\u014e\2\2\u071a\u071c\5\u00d2j\2"+
		"\u071b\u0719\3\2\2\2\u071c\u071f\3\2\2\2\u071d\u071b\3\2\2\2\u071d\u071e"+
		"\3\2\2\2\u071e\u0720\3\2\2\2\u071f\u071d\3\2\2\2\u0720\u0721\7\u015f\2"+
		"\2\u0721\u00d1\3\2\2\2\u0722\u0724\5\u0160\u00b1\2\u0723\u0725\t\13\2"+
		"\2\u0724\u0723\3\2\2\2\u0724\u0725\3\2\2\2\u0725\u00d3\3\2\2\2\u0726\u0727"+
		"\5\u00d6l\2\u0727\u00d5\3\2\2\2\u0728\u0729\7\u012e\2\2\u0729\u072a\7"+
		"\u015c\2\2\u072a\u072b\5\u0160\u00b1\2\u072b\u072c\7\u0152\2\2\u072c\u0734"+
		"\5\u0160\u00b1\2\u072d\u072e\7\u014e\2\2\u072e\u072f\5\u0160\u00b1\2\u072f"+
		"\u0730\7\u0152\2\2\u0730\u0731\5\u0160\u00b1\2\u0731\u0733\3\2\2\2\u0732"+
		"\u072d\3\2\2\2\u0733\u0736\3\2\2\2\u0734\u0732\3\2\2\2\u0734\u0735\3\2"+
		"\2\2\u0735\u0737\3\2\2\2\u0736\u0734\3\2\2\2\u0737\u073b\7\u015f\2\2\u0738"+
		"\u073a\5\u0090I\2\u0739\u0738\3\2\2\2\u073a\u073d\3\2\2\2\u073b\u0739"+
		"\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u00d7\3\2\2\2\u073d\u073b\3\2\2\2\u073e"+
		"\u0740\7\u00e1\2\2\u073f\u0741\5\u0138\u009d\2\u0740\u073f\3\2\2\2\u0740"+
		"\u0741\3\2\2\2\u0741\u00d9\3\2\2\2\u0742\u0744\7\u0126\2\2\u0743\u0745"+
		"\7\u015c\2\2\u0744\u0743\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0746\3\2\2"+
		"\2\u0746\u074b\5\u0138\u009d\2\u0747\u0748\7\u014e\2\2\u0748\u074a\5\u0138"+
		"\u009d\2\u0749\u0747\3\2\2\2\u074a\u074d\3\2\2\2\u074b\u0749\3\2\2\2\u074b"+
		"\u074c\3\2\2\2\u074c\u074f\3\2\2\2\u074d\u074b\3\2\2\2\u074e\u0750\7\u015f"+
		"\2\2\u074f\u074e\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0751\3\2\2\2\u0751"+
		"\u0753\7\u0090\2\2\u0752\u0754\7\u015c\2\2\u0753\u0752\3\2\2\2\u0753\u0754"+
		"\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u075a\5\u0160\u00b1\2\u0756\u0757\7"+
		"\u014e\2\2\u0757\u0759\5\u0160\u00b1\2\u0758\u0756\3\2\2\2\u0759\u075c"+
		"\3\2\2\2\u075a\u0758\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u075e\3\2\2\2\u075c"+
		"\u075a\3\2\2\2\u075d\u075f\7\u015f\2\2\u075e\u075d\3\2\2\2\u075e\u075f"+
		"\3\2\2\2\u075f\u00db\3\2\2\2\u0760\u0761\7m\2\2\u0761\u0762\7\u0164\2"+
		"\2\u0762\u0764\7\u0083\2\2\u0763\u0765\7\u015c\2\2\u0764\u0763\3\2\2\2"+
		"\u0764\u0765\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0768\5\u00e2r\2\u0767"+
		"\u0769\7\u015f\2\2\u0768\u0767\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076a"+
		"\3\2\2\2\u076a\u076b\7\u00a5\2\2\u076b\u076c\5\4\3\2\u076c\u076d\7_\2"+
		"\2\u076d\u076e\7\u00a5\2\2\u076e\u00dd\3\2\2\2\u076f\u0770\7m\2\2\u0770"+
		"\u0771\7\u0164\2\2\u0771\u0773\7\u0083\2\2\u0772\u0774\7\u00e3\2\2\u0773"+
		"\u0772\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0776\5\u0138"+
		"\u009d\2\u0776\u0777\7\u0151\2\2\u0777\u077a\5\u0138\u009d\2\u0778\u0779"+
		"\t\36\2\2\u0779\u077b\5\u0138\u009d\2\u077a\u0778\3\2\2\2\u077a\u077b"+
		"\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077d\7\u00a5\2\2\u077d\u077e\5\4\3"+
		"\2\u077e\u077f\7_\2\2\u077f\u0780\7\u00a5\2\2\u0780\u00df\3\2\2\2\u0781"+
		"\u0788\7\u016d\2\2\u0782\u0783\7\u0158\2\2\u0783\u0784\7\u0158\2\2\u0784"+
		"\u0785\7\u0164\2\2\u0785\u0786\7\u0156\2\2\u0786\u0788\7\u0156\2\2\u0787"+
		"\u0781\3\2\2\2\u0787\u0782\3\2\2\2\u0788\u00e1\3\2\2\2\u0789\u078b\5\u00e4"+
		"s\2\u078a\u0789\3\2\2\2\u078a\u078b\3\2\2\2\u078b\u078c\3\2\2\2\u078c"+
		"\u078d\5\u00eav\2\u078d\u00e3\3\2\2\2\u078e\u078f\7\u012e\2\2\u078f\u0794"+
		"\5\u00e6t\2\u0790\u0791\7\u014e\2\2\u0791\u0793\5\u00e6t\2\u0792\u0790"+
		"\3\2\2\2\u0793\u0796\3\2\2\2\u0794\u0792\3\2\2\2\u0794\u0795\3\2\2\2\u0795"+
		"\u00e5\3\2\2\2\u0796\u0794\3\2\2\2\u0797\u0799\5\u0160\u00b1\2\u0798\u079a"+
		"\5\u00e8u\2\u0799\u0798\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u079b\3\2\2"+
		"\2\u079b\u079c\7\17\2\2\u079c\u079d\7\u015c\2\2\u079d\u079e\5\u00eav\2"+
		"\u079e\u079f\7\u015f\2\2\u079f\u00e7\3\2\2\2\u07a0\u07a1\7\u015c\2\2\u07a1"+
		"\u07a6\5\u0160\u00b1\2\u07a2\u07a3\7\u014e\2\2\u07a3\u07a5\5\u0160\u00b1"+
		"\2\u07a4\u07a2\3\2\2\2\u07a5\u07a8\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a7"+
		"\3\2\2\2\u07a7\u07a9\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a9\u07aa\7\u015f\2"+
		"\2\u07aa\u00e9\3\2\2\2\u07ab\u07b1\5\u00ecw\2\u07ac\u07ad\5\u00eex\2\u07ad"+
		"\u07ae\5\u00ecw\2\u07ae\u07b0\3\2\2\2\u07af\u07ac\3\2\2\2\u07b0\u07b3"+
		"\3\2\2\2\u07b1\u07af\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u00eb\3\2\2\2\u07b3"+
		"\u07b1\3\2\2\2\u07b4\u07ba\5\u00f0y\2\u07b5\u07b6\7\u015c\2\2\u07b6\u07b7"+
		"\5\u00eav\2\u07b7\u07b8\7\u015f\2\2\u07b8\u07ba\3\2\2\2\u07b9\u07b4\3"+
		"\2\2\2\u07b9\u07b5\3\2\2\2\u07ba\u00ed\3\2\2\2\u07bb\u07bd\7\u011f\2\2"+
		"\u07bc\u07be\7\n\2\2\u07bd\u07bc\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u07c8"+
		"\3\2\2\2\u07bf\u07c1\7b\2\2\u07c0\u07c2\7\n\2\2\u07c1\u07c0\3\2\2\2\u07c1"+
		"\u07c2\3\2\2\2\u07c2\u07c8\3\2\2\2\u07c3\u07c5\7\u008e\2\2\u07c4\u07c6"+
		"\7\n\2\2\u07c5\u07c4\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07c8\3\2\2\2\u07c7"+
		"\u07bb\3\2\2\2\u07c7\u07bf\3\2\2\2\u07c7\u07c3\3\2\2\2\u07c8\u00ef\3\2"+
		"\2\2\u07c9\u07ca\t\37\2\2\u07ca\u07cc\5\u00f2z\2\u07cb\u07cd\5\u0100\u0081"+
		"\2\u07cc\u07cb\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07cf\3\2\2\2\u07ce\u07d0"+
		"\5\u0102\u0082\2\u07cf\u07ce\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u07d2\3"+
		"\2\2\2\u07d1\u07d3\5\u0118\u008d\2\u07d2\u07d1\3\2\2\2\u07d2\u07d3\3\2"+
		"\2\2\u07d3\u07d5\3\2\2\2\u07d4\u07d6\5\u011a\u008e\2\u07d5\u07d4\3\2\2"+
		"\2\u07d5\u07d6\3\2\2\2\u07d6\u07d9\3\2\2\2\u07d7\u07da\5\u011c\u008f\2"+
		"\u07d8\u07da\5\u011e\u0090\2\u07d9\u07d7\3\2\2\2\u07d9\u07d8\3\2\2\2\u07d9"+
		"\u07da\3\2\2\2\u07da\u07dc\3\2\2\2\u07db\u07dd\5\u0120\u0091\2\u07dc\u07db"+
		"\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07df\3\2\2\2\u07de\u07e0\5\u0122\u0092"+
		"\2\u07df\u07de\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u00f1\3\2\2\2\u07e1\u07e3"+
		"\5\u00f6|\2\u07e2\u07e1\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3\u07e5\3\2\2"+
		"\2\u07e4\u07e6\5\u00f8}\2\u07e5\u07e4\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6"+
		"\u07e7\3\2\2\2\u07e7\u07ec\5\u00fa~\2\u07e8\u07e9\7\u014e\2\2\u07e9\u07eb"+
		"\5\u00fa~\2\u07ea\u07e8\3\2\2\2\u07eb\u07ee\3\2\2\2\u07ec\u07ea\3\2\2"+
		"\2\u07ec\u07ed\3\2\2\2\u07ed\u00f3\3\2\2\2\u07ee\u07ec\3\2\2\2\u07ef\u07f0"+
		"\3\2\2\2\u07f0\u00f5\3\2\2\2\u07f1\u07f2\t \2\2\u07f2\u00f7\3\2\2\2\u07f3"+
		"\u07f4\7\u011a\2\2\u07f4\u07f5\5\u0138\u009d\2\u07f5\u00f9\3\2\2\2\u07f6"+
		"\u07f7\5\u0160\u00b1\2\u07f7\u07f8\7\u0152\2\2\u07f8\u07fa\3\2\2\2\u07f9"+
		"\u07f6\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fd\5\u0138"+
		"\u009d\2\u07fc\u07fe\5\u00fc\177\2\u07fd\u07fc\3\2\2\2\u07fd\u07fe\3\2"+
		"\2\2\u07fe\u0801\3\2\2\2\u07ff\u0801\5\u00fe\u0080\2\u0800\u07f9\3\2\2"+
		"\2\u0800\u07ff\3\2\2\2\u0801\u00fb\3\2\2\2\u0802\u0804\6\177\7\2\u0803"+
		"\u0805\7\17\2\2\u0804\u0803\3\2\2\2\u0804\u0805\3\2\2\2\u0805\u0806\3"+
		"\2\2\2\u0806\u080c\5\u0160\u00b1\2\u0807\u0808\7\u015c\2\2\u0808\u0809"+
		"\7\u0118\2\2\u0809\u080a\7\u0165\2\2\u080a\u080c\7\u015f\2\2\u080b\u0802"+
		"\3\2\2\2\u080b\u0807\3\2\2\2\u080c\u00fd\3\2\2\2\u080d\u080e\7\u0164\2"+
		"\2\u080e\u0810\7\6\2\2\u080f\u080d\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0811"+
		"\3\2\2\2\u0811\u0812\7\u015a\2\2\u0812\u00ff\3\2\2\2\u0813\u0814\7\u0090"+
		"\2\2\u0814\u0819\5\u0160\u00b1\2\u0815\u0816\7\u014e\2\2\u0816\u0818\5"+
		"\u0160\u00b1\2\u0817\u0815\3\2\2\2\u0818\u081b\3\2\2\2\u0819\u0817\3\2"+
		"\2\2\u0819\u081a\3\2\2\2\u081a\u0101\3\2\2\2\u081b\u0819\3\2\2\2\u081c"+
		"\u081d\7q\2\2\u081d\u0821\5\u0106\u0084\2\u081e\u0820\5\u010c\u0087\2"+
		"\u081f\u081e\3\2\2\2\u0820\u0823\3\2\2\2\u0821\u081f\3\2\2\2\u0821\u0822"+
		"\3\2\2\2\u0822\u082d\3\2\2\2\u0823\u0821\3\2\2\2\u0824\u0825\5\u0104\u0083"+
		"\2\u0825\u0829\5\u0106\u0084\2\u0826\u0828\5\u010c\u0087\2\u0827\u0826"+
		"\3\2\2\2\u0828\u082b\3\2\2\2\u0829\u0827\3\2\2\2\u0829\u082a\3\2\2\2\u082a"+
		"\u082d\3\2\2\2\u082b\u0829\3\2\2\2\u082c\u081c\3\2\2\2\u082c\u0824\3\2"+
		"\2\2\u082d\u0103\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0105\3\2\2\2\u0830"+
		"\u0834\5\u0108\u0085\2\u0831\u0834\5\u010a\u0086\2\u0832\u0834\5\u0110"+
		"\u0089\2\u0833\u0830\3\2\2\2\u0833\u0831\3\2\2\2\u0833\u0832\3\2\2\2\u0834"+
		"\u0107\3\2\2\2\u0835\u0837\5\u0116\u008c\2\u0836\u0838\5\u0114\u008b\2"+
		"\u0837\u0836\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u0109\3\2\2\2\u0839\u083a"+
		"\7\u015c\2\2\u083a\u083b\5\u00e2r\2\u083b\u083d\7\u015f\2\2\u083c\u083e"+
		"\5\u0114\u008b\2\u083d\u083c\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u010b\3"+
		"\2\2\2\u083f\u0840\7\u014e\2\2\u0840\u0847\5\u0106\u0084\2\u0841\u0842"+
		"\5\u010e\u0088\2\u0842\u0843\5\u0106\u0084\2\u0843\u0844\7\u00bf\2\2\u0844"+
		"\u0845\5\u0126\u0094\2\u0845\u0847\3\2\2\2\u0846\u083f\3\2\2\2\u0846\u0841"+
		"\3\2\2\2\u0847\u010d\3\2\2\2\u0848\u084a\7\u0087\2\2\u0849\u0848\3\2\2"+
		"\2\u0849\u084a\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u0852\7\u0095\2\2\u084c"+
		"\u084e\t!\2\2\u084d\u084f\7\u00c5\2\2\u084e\u084d\3\2\2\2\u084e\u084f"+
		"\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0852\7\u0095\2\2\u0851\u0849\3\2\2"+
		"\2\u0851\u084c\3\2\2\2\u0852\u010f\3\2\2\2\u0853\u0854\7\u0110\2\2\u0854"+
		"\u0855\7\u015c\2\2\u0855\u0856\7\u0126\2\2\u0856\u085b\5\u0112\u008a\2"+
		"\u0857\u0858\7\u014e\2\2\u0858\u085a\5\u0112\u008a\2\u0859\u0857\3\2\2"+
		"\2\u085a\u085d\3\2\2\2\u085b\u0859\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u085e"+
		"\3\2\2\2\u085d\u085b\3\2\2\2\u085e\u0860\7\u015f\2\2\u085f\u0861\5\u0114"+
		"\u008b\2\u0860\u085f\3\2\2\2\u0860\u0861\3\2\2\2\u0861\u0111\3\2\2\2\u0862"+
		"\u086f\5\u0138\u009d\2\u0863\u0864\7\u015c\2\2\u0864\u0869\5\u0138\u009d"+
		"\2\u0865\u0866\7\u014e\2\2\u0866\u0868\5\u0138\u009d\2\u0867\u0865\3\2"+
		"\2\2\u0868\u086b\3\2\2\2\u0869\u0867\3\2\2\2\u0869\u086a\3\2\2\2\u086a"+
		"\u086c\3\2\2\2\u086b\u0869\3\2\2\2\u086c\u086d\7\u015f\2\2\u086d\u086f"+
		"\3\2\2\2\u086e\u0862\3\2\2\2\u086e\u0863\3\2\2\2\u086f\u0113\3\2\2\2\u0870"+
		"\u0872\6\u008b\b\2\u0871\u0873\7\17\2\2\u0872\u0871\3\2\2\2\u0872\u0873"+
		"\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u087f\5\u0160\u00b1\2\u0875\u0876\7"+
		"\u015c\2\2\u0876\u087b\7\u0164\2\2\u0877\u0878\7\u014e\2\2\u0878\u087a"+
		"\7\u0164\2\2\u0879\u0877\3\2\2\2\u087a\u087d\3\2\2\2\u087b\u0879\3\2\2"+
		"\2\u087b\u087c\3\2\2\2\u087c\u087e\3\2\2\2\u087d\u087b\3\2\2\2\u087e\u0880"+
		"\7\u015f\2\2\u087f\u0875\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0115\3\2\2"+
		"\2\u0881\u0882\5\u0160\u00b1\2\u0882\u0117\3\2\2\2\u0883\u0884\7\u012d"+
		"\2\2\u0884\u0885\5\u0126\u0094\2\u0885\u0119\3\2\2\2\u0886\u0887\7x\2"+
		"\2\u0887\u0888\7\36\2\2\u0888\u088d\5\u0138\u009d\2\u0889\u088a\7\u014e"+
		"\2\2\u088a\u088c\5\u0138\u009d\2\u088b\u0889\3\2\2\2\u088c\u088f\3\2\2"+
		"\2\u088d\u088b\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u011b\3\2\2\2\u088f\u088d"+
		"\3\2\2\2\u0890\u0891\7{\2\2\u0891\u0892\5\u0126\u0094\2\u0892\u011d\3"+
		"\2\2\2\u0893\u0894\7\u00d4\2\2\u0894\u0895\5\u0126\u0094\2\u0895\u011f"+
		"\3\2\2\2\u0896\u0897\7\u00c3\2\2\u0897\u0898\7\36\2\2\u0898\u089a\5\u0138"+
		"\u009d\2\u0899\u089b\t\13\2\2\u089a\u0899\3\2\2\2\u089a\u089b\3\2\2\2"+
		"\u089b\u08a3\3\2\2\2\u089c\u089d\7\u014e\2\2\u089d\u089f\5\u0138\u009d"+
		"\2\u089e\u08a0\t\13\2\2\u089f\u089e\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0"+
		"\u08a2\3\2\2\2\u08a1\u089c\3\2\2\2\u08a2\u08a5\3\2\2\2\u08a3\u08a1\3\2"+
		"\2\2\u08a3\u08a4\3\2\2\2\u08a4\u0121\3\2\2\2\u08a5\u08a3\3\2\2\2\u08a6"+
		"\u08a8\5\u0124\u0093\2\u08a7\u08a6\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08a7"+
		"\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u0123\3\2\2\2\u08ab\u08ac\7\u009d\2"+
		"\2\u08ac\u08b7\5\u0138\u009d\2\u08ad\u08ae\7\u012e\2\2\u08ae\u08b4\t\""+
		"\2\2\u08af\u08b0\7\u0123\2\2\u08b0\u08b1\7\f\2\2\u08b1\u08b2\7\u0096\2"+
		"\2\u08b2\u08b3\t#\2\2\u08b3\u08b5\7\u00a1\2\2\u08b4\u08af\3\2\2\2\u08b4"+
		"\u08b5\3\2\2\2\u08b5\u08b7\3\2\2\2\u08b6\u08ab\3\2\2\2\u08b6\u08ad\3\2"+
		"\2\2\u08b7\u0125\3\2\2\2\u08b8\u08ba\b\u0094\1\2\u08b9\u08bb\7\u00b8\2"+
		"\2\u08ba\u08b9\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc\u08bd"+
		"\7\u015c\2\2\u08bd\u08be\5\u0126\u0094\2\u08be\u08bf\7\u015f\2\2\u08bf"+
		"\u08c2\3\2\2\2\u08c0\u08c2\5\u0128\u0095\2\u08c1\u08b8\3\2\2\2\u08c1\u08c0"+
		"\3\2\2\2\u08c2\u08c9\3\2\2\2\u08c3\u08c4\f\4\2\2\u08c4\u08c5\5\u0132\u009a"+
		"\2\u08c5\u08c6\5\u0126\u0094\5\u08c6\u08c8\3\2\2\2\u08c7\u08c3\3\2\2\2"+
		"\u08c8\u08cb\3\2\2\2\u08c9\u08c7\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u0127"+
		"\3\2\2\2\u08cb\u08c9\3\2\2\2\u08cc\u08d0\5\u012a\u0096\2\u08cd\u08d0\5"+
		"\u0130\u0099\2\u08ce\u08d0\5\u0138\u009d\2\u08cf\u08cc\3\2\2\2\u08cf\u08cd"+
		"\3\2\2\2\u08cf\u08ce\3\2\2\2\u08d0\u0129\3\2\2\2\u08d1\u08d2\5\u0138\u009d"+
		"\2\u08d2\u08d4\7\u0092\2\2\u08d3\u08d5\7\u00b8\2\2\u08d4\u08d3\3\2\2\2"+
		"\u08d4\u08d5\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u08d7\7\u00ba\2\2\u08d7"+
		"\u08e9\3\2\2\2\u08d8\u08d9\5\u0138\u009d\2\u08d9\u08da\7\26\2\2\u08da"+
		"\u08db\5\u0138\u009d\2\u08db\u08dc\7\f\2\2\u08dc\u08dd\5\u0138\u009d\2"+
		"\u08dd\u08e9\3\2\2\2\u08de\u08e0\7\u00b8\2\2\u08df\u08de\3\2\2\2\u08df"+
		"\u08e0\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e2\7e\2\2";
	private static final String _serializedATNSegment1 =
		"\u08e2\u08e3\7\u015c\2\2\u08e3\u08e4\5\u00e2r\2\u08e4\u08e5\7\u015f\2"+
		"\2\u08e5\u08e9\3\2\2\2\u08e6\u08e9\5\u012c\u0097\2\u08e7\u08e9\5\u012e"+
		"\u0098\2\u08e8\u08d1\3\2\2\2\u08e8\u08d8\3\2\2\2\u08e8\u08df\3\2\2\2\u08e8"+
		"\u08e6\3\2\2\2\u08e8\u08e7\3\2\2\2\u08e9\u012b\3\2\2\2\u08ea\u08ec\5\u0138"+
		"\u009d\2\u08eb\u08ed\7\u00b8\2\2\u08ec\u08eb\3\2\2\2\u08ec\u08ed\3\2\2"+
		"\2\u08ed\u08ee\3\2\2\2\u08ee\u08ef\7\u0083\2\2\u08ef\u08f9\7\u015c\2\2"+
		"\u08f0\u08f5\5\u0138\u009d\2\u08f1\u08f2\7\u014e\2\2\u08f2\u08f4\5\u0138"+
		"\u009d\2\u08f3\u08f1\3\2\2\2\u08f4\u08f7\3\2\2\2\u08f5\u08f3\3\2\2\2\u08f5"+
		"\u08f6\3\2\2\2\u08f6\u08fa\3\2\2\2\u08f7\u08f5\3\2\2\2\u08f8\u08fa\5\u00e2"+
		"r\2\u08f9\u08f0\3\2\2\2\u08f9\u08f8\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb"+
		"\u08fc\7\u015f\2\2\u08fc\u012d\3\2\2\2\u08fd\u08fe\7\u015c\2\2\u08fe\u0903"+
		"\5\u0138\u009d\2\u08ff\u0900\7\u014e\2\2\u0900\u0902\5\u0138\u009d\2\u0901"+
		"\u08ff\3\2\2\2\u0902\u0905\3\2\2\2\u0903\u0901\3\2\2\2\u0903\u0904\3\2"+
		"\2\2\u0904\u0906\3\2\2\2\u0905\u0903\3\2\2\2\u0906\u0908\7\u015f\2\2\u0907"+
		"\u0909\7\u00b8\2\2\u0908\u0907\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u090a"+
		"\3\2\2\2\u090a\u090b\7\u0083\2\2\u090b\u090c\7\u015c\2\2\u090c\u090d\5"+
		"\u00e2r\2\u090d\u090e\7\u015f\2\2\u090e\u012f\3\2\2\2\u090f\u0910\5\u0138"+
		"\u009d\2\u0910\u0911\5\u0134\u009b\2\u0911\u0912\5\u0138\u009d\2\u0912"+
		"\u0131\3\2\2\2\u0913\u0914\t$\2\2\u0914\u0133\3\2\2\2\u0915\u0923\7\u0152"+
		"\2\2\u0916\u0923\7\u0153\2\2\u0917\u0923\7\u0154\2\2\u0918\u0923\7\u0155"+
		"\2\2\u0919\u0923\7\u0158\2\2\u091a\u0923\7\u0159\2\2\u091b\u0923\7\u0156"+
		"\2\2\u091c\u0923\7\u0157\2\2\u091d\u091f\7\u00b8\2\2\u091e\u091d\3\2\2"+
		"\2\u091e\u091f\3\2\2\2\u091f\u0920\3\2\2\2\u0920\u0923\t%\2\2\u0921\u0923"+
		"\5\u0136\u009c\2\u0922\u0915\3\2\2\2\u0922\u0916\3\2\2\2\u0922\u0917\3"+
		"\2\2\2\u0922\u0918\3\2\2\2\u0922\u0919\3\2\2\2\u0922\u091a\3\2\2\2\u0922"+
		"\u091b\3\2\2\2\u0922\u091c\3\2\2\2\u0922\u091e\3\2\2\2\u0922\u0921\3\2"+
		"\2\2\u0923\u0135\3\2\2\2\u0924\u0925\3\2\2\2\u0925\u0137\3\2\2\2\u0926"+
		"\u0927\b\u009d\1\2\u0927\u0928\7\u015c\2\2\u0928\u0929\5\u00e2r\2\u0929"+
		"\u092a\7\u015f\2\2\u092a\u0938\3\2\2\2\u092b\u092c\7\u015c\2\2\u092c\u092d"+
		"\5\u0138\u009d\2\u092d\u092e\7\u015f\2\2\u092e\u0938\3\2\2\2\u092f\u0938"+
		"\5\u013c\u009f\2\u0930\u0938\5\u0140\u00a1\2\u0931\u0938\5\u0144\u00a3"+
		"\2\u0932\u0938\5\u014a\u00a6\2\u0933\u0938\5\u014c\u00a7\2\u0934\u0938"+
		"\5\u0154\u00ab\2\u0935\u0938\5\u0156\u00ac\2\u0936\u0938\5\u013a\u009e"+
		"\2\u0937\u0926\3\2\2\2\u0937\u092b\3\2\2\2\u0937\u092f\3\2\2\2\u0937\u0930"+
		"\3\2\2\2\u0937\u0931\3\2\2\2\u0937\u0932\3\2\2\2\u0937\u0933\3\2\2\2\u0937"+
		"\u0934\3\2\2\2\u0937\u0935\3\2\2\2\u0937\u0936\3\2\2\2\u0938\u0949\3\2"+
		"\2\2\u0939\u093a\f\20\2\2\u093a\u093b\7\u015a\2\2\u093b\u0948\5\u0138"+
		"\u009d\21\u093c\u093d\f\17\2\2\u093d\u093e\7\u0150\2\2\u093e\u0948\5\u0138"+
		"\u009d\20\u093f\u0940\f\16\2\2\u0940\u0941\7\u014c\2\2\u0941\u0948\5\u0138"+
		"\u009d\17\u0942\u0943\f\r\2\2\u0943\u0944\7\u0162\2\2\u0944\u0948\5\u0138"+
		"\u009d\16\u0945\u0946\f\21\2\2\u0946\u0948\5\u013e\u00a0\2\u0947\u0939"+
		"\3\2\2\2\u0947\u093c\3\2\2\2\u0947\u093f\3\2\2\2\u0947\u0942\3\2\2\2\u0947"+
		"\u0945\3\2\2\2\u0948\u094b\3\2\2\2\u0949\u0947\3\2\2\2\u0949\u094a\3\2"+
		"\2\2\u094a\u0139\3\2\2\2\u094b\u0949\3\2\2\2\u094c\u0955\5\u015c\u00af"+
		"\2\u094d\u0955\5\u015e\u00b0\2\u094e\u0955\5\u0168\u00b5\2\u094f\u0955"+
		"\5\u0160\u00b1\2\u0950\u0955\5\u0162\u00b2\2\u0951\u0955\5\u0166\u00b4"+
		"\2\u0952\u0955\5\u0164\u00b3\2\u0953\u0955\5\u016a\u00b6\2\u0954\u094c"+
		"\3\2\2\2\u0954\u094d\3\2\2\2\u0954\u094e\3\2\2\2\u0954\u094f\3\2\2\2\u0954"+
		"\u0950\3\2\2\2\u0954\u0951\3\2\2\2\u0954\u0952\3\2\2\2\u0954\u0953\3\2"+
		"\2\2\u0955\u013b\3\2\2\2\u0956\u0957\7\u008f\2\2\u0957\u0958\5\u0138\u009d"+
		"\2\u0958\u0959\5\u013e\u00a0\2\u0959\u013d\3\2\2\2\u095a\u095b\t&\2\2"+
		"\u095b\u013f\3\2\2\2\u095c\u095d\5\u0142\u00a2\2\u095d\u095e\t\'\2\2\u095e"+
		"\u0963\5\u0142\u00a2\2\u095f\u0960\t\'\2\2\u0960\u0962\5\u0142\u00a2\2"+
		"\u0961\u095f\3\2\2\2\u0962\u0965\3\2\2\2\u0963\u0961\3\2\2\2\u0963\u0964"+
		"\3\2\2\2\u0964\u0141\3\2\2\2\u0965\u0963\3\2\2\2\u0966\u0967\7\u015c\2"+
		"\2\u0967\u0968\5\u0138\u009d\2\u0968\u0969\7\u015f\2\2\u0969\u0970\3\2"+
		"\2\2\u096a\u0970\5\u0144\u00a3\2\u096b\u0970\5\u014c\u00a7\2\u096c\u0970"+
		"\5\u0154\u00ab\2\u096d\u0970\5\u0156\u00ac\2\u096e\u0970\5\u013a\u009e"+
		"\2\u096f\u0966\3\2\2\2\u096f\u096a\3\2\2\2\u096f\u096b\3\2\2\2\u096f\u096c"+
		"\3\2\2\2\u096f\u096d\3\2\2\2\u096f\u096e\3\2\2\2\u0970\u0143\3\2\2\2\u0971"+
		"\u0974\5\u0146\u00a4\2\u0972\u0974\5\u0148\u00a5\2\u0973\u0971\3\2\2\2"+
		"\u0973\u0972\3\2\2\2\u0974\u0145\3\2\2\2\u0975\u0976\7#\2\2\u0976\u097c"+
		"\5\u0138\u009d\2\u0977\u0978\7\u012c\2\2\u0978\u0979\5\u0138\u009d\2\u0979"+
		"\u097a\7\u0115\2\2\u097a\u097b\5\u0138\u009d\2\u097b\u097d\3\2\2\2\u097c"+
		"\u0977\3\2\2\2\u097d\u097e\3\2\2\2\u097e\u097c\3\2\2\2\u097e\u097f\3\2"+
		"\2\2\u097f\u0982\3\2\2\2\u0980\u0981\7[\2\2\u0981\u0983\5\u0138\u009d"+
		"\2\u0982\u0980\3\2\2\2\u0982\u0983\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0985"+
		"\7_\2\2\u0985\u0147\3\2\2\2\u0986\u098c\7#\2\2\u0987\u0988\7\u012c\2\2"+
		"\u0988\u0989\5\u0126\u0094\2\u0989\u098a\7\u0115\2\2\u098a\u098b\5\u0138"+
		"\u009d\2\u098b\u098d\3\2\2\2\u098c\u0987\3\2\2\2\u098d\u098e\3\2\2\2\u098e"+
		"\u098c\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u0992\3\2\2\2\u0990\u0991\7["+
		"\2\2\u0991\u0993\5\u0138\u009d\2\u0992\u0990\3\2\2\2\u0992\u0993\3\2\2"+
		"\2\u0993\u0994\3\2\2\2\u0994\u0995\7_\2\2\u0995\u0149\3\2\2\2\u0996\u0997"+
		"\5\u0160\u00b1\2\u0997\u0998\7\5\2\2\u0998\u0999\t(\2\2\u0999\u014b\3"+
		"\2\2\2\u099a\u099b\7\23\2\2\u099b\u099d\7\u015c\2\2\u099c\u099e\5\u014e"+
		"\u00a8\2\u099d\u099c\3\2\2\2\u099d\u099e\3\2\2\2\u099e\u099f\3\2\2\2\u099f"+
		"\u09a0\5\u0138\u009d\2\u09a0\u09a2\7\u015f\2\2\u09a1\u09a3\5\u0150\u00a9"+
		"\2\u09a2\u09a1\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u0a33\3\2\2\2\u09a4\u09a5"+
		"\78\2\2\u09a5\u09ab\7\u015c\2\2\u09a6\u09a8\5\u014e\u00a8\2\u09a7\u09a6"+
		"\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09ac\5\u0138\u009d"+
		"\2\u09aa\u09ac\7\u015a\2\2\u09ab\u09a7\3\2\2\2\u09ab\u09aa\3\2\2\2\u09ac"+
		"\u09ad\3\2\2\2\u09ad\u09af\7\u015f\2\2\u09ae\u09b0\5\u0150\u00a9\2\u09af"+
		"\u09ae\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u0a33\3\2\2\2\u09b1\u09b2\79"+
		"\2\2\u09b2\u09b8\7\u015c\2\2\u09b3\u09b5\5\u014e\u00a8\2\u09b4\u09b3\3"+
		"\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b9\5\u0138\u009d"+
		"\2\u09b7\u09b9\7\u015a\2\2\u09b8\u09b4\3\2\2\2\u09b8\u09b7\3\2\2\2\u09b9"+
		"\u09ba\3\2\2\2\u09ba\u09bc\7\u015f\2\2\u09bb\u09bd\5\u0150\u00a9\2\u09bc"+
		"\u09bb\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u0a33\3\2\2\2\u09be\u09bf\7\u0135"+
		"\2\2\u09bf\u09c0\7\u015c\2\2\u09c0\u09c1\7\u015f\2\2\u09c1\u0a33\5\u0150"+
		"\u00a9\2\u09c2\u09c3\7\u0139\2\2\u09c3\u09c4\7\u015c\2\2\u09c4\u09c5\7"+
		"\u015f\2\2\u09c5\u0a33\5\u0150\u00a9\2\u09c6\u09c7\7\u013a\2\2\u09c7\u09c8"+
		"\7\u015c\2\2\u09c8\u09c9\5\u0138\u009d\2\u09c9\u09ca\7\u015f\2\2\u09ca"+
		"\u09cb\5\u0150\u00a9\2\u09cb\u0a33\3\2\2\2\u09cc\u09cd\7\u013b\2\2\u09cd"+
		"\u09ce\7\u015c\2\2\u09ce\u09d5\5\u0138\u009d\2\u09cf\u09d0\7\u014e\2\2"+
		"\u09d0\u09d3\5\u0138\u009d\2\u09d1\u09d2\7\u014e\2\2\u09d2\u09d4\5\u0138"+
		"\u009d\2\u09d3\u09d1\3\2\2\2\u09d3\u09d4\3\2\2\2\u09d4\u09d6\3\2\2\2\u09d5"+
		"\u09cf\3\2\2\2\u09d5\u09d6\3\2\2\2\u09d6\u09d7\3\2\2\2\u09d7\u09d8\7\u015f"+
		"\2\2\u09d8\u09d9\5\u0150\u00a9\2\u09d9\u0a33\3\2\2\2\u09da\u09db\7\u013c"+
		"\2\2\u09db\u09dc\7\u015c\2\2\u09dc\u09dd\5\u0138\u009d\2\u09dd\u09de\7"+
		"\u015f\2\2\u09de\u09df\5\u0150\u00a9\2\u09df\u0a33\3\2\2\2\u09e0\u09e1"+
		"\7\u013d\2\2\u09e1\u09e2\7\u015c\2\2\u09e2\u09e9\5\u0138\u009d\2\u09e3"+
		"\u09e4\7\u014e\2\2\u09e4\u09e7\5\u0138\u009d\2\u09e5\u09e6\7\u014e\2\2"+
		"\u09e6\u09e8\5\u0138\u009d\2\u09e7\u09e5\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8"+
		"\u09ea\3\2\2\2\u09e9\u09e3\3\2\2\2\u09e9\u09ea\3\2\2\2\u09ea\u09eb\3\2"+
		"\2\2\u09eb\u09ec\7\u015f\2\2\u09ec\u09ed\5\u0150\u00a9\2\u09ed\u0a33\3"+
		"\2\2\2\u09ee\u09ef\7\u00a8\2\2\u09ef\u09f1\7\u015c\2\2\u09f0\u09f2\5\u014e"+
		"\u00a8\2\u09f1\u09f0\3\2\2\2\u09f1\u09f2\3\2\2\2\u09f2\u09f3\3\2\2\2\u09f3"+
		"\u09f4\5\u0138\u009d\2\u09f4\u09f6\7\u015f\2\2\u09f5\u09f7\5\u0150\u00a9"+
		"\2\u09f6\u09f5\3\2\2\2\u09f6\u09f7\3\2\2\2\u09f7\u0a33\3\2\2\2\u09f8\u09f9"+
		"\7\u00ae\2\2\u09f9\u09fb\7\u015c\2\2\u09fa\u09fc\5\u014e\u00a8\2\u09fb"+
		"\u09fa\3\2\2\2\u09fb\u09fc\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd\u09fe\5\u0138"+
		"\u009d\2\u09fe\u0a00\7\u015f\2\2\u09ff\u0a01\5\u0150\u00a9\2\u0a00\u09ff"+
		"\3\2\2\2\u0a00\u0a01\3\2\2\2\u0a01\u0a33\3\2\2\2\u0a02\u0a03\7\u0146\2"+
		"\2\u0a03\u0a04\7\u015c\2\2\u0a04\u0a05\7\u015f\2\2\u0a05\u0a33\5\u0150"+
		"\u00a9\2\u0a06\u0a07\7\u0147\2\2\u0a07\u0a08\7\u015c\2\2\u0a08\u0a09\7"+
		"\u015f\2\2\u0a09\u0a33\5\u0150\u00a9\2\u0a0a\u0a0b\7\u0148\2\2\u0a0b\u0a0d"+
		"\7\u015c\2\2\u0a0c\u0a0e\5\u014e\u00a8\2\u0a0d\u0a0c\3\2\2\2\u0a0d\u0a0e"+
		"\3\2\2\2\u0a0e\u0a0f\3\2\2\2\u0a0f\u0a10\5\u0138\u009d\2\u0a10\u0a12\7"+
		"\u015f\2\2\u0a11\u0a13\5\u0150\u00a9\2\u0a12\u0a11\3\2\2\2\u0a12\u0a13"+
		"\3\2\2\2\u0a13\u0a33\3\2\2\2\u0a14\u0a15\7\u010d\2\2\u0a15\u0a17\7\u015c"+
		"\2\2\u0a16\u0a18\5\u014e\u00a8\2\u0a17\u0a16\3\2\2\2\u0a17\u0a18\3\2\2"+
		"\2\u0a18\u0a19\3\2\2\2\u0a19\u0a1a\5\u0138\u009d\2\u0a1a\u0a1c\7\u015f"+
		"\2\2\u0a1b\u0a1d\5\u0150\u00a9\2\u0a1c\u0a1b\3\2\2\2\u0a1c\u0a1d\3\2\2"+
		"\2\u0a1d\u0a33\3\2\2\2\u0a1e\u0a1f\7\u0127\2\2\u0a1f\u0a21\7\u015c\2\2"+
		"\u0a20\u0a22\5\u014e\u00a8\2\u0a21\u0a20\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22"+
		"\u0a23\3\2\2\2\u0a23\u0a24\5\u0138\u009d\2\u0a24\u0a26\7\u015f\2\2\u0a25"+
		"\u0a27\5\u0150\u00a9\2\u0a26\u0a25\3\2\2\2\u0a26\u0a27\3\2\2\2\u0a27\u0a33"+
		"\3\2\2\2\u0a28\u0a29\7\u014a\2\2\u0a29\u0a2b\7\u015c\2\2\u0a2a\u0a2c\5"+
		"\u014e\u00a8\2\u0a2b\u0a2a\3\2\2\2\u0a2b\u0a2c\3\2\2\2\u0a2c\u0a2d\3\2"+
		"\2\2\u0a2d\u0a2e\5\u0138\u009d\2\u0a2e\u0a30\7\u015f\2\2\u0a2f\u0a31\5"+
		"\u0150\u00a9\2\u0a30\u0a2f\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31\u0a33\3\2"+
		"\2\2\u0a32\u099a\3\2\2\2\u0a32\u09a4\3\2\2\2\u0a32\u09b1\3\2\2\2\u0a32"+
		"\u09be\3\2\2\2\u0a32\u09c2\3\2\2\2\u0a32\u09c6\3\2\2\2\u0a32\u09cc\3\2"+
		"\2\2\u0a32\u09da\3\2\2\2\u0a32\u09e0\3\2\2\2\u0a32\u09ee\3\2\2\2\u0a32"+
		"\u09f8\3\2\2\2\u0a32\u0a02\3\2\2\2\u0a32\u0a06\3\2\2\2\u0a32\u0a0a\3\2"+
		"\2\2\u0a32\u0a14\3\2\2\2\u0a32\u0a1e\3\2\2\2\u0a32\u0a28\3\2\2\2\u0a33"+
		"\u014d\3\2\2\2\u0a34\u0a35\t \2\2\u0a35\u014f\3\2\2\2\u0a36\u0a37\7\u00c6"+
		"\2\2\u0a37\u0a39\7\u015c\2\2\u0a38\u0a3a\5\u0152\u00aa\2\u0a39\u0a38\3"+
		"\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u0a3c\3\2\2\2\u0a3b\u0a3d\5\u0120\u0091"+
		"\2\u0a3c\u0a3b\3\2\2\2\u0a3c\u0a3d\3\2\2\2\u0a3d\u0a3e\3\2\2\2\u0a3e\u0a3f"+
		"\7\u015f\2\2\u0a3f\u0151\3\2\2\2\u0a40\u0a41\7\u00ca\2\2\u0a41\u0a42\7"+
		"\36\2\2\u0a42\u0a47\5\u0138\u009d\2\u0a43\u0a44\7\u014e\2\2\u0a44\u0a46"+
		"\5\u0138\u009d\2\u0a45\u0a43\3\2\2\2\u0a46\u0a49\3\2\2\2\u0a47\u0a45\3"+
		"\2\2\2\u0a47\u0a48\3\2\2\2\u0a48\u0153\3\2\2\2\u0a49\u0a47\3\2\2\2\u0a4a"+
		"\u0b13\7\u0134\2\2\u0a4b\u0a4c\7%\2\2\u0a4c\u0a4d\7\u015c\2\2\u0a4d\u0a4e"+
		"\5\u0138\u009d\2\u0a4e\u0a4f\7\17\2\2\u0a4f\u0a51\5\u0094K\2\u0a50\u0a52"+
		"\5\u0096L\2\u0a51\u0a50\3\2\2\2\u0a51\u0a52\3\2\2\2\u0a52\u0a53\3\2\2"+
		"\2\u0a53\u0a54\7\u015f\2\2\u0a54\u0b13\3\2\2\2\u0a55\u0a56\78\2\2\u0a56"+
		"\u0a59\7\u015c\2\2\u0a57\u0a5a\5\u0138\u009d\2\u0a58\u0a5a\7\u015a\2\2"+
		"\u0a59\u0a57\3\2\2\2\u0a59\u0a58\3\2\2\2\u0a5a\u0a5b\3\2\2\2\u0a5b\u0b13"+
		"\7\u015f\2\2\u0a5c\u0b13\7\u0136\2\2\u0a5d\u0a5e\7>\2\2\u0a5e\u0b13\7"+
		"C\2\2\u0a5f\u0a63\7\u0137\2\2\u0a60\u0a61\7>\2\2\u0a61\u0a63\7\u0116\2"+
		"\2\u0a62\u0a5f\3\2\2\2\u0a62\u0a60\3\2\2\2\u0a63\u0a68\3\2\2\2\u0a64\u0a65"+
		"\7\u015c\2\2\u0a65\u0a66\5\u0138\u009d\2\u0a66\u0a67\7\u015f\2\2\u0a67"+
		"\u0a69\3\2\2\2\u0a68\u0a64\3\2\2\2\u0a68\u0a69\3\2\2\2\u0a69\u0b13\3\2"+
		"\2\2\u0a6a\u0b13\7\u0138\2\2\u0a6b\u0a6c\7>\2\2\u0a6c\u0b13\7\u014b\2"+
		"\2\u0a6d\u0a6e\7\u013e\2\2\u0a6e\u0a6f\7\u015c\2\2\u0a6f\u0a7c\5\u0138"+
		"\u009d\2\u0a70\u0a71\7\u014e\2\2\u0a71\u0a79\5\u0138\u009d\2\u0a72\u0a73"+
		"\7\u014e\2\2\u0a73\u0a74\5\u0138\u009d\2\u0a74\u0a75\7\u0152\2\2\u0a75"+
		"\u0a76\5\u0138\u009d\2\u0a76\u0a78\3\2\2\2\u0a77\u0a72\3\2\2\2\u0a78\u0a7b"+
		"\3\2\2\2\u0a79\u0a77\3\2\2\2\u0a79\u0a7a\3\2\2\2\u0a7a\u0a7d\3\2\2\2\u0a7b"+
		"\u0a79\3\2\2\2\u0a7c\u0a70\3\2\2\2\u0a7c\u0a7d\3\2\2\2\u0a7d\u0a7e\3\2"+
		"\2\2\u0a7e\u0a7f\7\u015f\2\2\u0a7f\u0b13\3\2\2\2\u0a80\u0a81\7\u013f\2"+
		"\2\u0a81\u0a82\7\u015c\2\2\u0a82\u0a8f\5\u0138\u009d\2\u0a83\u0a84\7\u014e"+
		"\2\2\u0a84\u0a8c\5\u0138\u009d\2\u0a85\u0a86\7\u014e\2\2\u0a86\u0a87\5"+
		"\u0138\u009d\2\u0a87\u0a88\7\u0152\2\2\u0a88\u0a89\5\u0138\u009d\2\u0a89"+
		"\u0a8b\3\2\2\2\u0a8a\u0a85\3\2\2\2\u0a8b\u0a8e\3\2\2\2\u0a8c\u0a8a\3\2"+
		"\2\2\u0a8c\u0a8d\3\2\2\2\u0a8d\u0a90\3\2\2\2\u0a8e\u0a8c\3\2\2\2\u0a8f"+
		"\u0a83\3\2\2\2\u0a8f\u0a90\3\2\2\2\u0a90\u0a91\3\2\2\2\u0a91\u0a92\7\u015f"+
		"\2\2\u0a92\u0b13\3\2\2\2\u0a93\u0a94\7\u0140\2\2\u0a94\u0a95\7\u015c\2"+
		"\2\u0a95\u0aa2\5\u0138\u009d\2\u0a96\u0a97\7\u014e\2\2\u0a97\u0a9f\5\u0138"+
		"\u009d\2\u0a98\u0a99\7\u014e\2\2\u0a99\u0a9a\5\u0138\u009d\2\u0a9a\u0a9b"+
		"\7\u0152\2\2\u0a9b\u0a9c\5\u0138\u009d\2\u0a9c\u0a9e\3\2\2\2\u0a9d\u0a98"+
		"\3\2\2\2\u0a9e\u0aa1\3\2\2\2\u0a9f\u0a9d\3\2\2\2\u0a9f\u0aa0\3\2\2\2\u0aa0"+
		"\u0aa3\3\2\2\2\u0aa1\u0a9f\3\2\2\2\u0aa2\u0a96\3\2\2\2\u0aa2\u0aa3\3\2"+
		"\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4\u0aa5\7\u015f\2\2\u0aa5\u0b13\3\2\2\2\u0aa6"+
		"\u0aa7\7\u0141\2\2\u0aa7\u0aa8\7\u015c\2\2\u0aa8\u0ab5\5\u0138\u009d\2"+
		"\u0aa9\u0aaa\7\u014e\2\2\u0aaa\u0ab2\5\u0138\u009d\2\u0aab\u0aac\7\u014e"+
		"\2\2\u0aac\u0aad\5\u0138\u009d\2\u0aad\u0aae\7\u0152\2\2\u0aae\u0aaf\5"+
		"\u0138\u009d\2\u0aaf\u0ab1\3\2\2\2\u0ab0\u0aab\3\2\2\2\u0ab1\u0ab4\3\2"+
		"\2\2\u0ab2\u0ab0\3\2\2\2\u0ab2\u0ab3\3\2\2\2\u0ab3\u0ab6\3\2\2\2\u0ab4"+
		"\u0ab2\3\2\2\2\u0ab5\u0aa9\3\2\2\2\u0ab5\u0ab6\3\2\2\2\u0ab6\u0ab7\3\2"+
		"\2\2\u0ab7\u0ab8\7\u015f\2\2\u0ab8\u0b13\3\2\2\2\u0ab9\u0aba\7\u0142\2"+
		"\2\u0aba\u0abb\7\u015c\2\2\u0abb\u0ac8\5\u0138\u009d\2\u0abc\u0abd\7\u014e"+
		"\2\2\u0abd\u0ac5\5\u0138\u009d\2\u0abe\u0abf\7\u014e\2\2\u0abf\u0ac0\5"+
		"\u0138\u009d\2\u0ac0\u0ac1\7\u0152\2\2\u0ac1\u0ac2\5\u0138\u009d\2\u0ac2"+
		"\u0ac4\3\2\2\2\u0ac3\u0abe\3\2\2\2\u0ac4\u0ac7\3\2\2\2\u0ac5\u0ac3\3\2"+
		"\2\2\u0ac5\u0ac6\3\2\2\2\u0ac6\u0ac9\3\2\2\2\u0ac7\u0ac5\3\2\2\2\u0ac8"+
		"\u0abc\3\2\2\2\u0ac8\u0ac9\3\2\2\2\u0ac9\u0aca\3\2\2\2\u0aca\u0acb\7\u015f"+
		"\2\2\u0acb\u0b13\3\2\2\2\u0acc\u0acd\7\u0143\2\2\u0acd\u0ace\7\u015c\2"+
		"\2\u0ace\u0adb\5\u0138\u009d\2\u0acf\u0ad0\7\u014e\2\2\u0ad0\u0ad8\5\u0138"+
		"\u009d\2\u0ad1\u0ad2\7\u014e\2\2\u0ad2\u0ad3\5\u0138\u009d\2\u0ad3\u0ad4"+
		"\7\u0152\2\2\u0ad4\u0ad5\5\u0138\u009d\2\u0ad5\u0ad7\3\2\2\2\u0ad6\u0ad1"+
		"\3\2\2\2\u0ad7\u0ada\3\2\2\2\u0ad8\u0ad6\3\2\2\2\u0ad8\u0ad9\3\2\2\2\u0ad9"+
		"\u0adc\3\2\2\2\u0ada\u0ad8\3\2\2\2\u0adb\u0acf\3\2\2\2\u0adb\u0adc\3\2"+
		"\2\2\u0adc\u0add\3\2\2\2\u0add\u0ade\7\u015f\2\2\u0ade\u0b13\3\2\2\2\u0adf"+
		"\u0ae0\7\u0144\2\2\u0ae0\u0ae1\7\u015c\2\2\u0ae1\u0ae9\5\u0138\u009d\2"+
		"\u0ae2\u0ae3\7\u014e\2\2\u0ae3\u0ae4\5\u0138\u009d\2\u0ae4\u0ae5\7\u0152"+
		"\2\2\u0ae5\u0ae6\5\u0138\u009d\2\u0ae6\u0ae8\3\2\2\2\u0ae7\u0ae2\3\2\2"+
		"\2\u0ae8\u0aeb\3\2\2\2\u0ae9\u0ae7\3\2\2\2\u0ae9\u0aea\3\2\2\2\u0aea\u0aec"+
		"\3\2\2\2\u0aeb\u0ae9\3\2\2\2\u0aec\u0aed\7\u015f\2\2\u0aed\u0b13\3\2\2"+
		"\2\u0aee\u0aef\7\u0145\2\2\u0aef\u0af0\7\u015c\2\2\u0af0\u0af6\5\u0138"+
		"\u009d\2\u0af1\u0af2\7\u014e\2\2\u0af2\u0af3\5\u0138\u009d\2\u0af3\u0af4"+
		"\7\u0152\2\2\u0af4\u0af5\5\u0138\u009d\2\u0af5\u0af7\3\2\2\2\u0af6\u0af1"+
		"\3\2\2\2\u0af7\u0af8\3\2\2\2\u0af8\u0af6\3\2\2\2\u0af8\u0af9\3\2\2\2\u0af9"+
		"\u0afc\3\2\2\2\u0afa\u0afb\7\u014e\2\2\u0afb\u0afd\5\u0138\u009d\2\u0afc"+
		"\u0afa\3\2\2\2\u0afc\u0afd\3\2\2\2\u0afd\u0afe\3\2\2\2\u0afe\u0aff\7\u015f"+
		"\2\2\u0aff\u0b13\3\2\2\2\u0b00\u0b01\7\u00ef\2\2\u0b01\u0b02\7\u015c\2"+
		"\2\u0b02\u0b03\5\u0138\u009d\2\u0b03\u0b04\7\u015f\2\2\u0b04\u0b13\3\2"+
		"\2\2\u0b05\u0b06\7\u010c\2\2\u0b06\u0b07\7\u015c\2\2\u0b07\u0b08\5\u0138"+
		"\u009d\2\u0b08\u0b09\7q\2\2\u0b09\u0b0c\5\u0138\u009d\2\u0b0a\u0b0b\7"+
		"m\2\2\u0b0b\u0b0d\5\u0138\u009d\2\u0b0c\u0b0a\3\2\2\2\u0b0c\u0b0d\3\2"+
		"\2\2\u0b0d\u0b0e\3\2\2\2\u0b0e\u0b0f\7\u015f\2\2\u0b0f\u0b13\3\2\2\2\u0b10"+
		"\u0b13\7\u0149\2\2\u0b11\u0b13\7\u014b\2\2\u0b12\u0a4a\3\2\2\2\u0b12\u0a4b"+
		"\3\2\2\2\u0b12\u0a55\3\2\2\2\u0b12\u0a5c\3\2\2\2\u0b12\u0a5d\3\2\2\2\u0b12"+
		"\u0a62\3\2\2\2\u0b12\u0a6a\3\2\2\2\u0b12\u0a6b\3\2\2\2\u0b12\u0a6d\3\2"+
		"\2\2\u0b12\u0a80\3\2\2\2\u0b12\u0a93\3\2\2\2\u0b12\u0aa6\3\2\2\2\u0b12"+
		"\u0ab9\3\2\2\2\u0b12\u0acc\3\2\2\2\u0b12\u0adf\3\2\2\2\u0b12\u0aee\3\2"+
		"\2\2\u0b12\u0b00\3\2\2\2\u0b12\u0b05\3\2\2\2\u0b12\u0b10\3\2\2\2\u0b12"+
		"\u0b11\3\2\2\2\u0b13\u0155\3\2\2\2\u0b14\u0b15\5\u0160\u00b1\2\u0b15\u0b17"+
		"\7\u015c\2\2\u0b16\u0b18\5\u0158\u00ad\2\u0b17\u0b16\3\2\2\2\u0b17\u0b18"+
		"\3\2\2\2\u0b18\u0b19\3\2\2\2\u0b19\u0b1a\7\u015f\2\2\u0b1a\u0157\3\2\2"+
		"\2\u0b1b\u0b20\5\u015a\u00ae\2\u0b1c\u0b1d\7\u014e\2\2\u0b1d\u0b1f\5\u015a"+
		"\u00ae\2\u0b1e\u0b1c\3\2\2\2\u0b1f\u0b22\3\2\2\2\u0b20\u0b1e\3\2\2\2\u0b20"+
		"\u0b21\3\2\2\2\u0b21\u0159\3\2\2\2\u0b22\u0b20\3\2\2\2\u0b23\u0b29\6\u00ae"+
		"\17\2\u0b24\u0b25\5\u0160\u00b1\2\u0b25\u0b27\7\u0152\2\2\u0b26\u0b28"+
		"\7\u0156\2\2\u0b27\u0b26\3\2\2\2\u0b27\u0b28\3\2\2\2\u0b28\u0b2a\3\2\2"+
		"\2\u0b29\u0b24\3\2\2\2\u0b29\u0b2a\3\2\2\2\u0b2a\u0b2b\3\2\2\2\u0b2b\u0b2c"+
		"\5\u0138\u009d\2\u0b2c\u015b\3\2\2\2\u0b2d\u0b2e\7C\2\2\u0b2e\u0b2f\5"+
		"\u0162\u00b2\2\u0b2f\u015d\3\2\2\2\u0b30\u0b31\7\u0116\2\2\u0b31\u0b32"+
		"\5\u0162\u00b2\2\u0b32\u015f\3\2\2\2\u0b33\u0b36\7\u0164\2\2\u0b34\u0b36"+
		"\5\u016e\u00b8\2\u0b35\u0b33\3\2\2\2\u0b35\u0b34\3\2\2\2\u0b36\u0b3e\3"+
		"\2\2\2\u0b37\u0b3a\7\6\2\2\u0b38\u0b3b\7\u0164\2\2\u0b39\u0b3b\5\u016e"+
		"\u00b8\2\u0b3a\u0b38\3\2\2\2\u0b3a\u0b39\3\2\2\2\u0b3b\u0b3d\3\2\2\2\u0b3c"+
		"\u0b37\3\2\2\2\u0b3d\u0b40\3\2\2\2\u0b3e\u0b3c\3\2\2\2\u0b3e\u0b3f\3\2"+
		"\2\2\u0b3f\u0161\3\2\2\2\u0b40\u0b3e\3\2\2\2\u0b41\u0b44\7\u0165\2\2\u0b42"+
		"\u0b44\7\u0166\2\2\u0b43\u0b41\3\2\2\2\u0b43\u0b42\3\2\2\2\u0b44\u0163"+
		"\3\2\2\2\u0b45\u0b47\t)\2\2\u0b46\u0b45\3\2\2\2\u0b46\u0b47\3\2\2\2\u0b47"+
		"\u0b48\3\2\2\2\u0b48\u0b49\7\u0167\2\2\u0b49\u0165\3\2\2\2\u0b4a\u0b4c"+
		"\t)\2\2\u0b4b\u0b4a\3\2\2\2\u0b4b\u0b4c\3\2\2\2\u0b4c\u0b4d\3\2\2\2\u0b4d"+
		"\u0b4e\7\u0168\2\2\u0b4e\u0167\3\2\2\2\u0b4f\u0b50\t*\2\2\u0b50\u0169"+
		"\3\2\2\2\u0b51\u0b52\7\u00ba\2\2\u0b52\u016b\3\2\2\2\u0b53\u0b54\7\u0169"+
		"\2\2\u0b54\u016d\3\2\2\2\u0b55\u0b56\t+\2\2\u0b56\u016f\3\2\2\2\u0173"+
		"\u0175\u0178\u017c\u017f\u0184\u018b\u0192\u019b\u019e\u01a0\u01bf\u01cc"+
		"\u01d4\u01da\u01ea\u01f6\u01f8\u0200\u0202\u0206\u0211\u0215\u021f\u0223"+
		"\u0225\u0236\u0242\u024c\u0253\u0257\u0261\u0265\u0267\u027f\u0296\u02a1"+
		"\u02a8\u02ae\u02b4\u02c4\u02cb\u02ce\u02d3\u02d7\u02e0\u02e5\u02ed\u02f2"+
		"\u02fb\u0307\u030c\u030f\u0319\u031c\u0320\u0323\u032b\u032e\u033f\u0343"+
		"\u034b\u0356\u0360\u0368\u036f\u0373\u0377\u037c\u0380\u0385\u0389\u038d"+
		"\u0397\u039b\u03a0\u03a5\u03a9\u03b6\u03bb\u03c1\u03ca\u03ce\u03d6\u03d9"+
		"\u03de\u03e3\u03ea\u03f1\u03f4\u03fb\u0401\u0406\u040c\u0411\u0414\u041a"+
		"\u0428\u0432\u0438\u043d\u0442\u0447\u044b\u0450\u0453\u045d\u0469\u0470"+
		"\u0473\u047f\u0484\u0489\u048c\u0493\u049f\u04ac\u04ae\u04b3\u04b6\u04c5"+
		"\u04cb\u04d6\u04d9\u04e3\u04ea\u04f0\u04f8\u0502\u0516\u051c\u0520\u0525"+
		"\u0529\u052e\u0531\u0536\u0539\u0547\u0566\u0568\u056d\u0571\u0576\u057d"+
		"\u0580\u0583\u0588\u058c\u058e\u0595\u059b\u05a2\u05a8\u05ab\u05b0\u05b4"+
		"\u05b7\u05be\u05c4\u05c7\u05d1\u05d7\u05da\u05e4\u05e6\u05ef\u05f6\u05fd"+
		"\u05ff\u0605\u0608\u0613\u061c\u0622\u0628\u062b\u0630\u0633\u0636\u0639"+
		"\u063c\u0642\u0648\u064b\u0650\u0653\u0656\u0659\u065c\u0662\u0664\u066e"+
		"\u0679\u067c\u0683\u0688\u068d\u0691\u0699\u069d\u06a2\u06a6\u06a8\u06ad"+
		"\u06b5\u06ba\u06c0\u06c9\u06cd\u06d7\u06e9\u06ed\u06f4\u06f6\u0703\u0709"+
		"\u070d\u0711\u071d\u0724\u0734\u073b\u0740\u0744\u074b\u074f\u0753\u075a"+
		"\u075e\u0764\u0768\u0773\u077a\u0787\u078a\u0794\u0799\u07a6\u07b1\u07b9"+
		"\u07bd\u07c1\u07c5\u07c7\u07cc\u07cf\u07d2\u07d5\u07d9\u07dc\u07df\u07e2"+
		"\u07e5\u07ec\u07f9\u07fd\u0800\u0804\u080b\u080f\u0819\u0821\u0829\u082c"+
		"\u0833\u0837\u083d\u0846\u0849\u084e\u0851\u085b\u0860\u0869\u086e\u0872"+
		"\u087b\u087f\u088d\u089a\u089f\u08a3\u08a9\u08b4\u08b6\u08ba\u08c1\u08c9"+
		"\u08cf\u08d4\u08df\u08e8\u08ec\u08f5\u08f9\u0903\u0908\u091e\u0922\u0937"+
		"\u0947\u0949\u0954\u0963\u096f\u0973\u097e\u0982\u098e\u0992\u099d\u09a2"+
		"\u09a7\u09ab\u09af\u09b4\u09b8\u09bc\u09d3\u09d5\u09e7\u09e9\u09f1\u09f6"+
		"\u09fb\u0a00\u0a0d\u0a12\u0a17\u0a1c\u0a21\u0a26\u0a2b\u0a30\u0a32\u0a39"+
		"\u0a3c\u0a47\u0a51\u0a59\u0a62\u0a68\u0a79\u0a7c\u0a8c\u0a8f\u0a9f\u0aa2"+
		"\u0ab2\u0ab5\u0ac5\u0ac8\u0ad8\u0adb\u0ae9\u0af8\u0afc\u0b0c\u0b12\u0b17"+
		"\u0b20\u0b27\u0b29\u0b35\u0b3a\u0b3e\u0b43\u0b46\u0b4b";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}