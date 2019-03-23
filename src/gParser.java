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
		RULE_cpp_stmt = 8, RULE_func_cpp_stmt = 9, RULE_paramsection = 10, RULE_parameters = 11, 
		RULE_openscope = 12, RULE_closescope = 13, RULE_cpp_body = 14, RULE_assignment_stmt_cpp = 15, 
		RULE_assignment_cpp = 16, RULE_declare_stmt_cpp = 17, RULE_declare_cpp = 18, 
		RULE_if_cpp_stmt = 19, RULE_elseif_cpp_block = 20, RULE_else_cpp_block = 21, 
		RULE_for_cpp_stmt = 22, RULE_inc_cpp = 23, RULE_exception_block = 24, 
		RULE_exception_block_item = 25, RULE_null_stmt = 26, RULE_expr_stmt = 27, 
		RULE_assignment_stmt = 28, RULE_assignment_stmt_item = 29, RULE_assignment_stmt_single_item = 30, 
		RULE_assignment_stmt_multiple_item = 31, RULE_assignment_stmt_select_item = 32, 
		RULE_set_session_option = 33, RULE_set_current_schema_option = 34, RULE_set_teradata_session_option = 35, 
		RULE_set_mssql_session_option = 36, RULE_begin_transaction_stmt = 37, 
		RULE_break_stmt = 38, RULE_call_stmt = 39, RULE_declare_stmt = 40, RULE_declare_block = 41, 
		RULE_declare_block_inplace = 42, RULE_declare_stmt_item = 43, RULE_declare_var_item = 44, 
		RULE_declare_condition_item = 45, RULE_declare_cursor_item = 46, RULE_cursor_with_return = 47, 
		RULE_cursor_without_return = 48, RULE_declare_handler_item = 49, RULE_declare_temporary_table_item = 50, 
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
		RULE_from_table_clause = 129, RULE_from_table_name_clause = 130, RULE_from_subselect_clause = 131, 
		RULE_from_join_clause = 132, RULE_from_join_type_clause = 133, RULE_from_table_values_clause = 134, 
		RULE_from_table_values_row = 135, RULE_from_alias_clause = 136, RULE_table_name = 137, 
		RULE_where_clause = 138, RULE_group_by_clause = 139, RULE_having_clause = 140, 
		RULE_qualify_clause = 141, RULE_order_by_clause = 142, RULE_select_options = 143, 
		RULE_select_options_item = 144, RULE_bool_expr = 145, RULE_bool_expr_atom = 146, 
		RULE_bool_expr_unary = 147, RULE_bool_expr_single_in = 148, RULE_bool_expr_multi_in = 149, 
		RULE_bool_expr_binary = 150, RULE_bool_expr_logical_operator = 151, RULE_bool_expr_binary_operator = 152, 
		RULE_expr = 153, RULE_expr_atom = 154, RULE_expr_interval = 155, RULE_interval_item = 156, 
		RULE_expr_concat = 157, RULE_expr_concat_item = 158, RULE_expr_case = 159, 
		RULE_expr_case_simple = 160, RULE_expr_case_searched = 161, RULE_expr_cursor_attribute = 162, 
		RULE_expr_agg_window_func = 163, RULE_expr_func_all_distinct = 164, RULE_expr_func_over_clause = 165, 
		RULE_expr_func_partition_by_clause = 166, RULE_expr_spec_func = 167, RULE_expr_func = 168, 
		RULE_expr_func_params = 169, RULE_func_param = 170, RULE_date_literal = 171, 
		RULE_timestamp_literal = 172, RULE_ident = 173, RULE_string = 174, RULE_int_number = 175, 
		RULE_dec_number = 176, RULE_bool_literal = 177, RULE_null_const = 178, 
		RULE_missing_semicolon = 179, RULE_non_reserved_words = 180;
	public static final String[] ruleNames = {
		"program", "block", "begin_end_block", "single_block_stmt", "block_end", 
		"proc_block", "stmt", "semicolon_stmt", "cpp_stmt", "func_cpp_stmt", "paramsection", 
		"parameters", "openscope", "closescope", "cpp_body", "assignment_stmt_cpp", 
		"assignment_cpp", "declare_stmt_cpp", "declare_cpp", "if_cpp_stmt", "elseif_cpp_block", 
		"else_cpp_block", "for_cpp_stmt", "inc_cpp", "exception_block", "exception_block_item", 
		"null_stmt", "expr_stmt", "assignment_stmt", "assignment_stmt_item", "assignment_stmt_single_item", 
		"assignment_stmt_multiple_item", "assignment_stmt_select_item", "set_session_option", 
		"set_current_schema_option", "set_teradata_session_option", "set_mssql_session_option", 
		"begin_transaction_stmt", "break_stmt", "call_stmt", "declare_stmt", "declare_block", 
		"declare_block_inplace", "declare_stmt_item", "declare_var_item", "declare_condition_item", 
		"declare_cursor_item", "cursor_with_return", "cursor_without_return", 
		"declare_handler_item", "declare_temporary_table_item", "create_table_stmt", 
		"create_local_temp_table_stmt", "create_table_definition", "create_table_columns", 
		"create_table_columns_item", "column_name", "create_table_column_inline_cons", 
		"create_table_column_cons", "create_table_fk_action", "create_table_preoptions", 
		"create_table_preoptions_item", "create_table_preoptions_td_item", "create_table_options", 
		"create_table_options_item", "create_table_options_ora_item", "create_table_options_db2_item", 
		"create_table_options_td_item", "create_table_options_hive_item", "create_table_hive_row_format", 
		"create_table_hive_row_format_fields", "create_table_options_mssql_item", 
		"create_table_options_mysql_item", "dtype", "dtype_len", "dtype_attr", 
		"dtype_default", "create_database_stmt", "create_database_option", "create_function_stmt", 
		"create_function_return", "create_package_stmt", "package_spec", "package_spec_item", 
		"create_package_body_stmt", "package_body", "package_body_item", "create_procedure_stmt", 
		"create_routine_params", "create_routine_param_item", "create_routine_options", 
		"create_routine_option", "if_stmt", "if_plsql_stmt", "if_tsql_stmt", "if_bteq_stmt", 
		"elseif_block", "else_block", "exit_stmt", "open_stmt", "close_stmt", 
		"cmp_stmt", "cmp_source", "create_index_stmt", "create_index_col", "index_storage_clause", 
		"index_mssql_storage_clause", "return_stmt", "values_into_stmt", "for_cursor_stmt", 
		"for_range_stmt", "label", "select_stmt", "cte_select_stmt", "cte_select_stmt_item", 
		"cte_select_cols", "fullselect_stmt", "fullselect_stmt_item", "fullselect_set_clause", 
		"subselect_stmt", "select_list", "missing_coma", "select_list_set", "select_list_limit", 
		"select_list_item", "select_list_alias", "select_list_asterisk", "into_clause", 
		"from_clause", "from_table_clause", "from_table_name_clause", "from_subselect_clause", 
		"from_join_clause", "from_join_type_clause", "from_table_values_clause", 
		"from_table_values_row", "from_alias_clause", "table_name", "where_clause", 
		"group_by_clause", "having_clause", "qualify_clause", "order_by_clause", 
		"select_options", "select_options_item", "bool_expr", "bool_expr_atom", 
		"bool_expr_unary", "bool_expr_single_in", "bool_expr_multi_in", "bool_expr_binary", 
		"bool_expr_logical_operator", "bool_expr_binary_operator", "expr", "expr_atom", 
		"expr_interval", "interval_item", "expr_concat", "expr_concat_item", "expr_case", 
		"expr_case_simple", "expr_case_searched", "expr_cursor_attribute", "expr_agg_window_func", 
		"expr_func_all_distinct", "expr_func_over_clause", "expr_func_partition_by_clause", 
		"expr_spec_func", "expr_func", "expr_func_params", "func_param", "date_literal", 
		"timestamp_literal", "ident", "string", "int_number", "dec_number", "bool_literal", 
		"null_const", "missing_semicolon", "non_reserved_words"
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
			setState(362);
			block();
			setState(363);
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
		public List<Cpp_stmtContext> cpp_stmt() {
			return getRuleContexts(Cpp_stmtContext.class);
		}
		public Cpp_stmtContext cpp_stmt(int i) {
			return getRuleContext(Cpp_stmtContext.class,i);
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
			setState(373); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(368);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(365);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(366);
						cpp_stmt();
						}
						break;
					case 3:
						{
						setState(367);
						stmt();
						}
						break;
					}
					setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(370);
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
				setState(375); 
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
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(377);
				declare_block();
				}
			}

			setState(380);
			match(T_BEGIN);
			setState(381);
			block();
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(382);
				exception_block();
				}
				break;
			}
			setState(385);
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
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(T_BEGIN);
				setState(388);
				block();
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(389);
					exception_block();
					}
					break;
				}
				setState(392);
				block_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				stmt();
				setState(395);
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
			setState(399);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(400);
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
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(403);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(406); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(408);
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
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				begin_transaction_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				break_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
				call_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(417);
				close_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(418);
				cmp_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(419);
				create_database_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(420);
				create_function_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(421);
				create_index_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(422);
				create_local_temp_table_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(423);
				create_package_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(424);
				create_package_body_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(425);
				create_procedure_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(426);
				create_table_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(427);
				declare_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(428);
				exit_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(429);
				for_cursor_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(430);
				for_range_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(431);
				if_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(432);
				return_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(433);
				select_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(434);
				open_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(435);
				values_into_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(436);
				null_stmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(437);
				expr_stmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(438);
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
			setState(441);
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

	public static class Cpp_stmtContext extends ParserRuleContext {
		public Func_cpp_stmtContext func_cpp_stmt() {
			return getRuleContext(Func_cpp_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_cpp_stmtContext for_cpp_stmt() {
			return getRuleContext(For_cpp_stmtContext.class,0);
		}
		public Assignment_stmt_cppContext assignment_stmt_cpp() {
			return getRuleContext(Assignment_stmt_cppContext.class,0);
		}
		public Declare_stmt_cppContext declare_stmt_cpp() {
			return getRuleContext(Declare_stmt_cppContext.class,0);
		}
		public Inc_cppContext inc_cpp() {
			return getRuleContext(Inc_cppContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
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
		enterRule(_localctx, 16, RULE_cpp_stmt);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				func_cpp_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				for_cpp_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				assignment_stmt_cpp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(447);
				declare_stmt_cpp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(448);
				inc_cpp(0);
				setState(449);
				match(T_SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(451);
				stmt();
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
		public OpenscopeContext openscope() {
			return getRuleContext(OpenscopeContext.class,0);
		}
		public Cpp_bodyContext cpp_body() {
			return getRuleContext(Cpp_bodyContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public ClosescopeContext closescope() {
			return getRuleContext(ClosescopeContext.class,0);
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
		enterRule(_localctx, 18, RULE_func_cpp_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			dtype();
			setState(455);
			ident();
			setState(456);
			paramsection();
			setState(457);
			openscope();
			setState(458);
			cpp_body();
			setState(459);
			return_stmt();
			setState(460);
			match(T_SEMICOLON);
			setState(461);
			closescope();
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
		enterRule(_localctx, 20, RULE_paramsection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(T_OPEN_P);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BINARY_INTEGER) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PLS_INTEGER - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SIMPLE_INTEGER - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TINYINT - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_PART_COUNT - 322)) | (1L << (T_PART_LOC - 322)) | (1L << (T_RANK - 322)) | (1L << (T_ROW_NUMBER - 322)) | (1L << (T_STDEV - 322)) | (1L << (T_SYSDATE - 322)) | (1L << (T_VARIANCE - 322)) | (1L << (T_USER - 322)) | (1L << (L_ID - 322)))) != 0)) {
				{
				{
				setState(464);
				parameters(0);
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_parameters, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(473);
			dtype();
			setState(474);
			ident();
			}
			_ctx.stop = _input.LT(-1);
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParametersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameters);
					setState(476);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(477);
					match(T_COMMA);
					setState(478);
					dtype();
					setState(479);
					ident();
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class OpenscopeContext extends ParserRuleContext {
		public TerminalNode T_OPEN_B() { return getToken(gParser.T_OPEN_B, 0); }
		public OpenscopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openscope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOpenscope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOpenscope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOpenscope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenscopeContext openscope() throws RecognitionException {
		OpenscopeContext _localctx = new OpenscopeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_openscope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(T_OPEN_B);
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

	public static class ClosescopeContext extends ParserRuleContext {
		public TerminalNode T_CLOSE_B() { return getToken(gParser.T_CLOSE_B, 0); }
		public ClosescopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closescope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterClosescope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitClosescope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitClosescope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosescopeContext closescope() throws RecognitionException {
		ClosescopeContext _localctx = new ClosescopeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_closescope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
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

	public static class Cpp_bodyContext extends ParserRuleContext {
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
		enterRule(_localctx, 28, RULE_cpp_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(490);
					cpp_stmt();
					}
					} 
				}
				setState(495);
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
			exitRule();
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
		enterRule(_localctx, 30, RULE_assignment_stmt_cpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			assignment_cpp(0);
			setState(497);
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
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_assignment_cpp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(500);
				ident();
				setState(501);
				match(T_EQUAL);
				setState(502);
				ident();
				}
				break;
			case 2:
				{
				setState(504);
				ident();
				setState(505);
				match(T_EQUAL);
				setState(508); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(508);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(506);
							int_number();
							}
							break;
						case 2:
							{
							setState(507);
							dec_number();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(510); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(530);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Assignment_cppContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignment_cpp);
						setState(514);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(515);
						match(T_COMMA);
						setState(516);
						ident();
						setState(517);
						match(T_EQUAL);
						setState(520); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								setState(520);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
								case 1:
									{
									setState(518);
									int_number();
									}
									break;
								case 2:
									{
									setState(519);
									dec_number();
									}
									break;
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(522); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						_localctx = new Assignment_cppContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignment_cpp);
						setState(524);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(525);
						match(T_COMMA);
						setState(526);
						ident();
						setState(527);
						match(T_EQUAL);
						setState(528);
						ident();
						}
						break;
					}
					} 
				}
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Declare_stmt_cppContext extends ParserRuleContext {
		public Declare_cppContext declare_cpp() {
			return getRuleContext(Declare_cppContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public Declare_stmt_cppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt_cpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_stmt_cpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_stmt_cpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_stmt_cpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmt_cppContext declare_stmt_cpp() throws RecognitionException {
		Declare_stmt_cppContext _localctx = new Declare_stmt_cppContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declare_stmt_cpp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			declare_cpp(0);
			setState(536);
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

	public static class Declare_cppContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
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
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Declare_cppContext declare_cpp() {
			return getRuleContext(Declare_cppContext.class,0);
		}
		public TerminalNode T_COMMA() { return getToken(gParser.T_COMMA, 0); }
		public Declare_cppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare_cpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare_cpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare_cpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_cppContext declare_cpp() throws RecognitionException {
		return declare_cpp(0);
	}

	private Declare_cppContext declare_cpp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Declare_cppContext _localctx = new Declare_cppContext(_ctx, _parentState);
		Declare_cppContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_declare_cpp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(539);
				dtype();
				setState(540);
				ident();
				}
				break;
			case 2:
				{
				setState(542);
				dtype();
				setState(543);
				ident();
				setState(544);
				match(T_EQUAL);
				setState(552);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ADD:
				case T_SUB:
				case L_INT:
				case L_DEC:
					{
					setState(547); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(547);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
							case 1:
								{
								setState(545);
								int_number();
								}
								break;
							case 2:
								{
								setState(546);
								dec_number();
								}
								break;
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(549); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
				case L_ID:
					{
					setState(551);
					ident();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				setState(554);
				dtype();
				setState(555);
				ident();
				setState(556);
				match(T_EQUAL);
				setState(557);
				select_stmt();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(577);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new Declare_cppContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_declare_cpp);
						setState(561);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(562);
						match(T_COMMA);
						setState(563);
						ident();
						}
						break;
					case 2:
						{
						_localctx = new Declare_cppContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_declare_cpp);
						setState(564);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(565);
						match(T_COMMA);
						setState(566);
						ident();
						setState(567);
						match(T_EQUAL);
						setState(575);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T_ADD:
						case T_SUB:
						case L_INT:
						case L_DEC:
							{
							setState(570); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									setState(570);
									_errHandler.sync(this);
									switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
									case 1:
										{
										setState(568);
										int_number();
										}
										break;
									case 2:
										{
										setState(569);
										dec_number();
										}
										break;
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(572); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
						case L_ID:
							{
							setState(574);
							ident();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public OpenscopeContext openscope() {
			return getRuleContext(OpenscopeContext.class,0);
		}
		public Cpp_bodyContext cpp_body() {
			return getRuleContext(Cpp_bodyContext.class,0);
		}
		public ClosescopeContext closescope() {
			return getRuleContext(ClosescopeContext.class,0);
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
		enterRule(_localctx, 38, RULE_if_cpp_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(T_IF);
			setState(583);
			match(T_OPEN_P);
			setState(584);
			bool_expr(0);
			setState(585);
			match(T_CLOSE_P);
			setState(586);
			openscope();
			setState(587);
			cpp_body();
			setState(588);
			closescope();
			setState(592);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(589);
					elseif_cpp_block();
					}
					} 
				}
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(595);
				else_cpp_block();
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

	public static class Elseif_cpp_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSEIF() { return getToken(gParser.T_ELSEIF, 0); }
		public TerminalNode T_OPEN_P() { return getToken(gParser.T_OPEN_P, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public OpenscopeContext openscope() {
			return getRuleContext(OpenscopeContext.class,0);
		}
		public Cpp_bodyContext cpp_body() {
			return getRuleContext(Cpp_bodyContext.class,0);
		}
		public ClosescopeContext closescope() {
			return getRuleContext(ClosescopeContext.class,0);
		}
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
			setState(598);
			match(T_ELSEIF);
			setState(599);
			match(T_OPEN_P);
			setState(600);
			bool_expr(0);
			setState(601);
			match(T_CLOSE_P);
			setState(602);
			openscope();
			setState(603);
			cpp_body();
			setState(604);
			closescope();
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
		public OpenscopeContext openscope() {
			return getRuleContext(OpenscopeContext.class,0);
		}
		public Cpp_bodyContext cpp_body() {
			return getRuleContext(Cpp_bodyContext.class,0);
		}
		public ClosescopeContext closescope() {
			return getRuleContext(ClosescopeContext.class,0);
		}
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
			setState(606);
			match(T_ELSE);
			setState(607);
			openscope();
			setState(608);
			cpp_body();
			setState(609);
			closescope();
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
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(gParser.T_SEMICOLON, 0); }
		public Inc_cppContext inc_cpp() {
			return getRuleContext(Inc_cppContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(gParser.T_CLOSE_P, 0); }
		public OpenscopeContext openscope() {
			return getRuleContext(OpenscopeContext.class,0);
		}
		public Cpp_bodyContext cpp_body() {
			return getRuleContext(Cpp_bodyContext.class,0);
		}
		public ClosescopeContext closescope() {
			return getRuleContext(ClosescopeContext.class,0);
		}
		public Assignment_stmt_cppContext assignment_stmt_cpp() {
			return getRuleContext(Assignment_stmt_cppContext.class,0);
		}
		public Declare_stmt_cppContext declare_stmt_cpp() {
			return getRuleContext(Declare_stmt_cppContext.class,0);
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
		enterRule(_localctx, 44, RULE_for_cpp_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(T_FOR);
			setState(612);
			match(T_OPEN_P);
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(613);
				assignment_stmt_cpp();
				}
				break;
			case 2:
				{
				setState(614);
				declare_stmt_cpp();
				}
				break;
			}
			setState(617);
			bool_expr(0);
			setState(618);
			match(T_SEMICOLON);
			setState(619);
			inc_cpp(0);
			setState(620);
			match(T_CLOSE_P);
			setState(621);
			openscope();
			setState(622);
			cpp_body();
			setState(623);
			closescope();
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
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
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
		public List<Inc_cppContext> inc_cpp() {
			return getRuleContexts(Inc_cppContext.class);
		}
		public Inc_cppContext inc_cpp(int i) {
			return getRuleContext(Inc_cppContext.class,i);
		}
		public TerminalNode T_COMMA() { return getToken(gParser.T_COMMA, 0); }
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
		return inc_cpp(0);
	}

	private Inc_cppContext inc_cpp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Inc_cppContext _localctx = new Inc_cppContext(_ctx, _parentState);
		Inc_cppContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_inc_cpp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(626);
				ident();
				setState(627);
				match(T_ADD);
				setState(628);
				match(T_ADD);
				}
				break;
			case 2:
				{
				setState(630);
				ident();
				setState(631);
				match(T_SUBSUB);
				}
				break;
			case 3:
				{
				setState(633);
				ident();
				setState(634);
				match(T_ADD);
				setState(635);
				match(T_EQUAL);
				setState(638);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ADD:
				case T_SUB:
				case L_INT:
					{
					setState(636);
					int_number();
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
				case L_ID:
					{
					setState(637);
					ident();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				{
				setState(640);
				ident();
				setState(641);
				match(T_SUB);
				setState(642);
				match(T_EQUAL);
				setState(645);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ADD:
				case T_SUB:
				case L_INT:
					{
					setState(643);
					int_number();
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
				case L_ID:
					{
					setState(644);
					ident();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				{
				setState(647);
				ident();
				setState(648);
				match(T_MUL);
				setState(649);
				match(T_EQUAL);
				setState(652);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ADD:
				case T_SUB:
				case L_INT:
					{
					setState(650);
					int_number();
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
				case L_ID:
					{
					setState(651);
					ident();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Inc_cppContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inc_cpp);
					setState(656);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(657);
					match(T_COMMA);
					setState(658);
					inc_cpp(2);
					}
					} 
				}
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
			setState(664);
			match(T_EXCEPTION);
			setState(666); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(665);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(668); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
			setState(670);
			match(T_WHEN);
			setState(671);
			match(L_ID);
			setState(672);
			match(T_THEN);
			setState(673);
			block();
			setState(674);
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
			setState(676);
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
			setState(678);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			setState(679);
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
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				match(T_SET);
				setState(682);
				set_session_option();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(683);
					match(T_SET);
					}
					break;
				}
				setState(686);
				assignment_stmt_item();
				setState(691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(687);
						match(T_COMMA);
						setState(688);
						assignment_stmt_item();
						}
						} 
					}
					setState(693);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(698);
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
			setState(717);
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
				setState(701);
				ident();
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(702);
					match(T_COLON);
					}
				}

				setState(705);
				match(T_EQUAL);
				setState(706);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				match(T_OPEN_P);
				setState(709);
				ident();
				setState(710);
				match(T_CLOSE_P);
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(711);
					match(T_COLON);
					}
				}

				setState(714);
				match(T_EQUAL);
				setState(715);
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
			setState(719);
			match(T_OPEN_P);
			setState(720);
			ident();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(721);
				match(T_COMMA);
				setState(722);
				ident();
				}
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(728);
			match(T_CLOSE_P);
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(729);
				match(T_COLON);
				}
			}

			setState(732);
			match(T_EQUAL);
			setState(733);
			match(T_OPEN_P);
			setState(734);
			expr(0);
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(735);
				match(T_COMMA);
				setState(736);
				expr(0);
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(742);
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
			setState(756);
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
				setState(744);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(745);
				match(T_OPEN_P);
				setState(746);
				ident();
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(747);
					match(T_COMMA);
					setState(748);
					ident();
					}
					}
					setState(753);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(754);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(758);
				match(T_COLON);
				}
			}

			setState(761);
			match(T_EQUAL);
			setState(762);
			match(T_OPEN_P);
			setState(763);
			select_stmt();
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
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_SCHEMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
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
				setState(767);
				set_mssql_session_option();
				}
				break;
			case T_QUERY_BAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
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
			setState(776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_SCHEMA:
				{
				{
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CURRENT) {
					{
					setState(771);
					match(T_CURRENT);
					}
				}

				setState(774);
				match(T_SCHEMA);
				}
				}
				break;
			case T_CURRENT_SCHEMA:
				{
				setState(775);
				match(T_CURRENT_SCHEMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(778);
				match(T_EQUAL);
				}
			}

			setState(781);
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
			setState(783);
			match(T_QUERY_BAND);
			setState(784);
			match(T_EQUAL);
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(785);
				expr(0);
				}
				break;
			case 2:
				{
				setState(786);
				match(T_NONE);
				}
				break;
			}
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UPDATE) {
				{
				setState(789);
				match(T_UPDATE);
				}
			}

			setState(792);
			match(T_FOR);
			setState(793);
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
			setState(795);
			_la = _input.LA(1);
			if ( !(_la==T_ANSI_NULLS || _la==T_ANSI_PADDING || _la==T_NOCOUNT || _la==T_QUOTED_IDENTIFIER || _la==T_XACT_ABORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(796);
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
			setState(798);
			match(T_BEGIN);
			setState(799);
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
			setState(801);
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
			setState(803);
			match(T_CALL);
			setState(804);
			ident();
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(805);
				match(T_OPEN_P);
				setState(807);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(806);
					expr_func_params();
					}
					break;
				}
				setState(809);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(810);
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
			setState(813);
			match(T_DECLARE);
			setState(814);
			declare_stmt_item();
			setState(819);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(815);
					match(T_COMMA);
					setState(816);
					declare_stmt_item();
					}
					} 
				}
				setState(821);
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
			setState(822);
			match(T_DECLARE);
			setState(823);
			declare_stmt_item();
			setState(824);
			match(T_SEMICOLON);
			setState(830);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(825);
					declare_stmt_item();
					setState(826);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(832);
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
			setState(833);
			declare_stmt_item();
			setState(834);
			match(T_SEMICOLON);
			setState(840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(835);
					declare_stmt_item();
					setState(836);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
				declare_cursor_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				declare_condition_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(845);
				declare_handler_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(846);
				declare_var_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(847);
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
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				ident();
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(851);
					match(T_COMMA);
					setState(852);
					ident();
					}
					}
					setState(857);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(859);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(858);
					match(T_AS);
					}
					break;
				}
				setState(861);
				dtype();
				setState(863);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(862);
					dtype_len();
					}
					break;
				}
				setState(868);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(865);
						dtype_attr();
						}
						} 
					}
					setState(870);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(872);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(871);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				ident();
				setState(875);
				match(T_CONSTANT);
				setState(877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(876);
					match(T_AS);
					}
					break;
				}
				setState(879);
				dtype();
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(880);
					dtype_len();
					}
				}

				setState(883);
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
			setState(887);
			ident();
			setState(888);
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
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(890);
				match(T_CURSOR);
				setState(891);
				ident();
				}
				break;
			case 2:
				{
				setState(892);
				ident();
				setState(893);
				match(T_CURSOR);
				}
				break;
			}
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WITH:
				{
				setState(897);
				cursor_with_return();
				}
				break;
			case T_WITHOUT:
				{
				setState(898);
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
			setState(901);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_FOR || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(902);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(903);
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
			setState(906);
			match(T_WITH);
			setState(907);
			match(T_RETURN);
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ONLY) {
				{
				setState(908);
				match(T_ONLY);
				}
			}

			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TO) {
				{
				setState(911);
				match(T_TO);
				setState(912);
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
			setState(915);
			match(T_WITHOUT);
			setState(916);
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
			setState(918);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(919);
			match(T_HANDLER);
			setState(920);
			match(T_FOR);
			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(921);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2:
				{
				setState(922);
				match(T_SQLWARNING);
				}
				break;
			case 3:
				{
				setState(923);
				match(T_NOT);
				setState(924);
				match(T_FOUND);
				}
				break;
			case 4:
				{
				setState(925);
				ident();
				}
				break;
			}
			setState(928);
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
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(930);
				match(T_GLOBAL);
				}
			}

			setState(933);
			match(T_TEMPORARY);
			setState(934);
			match(T_TABLE);
			setState(935);
			ident();
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(936);
				create_table_preoptions();
				}
			}

			setState(939);
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
			setState(941);
			match(T_CREATE);
			setState(942);
			match(T_TABLE);
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(943);
				match(T_IF);
				setState(944);
				match(T_NOT);
				setState(945);
				match(T_EXISTS);
				}
				break;
			}
			setState(948);
			table_name();
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(949);
				create_table_preoptions();
				}
			}

			setState(952);
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
			setState(954);
			match(T_CREATE);
			setState(961);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(955);
				match(T_LOCAL);
				setState(956);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(957);
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

				setState(960);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(963);
			match(T_TABLE);
			setState(964);
			ident();
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(965);
				create_table_preoptions();
				}
			}

			setState(968);
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
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(970);
					match(T_AS);
					}
				}

				setState(973);
				match(T_OPEN_P);
				setState(974);
				select_stmt();
				setState(975);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(977);
					match(T_AS);
					}
				}

				setState(980);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(981);
				match(T_OPEN_P);
				setState(982);
				create_table_columns();
				setState(983);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(987);
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
			setState(990);
			create_table_columns_item();
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(991);
				match(T_COMMA);
				setState(992);
				create_table_columns_item();
				}
				}
				setState(997);
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
			setState(1020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				column_name();
				setState(999);
				dtype();
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(1000);
					dtype_len();
					}
				}

				setState(1006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1003);
						dtype_attr();
						}
						} 
					}
					setState(1008);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T_DEFAULT - 72)) | (1L << (T_ENABLE - 72)) | (1L << (T_IDENTITY - 72)))) != 0) || ((((_la - 182)) & ~0x3f) == 0 && ((1L << (_la - 182)) & ((1L << (T_NOT - 182)) | (1L << (T_NULL - 182)) | (1L << (T_PRIMARY - 182)) | (1L << (T_REFERENCES - 182)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (T_UNIQUE - 286)) | (1L << (T_WITH - 286)) | (1L << (T_COLON - 286)) | (1L << (T_EQUAL - 286)))) != 0)) {
					{
					{
					setState(1009);
					create_table_column_inline_cons();
					}
					}
					setState(1014);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(1015);
					match(T_CONSTRAINT);
					setState(1016);
					ident();
					}
				}

				setState(1019);
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
			setState(1022);
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
			setState(1056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1025);
					match(T_NOT);
					}
				}

				setState(1028);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1029);
				match(T_PRIMARY);
				setState(1030);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1031);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(1032);
				match(T_REFERENCES);
				setState(1033);
				table_name();
				setState(1034);
				match(T_OPEN_P);
				setState(1035);
				ident();
				setState(1036);
				match(T_CLOSE_P);
				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(1037);
					create_table_fk_action();
					}
					}
					setState(1042);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(1043);
				match(T_IDENTITY);
				setState(1044);
				match(T_OPEN_P);
				setState(1045);
				match(L_INT);
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1046);
					match(T_COMMA);
					setState(1047);
					match(L_INT);
					}
					}
					setState(1052);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1053);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1054);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1055);
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
			setState(1115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				match(T_PRIMARY);
				setState(1059);
				match(T_KEY);
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(1060);
					match(T_CLUSTERED);
					}
				}

				setState(1063);
				match(T_OPEN_P);
				setState(1064);
				ident();
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(1065);
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

				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1068);
					match(T_COMMA);
					setState(1069);
					ident();
					setState(1071);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(1070);
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
					setState(1077);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1078);
				match(T_CLOSE_P);
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(1079);
					match(T_ENABLE);
					}
				}

				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1082);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
				match(T_FOREIGN);
				setState(1086);
				match(T_KEY);
				setState(1087);
				match(T_OPEN_P);
				setState(1088);
				ident();
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1089);
					match(T_COMMA);
					setState(1090);
					ident();
					}
					}
					setState(1095);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1096);
				match(T_CLOSE_P);
				setState(1097);
				match(T_REFERENCES);
				setState(1098);
				table_name();
				setState(1099);
				match(T_OPEN_P);
				setState(1100);
				ident();
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1101);
					match(T_COMMA);
					setState(1102);
					ident();
					}
					}
					setState(1107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1108);
				match(T_CLOSE_P);
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(1109);
					create_table_fk_action();
					}
					}
					setState(1114);
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
			setState(1117);
			match(T_ON);
			setState(1118);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1119);
				match(T_NO);
				setState(1120);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(1121);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(1122);
				match(T_SET);
				setState(1123);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(1124);
				match(T_SET);
				setState(1125);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(1126);
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
			setState(1130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1129);
				create_table_preoptions_item();
				}
				}
				setState(1132); 
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
			setState(1137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				match(T_COMMA);
				setState(1135);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1136);
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
			setState(1140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(1139);
				match(T_NO);
				}
			}

			setState(1142);
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
			setState(1145); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1144);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1147); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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
			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149);
				match(T_ON);
				setState(1150);
				match(T_COMMIT);
				setState(1151);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1152);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1154);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1155);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1156);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1157);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1158);
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
			setState(1179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				match(T_SEGMENT);
				setState(1162);
				match(T_CREATION);
				setState(1163);
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
				setState(1164);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1165);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1166);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1167);
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
				setState(1168);
				match(T_STORAGE);
				setState(1169);
				match(T_OPEN_P);
				setState(1172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1172);
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
						setState(1170);
						ident();
						}
						break;
					case L_INT:
						{
						setState(1171);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_PART_COUNT - 322)) | (1L << (T_PART_LOC - 322)) | (1L << (T_RANK - 322)) | (1L << (T_ROW_NUMBER - 322)) | (1L << (T_STDEV - 322)) | (1L << (T_SYSDATE - 322)) | (1L << (T_VARIANCE - 322)) | (1L << (T_USER - 322)) | (1L << (L_ID - 322)) | (1L << (L_INT - 322)))) != 0) );
				setState(1176);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1177);
				match(T_TABLESPACE);
				setState(1178);
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
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(1181);
					match(T_INDEX);
					}
				}

				setState(1184);
				match(T_IN);
				setState(1185);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
				match(T_WITH);
				setState(1187);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1188);
				match(T_DISTRIBUTE);
				setState(1189);
				match(T_BY);
				setState(1190);
				match(T_HASH);
				setState(1191);
				match(T_OPEN_P);
				setState(1192);
				ident();
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1193);
					match(T_COMMA);
					setState(1194);
					ident();
					}
					}
					setState(1199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1200);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1202);
					match(T_NOT);
					}
				}

				setState(1205);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1206);
				match(T_COMPRESS);
				setState(1207);
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
				setState(1208);
				match(T_DEFINITION);
				setState(1209);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1210);
				match(T_WITH);
				setState(1211);
				match(T_RESTRICT);
				setState(1212);
				match(T_ON);
				setState(1213);
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
			setState(1234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(1216);
					match(T_UNIQUE);
					}
				}

				setState(1219);
				match(T_PRIMARY);
				setState(1220);
				match(T_INDEX);
				setState(1221);
				match(T_OPEN_P);
				setState(1222);
				ident();
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1223);
					match(T_COMMA);
					setState(1224);
					ident();
					}
					}
					setState(1229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1230);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1232);
				match(T_WITH);
				setState(1233);
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
			setState(1240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1236);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1237);
				match(T_STORED);
				setState(1238);
				match(T_AS);
				setState(1239);
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
			setState(1242);
			match(T_ROW);
			setState(1243);
			match(T_FORMAT);
			setState(1244);
			match(T_DELIMITED);
			setState(1248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1245);
					create_table_hive_row_format_fields();
					}
					} 
				}
				setState(1250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
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
			setState(1278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1251);
				match(T_FIELDS);
				setState(1252);
				match(T_TERMINATED);
				setState(1253);
				match(T_BY);
				setState(1254);
				expr(0);
				setState(1258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1255);
					match(T_ESCAPED);
					setState(1256);
					match(T_BY);
					setState(1257);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				match(T_COLLECTION);
				setState(1261);
				match(T_ITEMS);
				setState(1262);
				match(T_TERMINATED);
				setState(1263);
				match(T_BY);
				setState(1264);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1265);
				match(T_MAP);
				setState(1266);
				match(T_KEYS);
				setState(1267);
				match(T_TERMINATED);
				setState(1268);
				match(T_BY);
				setState(1269);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1270);
				match(T_LINES);
				setState(1271);
				match(T_TERMINATED);
				setState(1272);
				match(T_BY);
				setState(1273);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1274);
				match(T_NULL);
				setState(1275);
				match(T_DEFINED);
				setState(1276);
				match(T_AS);
				setState(1277);
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
			setState(1284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				match(T_ON);
				setState(1281);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1282);
				match(T_TEXTIMAGE_ON);
				setState(1283);
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
			setState(1313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1286);
				match(T_AUTO_INCREMENT);
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1287);
					match(T_EQUAL);
					}
				}

				setState(1290);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1291);
				match(T_COMMENT);
				setState(1293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1292);
					match(T_EQUAL);
					}
				}

				setState(1295);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(1296);
					match(T_DEFAULT);
					}
				}

				setState(1302);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(1299);
					match(T_CHARACTER);
					setState(1300);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(1301);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1304);
					match(T_EQUAL);
					}
				}

				setState(1307);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1308);
				match(T_ENGINE);
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
			setState(1360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1315);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1316);
				match(T_BIGINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1317);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1318);
				match(T_BINARY_FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1319);
				match(T_BINARY_INTEGER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1320);
				match(T_BIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1321);
				match(T_DATE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1322);
				match(T_DATETIME);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1323);
				match(T_DEC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1324);
				match(T_DECIMAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1325);
				match(T_DOUBLE);
				setState(1327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1326);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1329);
				match(T_FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1330);
				match(T_INT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1331);
				match(T_INT2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1332);
				match(T_INT4);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1333);
				match(T_INT8);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1334);
				match(T_INTEGER);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1335);
				match(T_NCHAR);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1336);
				match(T_NVARCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1337);
				match(T_NUMBER);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1338);
				match(T_NUMERIC);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1339);
				match(T_PLS_INTEGER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1340);
				match(T_REAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1341);
				match(T_RESULT_SET_LOCATOR);
				setState(1342);
				match(T_VARYING);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1343);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1344);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1345);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1346);
				match(T_SMALLINT);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1347);
				match(T_SMALLDATETIME);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1348);
				match(T_STRING);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1349);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1350);
				match(T_TIMESTAMP);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1351);
				match(T_TINYINT);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1352);
				match(T_VARCHAR);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1353);
				match(T_VARCHAR2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1354);
				match(T_XML);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1355);
				ident();
				setState(1358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1356);
					match(T__2);
					setState(1357);
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
			setState(1362);
			match(T_OPEN_P);
			setState(1363);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1364);
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

			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1367);
				match(T_COMMA);
				setState(1368);
				match(L_INT);
				}
			}

			setState(1371);
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
			setState(1384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1373);
					match(T_NOT);
					}
				}

				setState(1376);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				match(T_CHARACTER);
				setState(1378);
				match(T_SET);
				setState(1379);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1380);
					match(T_NOT);
					}
				}

				setState(1383);
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
			setState(1398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1386);
					match(T_COLON);
					}
				}

				setState(1389);
				match(T_EQUAL);
				setState(1390);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1391);
					match(T_WITH);
					}
				}

				setState(1394);
				match(T_DEFAULT);
				setState(1396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1395);
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
			setState(1400);
			match(T_CREATE);
			setState(1401);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1402);
				match(T_IF);
				setState(1403);
				match(T_NOT);
				setState(1404);
				match(T_EXISTS);
				}
				break;
			}
			setState(1407);
			expr(0);
			setState(1411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1408);
					create_database_option();
					}
					} 
				}
				setState(1413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
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
			setState(1418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1414);
				match(T_COMMENT);
				setState(1415);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1416);
				match(T_LOCATION);
				setState(1417);
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
			setState(1427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1420);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1421);
				match(T_CREATE);
				setState(1424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1422);
					match(T_OR);
					setState(1423);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1426);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
			}
			setState(1429);
			match(T_FUNCTION);
			setState(1430);
			ident();
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1431);
				create_routine_params();
				}
				break;
			}
			setState(1434);
			create_function_return();
			setState(1436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1435);
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
			setState(1439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1438);
				declare_block_inplace();
				}
				break;
			}
			setState(1441);
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
			setState(1443);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1444);
			dtype();
			setState(1446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1445);
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
			setState(1486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ALTER:
					{
					setState(1448);
					match(T_ALTER);
					}
					break;
				case T_CREATE:
					{
					setState(1449);
					match(T_CREATE);
					setState(1452);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_OR) {
						{
						setState(1450);
						match(T_OR);
						setState(1451);
						match(T_REPLACE);
						}
					}

					}
					break;
				case T_REPLACE:
					{
					setState(1454);
					match(T_REPLACE);
					}
					break;
				case T_PACKAGE:
					break;
				default:
					break;
				}
				setState(1457);
				match(T_PACKAGE);
				setState(1458);
				ident();
				setState(1459);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1460);
				package_spec();
				setState(1461);
				match(T_END);
				setState(1465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1462);
					ident();
					setState(1463);
					match(T_SEMICOLON);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1474);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ALTER:
					{
					setState(1467);
					match(T_ALTER);
					}
					break;
				case T_CREATE:
					{
					setState(1468);
					match(T_CREATE);
					setState(1471);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_OR) {
						{
						setState(1469);
						match(T_OR);
						setState(1470);
						match(T_REPLACE);
						}
					}

					}
					break;
				case T_REPLACE:
					{
					setState(1473);
					match(T_REPLACE);
					}
					break;
				case T_PACKAGE:
					break;
				default:
					break;
				}
				setState(1476);
				match(T_PACKAGE);
				setState(1477);
				ident();
				setState(1478);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1479);
				package_spec();
				setState(1480);
				match(T_END);
				setState(1484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1481);
					ident();
					setState(1482);
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
			setState(1488);
			package_spec_item();
			setState(1489);
			match(T_SEMICOLON);
			setState(1495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_PART_COUNT - 322)) | (1L << (T_PART_LOC - 322)) | (1L << (T_RANK - 322)) | (1L << (T_ROW_NUMBER - 322)) | (1L << (T_STDEV - 322)) | (1L << (T_SYSDATE - 322)) | (1L << (T_VARIANCE - 322)) | (1L << (T_USER - 322)) | (1L << (L_ID - 322)))) != 0)) {
				{
				{
				setState(1490);
				package_spec_item();
				setState(1491);
				match(T_SEMICOLON);
				}
				}
				setState(1497);
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
			setState(1511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				match(T_FUNCTION);
				setState(1500);
				ident();
				setState(1502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1501);
					create_routine_params();
					}
					break;
				}
				setState(1504);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1506);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1507);
				ident();
				setState(1509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1508);
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
			setState(1520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1513);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1514);
				match(T_CREATE);
				setState(1517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1515);
					match(T_OR);
					setState(1516);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1519);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1522);
			match(T_PACKAGE);
			setState(1523);
			match(T_BODY);
			setState(1524);
			ident();
			setState(1525);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1526);
			package_body();
			setState(1527);
			match(T_END);
			setState(1531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1528);
				ident();
				setState(1529);
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
			setState(1533);
			package_body_item();
			setState(1534);
			match(T_SEMICOLON);
			setState(1540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA) | (1L << T_CURSOR) | (1L << T_DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)) | (1L << (T_HAVING - 64)) | (1L << (T_HDFS - 64)) | (1L << (T_HIVE - 64)) | (1L << (T_HOST - 64)) | (1L << (T_IDENTITY - 64)) | (1L << (T_IF - 64)) | (1L << (T_IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)) | (1L << (T_NOT - 128)) | (1L << (T_NOTFOUND - 128)) | (1L << (T_NUMERIC - 128)) | (1L << (T_NUMBER - 128)) | (1L << (T_OBJECT - 128)) | (1L << (T_OFF - 128)) | (1L << (T_ON - 128)) | (1L << (T_ONLY - 128)) | (1L << (T_OPEN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)) | (1L << (T_SESSION - 192)) | (1L << (T_SESSIONS - 192)) | (1L << (T_SETS - 192)) | (1L << (T_SHARE - 192)) | (1L << (T_SIGNAL - 192)) | (1L << (T_SIMPLE_DOUBLE - 192)) | (1L << (T_SIMPLE_FLOAT - 192)) | (1L << (T_SMALLDATETIME - 192)) | (1L << (T_SMALLINT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)) | (1L << (T_ACTIVITY_COUNT - 256)) | (1L << (T_CUME_DIST - 256)) | (1L << (T_CURRENT_DATE - 256)) | (1L << (T_CURRENT_TIMESTAMP - 256)) | (1L << (T_CURRENT_USER - 256)) | (1L << (T_DENSE_RANK - 256)) | (1L << (T_FIRST_VALUE - 256)) | (1L << (T_LAG - 256)) | (1L << (T_LAST_VALUE - 256)) | (1L << (T_LEAD - 256)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (T_PART_COUNT - 322)) | (1L << (T_PART_LOC - 322)) | (1L << (T_RANK - 322)) | (1L << (T_ROW_NUMBER - 322)) | (1L << (T_STDEV - 322)) | (1L << (T_SYSDATE - 322)) | (1L << (T_VARIANCE - 322)) | (1L << (T_USER - 322)) | (1L << (L_ID - 322)))) != 0)) {
				{
				{
				setState(1535);
				package_body_item();
				setState(1536);
				match(T_SEMICOLON);
				}
				}
				setState(1542);
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
			setState(1546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1543);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1544);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1545);
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
			setState(1612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1555);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ALTER:
					{
					setState(1548);
					match(T_ALTER);
					}
					break;
				case T_CREATE:
					{
					setState(1549);
					match(T_CREATE);
					setState(1552);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_OR) {
						{
						setState(1550);
						match(T_OR);
						setState(1551);
						match(T_REPLACE);
						}
					}

					}
					break;
				case T_REPLACE:
					{
					setState(1554);
					match(T_REPLACE);
					}
					break;
				case T_PROC:
				case T_PROCEDURE:
					break;
				default:
					break;
				}
				setState(1557);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1558);
				ident();
				setState(1560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1559);
					create_routine_params();
					}
					break;
				}
				setState(1563);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1562);
					create_routine_options();
					}
					break;
				}
				setState(1566);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1565);
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
				setState(1569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1568);
					declare_block_inplace();
					}
					break;
				}
				setState(1572);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1571);
					label();
					}
					break;
				}
				setState(1574);
				proc_block();
				setState(1578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1575);
					ident();
					setState(1576);
					match(T_SEMICOLON);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1587);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ALTER:
					{
					setState(1580);
					match(T_ALTER);
					}
					break;
				case T_CREATE:
					{
					setState(1581);
					match(T_CREATE);
					setState(1584);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_OR) {
						{
						setState(1582);
						match(T_OR);
						setState(1583);
						match(T_REPLACE);
						}
					}

					}
					break;
				case T_REPLACE:
					{
					setState(1586);
					match(T_REPLACE);
					}
					break;
				case T_PROC:
				case T_PROCEDURE:
					break;
				default:
					break;
				}
				setState(1589);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1590);
				ident();
				setState(1592);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1591);
					create_routine_params();
					}
					break;
				}
				setState(1595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1594);
					create_routine_options();
					}
					break;
				}
				setState(1598);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1597);
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
				setState(1601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1600);
					declare_block_inplace();
					}
					break;
				}
				setState(1604);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1603);
					label();
					}
					break;
				}
				setState(1606);
				proc_block();
				setState(1610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1607);
					ident();
					setState(1608);
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
			setState(1636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1614);
				match(T_OPEN_P);
				setState(1615);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1616);
				match(T_OPEN_P);
				setState(1617);
				create_routine_param_item();
				setState(1622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1618);
					match(T_COMMA);
					setState(1619);
					create_routine_param_item();
					}
					}
					setState(1624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1625);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1627);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1628);
				create_routine_param_item();
				setState(1633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1629);
						match(T_COMMA);
						setState(1630);
						create_routine_param_item();
						}
						} 
					}
					setState(1635);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
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
			setState(1680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1638);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1639);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1640);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1641);
					match(T_IN);
					setState(1642);
					match(T_OUT);
					}
					break;
				}
				setState(1645);
				ident();
				setState(1646);
				dtype();
				setState(1648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1647);
					dtype_len();
					}
					break;
				}
				setState(1653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1650);
						dtype_attr();
						}
						} 
					}
					setState(1655);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				}
				setState(1657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1656);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1659);
				ident();
				setState(1665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
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
				dtype();
				setState(1669);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1668);
					dtype_len();
					}
					break;
				}
				setState(1674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1671);
						dtype_attr();
						}
						} 
					}
					setState(1676);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				}
				setState(1678);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1677);
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
			setState(1683); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1682);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1685); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
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
			setState(1698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1687);
				match(T_LANGUAGE);
				setState(1688);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1689);
				match(T_SQL);
				setState(1690);
				match(T_SECURITY);
				setState(1691);
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
				setState(1693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1692);
					match(T_DYNAMIC);
					}
				}

				setState(1695);
				match(T_RESULT);
				setState(1696);
				match(T_SETS);
				setState(1697);
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
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1700);
				if_cpp_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1701);
				if_plsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1702);
				if_tsql_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1703);
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
			setState(1706);
			match(T_IF);
			setState(1707);
			bool_expr(0);
			setState(1708);
			match(T_THEN);
			setState(1709);
			block();
			setState(1713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1710);
				elseif_block();
				}
				}
				setState(1715);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1716);
				else_block();
				}
			}

			setState(1719);
			match(T_END);
			setState(1720);
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
			setState(1722);
			match(T_IF);
			setState(1723);
			bool_expr(0);
			setState(1724);
			single_block_stmt();
			setState(1727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1725);
				match(T_ELSE);
				setState(1726);
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
			setState(1729);
			match(T__3);
			setState(1730);
			match(T_IF);
			setState(1731);
			bool_expr(0);
			setState(1732);
			match(T_THEN);
			setState(1733);
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
			setState(1735);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1736);
			bool_expr(0);
			setState(1737);
			match(T_THEN);
			setState(1738);
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
			setState(1740);
			match(T_ELSE);
			setState(1741);
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
			setState(1743);
			match(T_EXIT);
			setState(1745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1744);
				match(L_ID);
				}
				break;
			}
			setState(1749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1747);
				match(T_WHEN);
				setState(1748);
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
			setState(1751);
			match(T_OPEN);
			setState(1752);
			match(L_ID);
			setState(1758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1753);
				match(T_FOR);
				setState(1756);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1754);
					select_stmt();
					}
					break;
				case 2:
					{
					setState(1755);
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
			setState(1760);
			match(T_CLOSE);
			setState(1761);
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
			setState(1763);
			match(T_CMP);
			setState(1764);
			_la = _input.LA(1);
			if ( !(_la==T_ROW_COUNT || _la==T_SUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1765);
			cmp_source();
			setState(1766);
			match(T_COMMA);
			setState(1767);
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
			setState(1777);
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
				setState(1769);
				table_name();
				setState(1771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1770);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(1773);
				match(T_OPEN_P);
				setState(1774);
				select_stmt();
				setState(1775);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1779);
				match(T_AT);
				setState(1780);
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
			setState(1783);
			match(T_CREATE);
			setState(1785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1784);
				match(T_UNIQUE);
				}
			}

			setState(1787);
			match(T_INDEX);
			setState(1788);
			ident();
			setState(1789);
			match(T_ON);
			setState(1790);
			table_name();
			setState(1791);
			match(T_OPEN_P);
			setState(1792);
			create_index_col();
			setState(1797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1793);
				match(T_COMMA);
				setState(1794);
				create_index_col();
				}
				}
				setState(1799);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1800);
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
			setState(1802);
			ident();
			setState(1804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(1803);
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
			setState(1806);
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
			setState(1808);
			match(T_WITH);
			setState(1809);
			match(T_OPEN_P);
			setState(1810);
			ident();
			setState(1811);
			match(T_EQUAL);
			setState(1812);
			ident();
			setState(1820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1813);
				match(T_COMMA);
				setState(1814);
				ident();
				setState(1815);
				match(T_EQUAL);
				setState(1816);
				ident();
				}
				}
				setState(1822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1823);
			match(T_CLOSE_P);
			setState(1827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ON || _la==T_TEXTIMAGE_ON) {
				{
				{
				setState(1824);
				create_table_options_mssql_item();
				}
				}
				setState(1829);
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
			setState(1830);
			match(T_RETURN);
			setState(1832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1831);
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
			setState(1834);
			match(T_VALUES);
			setState(1836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1835);
				match(T_OPEN_P);
				}
				break;
			}
			setState(1838);
			expr(0);
			setState(1843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1839);
				match(T_COMMA);
				setState(1840);
				expr(0);
				}
				}
				setState(1845);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(1846);
				match(T_CLOSE_P);
				}
			}

			setState(1849);
			match(T_INTO);
			setState(1851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1850);
				match(T_OPEN_P);
				}
			}

			setState(1853);
			ident();
			setState(1858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1854);
					match(T_COMMA);
					setState(1855);
					ident();
					}
					} 
				}
				setState(1860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			}
			setState(1862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1861);
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
			setState(1864);
			match(T_FOR);
			setState(1865);
			match(L_ID);
			setState(1866);
			match(T_IN);
			setState(1868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1867);
				match(T_OPEN_P);
				}
				break;
			}
			setState(1870);
			select_stmt();
			setState(1872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(1871);
				match(T_CLOSE_P);
				}
			}

			setState(1874);
			match(T_LOOP);
			setState(1875);
			block();
			setState(1876);
			match(T_END);
			setState(1877);
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
			setState(1879);
			match(T_FOR);
			setState(1880);
			match(L_ID);
			setState(1881);
			match(T_IN);
			setState(1883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1882);
				match(T_REVERSE);
				}
				break;
			}
			setState(1885);
			expr(0);
			setState(1886);
			match(T_DOT2);
			setState(1887);
			expr(0);
			setState(1890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(1888);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1889);
				expr(0);
				}
			}

			setState(1892);
			match(T_LOOP);
			setState(1893);
			block();
			setState(1894);
			match(T_END);
			setState(1895);
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
			setState(1903);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1897);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1898);
				match(T_LESS);
				setState(1899);
				match(T_LESS);
				setState(1900);
				match(L_ID);
				setState(1901);
				match(T_GREATER);
				setState(1902);
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
			setState(1906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(1905);
				cte_select_stmt();
				}
			}

			setState(1908);
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
			setState(1910);
			match(T_WITH);
			setState(1911);
			cte_select_stmt_item();
			setState(1916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1912);
				match(T_COMMA);
				setState(1913);
				cte_select_stmt_item();
				}
				}
				setState(1918);
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
			setState(1919);
			ident();
			setState(1921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1920);
				cte_select_cols();
				}
			}

			setState(1923);
			match(T_AS);
			setState(1924);
			match(T_OPEN_P);
			setState(1925);
			fullselect_stmt();
			setState(1926);
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
			setState(1928);
			match(T_OPEN_P);
			setState(1929);
			ident();
			setState(1934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1930);
				match(T_COMMA);
				setState(1931);
				ident();
				}
				}
				setState(1936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1937);
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
			setState(1939);
			fullselect_stmt_item();
			setState(1945);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1940);
					fullselect_set_clause();
					setState(1941);
					fullselect_stmt_item();
					}
					} 
				}
				setState(1947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
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
			setState(1953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1948);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1949);
				match(T_OPEN_P);
				setState(1950);
				fullselect_stmt();
				setState(1951);
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
			setState(1967);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1955);
				match(T_UNION);
				setState(1957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1956);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1959);
				match(T_EXCEPT);
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1960);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1963);
				match(T_INTERSECT);
				setState(1965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1964);
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
			setState(1969);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1970);
			select_list();
			setState(1972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(1971);
				into_clause();
				}
				break;
			}
			setState(1975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(1974);
				from_clause();
				}
				break;
			}
			setState(1978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(1977);
				where_clause();
				}
				break;
			}
			setState(1981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(1980);
				group_by_clause();
				}
				break;
			}
			setState(1985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(1983);
				having_clause();
				}
				break;
			case 2:
				{
				setState(1984);
				qualify_clause();
				}
				break;
			}
			setState(1988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(1987);
				order_by_clause();
				}
				break;
			}
			setState(1991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(1990);
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
			setState(1994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1993);
				select_list_set();
				}
				break;
			}
			setState(1997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1996);
				select_list_limit();
				}
				break;
			}
			setState(1999);
			select_list_item();
			setState(2004);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2000);
					match(T_COMMA);
					setState(2001);
					select_list_item();
					}
					} 
				}
				setState(2006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
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
			setState(2009);
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
			setState(2011);
			match(T_TOP);
			setState(2012);
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
			setState(2024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2017);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(2014);
					ident();
					setState(2015);
					match(T_EQUAL);
					}
					break;
				}
				setState(2019);
				expr(0);
				setState(2021);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(2020);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(2023);
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
			setState(2035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2026);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(2028);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(2027);
					match(T_AS);
					}
					break;
				}
				setState(2030);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2031);
				match(T_OPEN_P);
				setState(2032);
				match(T_TITLE);
				setState(2033);
				match(L_S_STRING);
				setState(2034);
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
			setState(2039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(2037);
				match(L_ID);
				setState(2038);
				match(T__3);
				}
			}

			setState(2041);
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
			setState(2043);
			match(T_INTO);
			setState(2044);
			ident();
			setState(2049);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2045);
					match(T_COMMA);
					setState(2046);
					ident();
					}
					} 
				}
				setState(2051);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(2052);
			match(T_FROM);
			setState(2053);
			from_table_clause();
			setState(2057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2054);
					from_join_clause();
					}
					} 
				}
				setState(2059);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
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
		enterRule(_localctx, 258, RULE_from_table_clause);
		try {
			setState(2063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2060);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2061);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2062);
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
		enterRule(_localctx, 260, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2065);
			table_name();
			setState(2067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(2066);
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
		enterRule(_localctx, 262, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2069);
			match(T_OPEN_P);
			setState(2070);
			select_stmt();
			setState(2071);
			match(T_CLOSE_P);
			setState(2073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(2072);
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
		enterRule(_localctx, 264, RULE_from_join_clause);
		try {
			setState(2082);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2075);
				match(T_COMMA);
				setState(2076);
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
				setState(2077);
				from_join_type_clause();
				setState(2078);
				from_table_clause();
				setState(2079);
				match(T_ON);
				setState(2080);
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
		enterRule(_localctx, 266, RULE_from_join_type_clause);
		int _la;
		try {
			setState(2093);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(2084);
					match(T_INNER);
					}
				}

				setState(2087);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2088);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(2089);
					match(T_OUTER);
					}
				}

				setState(2092);
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
		enterRule(_localctx, 268, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			match(T_TABLE);
			setState(2096);
			match(T_OPEN_P);
			setState(2097);
			match(T_VALUES);
			setState(2098);
			from_table_values_row();
			setState(2103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2099);
				match(T_COMMA);
				setState(2100);
				from_table_values_row();
				}
				}
				setState(2105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2106);
			match(T_CLOSE_P);
			setState(2108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(2107);
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
		enterRule(_localctx, 270, RULE_from_table_values_row);
		int _la;
		try {
			setState(2122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2110);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2111);
				match(T_OPEN_P);
				setState(2112);
				expr(0);
				setState(2117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2113);
					match(T_COMMA);
					setState(2114);
					expr(0);
					}
					}
					setState(2119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2120);
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
		enterRule(_localctx, 272, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2124);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(2126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(2125);
				match(T_AS);
				}
				break;
			}
			setState(2128);
			ident();
			setState(2139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(2129);
				match(T_OPEN_P);
				setState(2130);
				match(L_ID);
				setState(2135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2131);
					match(T_COMMA);
					setState(2132);
					match(L_ID);
					}
					}
					setState(2137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2138);
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
		enterRule(_localctx, 274, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2141);
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
		enterRule(_localctx, 276, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2143);
			match(T_WHERE);
			setState(2144);
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
		enterRule(_localctx, 278, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2146);
			match(T_GROUP);
			setState(2147);
			match(T_BY);
			setState(2148);
			expr(0);
			setState(2153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2149);
					match(T_COMMA);
					setState(2150);
					expr(0);
					}
					} 
				}
				setState(2155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
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
		enterRule(_localctx, 280, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2156);
			match(T_HAVING);
			setState(2157);
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
		enterRule(_localctx, 282, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2159);
			match(T_QUALIFY);
			setState(2160);
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
		enterRule(_localctx, 284, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2162);
			match(T_ORDER);
			setState(2163);
			match(T_BY);
			setState(2164);
			expr(0);
			setState(2166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2165);
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
			setState(2175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2168);
					match(T_COMMA);
					setState(2169);
					expr(0);
					setState(2171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
					case 1:
						{
						setState(2170);
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
				setState(2177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
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
		enterRule(_localctx, 286, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2179); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2178);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2181); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
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
		enterRule(_localctx, 288, RULE_select_options_item);
		int _la;
		try {
			setState(2194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2183);
				match(T_LIMIT);
				setState(2184);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2185);
				match(T_WITH);
				setState(2186);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 234)) & ~0x3f) == 0 && ((1L << (_la - 234)) & ((1L << (T_RR - 234)) | (1L << (T_RS - 234)) | (1L << (T_UR - 234)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2187);
					match(T_USE);
					setState(2188);
					match(T_AND);
					setState(2189);
					match(T_KEEP);
					setState(2190);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2191);
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
		int _startState = 290;
		enterRecursionRule(_localctx, 290, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				setState(2198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2197);
					match(T_NOT);
					}
				}

				setState(2200);
				match(T_OPEN_P);
				setState(2201);
				bool_expr(0);
				setState(2202);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2204);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(2207);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(2208);
					bool_expr_logical_operator();
					setState(2209);
					bool_expr(3);
					}
					} 
				}
				setState(2215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
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
		enterRule(_localctx, 292, RULE_bool_expr_atom);
		try {
			setState(2219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2216);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2217);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2218);
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
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
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
		enterRule(_localctx, 294, RULE_bool_expr_unary);
		int _la;
		try {
			setState(2248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2221);
				expr(0);
				setState(2222);
				match(T_IS);
				setState(2224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2223);
					match(T_NOT);
					}
				}

				setState(2226);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2228);
				expr(0);
				setState(2229);
				match(T_IS);
				setState(2230);
				bool_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2232);
				expr(0);
				setState(2233);
				match(T_BETWEEN);
				setState(2234);
				expr(0);
				setState(2235);
				match(T_AND);
				setState(2236);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2238);
					match(T_NOT);
					}
				}

				setState(2241);
				match(T_EXISTS);
				setState(2242);
				match(T_OPEN_P);
				setState(2243);
				select_stmt();
				setState(2244);
				match(T_CLOSE_P);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2246);
				bool_expr_single_in();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2247);
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
		enterRule(_localctx, 296, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
			expr(0);
			setState(2252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2251);
				match(T_NOT);
				}
			}

			setState(2254);
			match(T_IN);
			setState(2255);
			match(T_OPEN_P);
			setState(2265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				{
				setState(2256);
				expr(0);
				setState(2261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2257);
					match(T_COMMA);
					setState(2258);
					expr(0);
					}
					}
					setState(2263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(2264);
				select_stmt();
				}
				break;
			}
			setState(2267);
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
		enterRule(_localctx, 298, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2269);
			match(T_OPEN_P);
			setState(2270);
			expr(0);
			setState(2275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2271);
				match(T_COMMA);
				setState(2272);
				expr(0);
				}
				}
				setState(2277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2278);
			match(T_CLOSE_P);
			setState(2280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2279);
				match(T_NOT);
				}
			}

			setState(2282);
			match(T_IN);
			setState(2283);
			match(T_OPEN_P);
			setState(2284);
			select_stmt();
			setState(2285);
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
		enterRule(_localctx, 300, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2287);
			expr(0);
			setState(2288);
			bool_expr_binary_operator();
			setState(2289);
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
		enterRule(_localctx, 302, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
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
		enterRule(_localctx, 304, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2293);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2294);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2295);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(2296);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2297);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2298);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(2299);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2300);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2301);
					match(T_NOT);
					}
				}

				setState(2304);
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
		int _startState = 306;
		enterRecursionRule(_localctx, 306, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				setState(2308);
				match(T_OPEN_P);
				setState(2309);
				select_stmt();
				setState(2310);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2312);
				match(T_OPEN_P);
				setState(2313);
				expr(0);
				setState(2314);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2316);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(2317);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(2318);
				expr_case();
				}
				break;
			case 6:
				{
				setState(2319);
				expr_cursor_attribute();
				}
				break;
			case 7:
				{
				setState(2320);
				expr_agg_window_func();
				}
				break;
			case 8:
				{
				setState(2321);
				expr_spec_func();
				}
				break;
			case 9:
				{
				setState(2322);
				expr_func();
				}
				break;
			case 10:
				{
				setState(2323);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2340);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2326);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2327);
						match(T_MUL);
						setState(2328);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2329);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2330);
						match(T_DIV);
						setState(2331);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2332);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2333);
						match(T_ADD);
						setState(2334);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2335);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2336);
						match(T_SUB);
						setState(2337);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2338);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2339);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(2344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
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
		enterRule(_localctx, 308, RULE_expr_atom);
		try {
			setState(2353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2345);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2346);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2347);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2348);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2349);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2350);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2351);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2352);
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
		enterRule(_localctx, 310, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			match(T_INTERVAL);
			setState(2356);
			expr(0);
			setState(2357);
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
		enterRule(_localctx, 312, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2359);
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
		enterRule(_localctx, 314, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2361);
			expr_concat_item();
			setState(2362);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2363);
			expr_concat_item();
			setState(2368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2364);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2365);
					expr_concat_item();
					}
					} 
				}
				setState(2370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
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
		enterRule(_localctx, 316, RULE_expr_concat_item);
		try {
			setState(2380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2371);
				match(T_OPEN_P);
				setState(2372);
				expr(0);
				setState(2373);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2375);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2376);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2377);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2378);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2379);
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
		enterRule(_localctx, 318, RULE_expr_case);
		try {
			setState(2384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2382);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2383);
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
		enterRule(_localctx, 320, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
			match(T_CASE);
			setState(2387);
			expr(0);
			setState(2393); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2388);
				match(T_WHEN);
				setState(2389);
				expr(0);
				setState(2390);
				match(T_THEN);
				setState(2391);
				expr(0);
				}
				}
				setState(2395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2397);
				match(T_ELSE);
				setState(2398);
				expr(0);
				}
			}

			setState(2401);
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
		enterRule(_localctx, 322, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2403);
			match(T_CASE);
			setState(2409); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2404);
				match(T_WHEN);
				setState(2405);
				bool_expr(0);
				setState(2406);
				match(T_THEN);
				setState(2407);
				expr(0);
				}
				}
				setState(2411); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2413);
				match(T_ELSE);
				setState(2414);
				expr(0);
				}
			}

			setState(2417);
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
		enterRule(_localctx, 324, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2419);
			ident();
			setState(2420);
			match(T__2);
			setState(2421);
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
		enterRule(_localctx, 326, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2423);
				match(T_AVG);
				setState(2424);
				match(T_OPEN_P);
				setState(2426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
				case 1:
					{
					setState(2425);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2428);
				expr(0);
				setState(2429);
				match(T_CLOSE_P);
				setState(2431);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
				case 1:
					{
					setState(2430);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2433);
				match(T_COUNT);
				setState(2434);
				match(T_OPEN_P);
				setState(2440);
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
					setState(2436);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
					case 1:
						{
						setState(2435);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2438);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2439);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2442);
				match(T_CLOSE_P);
				setState(2444);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
				case 1:
					{
					setState(2443);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2446);
				match(T_COUNT_BIG);
				setState(2447);
				match(T_OPEN_P);
				setState(2453);
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
					setState(2449);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
					case 1:
						{
						setState(2448);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2451);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2452);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2455);
				match(T_CLOSE_P);
				setState(2457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
				case 1:
					{
					setState(2456);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2459);
				match(T_CUME_DIST);
				setState(2460);
				match(T_OPEN_P);
				setState(2461);
				match(T_CLOSE_P);
				setState(2462);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2463);
				match(T_DENSE_RANK);
				setState(2464);
				match(T_OPEN_P);
				setState(2465);
				match(T_CLOSE_P);
				setState(2466);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2467);
				match(T_FIRST_VALUE);
				setState(2468);
				match(T_OPEN_P);
				setState(2469);
				expr(0);
				setState(2470);
				match(T_CLOSE_P);
				setState(2471);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2473);
				match(T_LAG);
				setState(2474);
				match(T_OPEN_P);
				setState(2475);
				expr(0);
				setState(2482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2476);
					match(T_COMMA);
					setState(2477);
					expr(0);
					setState(2480);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2478);
						match(T_COMMA);
						setState(2479);
						expr(0);
						}
					}

					}
				}

				setState(2484);
				match(T_CLOSE_P);
				setState(2485);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2487);
				match(T_LAST_VALUE);
				setState(2488);
				match(T_OPEN_P);
				setState(2489);
				expr(0);
				setState(2490);
				match(T_CLOSE_P);
				setState(2491);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2493);
				match(T_LEAD);
				setState(2494);
				match(T_OPEN_P);
				setState(2495);
				expr(0);
				setState(2502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2496);
					match(T_COMMA);
					setState(2497);
					expr(0);
					setState(2500);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2498);
						match(T_COMMA);
						setState(2499);
						expr(0);
						}
					}

					}
				}

				setState(2504);
				match(T_CLOSE_P);
				setState(2505);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2507);
				match(T_MAX);
				setState(2508);
				match(T_OPEN_P);
				setState(2510);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(2509);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2512);
				expr(0);
				setState(2513);
				match(T_CLOSE_P);
				setState(2515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
				case 1:
					{
					setState(2514);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2517);
				match(T_MIN);
				setState(2518);
				match(T_OPEN_P);
				setState(2520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(2519);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2522);
				expr(0);
				setState(2523);
				match(T_CLOSE_P);
				setState(2525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
				case 1:
					{
					setState(2524);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2527);
				match(T_RANK);
				setState(2528);
				match(T_OPEN_P);
				setState(2529);
				match(T_CLOSE_P);
				setState(2530);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2531);
				match(T_ROW_NUMBER);
				setState(2532);
				match(T_OPEN_P);
				setState(2533);
				match(T_CLOSE_P);
				setState(2534);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2535);
				match(T_STDEV);
				setState(2536);
				match(T_OPEN_P);
				setState(2538);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
				case 1:
					{
					setState(2537);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2540);
				expr(0);
				setState(2541);
				match(T_CLOSE_P);
				setState(2543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2542);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2545);
				match(T_SUM);
				setState(2546);
				match(T_OPEN_P);
				setState(2548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
				case 1:
					{
					setState(2547);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2550);
				expr(0);
				setState(2551);
				match(T_CLOSE_P);
				setState(2553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(2552);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(2555);
				match(T_VAR);
				setState(2556);
				match(T_OPEN_P);
				setState(2558);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2557);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2560);
				expr(0);
				setState(2561);
				match(T_CLOSE_P);
				setState(2563);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
				case 1:
					{
					setState(2562);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(2565);
				match(T_VARIANCE);
				setState(2566);
				match(T_OPEN_P);
				setState(2568);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
				case 1:
					{
					setState(2567);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2570);
				expr(0);
				setState(2571);
				match(T_CLOSE_P);
				setState(2573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
				case 1:
					{
					setState(2572);
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
		enterRule(_localctx, 328, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2577);
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
		enterRule(_localctx, 330, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2579);
			match(T_OVER);
			setState(2580);
			match(T_OPEN_P);
			setState(2582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2581);
				expr_func_partition_by_clause();
				}
			}

			setState(2585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2584);
				order_by_clause();
				}
			}

			setState(2587);
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
		enterRule(_localctx, 332, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2589);
			match(T_PARTITION);
			setState(2590);
			match(T_BY);
			setState(2591);
			expr(0);
			setState(2596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2592);
				match(T_COMMA);
				setState(2593);
				expr(0);
				}
				}
				setState(2598);
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
		enterRule(_localctx, 334, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2599);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2600);
				match(T_CAST);
				setState(2601);
				match(T_OPEN_P);
				setState(2602);
				expr(0);
				setState(2603);
				match(T_AS);
				setState(2604);
				dtype();
				setState(2606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2605);
					dtype_len();
					}
				}

				setState(2608);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2610);
				match(T_COUNT);
				setState(2611);
				match(T_OPEN_P);
				setState(2614);
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
					setState(2612);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(2613);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2616);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2617);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2618);
				match(T_CURRENT);
				setState(2619);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2623);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(2620);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(2621);
					match(T_CURRENT);
					setState(2622);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
				case 1:
					{
					setState(2625);
					match(T_OPEN_P);
					setState(2626);
					expr(0);
					setState(2627);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2631);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2632);
				match(T_CURRENT);
				setState(2633);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2634);
				match(T_MAX_PART_STRING);
				setState(2635);
				match(T_OPEN_P);
				setState(2636);
				expr(0);
				setState(2649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2637);
					match(T_COMMA);
					setState(2638);
					expr(0);
					setState(2646);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2639);
						match(T_COMMA);
						setState(2640);
						expr(0);
						setState(2641);
						match(T_EQUAL);
						setState(2642);
						expr(0);
						}
						}
						setState(2648);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2651);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2653);
				match(T_MIN_PART_STRING);
				setState(2654);
				match(T_OPEN_P);
				setState(2655);
				expr(0);
				setState(2668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2656);
					match(T_COMMA);
					setState(2657);
					expr(0);
					setState(2665);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2658);
						match(T_COMMA);
						setState(2659);
						expr(0);
						setState(2660);
						match(T_EQUAL);
						setState(2661);
						expr(0);
						}
						}
						setState(2667);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2670);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2672);
				match(T_MAX_PART_INT);
				setState(2673);
				match(T_OPEN_P);
				setState(2674);
				expr(0);
				setState(2687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2675);
					match(T_COMMA);
					setState(2676);
					expr(0);
					setState(2684);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2677);
						match(T_COMMA);
						setState(2678);
						expr(0);
						setState(2679);
						match(T_EQUAL);
						setState(2680);
						expr(0);
						}
						}
						setState(2686);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2689);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2691);
				match(T_MIN_PART_INT);
				setState(2692);
				match(T_OPEN_P);
				setState(2693);
				expr(0);
				setState(2706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2694);
					match(T_COMMA);
					setState(2695);
					expr(0);
					setState(2703);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2696);
						match(T_COMMA);
						setState(2697);
						expr(0);
						setState(2698);
						match(T_EQUAL);
						setState(2699);
						expr(0);
						}
						}
						setState(2705);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2708);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2710);
				match(T_MAX_PART_DATE);
				setState(2711);
				match(T_OPEN_P);
				setState(2712);
				expr(0);
				setState(2725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2713);
					match(T_COMMA);
					setState(2714);
					expr(0);
					setState(2722);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2715);
						match(T_COMMA);
						setState(2716);
						expr(0);
						setState(2717);
						match(T_EQUAL);
						setState(2718);
						expr(0);
						}
						}
						setState(2724);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2727);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2729);
				match(T_MIN_PART_DATE);
				setState(2730);
				match(T_OPEN_P);
				setState(2731);
				expr(0);
				setState(2744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2732);
					match(T_COMMA);
					setState(2733);
					expr(0);
					setState(2741);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2734);
						match(T_COMMA);
						setState(2735);
						expr(0);
						setState(2736);
						match(T_EQUAL);
						setState(2737);
						expr(0);
						}
						}
						setState(2743);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2746);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2748);
				match(T_PART_COUNT);
				setState(2749);
				match(T_OPEN_P);
				setState(2750);
				expr(0);
				setState(2758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2751);
					match(T_COMMA);
					setState(2752);
					expr(0);
					setState(2753);
					match(T_EQUAL);
					setState(2754);
					expr(0);
					}
					}
					setState(2760);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2761);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2763);
				match(T_PART_LOC);
				setState(2764);
				match(T_OPEN_P);
				setState(2765);
				expr(0);
				setState(2771); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2766);
						match(T_COMMA);
						setState(2767);
						expr(0);
						setState(2768);
						match(T_EQUAL);
						setState(2769);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2773); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2775);
					match(T_COMMA);
					setState(2776);
					expr(0);
					}
				}

				setState(2779);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2781);
				match(T_TRIM);
				setState(2782);
				match(T_OPEN_P);
				setState(2783);
				expr(0);
				setState(2784);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2786);
				match(T_SUBSTRING);
				setState(2787);
				match(T_OPEN_P);
				setState(2788);
				expr(0);
				setState(2789);
				match(T_FROM);
				setState(2790);
				expr(0);
				setState(2793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(2791);
					match(T_FOR);
					setState(2792);
					expr(0);
					}
				}

				setState(2795);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2797);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2798);
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
		enterRule(_localctx, 336, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2801);
			ident();
			setState(2802);
			match(T_OPEN_P);
			setState(2804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				{
				setState(2803);
				expr_func_params();
				}
				break;
			}
			setState(2806);
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
		enterRule(_localctx, 338, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2808);
			func_param();
			setState(2813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,359,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2809);
					match(T_COMMA);
					setState(2810);
					func_param();
					}
					} 
				}
				setState(2815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,359,_ctx);
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
		enterRule(_localctx, 340, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2816);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(2822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
			case 1:
				{
				setState(2817);
				ident();
				setState(2818);
				match(T_EQUAL);
				setState(2820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(2819);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(2824);
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
		enterRule(_localctx, 342, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2826);
			match(T_DATE);
			setState(2827);
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
		enterRule(_localctx, 344, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2829);
			match(T_TIMESTAMP);
			setState(2830);
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
		enterRule(_localctx, 346, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(2832);
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
				setState(2833);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2843);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,364,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2836);
					match(T__3);
					setState(2839);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(2837);
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
						setState(2838);
						non_reserved_words();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(2845);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,364,_ctx);
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
		enterRule(_localctx, 348, RULE_string);
		try {
			setState(2848);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2846);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2847);
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
		enterRule(_localctx, 350, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2850);
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

			setState(2853);
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
		enterRule(_localctx, 352, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2855);
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

			setState(2858);
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
		enterRule(_localctx, 354, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2860);
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
		enterRule(_localctx, 356, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2862);
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
		enterRule(_localctx, 358, RULE_missing_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2864);
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
		enterRule(_localctx, 360, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2866);
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
		case 11:
			return parameters_sempred((ParametersContext)_localctx, predIndex);
		case 16:
			return assignment_cpp_sempred((Assignment_cppContext)_localctx, predIndex);
		case 18:
			return declare_cpp_sempred((Declare_cppContext)_localctx, predIndex);
		case 23:
			return inc_cpp_sempred((Inc_cppContext)_localctx, predIndex);
		case 27:
			return expr_stmt_sempred((Expr_stmtContext)_localctx, predIndex);
		case 88:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 125:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 136:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 145:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 153:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 170:
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
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declare_cpp_sempred(Declare_cppContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inc_cpp_sempred(Inc_cppContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_stmt_sempred(Expr_stmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return !_input.LT(1).getText().equalsIgnoreCase("GO");
		}
		return true;
	}
	private boolean create_routine_params_sempred(Create_routine_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return !_input.LT(1).getText().equalsIgnoreCase("IS") &&
		        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean select_list_alias_sempred(Select_list_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM");
		}
		return true;
	}
	private boolean from_alias_clause_sempred(From_alias_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
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
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 13);
		case 14:
			return precpred(_ctx, 12);
		case 15:
			return precpred(_ctx, 11);
		case 16:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean func_param_sempred(Func_paramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u016d\u0b37\4\2\t"+
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
		"\3\2\3\2\3\2\3\3\3\3\3\3\5\3\u0173\n\3\3\3\5\3\u0176\n\3\6\3\u0178\n\3"+
		"\r\3\16\3\u0179\3\4\5\4\u017d\n\4\3\4\3\4\3\4\5\4\u0182\n\4\3\4\3\4\3"+
		"\5\3\5\3\5\5\5\u0189\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0190\n\5\3\6\3\6\3\6"+
		"\3\7\3\7\6\7\u0197\n\7\r\7\16\7\u0198\3\7\5\7\u019c\n\7\5\7\u019e\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01ba\n\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u01c7\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\7\f\u01d4\n\f\f\f\16\f\u01d7\13\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01e4\n\r\f\r\16\r\u01e7\13\r\3\16\3\16"+
		"\3\17\3\17\3\20\7\20\u01ee\n\20\f\20\16\20\u01f1\13\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u01ff\n\22\r\22\16"+
		"\22\u0200\5\22\u0203\n\22\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u020b\n\22"+
		"\r\22\16\22\u020c\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0215\n\22\f\22\16"+
		"\22\u0218\13\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\6\24\u0226\n\24\r\24\16\24\u0227\3\24\5\24\u022b\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0232\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\6\24\u023d\n\24\r\24\16\24\u023e\3\24\5\24\u0242\n\24\7\24\u0244"+
		"\n\24\f\24\16\24\u0247\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7"+
		"\25\u0251\n\25\f\25\16\25\u0254\13\25\3\25\5\25\u0257\n\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\5\30\u026a\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0281\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0288\n\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u028f\n\31\5\31\u0291\n\31\3\31\3\31\3\31\7\31\u0296\n\31\f\31\16\31"+
		"\u0299\13\31\3\32\3\32\6\32\u029d\n\32\r\32\16\32\u029e\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u02af\n\36"+
		"\3\36\3\36\3\36\7\36\u02b4\n\36\f\36\16\36\u02b7\13\36\5\36\u02b9\n\36"+
		"\3\37\3\37\3\37\5\37\u02be\n\37\3 \3 \5 \u02c2\n \3 \3 \3 \3 \3 \3 \3"+
		" \5 \u02cb\n \3 \3 \3 \5 \u02d0\n \3!\3!\3!\3!\7!\u02d6\n!\f!\16!\u02d9"+
		"\13!\3!\3!\5!\u02dd\n!\3!\3!\3!\3!\3!\7!\u02e4\n!\f!\16!\u02e7\13!\3!"+
		"\3!\3\"\3\"\3\"\3\"\3\"\7\"\u02f0\n\"\f\"\16\"\u02f3\13\"\3\"\3\"\5\""+
		"\u02f7\n\"\3\"\5\"\u02fa\n\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u0304\n#"+
		"\3$\5$\u0307\n$\3$\3$\5$\u030b\n$\3$\5$\u030e\n$\3$\3$\3%\3%\3%\3%\5%"+
		"\u0316\n%\3%\5%\u0319\n%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)"+
		"\3)\5)\u032a\n)\3)\3)\5)\u032e\n)\3*\3*\3*\3*\7*\u0334\n*\f*\16*\u0337"+
		"\13*\3+\3+\3+\3+\3+\3+\7+\u033f\n+\f+\16+\u0342\13+\3,\3,\3,\3,\3,\7,"+
		"\u0349\n,\f,\16,\u034c\13,\3-\3-\3-\3-\3-\5-\u0353\n-\3.\3.\3.\7.\u0358"+
		"\n.\f.\16.\u035b\13.\3.\5.\u035e\n.\3.\3.\5.\u0362\n.\3.\7.\u0365\n.\f"+
		".\16.\u0368\13.\3.\5.\u036b\n.\3.\3.\3.\5.\u0370\n.\3.\3.\5.\u0374\n."+
		"\3.\3.\5.\u0378\n.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\5\60\u0382\n\60\3"+
		"\60\3\60\5\60\u0386\n\60\3\60\3\60\3\60\5\60\u038b\n\60\3\61\3\61\3\61"+
		"\5\61\u0390\n\61\3\61\3\61\5\61\u0394\n\61\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\5\63\u03a1\n\63\3\63\3\63\3\64\5\64\u03a6"+
		"\n\64\3\64\3\64\3\64\3\64\5\64\u03ac\n\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u03b5\n\65\3\65\3\65\5\65\u03b9\n\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\5\66\u03c1\n\66\3\66\5\66\u03c4\n\66\3\66\3\66\3\66\5\66\u03c9"+
		"\n\66\3\66\3\66\3\67\5\67\u03ce\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u03d5"+
		"\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u03dc\n\67\3\67\5\67\u03df\n\67\3"+
		"8\38\38\78\u03e4\n8\f8\168\u03e7\138\39\39\39\59\u03ec\n9\39\79\u03ef"+
		"\n9\f9\169\u03f2\139\39\79\u03f5\n9\f9\169\u03f8\139\39\39\59\u03fc\n"+
		"9\39\59\u03ff\n9\3:\3:\3;\3;\5;\u0405\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\7;\u0411\n;\f;\16;\u0414\13;\3;\3;\3;\3;\3;\7;\u041b\n;\f;\16;\u041e"+
		"\13;\3;\3;\3;\5;\u0423\n;\3<\3<\3<\5<\u0428\n<\3<\3<\3<\5<\u042d\n<\3"+
		"<\3<\3<\5<\u0432\n<\7<\u0434\n<\f<\16<\u0437\13<\3<\3<\5<\u043b\n<\3<"+
		"\5<\u043e\n<\3<\3<\3<\3<\3<\3<\7<\u0446\n<\f<\16<\u0449\13<\3<\3<\3<\3"+
		"<\3<\3<\3<\7<\u0452\n<\f<\16<\u0455\13<\3<\3<\7<\u0459\n<\f<\16<\u045c"+
		"\13<\5<\u045e\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u046a\n=\3>\6>\u046d"+
		"\n>\r>\16>\u046e\3?\3?\3?\5?\u0474\n?\3@\5@\u0477\n@\3@\3@\3A\6A\u047c"+
		"\nA\rA\16A\u047d\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u048a\nB\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\6C\u0497\nC\rC\16C\u0498\3C\3C\3C\5C\u049e\nC\3"+
		"D\5D\u04a1\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\7D\u04ae\nD\fD\16D\u04b1"+
		"\13D\3D\3D\3D\5D\u04b6\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u04c1\nD\3E\5"+
		"E\u04c4\nE\3E\3E\3E\3E\3E\3E\7E\u04cc\nE\fE\16E\u04cf\13E\3E\3E\3E\3E"+
		"\5E\u04d5\nE\3F\3F\3F\3F\5F\u04db\nF\3G\3G\3G\3G\7G\u04e1\nG\fG\16G\u04e4"+
		"\13G\3H\3H\3H\3H\3H\3H\3H\5H\u04ed\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\5H\u0501\nH\3I\3I\3I\3I\5I\u0507\nI\3J\3J\5J\u050b"+
		"\nJ\3J\3J\3J\5J\u0510\nJ\3J\3J\5J\u0514\nJ\3J\3J\3J\5J\u0519\nJ\3J\5J"+
		"\u051c\nJ\3J\3J\3J\5J\u0521\nJ\3J\5J\u0524\nJ\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\5K\u0532\nK\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u0551\nK\5K\u0553\nK\3L"+
		"\3L\3L\5L\u0558\nL\3L\3L\5L\u055c\nL\3L\3L\3M\5M\u0561\nM\3M\3M\3M\3M"+
		"\3M\5M\u0568\nM\3M\5M\u056b\nM\3N\5N\u056e\nN\3N\3N\3N\5N\u0573\nN\3N"+
		"\3N\5N\u0577\nN\5N\u0579\nN\3O\3O\3O\3O\3O\5O\u0580\nO\3O\3O\7O\u0584"+
		"\nO\fO\16O\u0587\13O\3P\3P\3P\3P\5P\u058d\nP\3Q\3Q\3Q\3Q\5Q\u0593\nQ\3"+
		"Q\5Q\u0596\nQ\3Q\3Q\3Q\5Q\u059b\nQ\3Q\3Q\5Q\u059f\nQ\3Q\5Q\u05a2\nQ\3"+
		"Q\3Q\3R\3R\3R\5R\u05a9\nR\3S\3S\3S\3S\5S\u05af\nS\3S\5S\u05b2\nS\3S\3"+
		"S\3S\3S\3S\3S\3S\3S\5S\u05bc\nS\3S\3S\3S\3S\5S\u05c2\nS\3S\5S\u05c5\n"+
		"S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u05cf\nS\5S\u05d1\nS\3T\3T\3T\3T\3T\7T\u05d8"+
		"\nT\fT\16T\u05db\13T\3U\3U\3U\3U\5U\u05e1\nU\3U\3U\3U\3U\3U\5U\u05e8\n"+
		"U\5U\u05ea\nU\3V\3V\3V\3V\5V\u05f0\nV\3V\5V\u05f3\nV\3V\3V\3V\3V\3V\3"+
		"V\3V\3V\3V\5V\u05fe\nV\3W\3W\3W\3W\3W\7W\u0605\nW\fW\16W\u0608\13W\3X"+
		"\3X\3X\5X\u060d\nX\3Y\3Y\3Y\3Y\5Y\u0613\nY\3Y\5Y\u0616\nY\3Y\3Y\3Y\5Y"+
		"\u061b\nY\3Y\5Y\u061e\nY\3Y\5Y\u0621\nY\3Y\5Y\u0624\nY\3Y\5Y\u0627\nY"+
		"\3Y\3Y\3Y\3Y\5Y\u062d\nY\3Y\3Y\3Y\3Y\5Y\u0633\nY\3Y\5Y\u0636\nY\3Y\3Y"+
		"\3Y\5Y\u063b\nY\3Y\5Y\u063e\nY\3Y\5Y\u0641\nY\3Y\5Y\u0644\nY\3Y\5Y\u0647"+
		"\nY\3Y\3Y\3Y\3Y\5Y\u064d\nY\5Y\u064f\nY\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u0657\nZ"+
		"\fZ\16Z\u065a\13Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u0662\nZ\fZ\16Z\u0665\13Z\5Z\u0667"+
		"\nZ\3[\3[\3[\3[\3[\5[\u066e\n[\3[\3[\3[\5[\u0673\n[\3[\7[\u0676\n[\f["+
		"\16[\u0679\13[\3[\5[\u067c\n[\3[\3[\3[\3[\3[\3[\5[\u0684\n[\3[\3[\5[\u0688"+
		"\n[\3[\7[\u068b\n[\f[\16[\u068e\13[\3[\5[\u0691\n[\5[\u0693\n[\3\\\6\\"+
		"\u0696\n\\\r\\\16\\\u0697\3]\3]\3]\3]\3]\3]\5]\u06a0\n]\3]\3]\3]\5]\u06a5"+
		"\n]\3^\3^\3^\3^\5^\u06ab\n^\3_\3_\3_\3_\3_\7_\u06b2\n_\f_\16_\u06b5\13"+
		"_\3_\5_\u06b8\n_\3_\3_\3_\3`\3`\3`\3`\3`\5`\u06c2\n`\3a\3a\3a\3a\3a\3"+
		"a\3b\3b\3b\3b\3b\3c\3c\3c\3d\3d\5d\u06d4\nd\3d\3d\5d\u06d8\nd\3e\3e\3"+
		"e\3e\3e\5e\u06df\ne\5e\u06e1\ne\3f\3f\3f\3g\3g\3g\3g\3g\3g\3h\3h\5h\u06ee"+
		"\nh\3h\3h\3h\3h\5h\u06f4\nh\3h\3h\5h\u06f8\nh\3i\3i\5i\u06fc\ni\3i\3i"+
		"\3i\3i\3i\3i\3i\3i\7i\u0706\ni\fi\16i\u0709\13i\3i\3i\3j\3j\5j\u070f\n"+
		"j\3k\3k\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\7l\u071d\nl\fl\16l\u0720\13l\3l"+
		"\3l\7l\u0724\nl\fl\16l\u0727\13l\3m\3m\5m\u072b\nm\3n\3n\5n\u072f\nn\3"+
		"n\3n\3n\7n\u0734\nn\fn\16n\u0737\13n\3n\5n\u073a\nn\3n\3n\5n\u073e\nn"+
		"\3n\3n\3n\7n\u0743\nn\fn\16n\u0746\13n\3n\5n\u0749\nn\3o\3o\3o\3o\5o\u074f"+
		"\no\3o\3o\5o\u0753\no\3o\3o\3o\3o\3o\3p\3p\3p\3p\5p\u075e\np\3p\3p\3p"+
		"\3p\3p\5p\u0765\np\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\5q\u0772\nq\3r\5r"+
		"\u0775\nr\3r\3r\3s\3s\3s\3s\7s\u077d\ns\fs\16s\u0780\13s\3t\3t\5t\u0784"+
		"\nt\3t\3t\3t\3t\3t\3u\3u\3u\3u\7u\u078f\nu\fu\16u\u0792\13u\3u\3u\3v\3"+
		"v\3v\3v\7v\u079a\nv\fv\16v\u079d\13v\3w\3w\3w\3w\3w\5w\u07a4\nw\3x\3x"+
		"\5x\u07a8\nx\3x\3x\5x\u07ac\nx\3x\3x\5x\u07b0\nx\5x\u07b2\nx\3y\3y\3y"+
		"\5y\u07b7\ny\3y\5y\u07ba\ny\3y\5y\u07bd\ny\3y\5y\u07c0\ny\3y\3y\5y\u07c4"+
		"\ny\3y\5y\u07c7\ny\3y\5y\u07ca\ny\3z\5z\u07cd\nz\3z\5z\u07d0\nz\3z\3z"+
		"\3z\7z\u07d5\nz\fz\16z\u07d8\13z\3{\3{\3|\3|\3}\3}\3}\3~\3~\3~\5~\u07e4"+
		"\n~\3~\3~\5~\u07e8\n~\3~\5~\u07eb\n~\3\177\3\177\5\177\u07ef\n\177\3\177"+
		"\3\177\3\177\3\177\3\177\5\177\u07f6\n\177\3\u0080\3\u0080\5\u0080\u07fa"+
		"\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u0802"+
		"\n\u0081\f\u0081\16\u0081\u0805\13\u0081\3\u0082\3\u0082\3\u0082\7\u0082"+
		"\u080a\n\u0082\f\u0082\16\u0082\u080d\13\u0082\3\u0083\3\u0083\3\u0083"+
		"\5\u0083\u0812\n\u0083\3\u0084\3\u0084\5\u0084\u0816\n\u0084\3\u0085\3"+
		"\u0085\3\u0085\3\u0085\5\u0085\u081c\n\u0085\3\u0086\3\u0086\3\u0086\3"+
		"\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0825\n\u0086\3\u0087\5\u0087\u0828"+
		"\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u082d\n\u0087\3\u0087\5\u0087"+
		"\u0830\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\7\u0088"+
		"\u0838\n\u0088\f\u0088\16\u0088\u083b\13\u0088\3\u0088\3\u0088\5\u0088"+
		"\u083f\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\7\u0089\u0846\n"+
		"\u0089\f\u0089\16\u0089\u0849\13\u0089\3\u0089\3\u0089\5\u0089\u084d\n"+
		"\u0089\3\u008a\3\u008a\5\u008a\u0851\n\u008a\3\u008a\3\u008a\3\u008a\3"+
		"\u008a\3\u008a\7\u008a\u0858\n\u008a\f\u008a\16\u008a\u085b\13\u008a\3"+
		"\u008a\5\u008a\u085e\n\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u086a\n\u008d\f\u008d\16"+
		"\u008d\u086d\13\u008d\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0879\n\u0090\3\u0090\3\u0090"+
		"\3\u0090\5\u0090\u087e\n\u0090\7\u0090\u0880\n\u0090\f\u0090\16\u0090"+
		"\u0883\13\u0090\3\u0091\6\u0091\u0886\n\u0091\r\u0091\16\u0091\u0887\3"+
		"\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\5\u0092\u0893\n\u0092\5\u0092\u0895\n\u0092\3\u0093\3\u0093\5\u0093\u0899"+
		"\n\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u08a0\n\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\7\u0093\u08a6\n\u0093\f\u0093\16\u0093"+
		"\u08a9\13\u0093\3\u0094\3\u0094\3\u0094\5\u0094\u08ae\n\u0094\3\u0095"+
		"\3\u0095\3\u0095\5\u0095\u08b3\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u08c2\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\5\u0095\u08cb\n\u0095\3\u0096\3\u0096\5\u0096\u08cf\n\u0096\3"+
		"\u0096\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u08d6\n\u0096\f\u0096\16"+
		"\u0096\u08d9\13\u0096\3\u0096\5\u0096\u08dc\n\u0096\3\u0096\3\u0096\3"+
		"\u0097\3\u0097\3\u0097\3\u0097\7\u0097\u08e4\n\u0097\f\u0097\16\u0097"+
		"\u08e7\13\u0097\3\u0097\3\u0097\5\u0097\u08eb\n\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\5\u009a\u0901\n\u009a\3\u009a\5\u009a\u0904\n\u009a\3\u009b\3\u009b\3"+
		"\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u0917\n\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\7\u009b\u0927\n\u009b\f\u009b"+
		"\16\u009b\u092a\13\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\5\u009c\u0934\n\u009c\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\7\u009f\u0941"+
		"\n\u009f\f\u009f\16\u009f\u0944\13\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u094f\n\u00a0\3\u00a1"+
		"\3\u00a1\5\u00a1\u0953\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\6\u00a2\u095c\n\u00a2\r\u00a2\16\u00a2\u095d\3\u00a2"+
		"\3\u00a2\5\u00a2\u0962\n\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\6\u00a3\u096c\n\u00a3\r\u00a3\16\u00a3\u096d"+
		"\3\u00a3\3\u00a3\5\u00a3\u0972\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u097d\n\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\5\u00a5\u0982\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5"+
		"\u0987\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u098b\n\u00a5\3\u00a5\3\u00a5\5"+
		"\u00a5\u098f\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0994\n\u00a5\3\u00a5"+
		"\3\u00a5\5\u00a5\u0998\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u099c\n\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u09b3\n\u00a5\5\u00a5\u09b5\n\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u09c7"+
		"\n\u00a5\5\u00a5\u09c9\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\5\u00a5\u09d1\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u09d6\n"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u09db\n\u00a5\3\u00a5\3\u00a5\3"+
		"\u00a5\5\u00a5\u09e0\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u09ed\n\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\5\u00a5\u09f2\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5"+
		"\u00a5\u09f7\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u09fc\n\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\5\u00a5\u0a01\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5"+
		"\u0a06\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0a0b\n\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\5\u00a5\u0a10\n\u00a5\5\u00a5\u0a12\n\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0a19\n\u00a7\3\u00a7\5\u00a7\u0a1c\n"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\7\u00a8"+
		"\u0a25\n\u00a8\f\u00a8\16\u00a8\u0a28\13\u00a8\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0a31\n\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0a39\n\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0a42\n\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0a48\n\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\7\u00a9\u0a57\n\u00a9\f\u00a9\16\u00a9\u0a5a\13\u00a9\5\u00a9"+
		"\u0a5c\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u0a6a\n\u00a9\f\u00a9"+
		"\16\u00a9\u0a6d\13\u00a9\5\u00a9\u0a6f\n\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\7\u00a9\u0a7d\n\u00a9\f\u00a9\16\u00a9\u0a80\13\u00a9\5\u00a9\u0a82\n"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u0a90\n\u00a9\f\u00a9\16\u00a9"+
		"\u0a93\13\u00a9\5\u00a9\u0a95\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9"+
		"\u0aa3\n\u00a9\f\u00a9\16\u00a9\u0aa6\13\u00a9\5\u00a9\u0aa8\n\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u0ab6\n\u00a9\f\u00a9\16\u00a9\u0ab9"+
		"\13\u00a9\5\u00a9\u0abb\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u0ac7\n\u00a9\f\u00a9"+
		"\16\u00a9\u0aca\13\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\6\u00a9\u0ad6\n\u00a9\r\u00a9\16\u00a9"+
		"\u0ad7\3\u00a9\3\u00a9\5\u00a9\u0adc\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\5\u00a9\u0aec\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u0af2\n\u00a9\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0af7\n\u00aa\3"+
		"\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\7\u00ab\u0afe\n\u00ab\f\u00ab\16"+
		"\u00ab\u0b01\13\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0b07\n"+
		"\u00ac\5\u00ac\u0b09\n\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3"+
		"\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\5\u00af\u0b15\n\u00af\3\u00af\3"+
		"\u00af\3\u00af\5\u00af\u0b1a\n\u00af\7\u00af\u0b1c\n\u00af\f\u00af\16"+
		"\u00af\u0b1f\13\u00af\3\u00b0\3\u00b0\5\u00b0\u0b23\n\u00b0\3\u00b1\5"+
		"\u00b1\u0b26\n\u00b1\3\u00b1\3\u00b1\3\u00b2\5\u00b2\u0b2b\n\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6"+
		"\3\u00b6\2\b\30\"&\60\u0124\u0134\u00b7\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\2,\5\2\3\4\u0150"+
		"\u0150\u0161\u0161\4\2__\u012c\u012c\4\2\u00f8\u00f8\u011b\u011b\6\2\r"+
		"\16\u00b4\u00b4\u00d7\u00d7\u0131\u0131\3\2\u00be\u00bf\5\2\17\17mm\u0092"+
		"\u0092\4\2!!))\4\2\66\66ff\4\2\u00af\u00af\u00f7\u00f7\4\2\20\20RR\4\2"+
		"OO\u0121\u0121\4\2gg\u00a2\u00a2\4\2OO\u00cf\u00cf\4\2KK\u0082\u0082\5"+
		"\2\u0086\u0086\u00a9\u00a9\u00cb\u00cc\4\2\u00a4\u00a4\u00b6\u00b6\4\2"+
		"\u00b3\u00b3\u0133\u0133\4\2\u00ea\u00ea\u011e\u011e\4\2\u00a8\u00a8\u0167"+
		"\u0167\4\2\37\37&&\4\2$$==\4\2AA\u00f0\u00f0\4\2\17\17\u0092\u0092\3\2"+
		"\u00e1\u00e2\3\2\u00d2\u00d3\6\2<<MM\u0091\u0091\u00c8\u00c8\3\2\\]\4"+
		"\2\u00eb\u00eb\u010d\u010d\4\2\36\36\u0107\u0107\3\2\u00f5\u00f6\4\2\n"+
		"\nVV\5\2rr\u009b\u009b\u00e4\u00e4\5\2==\u00ec\u00ed\u0122\u0122\5\2d"+
		"d\u00fb\u00fb\u0121\u0121\4\2\f\f\u00c2\u00c2\5\2\u009c\u009c\u00db\u00db"+
		"\u00e5\u00e5\5\2EF\u00ac\u00ad\u00f1\u00f2\4\2\63\63\u014f\u014f\5\2p"+
		"p\u0093\u0093\u00b9\u00b9\4\2\u014c\u014c\u0162\u0162\4\2hh\u011c\u011c"+
		"\16\2\b\31\33Z^^`\u00b9\u00bb\u00cc\u00ce\u00e9\u00eb\u00fe\u0100\u0116"+
		"\u0118\u011d\u0120\u012b\u012e\u013d\u0144\u014b\2\u0cba\2\u016c\3\2\2"+
		"\2\4\u0177\3\2\2\2\6\u017c\3\2\2\2\b\u018f\3\2\2\2\n\u0191\3\2\2\2\f\u019d"+
		"\3\2\2\2\16\u01b9\3\2\2\2\20\u01bb\3\2\2\2\22\u01c6\3\2\2\2\24\u01c8\3"+
		"\2\2\2\26\u01d1\3\2\2\2\30\u01da\3\2\2\2\32\u01e8\3\2\2\2\34\u01ea\3\2"+
		"\2\2\36\u01ef\3\2\2\2 \u01f2\3\2\2\2\"\u0202\3\2\2\2$\u0219\3\2\2\2&\u0231"+
		"\3\2\2\2(\u0248\3\2\2\2*\u0258\3\2\2\2,\u0260\3\2\2\2.\u0265\3\2\2\2\60"+
		"\u0290\3\2\2\2\62\u029a\3\2\2\2\64\u02a0\3\2\2\2\66\u02a6\3\2\2\28\u02a8"+
		"\3\2\2\2:\u02b8\3\2\2\2<\u02bd\3\2\2\2>\u02cf\3\2\2\2@\u02d1\3\2\2\2B"+
		"\u02f6\3\2\2\2D\u0303\3\2\2\2F\u030a\3\2\2\2H\u0311\3\2\2\2J\u031d\3\2"+
		"\2\2L\u0320\3\2\2\2N\u0323\3\2\2\2P\u0325\3\2\2\2R\u032f\3\2\2\2T\u0338"+
		"\3\2\2\2V\u0343\3\2\2\2X\u0352\3\2\2\2Z\u0377\3\2\2\2\\\u0379\3\2\2\2"+
		"^\u0381\3\2\2\2`\u038c\3\2\2\2b\u0395\3\2\2\2d\u0398\3\2\2\2f\u03a5\3"+
		"\2\2\2h\u03af\3\2\2\2j\u03bc\3\2\2\2l\u03db\3\2\2\2n\u03e0\3\2\2\2p\u03fe"+
		"\3\2\2\2r\u0400\3\2\2\2t\u0422\3\2\2\2v\u045d\3\2\2\2x\u045f\3\2\2\2z"+
		"\u046c\3\2\2\2|\u0473\3\2\2\2~\u0476\3\2\2\2\u0080\u047b\3\2\2\2\u0082"+
		"\u0489\3\2\2\2\u0084\u049d\3\2\2\2\u0086\u04c0\3\2\2\2\u0088\u04d4\3\2"+
		"\2\2\u008a\u04da\3\2\2\2\u008c\u04dc\3\2\2\2\u008e\u0500\3\2\2\2\u0090"+
		"\u0506\3\2\2\2\u0092\u0523\3\2\2\2\u0094\u0552\3\2\2\2\u0096\u0554\3\2"+
		"\2\2\u0098\u056a\3\2\2\2\u009a\u0578\3\2\2\2\u009c\u057a\3\2\2\2\u009e"+
		"\u058c\3\2\2\2\u00a0\u0595\3\2\2\2\u00a2\u05a5\3\2\2\2\u00a4\u05d0\3\2"+
		"\2\2\u00a6\u05d2\3\2\2\2\u00a8\u05e9\3\2\2\2\u00aa\u05f2\3\2\2\2\u00ac"+
		"\u05ff\3\2\2\2\u00ae\u060c\3\2\2\2\u00b0\u064e\3\2\2\2\u00b2\u0666\3\2"+
		"\2\2\u00b4\u0692\3\2\2\2\u00b6\u0695\3\2\2\2\u00b8\u06a4\3\2\2\2\u00ba"+
		"\u06aa\3\2\2\2\u00bc\u06ac\3\2\2\2\u00be\u06bc\3\2\2\2\u00c0\u06c3\3\2"+
		"\2\2\u00c2\u06c9\3\2\2\2\u00c4\u06ce\3\2\2\2\u00c6\u06d1\3\2\2\2\u00c8"+
		"\u06d9\3\2\2\2\u00ca\u06e2\3\2\2\2\u00cc\u06e5\3\2\2\2\u00ce\u06f3\3\2"+
		"\2\2\u00d0\u06f9\3\2\2\2\u00d2\u070c\3\2\2\2\u00d4\u0710\3\2\2\2\u00d6"+
		"\u0712\3\2\2\2\u00d8\u0728\3\2\2\2\u00da\u072c\3\2\2\2\u00dc\u074a\3\2"+
		"\2\2\u00de\u0759\3\2\2\2\u00e0\u0771\3\2\2\2\u00e2\u0774\3\2\2\2\u00e4"+
		"\u0778\3\2\2\2\u00e6\u0781\3\2\2\2\u00e8\u078a\3\2\2\2\u00ea\u0795\3\2"+
		"\2\2\u00ec\u07a3\3\2\2\2\u00ee\u07b1\3\2\2\2\u00f0\u07b3\3\2\2\2\u00f2"+
		"\u07cc\3\2\2\2\u00f4\u07d9\3\2\2\2\u00f6\u07db\3\2\2\2\u00f8\u07dd\3\2"+
		"\2\2\u00fa\u07ea\3\2\2\2\u00fc\u07f5\3\2\2\2\u00fe\u07f9\3\2\2\2\u0100"+
		"\u07fd\3\2\2\2\u0102\u0806\3\2\2\2\u0104\u0811\3\2\2\2\u0106\u0813\3\2"+
		"\2\2\u0108\u0817\3\2\2\2\u010a\u0824\3\2\2\2\u010c\u082f\3\2\2\2\u010e"+
		"\u0831\3\2\2\2\u0110\u084c\3\2\2\2\u0112\u084e\3\2\2\2\u0114\u085f\3\2"+
		"\2\2\u0116\u0861\3\2\2\2\u0118\u0864\3\2\2\2\u011a\u086e\3\2\2\2\u011c"+
		"\u0871\3\2\2\2\u011e\u0874\3\2\2\2\u0120\u0885\3\2\2\2\u0122\u0894\3\2"+
		"\2\2\u0124\u089f\3\2\2\2\u0126\u08ad\3\2\2\2\u0128\u08ca\3\2\2\2\u012a"+
		"\u08cc\3\2\2\2\u012c\u08df\3\2\2\2\u012e\u08f1\3\2\2\2\u0130\u08f5\3\2"+
		"\2\2\u0132\u0903\3\2\2\2\u0134\u0916\3\2\2\2\u0136\u0933\3\2\2\2\u0138"+
		"\u0935\3\2\2\2\u013a\u0939\3\2\2\2\u013c\u093b\3\2\2\2\u013e\u094e\3\2"+
		"\2\2\u0140\u0952\3\2\2\2\u0142\u0954\3\2\2\2\u0144\u0965\3\2\2\2\u0146"+
		"\u0975\3\2\2\2\u0148\u0a11\3\2\2\2\u014a\u0a13\3\2\2\2\u014c\u0a15\3\2"+
		"\2\2\u014e\u0a1f\3\2\2\2\u0150\u0af1\3\2\2\2\u0152\u0af3\3\2\2\2\u0154"+
		"\u0afa\3\2\2\2\u0156\u0b02\3\2\2\2\u0158\u0b0c\3\2\2\2\u015a\u0b0f\3\2"+
		"\2\2\u015c\u0b14\3\2\2\2\u015e\u0b22\3\2\2\2\u0160\u0b25\3\2\2\2\u0162"+
		"\u0b2a\3\2\2\2\u0164\u0b2e\3\2\2\2\u0166\u0b30\3\2\2\2\u0168\u0b32\3\2"+
		"\2\2\u016a\u0b34\3\2\2\2\u016c\u016d\5\4\3\2\u016d\u016e\7\2\2\3\u016e"+
		"\3\3\2\2\2\u016f\u0173\5\6\4\2\u0170\u0173\5\22\n\2\u0171\u0173\5\16\b"+
		"\2\u0172\u016f\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0175"+
		"\3\2\2\2\u0174\u0176\7v\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0178\3\2\2\2\u0177\u0172\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017a\5\3\2\2\2\u017b\u017d\5T+\2\u017c\u017b"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\7\25\2\2"+
		"\u017f\u0181\5\4\3\2\u0180\u0182\5\62\32\2\u0181\u0180\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\5\n\6\2\u0184\7\3\2\2\2\u0185"+
		"\u0186\7\25\2\2\u0186\u0188\5\4\3\2\u0187\u0189\5\62\32\2\u0188\u0187"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5\n\6\2\u018b"+
		"\u0190\3\2\2\2\u018c\u018d\5\16\b\2\u018d\u018e\7\u0161\2\2\u018e\u0190"+
		"\3\2\2\2\u018f\u0185\3\2\2\2\u018f\u018c\3\2\2\2\u0190\t\3\2\2\2\u0191"+
		"\u0192\6\6\2\2\u0192\u0193\7_\2\2\u0193\13\3\2\2\2\u0194\u019e\5\6\4\2"+
		"\u0195\u0197\5\16\b\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u019c\7v\2\2\u019b"+
		"\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u0194\3\2"+
		"\2\2\u019d\u0196\3\2\2\2\u019e\r\3\2\2\2\u019f\u01ba\5:\36\2\u01a0\u01ba"+
		"\5L\'\2\u01a1\u01ba\5N(\2\u01a2\u01ba\5P)\2\u01a3\u01ba\5\u00caf\2\u01a4"+
		"\u01ba\5\u00ccg\2\u01a5\u01ba\5\u009cO\2\u01a6\u01ba\5\u00a0Q\2\u01a7"+
		"\u01ba\5\u00d0i\2\u01a8\u01ba\5j\66\2\u01a9\u01ba\5\u00a4S\2\u01aa\u01ba"+
		"\5\u00aaV\2\u01ab\u01ba\5\u00b0Y\2\u01ac\u01ba\5h\65\2\u01ad\u01ba\5R"+
		"*\2\u01ae\u01ba\5\u00c6d\2\u01af\u01ba\5\u00dco\2\u01b0\u01ba\5\u00de"+
		"p\2\u01b1\u01ba\5\u00ba^\2\u01b2\u01ba\5\u00d8m\2\u01b3\u01ba\5\u00e2"+
		"r\2\u01b4\u01ba\5\u00c8e\2\u01b5\u01ba\5\u00dan\2\u01b6\u01ba\5\66\34"+
		"\2\u01b7\u01ba\58\35\2\u01b8\u01ba\5\20\t\2\u01b9\u019f\3\2\2\2\u01b9"+
		"\u01a0\3\2\2\2\u01b9\u01a1\3\2\2\2\u01b9\u01a2\3\2\2\2\u01b9\u01a3\3\2"+
		"\2\2\u01b9\u01a4\3\2\2\2\u01b9\u01a5\3\2\2\2\u01b9\u01a6\3\2\2\2\u01b9"+
		"\u01a7\3\2\2\2\u01b9\u01a8\3\2\2\2\u01b9\u01a9\3\2\2\2\u01b9\u01aa\3\2"+
		"\2\2\u01b9\u01ab\3\2\2\2\u01b9\u01ac\3\2\2\2\u01b9\u01ad\3\2\2\2\u01b9"+
		"\u01ae\3\2\2\2\u01b9\u01af\3\2\2\2\u01b9\u01b0\3\2\2\2\u01b9\u01b1\3\2"+
		"\2\2\u01b9\u01b2\3\2\2\2\u01b9\u01b3\3\2\2\2\u01b9\u01b4\3\2\2\2\u01b9"+
		"\u01b5\3\2\2\2\u01b9\u01b6\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01b8\3\2"+
		"\2\2\u01ba\17\3\2\2\2\u01bb\u01bc\t\2\2\2\u01bc\21\3\2\2\2\u01bd\u01c7"+
		"\5\24\13\2\u01be\u01c7\5\u00ba^\2\u01bf\u01c7\5.\30\2\u01c0\u01c7\5 \21"+
		"\2\u01c1\u01c7\5$\23\2\u01c2\u01c3\5\60\31\2\u01c3\u01c4\7\u0161\2\2\u01c4"+
		"\u01c7\3\2\2\2\u01c5\u01c7\5\16\b\2\u01c6\u01bd\3\2\2\2\u01c6\u01be\3"+
		"\2\2\2\u01c6\u01bf\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6"+
		"\u01c2\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\23\3\2\2\2\u01c8\u01c9\5\u0094"+
		"K\2\u01c9\u01ca\5\u015c\u00af\2\u01ca\u01cb\5\26\f\2\u01cb\u01cc\5\32"+
		"\16\2\u01cc\u01cd\5\36\20\2\u01cd\u01ce\5\u00d8m\2\u01ce\u01cf\7\u0161"+
		"\2\2\u01cf\u01d0\5\34\17\2\u01d0\25\3\2\2\2\u01d1\u01d5\7\u015c\2\2\u01d2"+
		"\u01d4\5\30\r\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3"+
		"\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8"+
		"\u01d9\7\u015f\2\2\u01d9\27\3\2\2\2\u01da\u01db\b\r\1\2\u01db\u01dc\5"+
		"\u0094K\2\u01dc\u01dd\5\u015c\u00af\2\u01dd\u01e5\3\2\2\2\u01de\u01df"+
		"\f\3\2\2\u01df\u01e0\7\u014e\2\2\u01e0\u01e1\5\u0094K\2\u01e1\u01e2\5"+
		"\u015c\u00af\2\u01e2\u01e4\3\2\2\2\u01e3\u01de\3\2\2\2\u01e4\u01e7\3\2"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\31\3\2\2\2\u01e7\u01e5"+
		"\3\2\2\2\u01e8\u01e9\7\u015b\2\2\u01e9\33\3\2\2\2\u01ea\u01eb\7\u015e"+
		"\2\2\u01eb\35\3\2\2\2\u01ec\u01ee\5\22\n\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1"+
		"\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\37\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01f3\5\"\22\2\u01f3\u01f4\7\u0161\2\2\u01f4!\3\2"+
		"\2\2\u01f5\u01f6\b\22\1\2\u01f6\u01f7\5\u015c\u00af\2\u01f7\u01f8\7\u0152"+
		"\2\2\u01f8\u01f9\5\u015c\u00af\2\u01f9\u0203\3\2\2\2\u01fa\u01fb\5\u015c"+
		"\u00af\2\u01fb\u01fe\7\u0152\2\2\u01fc\u01ff\5\u0160\u00b1\2\u01fd\u01ff"+
		"\5\u0162\u00b2\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0200\3"+
		"\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202"+
		"\u01f5\3\2\2\2\u0202\u01fa\3\2\2\2\u0203\u0216\3\2\2\2\u0204\u0205\f\4"+
		"\2\2\u0205\u0206\7\u014e\2\2\u0206\u0207\5\u015c\u00af\2\u0207\u020a\7"+
		"\u0152\2\2\u0208\u020b\5\u0160\u00b1\2\u0209\u020b\5\u0162\u00b2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\u0215\3\2\2\2\u020e\u020f\f\3\2\2\u020f"+
		"\u0210\7\u014e\2\2\u0210\u0211\5\u015c\u00af\2\u0211\u0212\7\u0152\2\2"+
		"\u0212\u0213\5\u015c\u00af\2\u0213\u0215\3\2\2\2\u0214\u0204\3\2\2\2\u0214"+
		"\u020e\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2"+
		"\2\2\u0217#\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\5&\24\2\u021a\u021b"+
		"\7\u0161\2\2\u021b%\3\2\2\2\u021c\u021d\b\24\1\2\u021d\u021e\5\u0094K"+
		"\2\u021e\u021f\5\u015c\u00af\2\u021f\u0232\3\2\2\2\u0220\u0221\5\u0094"+
		"K\2\u0221\u0222\5\u015c\u00af\2\u0222\u022a\7\u0152\2\2\u0223\u0226\5"+
		"\u0160\u00b1\2\u0224\u0226\5\u0162\u00b2\2\u0225\u0223\3\2\2\2\u0225\u0224"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u022b\3\2\2\2\u0229\u022b\5\u015c\u00af\2\u022a\u0225\3\2\2\2\u022a\u0229"+
		"\3\2\2\2\u022b\u0232\3\2\2\2\u022c\u022d\5\u0094K\2\u022d\u022e\5\u015c"+
		"\u00af\2\u022e\u022f\7\u0152\2\2\u022f\u0230\5\u00e2r\2\u0230\u0232\3"+
		"\2\2\2\u0231\u021c\3\2\2\2\u0231\u0220\3\2\2\2\u0231\u022c\3\2\2\2\u0232"+
		"\u0245\3\2\2\2\u0233\u0234\f\4\2\2\u0234\u0235\7\u014e\2\2\u0235\u0244"+
		"\5\u015c\u00af\2\u0236\u0237\f\3\2\2\u0237\u0238\7\u014e\2\2\u0238\u0239"+
		"\5\u015c\u00af\2\u0239\u0241\7\u0152\2\2\u023a\u023d\5\u0160\u00b1\2\u023b"+
		"\u023d\5\u0162\u00b2\2\u023c\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0242\3\2\2\2\u0240"+
		"\u0242\5\u015c\u00af\2\u0241\u023c\3\2\2\2\u0241\u0240\3\2\2\2\u0242\u0244"+
		"\3\2\2\2\u0243\u0233\3\2\2\2\u0243\u0236\3\2\2\2\u0244\u0247\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\'\3\2\2\2\u0247\u0245\3\2\2\2"+
		"\u0248\u0249\7\u0080\2\2\u0249\u024a\7\u015c\2\2\u024a\u024b\5\u0124\u0093"+
		"\2\u024b\u024c\7\u015f\2\2\u024c\u024d\5\32\16\2\u024d\u024e\5\36\20\2"+
		"\u024e\u0252\5\34\17\2\u024f\u0251\5*\26\2\u0250\u024f\3\2\2\2\u0251\u0254"+
		"\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0256\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0255\u0257\5,\27\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2"+
		"\2\2\u0257)\3\2\2\2\u0258\u0259\7\\\2\2\u0259\u025a\7\u015c\2\2\u025a"+
		"\u025b\5\u0124\u0093\2\u025b\u025c\7\u015f\2\2\u025c\u025d\5\32\16\2\u025d"+
		"\u025e\5\36\20\2\u025e\u025f\5\34\17\2\u025f+\3\2\2\2\u0260\u0261\7[\2"+
		"\2\u0261\u0262\5\32\16\2\u0262\u0263\5\36\20\2\u0263\u0264\5\34\17\2\u0264"+
		"-\3\2\2\2\u0265\u0266\7m\2\2\u0266\u0269\7\u015c\2\2\u0267\u026a\5 \21"+
		"\2\u0268\u026a\5$\23\2\u0269\u0267\3\2\2\2\u0269\u0268\3\2\2\2\u026a\u026b"+
		"\3\2\2\2\u026b\u026c\5\u0124\u0093\2\u026c\u026d\7\u0161\2\2\u026d\u026e"+
		"\5\60\31\2\u026e\u026f\7\u015f\2\2\u026f\u0270\5\32\16\2\u0270\u0271\5"+
		"\36\20\2\u0271\u0272\5\34\17\2\u0272/\3\2\2\2\u0273\u0274\b\31\1\2\u0274"+
		"\u0275\5\u015c\u00af\2\u0275\u0276\7\u014c\2\2\u0276\u0277\7\u014c\2\2"+
		"\u0277\u0291\3\2\2\2\u0278\u0279\5\u015c\u00af\2\u0279\u027a\7\u0163\2"+
		"\2\u027a\u0291\3\2\2\2\u027b\u027c\5\u015c\u00af\2\u027c\u027d\7\u014c"+
		"\2\2\u027d\u0280\7\u0152\2\2\u027e\u0281\5\u0160\u00b1\2\u027f\u0281\5"+
		"\u015c\u00af\2\u0280\u027e\3\2\2\2\u0280\u027f\3\2\2\2\u0281\u0291\3\2"+
		"\2\2\u0282\u0283\5\u015c\u00af\2\u0283\u0284\7\u0162\2\2\u0284\u0287\7"+
		"\u0152\2\2\u0285\u0288\5\u0160\u00b1\2\u0286\u0288\5\u015c\u00af\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0286\3\2\2\2\u0288\u0291\3\2\2\2\u0289\u028a\5\u015c"+
		"\u00af\2\u028a\u028b\7\u015a\2\2\u028b\u028e\7\u0152\2\2\u028c\u028f\5"+
		"\u0160\u00b1\2\u028d\u028f\5\u015c\u00af\2\u028e\u028c\3\2\2\2\u028e\u028d"+
		"\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u0273\3\2\2\2\u0290\u0278\3\2\2\2\u0290"+
		"\u027b\3\2\2\2\u0290\u0282\3\2\2\2\u0290\u0289\3\2\2\2\u0291\u0297\3\2"+
		"\2\2\u0292\u0293\f\3\2\2\u0293\u0294\7\u014e\2\2\u0294\u0296\5\60\31\4"+
		"\u0295\u0292\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298\61\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029c\7c\2\2\u029b"+
		"\u029d\5\64\33\2\u029c\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029c\3"+
		"\2\2\2\u029e\u029f\3\2\2\2\u029f\63\3\2\2\2\u02a0\u02a1\7\u012c\2\2\u02a1"+
		"\u02a2\7\u0164\2\2\u02a2\u02a3\7\u0115\2\2\u02a3\u02a4\5\4\3\2\u02a4\u02a5"+
		"\n\3\2\2\u02a5\65\3\2\2\2\u02a6\u02a7\7\u00ba\2\2\u02a7\67\3\2\2\2\u02a8"+
		"\u02a9\6\35\t\2\u02a9\u02aa\5\u0134\u009b\2\u02aa9\3\2\2\2\u02ab\u02ac"+
		"\7\u00f7\2\2\u02ac\u02b9\5D#\2\u02ad\u02af\7\u00f7\2\2\u02ae\u02ad\3\2"+
		"\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b5\5<\37\2\u02b1"+
		"\u02b2\7\u014e\2\2\u02b2\u02b4\5<\37\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7"+
		"\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b8\u02ab\3\2\2\2\u02b8\u02ae\3\2\2\2\u02b9;\3\2\2\2"+
		"\u02ba\u02be\5> \2\u02bb\u02be\5@!\2\u02bc\u02be\5B\"\2\u02bd\u02ba\3"+
		"\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02bc\3\2\2\2\u02be=\3\2\2\2\u02bf\u02c1"+
		"\5\u015c\u00af\2\u02c0\u02c2\7\u014d\2\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2"+
		"\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7\u0152\2\2\u02c4\u02c5\5\u0134"+
		"\u009b\2\u02c5\u02d0\3\2\2\2\u02c6\u02c7\7\u015c\2\2\u02c7\u02c8\5\u015c"+
		"\u00af\2\u02c8\u02ca\7\u015f\2\2\u02c9\u02cb\7\u014d\2\2\u02ca\u02c9\3"+
		"\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\7\u0152\2\2"+
		"\u02cd\u02ce\5\u0134\u009b\2\u02ce\u02d0\3\2\2\2\u02cf\u02bf\3\2\2\2\u02cf"+
		"\u02c6\3\2\2\2\u02d0?\3\2\2\2\u02d1\u02d2\7\u015c\2\2\u02d2\u02d7\5\u015c"+
		"\u00af\2\u02d3\u02d4\7\u014e\2\2\u02d4\u02d6\5\u015c\u00af\2\u02d5\u02d3"+
		"\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
		"\u02da\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02dc\7\u015f\2\2\u02db\u02dd"+
		"\7\u014d\2\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\3\2\2"+
		"\2\u02de\u02df\7\u0152\2\2\u02df\u02e0\7\u015c\2\2\u02e0\u02e5\5\u0134"+
		"\u009b\2\u02e1\u02e2\7\u014e\2\2\u02e2\u02e4\5\u0134\u009b\2\u02e3\u02e1"+
		"\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e8\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02e9\7\u015f\2\2\u02e9A\3\2"+
		"\2\2\u02ea\u02f7\5\u015c\u00af\2\u02eb\u02ec\7\u015c\2\2\u02ec\u02f1\5"+
		"\u015c\u00af\2\u02ed\u02ee\7\u014e\2\2\u02ee\u02f0\5\u015c\u00af\2\u02ef"+
		"\u02ed\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2"+
		"\2\2\u02f2\u02f4\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f5\7\u015f\2\2\u02f5"+
		"\u02f7\3\2\2\2\u02f6\u02ea\3\2\2\2\u02f6\u02eb\3\2\2\2\u02f7\u02f9\3\2"+
		"\2\2\u02f8\u02fa\7\u014d\2\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u02fc\7\u0152\2\2\u02fc\u02fd\7\u015c\2\2\u02fd\u02fe"+
		"\5\u00e2r\2\u02fe\u02ff\7\u015f\2\2\u02ffC\3\2\2\2\u0300\u0304\5F$\2\u0301"+
		"\u0304\5J&\2\u0302\u0304\5H%\2\u0303\u0300\3\2\2\2\u0303\u0301\3\2\2\2"+
		"\u0303\u0302\3\2\2\2\u0304E\3\2\2\2\u0305\u0307\7>\2\2\u0306\u0305\3\2"+
		"\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030b\7\u00f0\2\2\u0309"+
		"\u030b\7?\2\2\u030a\u0306\3\2\2\2\u030a\u0309\3\2\2\2\u030b\u030d\3\2"+
		"\2\2\u030c\u030e\7\u0152\2\2\u030d\u030c\3\2\2\2\u030d\u030e\3\2\2\2\u030e"+
		"\u030f\3\2\2\2\u030f\u0310\5\u0134\u009b\2\u0310G\3\2\2\2\u0311\u0312"+
		"\7\u00d5\2\2\u0312\u0315\7\u0152\2\2\u0313\u0316\5\u0134\u009b\2\u0314"+
		"\u0316\7\u00b7\2\2\u0315\u0313\3\2\2\2\u0315\u0314\3\2\2\2\u0316\u0318"+
		"\3\2\2\2\u0317\u0319\7\u0121\2\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2"+
		"\2\u0319\u031a\3\2\2\2\u031a\u031b\7m\2\2\u031b\u031c\t\4\2\2\u031cI\3"+
		"\2\2\2\u031d\u031e\t\5\2\2\u031e\u031f\t\6\2\2\u031fK\3\2\2\2\u0320\u0321"+
		"\7\25\2\2\u0321\u0322\7\u011b\2\2\u0322M\3\2\2\2\u0323\u0324\7\35\2\2"+
		"\u0324O\3\2\2\2\u0325\u0326\7 \2\2\u0326\u032d\5\u015c\u00af\2\u0327\u0329"+
		"\7\u015c\2\2\u0328\u032a\5\u0154\u00ab\2\u0329\u0328\3\2\2\2\u0329\u032a"+
		"\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032e\7\u015f\2\2\u032c\u032e\5\u0154"+
		"\u00ab\2\u032d\u0327\3\2\2\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"Q\3\2\2\2\u032f\u0330\7I\2\2\u0330\u0335\5X-\2\u0331\u0332\7\u014e\2\2"+
		"\u0332\u0334\5X-\2\u0333\u0331\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333"+
		"\3\2\2\2\u0335\u0336\3\2\2\2\u0336S\3\2\2\2\u0337\u0335\3\2\2\2\u0338"+
		"\u0339\7I\2\2\u0339\u033a\5X-\2\u033a\u0340\7\u0161\2\2\u033b\u033c\5"+
		"X-\2\u033c\u033d\7\u0161\2\2\u033d\u033f\3\2\2\2\u033e\u033b\3\2\2\2\u033f"+
		"\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341U\3\2\2\2"+
		"\u0342\u0340\3\2\2\2\u0343\u0344\5X-\2\u0344\u034a\7\u0161\2\2\u0345\u0346"+
		"\5X-\2\u0346\u0347\7\u0161\2\2\u0347\u0349\3\2\2\2\u0348\u0345\3\2\2\2"+
		"\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034bW\3"+
		"\2\2\2\u034c\u034a\3\2\2\2\u034d\u0353\5^\60\2\u034e\u0353\5\\/\2\u034f"+
		"\u0353\5d\63\2\u0350\u0353\5Z.\2\u0351\u0353\5f\64\2\u0352\u034d\3\2\2"+
		"\2\u0352\u034e\3\2\2\2\u0352\u034f\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0351"+
		"\3\2\2\2\u0353Y\3\2\2\2\u0354\u0359\5\u015c\u00af\2\u0355\u0356\7\u014e"+
		"\2\2\u0356\u0358\5\u015c\u00af\2\u0357\u0355\3\2\2\2\u0358\u035b\3\2\2"+
		"\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359"+
		"\3\2\2\2\u035c\u035e\7\17\2\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2\2\2"+
		"\u035e\u035f\3\2\2\2\u035f\u0361\5\u0094K\2\u0360\u0362\5\u0096L\2\u0361"+
		"\u0360\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0366\3\2\2\2\u0363\u0365\5\u0098"+
		"M\2\u0364\u0363\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u036a\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u036b\5\u009a"+
		"N\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u0378\3\2\2\2\u036c"+
		"\u036d\5\u015c\u00af\2\u036d\u036f\7\60\2\2\u036e\u0370\7\17\2\2\u036f"+
		"\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0373\5\u0094"+
		"K\2\u0372\u0374\5\u0096L\2\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u0376\5\u009aN\2\u0376\u0378\3\2\2\2\u0377\u0354"+
		"\3\2\2\2\u0377\u036c\3\2\2\2\u0378[\3\2\2\2\u0379\u037a\5\u015c\u00af"+
		"\2\u037a\u037b\7\64\2\2\u037b]\3\2\2\2\u037c\u037d\7@\2\2\u037d\u0382"+
		"\5\u015c\u00af\2\u037e\u037f\5\u015c\u00af\2\u037f\u0380\7@\2\2\u0380"+
		"\u0382\3\2\2\2\u0381\u037c\3\2\2\2\u0381\u037e\3\2\2\2\u0382\u0385\3\2"+
		"\2\2\u0383\u0386\5`\61\2\u0384\u0386\5b\62\2\u0385\u0383\3\2\2\2\u0385"+
		"\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u038a\t\7"+
		"\2\2\u0388\u038b\5\u00e2r\2\u0389\u038b\5\u0134\u009b\2\u038a\u0388\3"+
		"\2\2\2\u038a\u0389\3\2\2\2\u038b_\3\2\2\2\u038c\u038d\7\u012e\2\2\u038d"+
		"\u038f\7\u00e1\2\2\u038e\u0390\7\u00c0\2\2\u038f\u038e\3\2\2\2\u038f\u0390"+
		"\3\2\2\2\u0390\u0393\3\2\2\2\u0391\u0392\7\u0119\2\2\u0392\u0394\t\b\2"+
		"\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394a\3\2\2\2\u0395\u0396"+
		"\7\u012f\2\2\u0396\u0397\7\u00e1\2\2\u0397c\3\2\2\2\u0398\u0399\t\t\2"+
		"\2\u0399\u039a\7y\2\2\u039a\u03a0\7m\2\2\u039b\u03a1\7\u0103\2\2\u039c"+
		"\u03a1\7\u0106\2\2\u039d\u039e\7\u00b8\2\2\u039e\u03a1\7p\2\2\u039f\u03a1"+
		"\5\u015c\u00af\2\u03a0\u039b\3\2\2\2\u03a0\u039c\3\2\2\2\u03a0\u039d\3"+
		"\2\2\2\u03a0\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\5\b\5\2\u03a3"+
		"e\3\2\2\2\u03a4\u03a6\7u\2\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6"+
		"\u03a7\3\2\2\2\u03a7\u03a8\7\u0112\2\2\u03a8\u03a9\7\u0110\2\2\u03a9\u03ab"+
		"\5\u015c\u00af\2\u03aa\u03ac\5z>\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2"+
		"\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\5l\67\2\u03aeg\3\2\2\2\u03af\u03b0"+
		"\7:\2\2\u03b0\u03b4\7\u0110\2\2\u03b1\u03b2\7\u0080\2\2\u03b2\u03b3\7"+
		"\u00b8\2\2\u03b3\u03b5\7e\2\2\u03b4\u03b1\3\2\2\2\u03b4\u03b5\3\2\2\2"+
		"\u03b5\u03b6\3\2\2\2\u03b6\u03b8\5\u0114\u008b\2\u03b7\u03b9\5z>\2\u03b8"+
		"\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\5l"+
		"\67\2\u03bbi\3\2\2\2\u03bc\u03c3\7:\2\2\u03bd\u03be\7\u009f\2\2\u03be"+
		"\u03c4\7\u0112\2\2\u03bf\u03c1\t\n\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1"+
		"\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\7\u012b\2\2\u03c3\u03bd\3\2\2"+
		"\2\u03c3\u03c0\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\7\u0110\2\2\u03c6"+
		"\u03c8\5\u015c\u00af\2\u03c7\u03c9\5z>\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9"+
		"\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\5l\67\2\u03cbk\3\2\2\2\u03cc"+
		"\u03ce\7\17\2\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\3"+
		"\2\2\2\u03cf\u03d0\7\u015c\2\2\u03d0\u03d1\5\u00e2r\2\u03d1\u03d2\7\u015f"+
		"\2\2\u03d2\u03dc\3\2\2\2\u03d3\u03d5\7\17\2\2\u03d4\u03d3\3\2\2\2\u03d4"+
		"\u03d5\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03dc\5\u00e2r\2\u03d7\u03d8"+
		"\7\u015c\2\2\u03d8\u03d9\5n8\2\u03d9\u03da\7\u015f\2\2\u03da\u03dc\3\2"+
		"\2\2\u03db\u03cd\3\2\2\2\u03db\u03d4\3\2\2\2\u03db\u03d7\3\2\2\2\u03dc"+
		"\u03de\3\2\2\2\u03dd\u03df\5\u0080A\2\u03de\u03dd\3\2\2\2\u03de\u03df"+
		"\3\2\2\2\u03dfm\3\2\2\2\u03e0\u03e5\5p9\2\u03e1\u03e2\7\u014e\2\2\u03e2"+
		"\u03e4\5p9\2\u03e3\u03e1\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3\3\2\2"+
		"\2\u03e5\u03e6\3\2\2\2\u03e6o\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e8\u03e9"+
		"\5r:\2\u03e9\u03eb\5\u0094K\2\u03ea\u03ec\5\u0096L\2\u03eb\u03ea\3\2\2"+
		"\2\u03eb\u03ec\3\2\2\2\u03ec\u03f0\3\2\2\2\u03ed\u03ef\5\u0098M\2\u03ee"+
		"\u03ed\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2"+
		"\2\2\u03f1\u03f6\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f3\u03f5\5t;\2\u03f4\u03f3"+
		"\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7"+
		"\u03ff\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03fa\7\65\2\2\u03fa\u03fc\5"+
		"\u015c\u00af\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\3\2"+
		"\2\2\u03fd\u03ff\5v<\2\u03fe\u03e8\3\2\2\2\u03fe\u03fb\3\2\2\2\u03ffq"+
		"\3\2\2\2\u0400\u0401\5\u015c\u00af\2\u0401s\3\2\2\2\u0402\u0423\5\u009a"+
		"N\2\u0403\u0405\7\u00b8\2\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2\2\2\u0405"+
		"\u0406\3\2\2\2\u0406\u0423\7\u00ba\2\2\u0407\u0408\7\u00d0\2\2\u0408\u0423"+
		"\7\u0097\2\2\u0409\u0423\7\u0120\2\2\u040a\u040b\7\u00da\2\2\u040b\u040c"+
		"\5\u0114\u008b\2\u040c\u040d\7\u015c\2\2\u040d\u040e\5\u015c\u00af\2\u040e"+
		"\u0412\7\u015f\2\2\u040f\u0411\5x=\2\u0410\u040f\3\2\2\2\u0411\u0414\3"+
		"\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0423\3\2\2\2\u0414"+
		"\u0412\3\2\2\2\u0415\u0416\7\177\2\2\u0416\u0417\7\u015c\2\2\u0417\u041c"+
		"\7\u0167\2\2\u0418\u0419\7\u014e\2\2\u0419\u041b\7\u0167\2\2\u041a\u0418"+
		"\3\2\2\2\u041b\u041e\3\2\2\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d"+
		"\u041f\3\2\2\2\u041e\u041c\3\2\2\2\u041f\u0423\7\u015f\2\2\u0420\u0423"+
		"\7\22\2\2\u0421\u0423\7^\2\2\u0422\u0402\3\2\2\2\u0422\u0404\3\2\2\2\u0422"+
		"\u0407\3\2\2\2\u0422\u0409\3\2\2\2\u0422\u040a\3\2\2\2\u0422\u0415\3\2"+
		"\2\2\u0422\u0420\3\2\2\2\u0422\u0421\3\2\2\2\u0423u\3\2\2\2\u0424\u0425"+
		"\7\u00d0\2\2\u0425\u0427\7\u0097\2\2\u0426\u0428\7+\2\2\u0427\u0426\3"+
		"\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\7\u015c\2\2"+
		"\u042a\u042c\5\u015c\u00af\2\u042b\u042d\t\13\2\2\u042c\u042b\3\2\2\2"+
		"\u042c\u042d\3\2\2\2\u042d\u0435\3\2\2\2\u042e\u042f\7\u014e\2\2\u042f"+
		"\u0431\5\u015c\u00af\2\u0430\u0432\t\13\2\2\u0431\u0430\3\2\2\2\u0431"+
		"\u0432\3\2\2\2\u0432\u0434\3\2\2\2\u0433\u042e\3\2\2\2\u0434\u0437\3\2"+
		"\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0438\3\2\2\2\u0437"+
		"\u0435\3\2\2\2\u0438\u043a\7\u015f\2\2\u0439\u043b\7^\2\2\u043a\u0439"+
		"\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043d\3\2\2\2\u043c\u043e\5\u00d4k"+
		"\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u045e\3\2\2\2\u043f\u0440"+
		"\7n\2\2\u0440\u0441\7\u0097\2\2\u0441\u0442\7\u015c\2\2\u0442\u0447\5"+
		"\u015c\u00af\2\u0443\u0444\7\u014e\2\2\u0444\u0446\5\u015c\u00af\2\u0445"+
		"\u0443\3\2\2\2\u0446\u0449\3\2\2\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2"+
		"\2\2\u0448\u044a\3\2\2\2\u0449\u0447\3\2\2\2\u044a\u044b\7\u015f\2\2\u044b"+
		"\u044c\7\u00da\2\2\u044c\u044d\5\u0114\u008b\2\u044d\u044e\7\u015c\2\2"+
		"\u044e\u0453\5\u015c\u00af\2\u044f\u0450\7\u014e\2\2\u0450\u0452\5\u015c"+
		"\u00af\2\u0451\u044f\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0451\3\2\2\2\u0453"+
		"\u0454\3\2\2\2\u0454\u0456\3\2\2\2\u0455\u0453\3\2\2\2\u0456\u045a\7\u015f"+
		"\2\2\u0457\u0459\5x=\2\u0458\u0457\3\2\2\2\u0459\u045c\3\2\2\2\u045a\u0458"+
		"\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045e\3\2\2\2\u045c\u045a\3\2\2\2\u045d"+
		"\u0424\3\2\2\2\u045d\u043f\3\2\2\2\u045ew\3\2\2\2\u045f\u0460\7\u00bf"+
		"\2\2\u0460\u0469\t\f\2\2\u0461\u0462\7\u00b3\2\2\u0462\u046a\7\b\2\2\u0463"+
		"\u046a\7\u00de\2\2\u0464\u0465\7\u00f7\2\2\u0465\u046a\7\u00ba\2\2\u0466"+
		"\u0467\7\u00f7\2\2\u0467\u046a\7J\2\2\u0468\u046a\7\"\2\2\u0469\u0461"+
		"\3\2\2\2\u0469\u0463\3\2\2\2\u0469\u0464\3\2\2\2\u0469\u0466\3\2\2\2\u0469"+
		"\u0468\3\2\2\2\u046ay\3\2\2\2\u046b\u046d\5|?\2\u046c\u046b\3\2\2\2\u046d"+
		"\u046e\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f{\3\2\2\2"+
		"\u0470\u0471\7\u014e\2\2\u0471\u0474\5~@\2\u0472\u0474\5\u008aF\2\u0473"+
		"\u0470\3\2\2\2\u0473\u0472\3\2\2\2\u0474}\3\2\2\2\u0475\u0477\7\u00b3"+
		"\2\2\u0476\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\3\2\2\2\u0478"+
		"\u0479\t\r\2\2\u0479\177\3\2\2\2\u047a\u047c\5\u0082B\2\u047b\u047a\3"+
		"\2\2\2\u047c\u047d\3\2\2\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047e"+
		"\u0081\3\2\2\2\u047f\u0480\7\u00bf\2\2\u0480\u0481\7\61\2\2\u0481\u0482"+
		"\t\16\2\2\u0482\u048a\7\u00e9\2\2\u0483\u048a\5\u0084C\2\u0484\u048a\5"+
		"\u0086D\2\u0485\u048a\5\u0088E\2\u0486\u048a\5\u008aF\2\u0487\u048a\5"+
		"\u0090I\2\u0488\u048a\5\u0092J\2\u0489\u047f\3\2\2\2\u0489\u0483\3\2\2"+
		"\2\u0489\u0484\3\2\2\2\u0489\u0485\3\2\2\2\u0489\u0486\3\2\2\2\u0489\u0487"+
		"\3\2\2\2\u0489\u0488\3\2\2\2\u048a\u0083\3\2\2\2\u048b\u048c\7\u00f4\2"+
		"\2\u048c\u048d\7;\2\2\u048d\u049e\t\17\2\2\u048e\u048f\t\20\2\2\u048f"+
		"\u049e\7\u0167\2\2\u0490\u049e\7\u00b5\2\2\u0491\u049e\t\21\2\2\u0492"+
		"\u0493\7\u0108\2\2\u0493\u0496\7\u015c\2\2\u0494\u0497\5\u015c\u00af\2"+
		"\u0495\u0497\7\u0167\2\2\u0496\u0494\3\2\2\2\u0496\u0495\3\2\2\2\u0497"+
		"\u0498\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2"+
		"\2\2\u049a\u049e\7\u015f\2\2\u049b\u049c\7\u0111\2\2\u049c\u049e\5\u015c"+
		"\u00af\2\u049d\u048b\3\2\2\2\u049d\u048e\3\2\2\2\u049d\u0490\3\2\2\2\u049d"+
		"\u0491\3\2\2\2\u049d\u0492\3\2\2\2\u049d\u049b\3\2\2\2\u049e\u0085\3\2"+
		"\2\2\u049f\u04a1\7\u0085\2\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\u04a2\3\2\2\2\u04a2\u04a3\7\u0083\2\2\u04a3\u04c1\5\u015c\u00af\2\u04a4"+
		"\u04a5\7\u012e\2\2\u04a5\u04c1\7\u00dc\2\2\u04a6\u04a7\7W\2\2\u04a7\u04a8"+
		"\7\36\2\2\u04a8\u04a9\7z\2\2\u04a9\u04aa\7\u015c\2\2\u04aa\u04af\5\u015c"+
		"\u00af\2\u04ab\u04ac\7\u014e\2\2\u04ac\u04ae\5\u015c\u00af\2\u04ad\u04ab"+
		"\3\2\2\2\u04ae\u04b1\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0"+
		"\u04b2\3\2\2\2\u04b1\u04af\3\2\2\2\u04b2\u04b3\7\u015f\2\2\u04b3\u04c1"+
		"\3\2\2\2\u04b4\u04b6\7\u00b8\2\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2"+
		"\2\u04b6\u04b7\3\2\2\2\u04b7\u04c1\7\u00a3\2\2\u04b8\u04b9\7\62\2\2\u04b9"+
		"\u04c1\t\22\2\2\u04ba\u04bb\7N\2\2\u04bb\u04c1\7\u00c0\2\2\u04bc\u04bd"+
		"\7\u012e\2\2\u04bd\u04be\7\u00de\2\2\u04be\u04bf\7\u00bf\2\2\u04bf\u04c1"+
		"\7Y\2\2\u04c0\u04a0\3\2\2\2\u04c0\u04a4\3\2\2\2\u04c0\u04a6\3\2\2\2\u04c0"+
		"\u04b5\3\2\2\2\u04c0\u04b8\3\2\2\2\u04c0\u04ba\3\2\2\2\u04c0\u04bc\3\2"+
		"\2\2\u04c1\u0087\3\2\2\2\u04c2\u04c4\7\u0120\2\2\u04c3\u04c2\3\2\2\2\u04c3"+
		"\u04c4\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6\7\u00d0\2\2\u04c6\u04c7"+
		"\7\u0085\2\2\u04c7\u04c8\7\u015c\2\2\u04c8\u04cd\5\u015c\u00af\2\u04c9"+
		"\u04ca\7\u014e\2\2\u04ca\u04cc\5\u015c\u00af\2\u04cb\u04c9\3\2\2\2\u04cc"+
		"\u04cf\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04d0\3\2"+
		"\2\2\u04cf\u04cd\3\2\2\2\u04d0\u04d1\7\u015f\2\2\u04d1\u04d5\3\2\2\2\u04d2"+
		"\u04d3\7\u012e\2\2\u04d3\u04d5\7B\2\2\u04d4\u04c3\3\2\2\2\u04d4\u04d2"+
		"\3\2\2\2\u04d5\u0089\3\2\2\2\u04d6\u04db\5\u008cG\2\u04d7\u04d8\7\u0109"+
		"\2\2\u04d8\u04d9\7\17\2\2\u04d9\u04db\5\u015c\u00af\2\u04da\u04d6\3\2"+
		"\2\2\u04da\u04d7\3\2\2\2\u04db\u008b\3\2\2\2\u04dc\u04dd\7\u00e8\2\2\u04dd"+
		"\u04de\7o\2\2\u04de\u04e2\7P\2\2\u04df\u04e1\5\u008eH\2\u04e0\u04df\3"+
		"\2\2\2\u04e1\u04e4\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3"+
		"\u008d\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e5\u04e6\7i\2\2\u04e6\u04e7\7\u0113"+
		"\2\2\u04e7\u04e8\7\36\2\2\u04e8\u04ec\5\u0134\u009b\2\u04e9\u04ea\7a\2"+
		"\2\u04ea\u04eb\7\36\2\2\u04eb\u04ed\5\u0134\u009b\2\u04ec\u04e9\3\2\2"+
		"\2\u04ec\u04ed\3\2\2\2\u04ed\u0501\3\2\2\2\u04ee\u04ef\7-\2\2\u04ef\u04f0"+
		"\7\u0094\2\2\u04f0\u04f1\7\u0113\2\2\u04f1\u04f2\7\36\2\2\u04f2\u0501"+
		"\5\u0134\u009b\2\u04f3\u04f4\7\u00a6\2\2\u04f4\u04f5\7\u0098\2\2\u04f5"+
		"\u04f6\7\u0113\2\2\u04f6\u04f7\7\36\2\2\u04f7\u0501\5\u0134\u009b\2\u04f8"+
		"\u04f9\7\u009e\2\2\u04f9\u04fa\7\u0113\2\2\u04fa\u04fb\7\36\2\2\u04fb"+
		"\u0501\5\u0134\u009b\2\u04fc\u04fd\7\u00ba\2\2\u04fd\u04fe\7L\2\2\u04fe"+
		"\u04ff\7\17\2\2\u04ff\u0501\5\u0134\u009b\2\u0500\u04e5\3\2\2\2\u0500"+
		"\u04ee\3\2\2\2\u0500\u04f3\3\2\2\2\u0500\u04f8\3\2\2\2\u0500\u04fc\3\2"+
		"\2\2\u0501\u008f\3\2\2\2\u0502\u0503\7\u00bf\2\2\u0503\u0507\5\u015c\u00af"+
		"\2\u0504\u0505\7\u0114\2\2\u0505\u0507\5\u015c\u00af\2\u0506\u0502\3\2"+
		"\2\2\u0506\u0504\3\2\2\2\u0507\u0091\3\2\2\2\u0508\u050a\7\22\2\2\u0509"+
		"\u050b\7\u0152\2\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c"+
		"\3\2\2\2\u050c\u0524\5\u0134\u009b\2\u050d\u050f\7/\2\2\u050e\u0510\7"+
		"\u0152\2\2\u050f\u050e\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\3\2\2\2"+
		"\u0511\u0524\5\u0134\u009b\2\u0512\u0514\7J\2\2\u0513\u0512\3\2\2\2\u0513"+
		"\u0514\3\2\2\2\u0514\u0518\3\2\2\2\u0515\u0516\7\'\2\2\u0516\u0519\7\u00f7"+
		"\2\2\u0517\u0519\7(\2\2\u0518\u0515\3\2\2\2\u0518\u0517\3\2\2\2\u0519"+
		"\u051b\3\2\2\2\u051a\u051c\7\u0152\2\2\u051b\u051a\3\2\2\2\u051b\u051c"+
		"\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u0524\5\u0134\u009b\2\u051e\u0520\7"+
		"`\2\2\u051f\u0521\7\u0152\2\2\u0520\u051f\3\2\2\2\u0520\u0521\3\2\2\2"+
		"\u0521\u0522\3\2\2\2\u0522\u0524\5\u0134\u009b\2\u0523\u0508\3\2\2\2\u0523"+
		"\u050d\3\2\2\2\u0523\u0513\3\2\2\2\u0523\u051e\3\2\2\2\u0524\u0093\3\2"+
		"\2\2\u0525\u0553\7&\2\2\u0526\u0553\7\27\2\2\u0527\u0553\7\30\2\2\u0528"+
		"\u0553\7\31\2\2\u0529\u0553\7\32\2\2\u052a\u0553\7\33\2\2\u052b\u0553"+
		"\7C\2\2\u052c\u0553\7D\2\2\u052d\u0553\7G\2\2\u052e\u0553\7H\2\2\u052f"+
		"\u0531\7X\2\2\u0530\u0532\7\u00ce\2\2\u0531\u0530\3\2\2\2\u0531\u0532"+
		"\3\2\2\2\u0532\u0553\3\2\2\2\u0533\u0553\7l\2\2\u0534\u0553\7\u0089\2"+
		"\2\u0535\u0553\7\u008a\2\2\u0536\u0553\7\u008b\2\2\u0537\u0553\7\u008c"+
		"\2\2\u0538\u0553\7\u008d\2\2\u0539\u0553\7\u00b0\2\2\u053a\u0553\7\u00b2"+
		"\2\2\u053b\u0553\7\u00bc\2\2\u053c\u0553\7\u00bb\2\2\u053d\u0553\7\u00cd"+
		"\2\2\u053e\u0553\7\u00d9\2\2\u053f\u0540\7\u00e0\2\2\u0540\u0553\7\u012a"+
		"\2\2\u0541\u0553\7\u00fe\2\2\u0542\u0553\7\u00fd\2\2\u0543\u0553\7\u00ff"+
		"\2\2\u0544\u0553\7\u0101\2\2\u0545\u0553\7\u0100\2\2\u0546\u0553\7\u010a"+
		"\2\2\u0547\u0553\7\u010f\2\2\u0548\u0553\7\u0116\2\2\u0549\u0553\7\u0117"+
		"\2\2\u054a\u0553\7\u0128\2\2\u054b\u0553\7\u0129\2\2\u054c\u0553\7\u0132"+
		"\2\2\u054d\u0550\5\u015c\u00af\2\u054e\u054f\7\5\2\2\u054f\u0551\t\23"+
		"\2\2\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0553\3\2\2\2\u0552"+
		"\u0525\3\2\2\2\u0552\u0526\3\2\2\2\u0552\u0527\3\2\2\2\u0552\u0528\3\2"+
		"\2\2\u0552\u0529\3\2\2\2\u0552\u052a\3\2\2\2\u0552\u052b\3\2\2\2\u0552"+
		"\u052c\3\2\2\2\u0552\u052d\3\2\2\2\u0552\u052e\3\2\2\2\u0552\u052f\3\2"+
		"\2\2\u0552\u0533\3\2\2\2\u0552\u0534\3\2\2\2\u0552\u0535\3\2\2\2\u0552"+
		"\u0536\3\2\2\2\u0552\u0537\3\2\2\2\u0552\u0538\3\2\2\2\u0552\u0539\3\2"+
		"\2\2\u0552\u053a\3\2\2\2\u0552\u053b\3\2\2\2\u0552\u053c\3\2\2\2\u0552"+
		"\u053d\3\2\2\2\u0552\u053e\3\2\2\2\u0552\u053f\3\2\2\2\u0552\u0541\3\2"+
		"\2\2\u0552\u0542\3\2\2\2\u0552\u0543\3\2\2\2\u0552\u0544\3\2\2\2\u0552"+
		"\u0545\3\2\2\2\u0552\u0546\3\2\2\2\u0552\u0547\3\2\2\2\u0552\u0548\3\2"+
		"\2\2\u0552\u0549\3\2\2\2\u0552\u054a\3\2\2\2\u0552\u054b\3\2\2\2\u0552"+
		"\u054c\3\2\2\2\u0552\u054d\3\2\2\2\u0553\u0095\3\2\2\2\u0554\u0555\7\u015c"+
		"\2\2\u0555\u0557\t\24\2\2\u0556\u0558\t\25\2\2\u0557\u0556\3\2\2\2\u0557"+
		"\u0558\3\2\2\2\u0558\u055b\3\2\2\2\u0559\u055a\7\u014e\2\2\u055a\u055c"+
		"\7\u0167\2\2\u055b\u0559\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d\3\2\2"+
		"\2\u055d\u055e\7\u015f\2\2\u055e\u0097\3\2\2\2\u055f\u0561\7\u00b8\2\2"+
		"\u0560\u055f\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u056b"+
		"\7\u00ba\2\2\u0563\u0564\7\'\2\2\u0564\u0565\7\u00f7\2\2\u0565\u056b\5"+
		"\u015c\u00af\2\u0566\u0568\7\u00b8\2\2\u0567\u0566\3\2\2\2\u0567\u0568"+
		"\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056b\t\26\2\2\u056a\u0560\3\2\2\2"+
		"\u056a\u0563\3\2\2\2\u056a\u0567\3\2\2\2\u056b\u0099\3\2\2\2\u056c\u056e"+
		"\7\u014d\2\2\u056d\u056c\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u056f\3\2\2"+
		"\2\u056f\u0570\7\u0152\2\2\u0570\u0579\5\u0134\u009b\2\u0571\u0573\7\u012e"+
		"\2\2\u0572\u0571\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0574\3\2\2\2\u0574"+
		"\u0576\7J\2\2\u0575\u0577\5\u0134\u009b\2\u0576\u0575\3\2\2\2\u0576\u0577"+
		"\3\2\2\2\u0577\u0579\3\2\2\2\u0578\u056d\3\2\2\2\u0578\u0572\3\2\2\2\u0579"+
		"\u009b\3\2\2\2\u057a\u057b\7:\2\2\u057b\u057f\t\27\2\2\u057c\u057d\7\u0080"+
		"\2\2\u057d\u057e\7\u00b8\2\2\u057e\u0580\7e\2\2\u057f\u057c\3\2\2\2\u057f"+
		"\u0580\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0585\5\u0134\u009b\2\u0582\u0584"+
		"\5\u009eP\2\u0583\u0582\3\2\2\2\u0584\u0587\3\2\2\2\u0585\u0583\3\2\2"+
		"\2\u0585\u0586\3\2\2\2\u0586\u009d\3\2\2\2\u0587\u0585\3\2\2\2\u0588\u0589"+
		"\7/\2\2\u0589\u058d\5\u0134\u009b\2\u058a\u058b\7\u00a0\2\2\u058b\u058d"+
		"\5\u0134\u009b\2\u058c\u0588\3\2\2\2\u058c\u058a\3\2\2\2\u058d\u009f\3"+
		"\2\2\2\u058e\u0596\7\13\2\2\u058f\u0592\7:\2\2\u0590\u0591\7\u00c2\2\2"+
		"\u0591\u0593\7\u00dc\2\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2\2\2\u0593"+
		"\u0596\3\2\2\2\u0594\u0596\7\u00dc\2\2\u0595\u058e\3\2\2\2\u0595\u058f"+
		"\3\2\2\2\u0595\u0594\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0597\3\2\2\2\u0597"+
		"\u0598\7s\2\2\u0598\u059a\5\u015c\u00af\2\u0599\u059b\5\u00b2Z\2\u059a"+
		"\u0599\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059e\5\u00a2"+
		"R\2\u059d\u059f\t\30\2\2\u059e\u059d\3\2\2\2\u059e\u059f\3\2\2\2\u059f"+
		"\u05a1\3\2\2\2\u05a0\u05a2\5V,\2\u05a1\u05a0\3\2\2\2\u05a1\u05a2\3\2\2"+
		"\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4\5\b\5\2\u05a4\u00a1\3\2\2\2\u05a5\u05a6"+
		"\t\31\2\2\u05a6\u05a8\5\u0094K\2\u05a7\u05a9\5\u0096L\2\u05a8\u05a7\3"+
		"\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u00a3\3\2\2\2\u05aa\u05b2\7\13\2\2\u05ab"+
		"\u05ae\7:\2\2\u05ac\u05ad\7\u00c2\2\2\u05ad\u05af\7\u00dc\2\2\u05ae\u05ac"+
		"\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0\u05b2\7\u00dc\2"+
		"\2\u05b1\u05aa\3\2\2\2\u05b1\u05ab\3\2\2\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2"+
		"\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\7\u00c9\2\2\u05b4\u05b5\5\u015c"+
		"\u00af\2\u05b5\u05b6\t\30\2\2\u05b6\u05b7\5\u00a6T\2\u05b7\u05bb\7_\2"+
		"\2\u05b8\u05b9\5\u015c\u00af\2\u05b9\u05ba\7\u0161\2\2\u05ba\u05bc\3\2"+
		"\2\2\u05bb\u05b8\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05d1\3\2\2\2\u05bd"+
		"\u05c5\7\13\2\2\u05be\u05c1\7:\2\2\u05bf\u05c0\7\u00c2\2\2\u05c0\u05c2"+
		"\7\u00dc\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c5\3\2\2"+
		"\2\u05c3\u05c5\7\u00dc\2\2\u05c4\u05bd\3\2\2\2\u05c4\u05be\3\2\2\2\u05c4"+
		"\u05c3\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\7\u00c9"+
		"\2\2\u05c7\u05c8\5\u015c\u00af\2\u05c8\u05c9\t\30\2\2\u05c9\u05ca\5\u00a6"+
		"T\2\u05ca\u05ce\7_\2\2\u05cb\u05cc\5\u015c\u00af\2\u05cc\u05cd\5\u0168"+
		"\u00b5\2\u05cd\u05cf\3\2\2\2\u05ce\u05cb\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf"+
		"\u05d1\3\2\2\2\u05d0\u05b1\3\2\2\2\u05d0\u05c4\3\2\2\2\u05d1\u00a5\3\2"+
		"\2\2\u05d2\u05d3\5\u00a8U\2\u05d3\u05d9\7\u0161\2\2\u05d4\u05d5\5\u00a8"+
		"U\2\u05d5\u05d6\7\u0161\2\2\u05d6\u05d8\3\2\2\2\u05d7\u05d4\3\2\2\2\u05d8"+
		"\u05db\3\2\2\2\u05d9\u05d7\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u00a7\3\2"+
		"\2\2\u05db\u05d9\3\2\2\2\u05dc\u05ea\5X-\2\u05dd\u05de\7s\2\2\u05de\u05e0"+
		"\5\u015c\u00af\2\u05df\u05e1\5\u00b2Z\2\u05e0\u05df\3\2\2\2\u05e0\u05e1"+
		"\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\5\u00a2R\2\u05e3\u05ea\3\2\2"+
		"\2\u05e4\u05e5\t\32\2\2\u05e5\u05e7\5\u015c\u00af\2\u05e6\u05e8\5\u00b2"+
		"Z\2\u05e7\u05e6\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05ea\3\2\2\2\u05e9"+
		"\u05dc\3\2\2\2\u05e9\u05dd\3\2\2\2\u05e9\u05e4\3\2\2\2\u05ea\u00a9\3\2"+
		"\2\2\u05eb\u05f3\7\13\2\2\u05ec\u05ef\7:\2\2\u05ed\u05ee\7\u00c2\2\2\u05ee"+
		"\u05f0\7\u00dc\2\2\u05ef\u05ed\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f3"+
		"\3\2\2\2\u05f1\u05f3\7\u00dc\2\2\u05f2\u05eb\3\2\2\2\u05f2\u05ec\3\2\2"+
		"\2\u05f2\u05f1\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f5"+
		"\7\u00c9\2\2\u05f5\u05f6\7\34\2\2\u05f6\u05f7\5\u015c\u00af\2\u05f7\u05f8"+
		"\t\30\2\2\u05f8\u05f9\5\u00acW\2\u05f9\u05fd\7_\2\2\u05fa\u05fb\5\u015c"+
		"\u00af\2\u05fb\u05fc\7\u0161\2\2\u05fc\u05fe\3\2\2\2\u05fd\u05fa\3\2\2"+
		"\2\u05fd\u05fe\3\2\2\2\u05fe\u00ab\3\2\2\2\u05ff\u0600\5\u00aeX\2\u0600"+
		"\u0606\7\u0161\2\2\u0601\u0602\5\u00aeX\2\u0602\u0603\7\u0161\2\2\u0603"+
		"\u0605\3\2\2\2\u0604\u0601\3\2\2\2\u0605\u0608\3\2\2\2\u0606\u0604\3\2"+
		"\2\2\u0606\u0607\3\2\2\2\u0607\u00ad\3\2\2\2\u0608\u0606\3\2\2\2\u0609"+
		"\u060d\5X-\2\u060a\u060d\5\u00a0Q\2\u060b\u060d\5\u00b0Y\2\u060c\u0609"+
		"\3\2\2\2\u060c\u060a\3\2\2\2\u060c\u060b\3\2\2\2\u060d\u00af\3\2\2\2\u060e"+
		"\u0616\7\13\2\2\u060f\u0612\7:\2\2\u0610\u0611\7\u00c2\2\2\u0611\u0613"+
		"\7\u00dc\2\2\u0612\u0610\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0616\3\2\2"+
		"\2\u0614\u0616\7\u00dc\2\2\u0615\u060e\3\2\2\2\u0615\u060f\3\2\2\2\u0615"+
		"\u0614\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u0618\t\32"+
		"\2\2\u0618\u061a\5\u015c\u00af\2\u0619\u061b\5\u00b2Z\2\u061a\u0619\3"+
		"\2\2\2\u061a\u061b\3\2\2\2\u061b\u061d\3\2\2\2\u061c\u061e\5\u00b6\\\2"+
		"\u061d\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0620\3\2\2\2\u061f\u0621"+
		"\t\30\2\2\u0620\u061f\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0623\3\2\2\2"+
		"\u0622\u0624\5V,\2\u0623\u0622\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0626"+
		"\3\2\2\2\u0625\u0627\5\u00e0q\2\u0626\u0625\3\2\2\2\u0626\u0627\3\2\2"+
		"\2\u0627\u0628\3\2\2\2\u0628\u062c\5\f\7\2\u0629\u062a\5\u015c\u00af\2"+
		"\u062a\u062b\7\u0161\2\2\u062b\u062d\3\2\2\2\u062c\u0629\3\2\2\2\u062c"+
		"\u062d\3\2\2\2\u062d\u064f\3\2\2\2\u062e\u0636\7\13\2\2\u062f\u0632\7"+
		":\2\2\u0630\u0631\7\u00c2\2\2\u0631\u0633\7\u00dc\2\2\u0632\u0630\3\2"+
		"\2\2\u0632\u0633\3\2\2\2\u0633\u0636\3\2\2\2\u0634\u0636\7\u00dc\2\2\u0635"+
		"\u062e\3\2\2\2\u0635\u062f\3\2\2\2\u0635\u0634\3\2\2\2\u0635\u0636\3\2"+
		"\2\2\u0636\u0637\3\2\2\2\u0637\u0638\t\32\2\2\u0638\u063a\5\u015c\u00af"+
		"\2\u0639\u063b\5\u00b2Z\2\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2\2\u063b"+
		"\u063d\3\2\2\2\u063c\u063e\5\u00b6\\\2\u063d\u063c\3\2\2\2\u063d\u063e"+
		"\3\2\2\2\u063e\u0640\3\2\2\2\u063f\u0641\t\30\2\2\u0640\u063f\3\2\2\2"+
		"\u0640\u0641\3\2\2\2\u0641\u0643\3\2\2\2\u0642\u0644\5V,\2\u0643\u0642"+
		"\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0646\3\2\2\2\u0645\u0647\5\u00e0q"+
		"\2\u0646\u0645\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u064c"+
		"\5\f\7\2\u0649\u064a\5\u015c\u00af\2\u064a\u064b\5\u0168\u00b5\2\u064b"+
		"\u064d\3\2\2\2\u064c\u0649\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064f\3\2"+
		"\2\2\u064e\u0615\3\2\2\2\u064e\u0635\3\2\2\2\u064f\u00b1\3\2\2\2\u0650"+
		"\u0651\7\u015c\2\2\u0651\u0667\7\u015f\2\2\u0652\u0653\7\u015c\2\2\u0653"+
		"\u0658\5\u00b4[\2\u0654\u0655\7\u014e\2\2\u0655\u0657\5\u00b4[\2\u0656"+
		"\u0654\3\2\2\2\u0657\u065a\3\2\2\2\u0658\u0656\3\2\2\2\u0658\u0659\3\2"+
		"\2\2\u0659\u065b\3\2\2\2\u065a\u0658\3\2\2\2\u065b\u065c\7\u015f\2\2\u065c"+
		"\u0667\3\2\2\2\u065d\u065e\6Z\n\2\u065e\u0663\5\u00b4[\2\u065f\u0660\7"+
		"\u014e\2\2\u0660\u0662\5\u00b4[\2\u0661\u065f\3\2\2\2\u0662\u0665\3\2"+
		"\2\2\u0663\u0661\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0667\3\2\2\2\u0665"+
		"\u0663\3\2\2\2\u0666\u0650\3\2\2\2\u0666\u0652\3\2\2\2\u0666\u065d\3\2"+
		"\2\2\u0667\u00b3\3\2\2\2\u0668\u066e\7\u0083\2\2\u0669\u066e\7\u00c4\2"+
		"\2\u066a\u066e\7\u0088\2\2\u066b\u066c\7\u0083\2\2\u066c\u066e\7\u00c4"+
		"\2\2\u066d\u0668\3\2\2\2\u066d\u0669\3\2\2\2\u066d\u066a\3\2\2\2\u066d"+
		"\u066b\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0670\5\u015c"+
		"\u00af\2\u0670\u0672\5\u0094K\2\u0671\u0673\5\u0096L\2\u0672\u0671\3\2"+
		"\2\2\u0672\u0673\3\2\2\2\u0673\u0677\3\2\2\2\u0674\u0676\5\u0098M\2\u0675"+
		"\u0674\3\2\2\2\u0676\u0679\3\2\2\2\u0677\u0675\3\2\2\2\u0677\u0678\3\2"+
		"\2\2\u0678\u067b\3\2\2\2\u0679\u0677\3\2\2\2\u067a\u067c\5\u009aN\2\u067b"+
		"\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u0693\3\2\2\2\u067d\u0683\5\u015c"+
		"\u00af\2\u067e\u0684\7\u0083\2\2\u067f\u0684\7\u00c4\2\2\u0680\u0684\7"+
		"\u0088\2\2\u0681\u0682\7\u0083\2\2\u0682\u0684\7\u00c4\2\2\u0683\u067e"+
		"\3\2\2\2\u0683\u067f\3\2\2\2\u0683\u0680\3\2\2\2\u0683\u0681\3\2\2\2\u0683"+
		"\u0684\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0687\5\u0094K\2\u0686\u0688"+
		"\5\u0096L\2\u0687\u0686\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u068c\3\2\2"+
		"\2\u0689\u068b\5\u0098M\2\u068a\u0689\3\2\2\2\u068b\u068e\3\2\2\2\u068c"+
		"\u068a\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u0690\3\2\2\2\u068e\u068c\3\2"+
		"\2\2\u068f\u0691\5\u009aN\2\u0690\u068f\3\2\2\2\u0690\u0691\3\2\2\2\u0691"+
		"\u0693\3\2\2\2\u0692\u066d\3\2\2\2\u0692\u067d\3\2\2\2\u0693\u00b5\3\2"+
		"\2\2\u0694\u0696\5\u00b8]\2\u0695\u0694\3\2\2\2\u0696\u0697\3\2\2\2\u0697"+
		"\u0695\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u00b7\3\2\2\2\u0699\u069a\7\u0099"+
		"\2\2\u069a\u06a5\7\u0102\2\2\u069b\u069c\7\u0102\2\2\u069c\u069d\7\u00f3"+
		"\2\2\u069d\u06a5\t\33\2\2\u069e\u06a0\7Z\2\2\u069f\u069e\3\2\2\2\u069f"+
		"\u06a0\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a2\7\u00df\2\2\u06a2\u06a3"+
		"\7\u00fa\2\2\u06a3\u06a5\7\u0167\2\2\u06a4\u0699\3\2\2\2\u06a4\u069b\3"+
		"\2\2\2\u06a4\u069f\3\2\2\2\u06a5\u00b9\3\2\2\2\u06a6\u06ab\5(\25\2\u06a7"+
		"\u06ab\5\u00bc_\2\u06a8\u06ab\5\u00be`\2\u06a9\u06ab\5\u00c0a\2\u06aa"+
		"\u06a6\3\2\2\2\u06aa\u06a7\3\2\2\2\u06aa\u06a8\3\2\2\2\u06aa\u06a9\3\2"+
		"\2\2\u06ab\u00bb\3\2\2\2\u06ac\u06ad\7\u0080\2\2\u06ad\u06ae\5\u0124\u0093"+
		"\2\u06ae\u06af\7\u0115\2\2\u06af\u06b3\5\4\3\2\u06b0\u06b2\5\u00c2b\2"+
		"\u06b1\u06b0\3\2\2\2\u06b2\u06b5\3\2\2\2\u06b3\u06b1\3\2\2\2\u06b3\u06b4"+
		"\3\2\2\2\u06b4\u06b7\3\2\2\2\u06b5\u06b3\3\2\2\2\u06b6\u06b8\5\u00c4c"+
		"\2\u06b7\u06b6\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06ba"+
		"\7_\2\2\u06ba\u06bb\7\u0080\2\2\u06bb\u00bd\3\2\2\2\u06bc\u06bd\7\u0080"+
		"\2\2\u06bd\u06be\5\u0124\u0093\2\u06be\u06c1\5\b\5\2\u06bf\u06c0\7[\2"+
		"\2\u06c0\u06c2\5\b\5\2\u06c1\u06bf\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u00bf"+
		"\3\2\2\2\u06c3\u06c4\7\6\2\2\u06c4\u06c5\7\u0080\2\2\u06c5\u06c6\5\u0124"+
		"\u0093\2\u06c6\u06c7\7\u0115\2\2\u06c7\u06c8\5\b\5\2\u06c8\u00c1\3\2\2"+
		"\2\u06c9\u06ca\t\34\2\2\u06ca\u06cb\5\u0124\u0093\2\u06cb\u06cc\7\u0115"+
		"\2\2\u06cc\u06cd\5\4\3\2\u06cd\u00c3\3\2\2\2\u06ce\u06cf\7[\2\2\u06cf"+
		"\u06d0\5\4\3\2\u06d0\u00c5\3\2\2\2\u06d1\u06d3\7f\2\2\u06d2\u06d4\7\u0164"+
		"\2\2\u06d3\u06d2\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d7\3\2\2\2\u06d5"+
		"\u06d6\7\u012c\2\2\u06d6\u06d8\5\u0124\u0093\2\u06d7\u06d5\3\2\2\2\u06d7"+
		"\u06d8\3\2\2\2\u06d8\u00c7\3\2\2\2\u06d9\u06da\7\u00c1\2\2\u06da\u06e0"+
		"\7\u0164\2\2\u06db\u06de\7m\2\2\u06dc\u06df\5\u00e2r\2\u06dd\u06df\5\u0134"+
		"\u009b\2\u06de\u06dc\3\2\2\2\u06de\u06dd\3\2\2\2\u06df\u06e1\3\2\2\2\u06e0"+
		"\u06db\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u00c9\3\2\2\2\u06e2\u06e3\7*"+
		"\2\2\u06e3\u06e4\7\u0164\2\2\u06e4\u00cb\3\2\2\2\u06e5\u06e6\7,\2\2\u06e6"+
		"\u06e7\t\35\2\2\u06e7\u06e8\5\u00ceh\2\u06e8\u06e9\7\u014e\2\2\u06e9\u06ea"+
		"\5\u00ceh\2\u06ea\u00cd\3\2\2\2\u06eb\u06ed\5\u0114\u008b\2\u06ec\u06ee"+
		"\5\u0116\u008c\2\u06ed\u06ec\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f4\3"+
		"\2\2\2\u06ef\u06f0\7\u015c\2\2\u06f0\u06f1\5\u00e2r\2\u06f1\u06f2\7\u015f"+
		"\2\2\u06f2\u06f4\3\2\2\2\u06f3\u06eb\3\2\2\2\u06f3\u06ef\3\2\2\2\u06f4"+
		"\u06f7\3\2\2\2\u06f5\u06f6\7\21\2\2\u06f6\u06f8\5\u015c\u00af\2\u06f7"+
		"\u06f5\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u00cf\3\2\2\2\u06f9\u06fb\7:"+
		"\2\2\u06fa\u06fc\7\u0120\2\2\u06fb\u06fa\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc"+
		"\u06fd\3\2\2\2\u06fd\u06fe\7\u0085\2\2\u06fe\u06ff\5\u015c\u00af\2\u06ff"+
		"\u0700\7\u00bf\2\2\u0700\u0701\5\u0114\u008b\2\u0701\u0702\7\u015c\2\2"+
		"\u0702\u0707\5\u00d2j\2\u0703\u0704\7\u014e\2\2\u0704\u0706\5\u00d2j\2"+
		"\u0705\u0703\3\2\2\2\u0706\u0709\3\2\2\2\u0707\u0705\3\2\2\2\u0707\u0708"+
		"\3\2\2\2\u0708\u070a\3\2\2\2\u0709\u0707\3\2\2\2\u070a\u070b\7\u015f\2"+
		"\2\u070b\u00d1\3\2\2\2\u070c\u070e\5\u015c\u00af\2\u070d\u070f\t\13\2"+
		"\2\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u00d3\3\2\2\2\u0710\u0711"+
		"\5\u00d6l\2\u0711\u00d5\3\2\2\2\u0712\u0713\7\u012e\2\2\u0713\u0714\7"+
		"\u015c\2\2\u0714\u0715\5\u015c\u00af\2\u0715\u0716\7\u0152\2\2\u0716\u071e"+
		"\5\u015c\u00af\2\u0717\u0718\7\u014e\2\2\u0718\u0719\5\u015c\u00af\2\u0719"+
		"\u071a\7\u0152\2\2\u071a\u071b\5\u015c\u00af\2\u071b\u071d\3\2\2\2\u071c"+
		"\u0717\3\2\2\2\u071d\u0720\3\2\2\2\u071e\u071c\3\2\2\2\u071e\u071f\3\2"+
		"\2\2\u071f\u0721\3\2\2\2\u0720\u071e\3\2\2\2\u0721\u0725\7\u015f\2\2\u0722"+
		"\u0724\5\u0090I\2\u0723\u0722\3\2\2\2\u0724\u0727\3\2\2\2\u0725\u0723"+
		"\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u00d7\3\2\2\2\u0727\u0725\3\2\2\2\u0728"+
		"\u072a\7\u00e1\2\2\u0729\u072b\5\u0134\u009b\2\u072a\u0729\3\2\2\2\u072a"+
		"\u072b\3\2\2\2\u072b\u00d9\3\2\2\2\u072c\u072e\7\u0126\2\2\u072d\u072f"+
		"\7\u015c\2\2\u072e\u072d\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0730\3\2\2"+
		"\2\u0730\u0735\5\u0134\u009b\2\u0731\u0732\7\u014e\2\2\u0732\u0734\5\u0134"+
		"\u009b\2\u0733\u0731\3\2\2\2\u0734\u0737\3\2\2\2\u0735\u0733\3\2\2\2\u0735"+
		"\u0736\3\2\2\2\u0736\u0739\3\2\2\2\u0737\u0735\3\2\2\2\u0738\u073a\7\u015f"+
		"\2\2\u0739\u0738\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073b\3\2\2\2\u073b"+
		"\u073d\7\u0090\2\2\u073c\u073e\7\u015c\2\2\u073d\u073c\3\2\2\2\u073d\u073e"+
		"\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u0744\5\u015c\u00af\2\u0740\u0741\7"+
		"\u014e\2\2\u0741\u0743\5\u015c\u00af\2\u0742\u0740\3\2\2\2\u0743\u0746"+
		"\3\2\2\2\u0744\u0742\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0748\3\2\2\2\u0746"+
		"\u0744\3\2\2\2\u0747\u0749\7\u015f\2\2\u0748\u0747\3\2\2\2\u0748\u0749"+
		"\3\2\2\2\u0749\u00db\3\2\2\2\u074a\u074b\7m\2\2\u074b\u074c\7\u0164\2"+
		"\2\u074c\u074e\7\u0083\2\2\u074d\u074f\7\u015c\2\2\u074e\u074d\3\2\2\2"+
		"\u074e\u074f\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0752\5\u00e2r\2\u0751"+
		"\u0753\7\u015f\2\2\u0752\u0751\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0754"+
		"\3\2\2\2\u0754\u0755\7\u00a5\2\2\u0755\u0756\5\4\3\2\u0756\u0757\7_\2"+
		"\2\u0757\u0758\7\u00a5\2\2\u0758\u00dd\3\2\2\2\u0759\u075a\7m\2\2\u075a"+
		"\u075b\7\u0164\2\2\u075b\u075d\7\u0083\2\2\u075c\u075e\7\u00e3\2\2\u075d"+
		"\u075c\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0760\5\u0134"+
		"\u009b\2\u0760\u0761\7\u0151\2\2\u0761\u0764\5\u0134\u009b\2\u0762\u0763"+
		"\t\36\2\2\u0763\u0765\5\u0134\u009b\2\u0764\u0762\3\2\2\2\u0764\u0765"+
		"\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0767\7\u00a5\2\2\u0767\u0768\5\4\3"+
		"\2\u0768\u0769\7_\2\2\u0769\u076a\7\u00a5\2\2\u076a\u00df\3\2\2\2\u076b"+
		"\u0772\7\u016d\2\2\u076c\u076d\7\u0158\2\2\u076d\u076e\7\u0158\2\2\u076e"+
		"\u076f\7\u0164\2\2\u076f\u0770\7\u0156\2\2\u0770\u0772\7\u0156\2\2\u0771"+
		"\u076b\3\2\2\2\u0771\u076c\3\2\2\2\u0772\u00e1\3\2\2\2\u0773\u0775\5\u00e4"+
		"s\2\u0774\u0773\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0776\3\2\2\2\u0776"+
		"\u0777\5\u00eav\2\u0777\u00e3\3\2\2\2\u0778\u0779\7\u012e\2\2\u0779\u077e"+
		"\5\u00e6t\2\u077a\u077b\7\u014e\2\2\u077b\u077d\5\u00e6t\2\u077c\u077a"+
		"\3\2\2\2\u077d\u0780\3\2\2\2\u077e\u077c\3\2\2\2\u077e\u077f\3\2\2\2\u077f"+
		"\u00e5\3\2\2\2\u0780\u077e\3\2\2\2\u0781\u0783\5\u015c\u00af\2\u0782\u0784"+
		"\5\u00e8u\2\u0783\u0782\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u0785\3\2\2"+
		"\2\u0785\u0786\7\17\2\2\u0786\u0787\7\u015c\2\2\u0787\u0788\5\u00eav\2"+
		"\u0788\u0789\7\u015f\2\2\u0789\u00e7\3\2\2\2\u078a\u078b\7\u015c\2\2\u078b"+
		"\u0790\5\u015c\u00af\2\u078c\u078d\7\u014e\2\2\u078d\u078f\5\u015c\u00af"+
		"\2\u078e\u078c\3\2\2\2\u078f\u0792\3\2\2\2\u0790\u078e\3\2\2\2\u0790\u0791"+
		"\3\2\2\2\u0791\u0793\3\2\2\2\u0792\u0790\3\2\2\2\u0793\u0794\7\u015f\2"+
		"\2\u0794\u00e9\3\2\2\2\u0795\u079b\5\u00ecw\2\u0796\u0797\5\u00eex\2\u0797"+
		"\u0798\5\u00ecw\2\u0798\u079a\3\2\2\2\u0799\u0796\3\2\2\2\u079a\u079d"+
		"\3\2\2\2\u079b\u0799\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u00eb\3\2\2\2\u079d"+
		"\u079b\3\2\2\2\u079e\u07a4\5\u00f0y\2\u079f\u07a0\7\u015c\2\2\u07a0\u07a1"+
		"\5\u00eav\2\u07a1\u07a2\7\u015f\2\2\u07a2\u07a4\3\2\2\2\u07a3\u079e\3"+
		"\2\2\2\u07a3\u079f\3\2\2\2\u07a4\u00ed\3\2\2\2\u07a5\u07a7\7\u011f\2\2"+
		"\u07a6\u07a8\7\n\2\2\u07a7\u07a6\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07b2"+
		"\3\2\2\2\u07a9\u07ab\7b\2\2\u07aa\u07ac\7\n\2\2\u07ab\u07aa\3\2\2\2\u07ab"+
		"\u07ac\3\2\2\2\u07ac\u07b2\3\2\2\2\u07ad\u07af\7\u008e\2\2\u07ae\u07b0"+
		"\7\n\2\2\u07af\u07ae\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b2\3\2\2\2\u07b1"+
		"\u07a5\3\2\2\2\u07b1\u07a9\3\2\2\2\u07b1\u07ad\3\2\2\2\u07b2\u00ef\3\2"+
		"\2\2\u07b3\u07b4\t\37\2\2\u07b4\u07b6\5\u00f2z\2\u07b5\u07b7\5\u0100\u0081"+
		"\2\u07b6\u07b5\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7\u07b9\3\2\2\2\u07b8\u07ba"+
		"\5\u0102\u0082\2\u07b9\u07b8\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07bc\3"+
		"\2\2\2\u07bb\u07bd\5\u0116\u008c\2\u07bc\u07bb\3\2\2\2\u07bc\u07bd\3\2"+
		"\2\2\u07bd\u07bf\3\2\2\2\u07be\u07c0\5\u0118\u008d\2\u07bf\u07be\3\2\2"+
		"\2\u07bf\u07c0\3\2\2\2\u07c0\u07c3\3\2\2\2\u07c1\u07c4\5\u011a\u008e\2"+
		"\u07c2\u07c4\5\u011c\u008f\2\u07c3\u07c1\3\2\2\2\u07c3\u07c2\3\2\2\2\u07c3"+
		"\u07c4\3\2\2\2\u07c4\u07c6\3\2\2\2\u07c5\u07c7\5\u011e\u0090\2\u07c6\u07c5"+
		"\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7\u07c9\3\2\2\2\u07c8\u07ca\5\u0120\u0091"+
		"\2\u07c9\u07c8\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u00f1\3\2\2\2\u07cb\u07cd"+
		"\5\u00f6|\2\u07cc\u07cb\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07cf\3\2\2"+
		"\2\u07ce\u07d0\5\u00f8}\2\u07cf\u07ce\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0"+
		"\u07d1\3\2\2\2\u07d1\u07d6\5\u00fa~\2\u07d2\u07d3\7\u014e\2\2\u07d3\u07d5"+
		"\5\u00fa~\2\u07d4\u07d2\3\2\2\2\u07d5\u07d8\3\2\2\2\u07d6\u07d4\3\2\2"+
		"\2\u07d6\u07d7\3\2\2\2\u07d7\u00f3\3\2\2\2\u07d8\u07d6\3\2\2\2\u07d9\u07da"+
		"\3\2\2\2\u07da\u00f5\3\2\2\2\u07db\u07dc\t \2\2\u07dc\u00f7\3\2\2\2\u07dd"+
		"\u07de\7\u011a\2\2\u07de\u07df\5\u0134\u009b\2\u07df\u00f9\3\2\2\2\u07e0"+
		"\u07e1\5\u015c\u00af\2\u07e1\u07e2\7\u0152\2\2\u07e2\u07e4\3\2\2\2\u07e3"+
		"\u07e0\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07e7\5\u0134"+
		"\u009b\2\u07e6\u07e8\5\u00fc\177\2\u07e7\u07e6\3\2\2\2\u07e7\u07e8\3\2"+
		"\2\2\u07e8\u07eb\3\2\2\2\u07e9\u07eb\5\u00fe\u0080\2\u07ea\u07e3\3\2\2"+
		"\2\u07ea\u07e9\3\2\2\2\u07eb\u00fb\3\2\2\2\u07ec\u07ee\6\177\13\2\u07ed"+
		"\u07ef\7\17\2\2\u07ee\u07ed\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u07f0\3"+
		"\2\2\2\u07f0\u07f6\5\u015c\u00af\2\u07f1\u07f2\7\u015c\2\2\u07f2\u07f3"+
		"\7\u0118\2\2\u07f3\u07f4\7\u0165\2\2\u07f4\u07f6\7\u015f\2\2\u07f5\u07ec"+
		"\3\2\2\2\u07f5\u07f1\3\2\2\2\u07f6\u00fd\3\2\2\2\u07f7\u07f8\7\u0164\2"+
		"\2\u07f8\u07fa\7\6\2\2\u07f9\u07f7\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb"+
		"\3\2\2\2\u07fb\u07fc\7\u015a\2\2\u07fc\u00ff\3\2\2\2\u07fd\u07fe\7\u0090"+
		"\2\2\u07fe\u0803\5\u015c\u00af\2\u07ff\u0800\7\u014e\2\2\u0800\u0802\5"+
		"\u015c\u00af\2\u0801\u07ff\3\2\2\2\u0802\u0805\3\2\2\2\u0803\u0801\3\2"+
		"\2\2\u0803\u0804\3\2\2\2\u0804\u0101\3\2\2\2\u0805\u0803\3\2\2\2\u0806"+
		"\u0807\7q\2\2\u0807\u080b\5\u0104\u0083\2\u0808\u080a\5\u010a\u0086\2"+
		"\u0809\u0808\3\2\2\2\u080a\u080d\3\2\2\2\u080b\u0809\3\2\2\2\u080b\u080c"+
		"\3\2\2\2\u080c\u0103\3\2\2\2\u080d\u080b\3\2\2\2\u080e\u0812\5\u0106\u0084"+
		"\2\u080f\u0812\5\u0108\u0085\2\u0810\u0812\5\u010e\u0088\2\u0811\u080e"+
		"\3\2\2\2\u0811\u080f\3\2\2\2\u0811\u0810\3\2\2\2\u0812\u0105\3\2\2\2\u0813"+
		"\u0815\5\u0114\u008b\2\u0814\u0816\5\u0112\u008a\2\u0815\u0814\3\2\2\2"+
		"\u0815\u0816\3\2\2\2\u0816\u0107\3\2\2\2\u0817\u0818\7\u015c\2\2\u0818"+
		"\u0819\5\u00e2r\2\u0819\u081b\7\u015f\2\2\u081a\u081c\5\u0112\u008a\2"+
		"\u081b\u081a\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u0109\3\2\2\2\u081d\u081e"+
		"\7\u014e\2\2\u081e\u0825\5\u0104\u0083\2\u081f\u0820\5\u010c\u0087\2\u0820"+
		"\u0821\5\u0104\u0083\2\u0821\u0822\7\u00bf\2\2\u0822\u0823\5\u0124\u0093"+
		"\2\u0823\u0825\3\2\2\2\u0824\u081d\3\2\2\2\u0824\u081f\3\2\2\2\u0825\u010b"+
		"\3\2\2\2\u0826\u0828\7\u0087\2\2\u0827\u0826\3\2\2\2\u0827\u0828\3\2\2"+
		"\2\u0828\u0829\3\2\2\2\u0829\u0830\7\u0095\2\2\u082a\u082c\t!\2\2\u082b"+
		"\u082d\7\u00c5\2\2\u082c\u082b\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u082e"+
		"\3\2\2\2\u082e\u0830\7\u0095\2\2\u082f\u0827\3\2\2\2\u082f\u082a\3\2\2"+
		"\2\u0830\u010d\3\2\2\2\u0831\u0832\7\u0110\2\2\u0832\u0833\7\u015c\2\2"+
		"\u0833\u0834\7\u0126\2\2\u0834\u0839\5\u0110\u0089\2\u0835\u0836\7\u014e"+
		"\2\2\u0836\u0838\5\u0110\u0089\2\u0837\u0835\3\2\2\2\u0838\u083b\3\2\2"+
		"\2\u0839\u0837\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083c\3\2\2\2\u083b\u0839"+
		"\3\2\2\2\u083c\u083e\7\u015f\2\2\u083d\u083f\5\u0112\u008a\2\u083e\u083d"+
		"\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u010f\3\2\2\2\u0840\u084d\5\u0134\u009b"+
		"\2\u0841\u0842\7\u015c\2\2\u0842\u0847\5\u0134\u009b\2\u0843\u0844\7\u014e"+
		"\2\2\u0844\u0846\5\u0134\u009b\2\u0845\u0843\3\2\2\2\u0846\u0849\3\2\2"+
		"\2\u0847\u0845\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u084a\3\2\2\2\u0849\u0847"+
		"\3\2\2\2\u084a\u084b\7\u015f\2\2\u084b\u084d\3\2\2\2\u084c\u0840\3\2\2"+
		"\2\u084c\u0841\3\2\2\2\u084d\u0111\3\2\2\2\u084e\u0850\6\u008a\f\2\u084f"+
		"\u0851\7\17\2\2\u0850\u084f\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0852\3"+
		"\2\2\2\u0852\u085d\5\u015c\u00af\2\u0853\u0854\7\u015c\2\2\u0854\u0859"+
		"\7\u0164\2\2\u0855\u0856\7\u014e\2\2\u0856\u0858\7\u0164\2\2\u0857\u0855"+
		"\3\2\2\2\u0858\u085b\3\2\2\2\u0859\u0857\3\2\2\2\u0859\u085a\3\2\2\2\u085a"+
		"\u085c\3\2\2\2\u085b\u0859\3\2\2\2\u085c\u085e\7\u015f\2\2\u085d\u0853"+
		"\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u0113\3\2\2\2\u085f\u0860\5\u015c\u00af"+
		"\2\u0860\u0115\3\2\2\2\u0861\u0862\7\u012d\2\2\u0862\u0863\5\u0124\u0093"+
		"\2\u0863\u0117\3\2\2\2\u0864\u0865\7x\2\2\u0865\u0866\7\36\2\2\u0866\u086b"+
		"\5\u0134\u009b\2\u0867\u0868\7\u014e\2\2\u0868\u086a\5\u0134\u009b\2\u0869"+
		"\u0867\3\2\2\2\u086a\u086d\3\2\2\2\u086b\u0869\3\2\2\2\u086b\u086c\3\2"+
		"\2\2\u086c\u0119\3\2\2\2\u086d\u086b\3\2\2\2\u086e\u086f\7{\2\2\u086f"+
		"\u0870\5\u0124\u0093\2\u0870\u011b\3\2\2\2\u0871\u0872\7\u00d4\2\2\u0872"+
		"\u0873\5\u0124\u0093\2\u0873\u011d\3\2\2\2\u0874\u0875\7\u00c3\2\2\u0875"+
		"\u0876\7\36\2\2\u0876\u0878\5\u0134\u009b\2\u0877\u0879\t\13\2\2\u0878"+
		"\u0877\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u0881\3\2\2\2\u087a\u087b\7\u014e"+
		"\2\2\u087b\u087d\5\u0134\u009b\2\u087c\u087e\t\13\2\2\u087d\u087c\3\2"+
		"\2\2\u087d\u087e\3\2\2\2\u087e\u0880\3\2\2\2\u087f\u087a\3\2\2\2\u0880"+
		"\u0883\3\2\2\2\u0881\u087f\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u011f\3\2"+
		"\2\2\u0883\u0881\3\2\2\2\u0884\u0886\5\u0122\u0092\2\u0885\u0884\3\2\2"+
		"\2\u0886\u0887\3\2\2\2\u0887\u0885\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u0121"+
		"\3\2\2\2\u0889\u088a\7\u009d\2\2\u088a\u0895\5\u0134\u009b\2\u088b\u088c"+
		"\7\u012e\2\2\u088c\u0892\t\"\2\2\u088d\u088e\7\u0123\2\2\u088e\u088f\7"+
		"\f\2\2\u088f\u0890\7\u0096\2\2\u0890\u0891\t#\2\2\u0891\u0893\7\u00a1"+
		"\2\2\u0892\u088d\3\2\2\2\u0892\u0893\3\2\2\2\u0893\u0895\3\2\2\2\u0894"+
		"\u0889\3\2\2\2\u0894\u088b\3\2\2\2\u0895\u0123\3\2\2\2\u0896\u0898\b\u0093"+
		"\1\2\u0897\u0899\7\u00b8\2\2\u0898\u0897\3\2\2\2\u0898\u0899\3\2\2\2\u0899"+
		"\u089a\3\2\2\2\u089a\u089b\7\u015c\2\2\u089b\u089c\5\u0124\u0093\2\u089c"+
		"\u089d\7\u015f\2\2\u089d\u08a0\3\2\2\2\u089e\u08a0\5\u0126\u0094\2\u089f"+
		"\u0896\3\2\2\2\u089f\u089e\3\2\2\2\u08a0\u08a7\3\2\2\2\u08a1\u08a2\f\4"+
		"\2\2\u08a2\u08a3\5\u0130\u0099\2\u08a3\u08a4\5\u0124\u0093\5\u08a4\u08a6"+
		"\3\2\2\2\u08a5\u08a1\3\2\2\2\u08a6\u08a9\3\2\2\2\u08a7\u08a5\3\2\2\2\u08a7"+
		"\u08a8\3\2\2\2\u08a8\u0125\3\2\2\2\u08a9\u08a7\3\2\2\2\u08aa\u08ae\5\u0128"+
		"\u0095\2\u08ab\u08ae\5\u012e\u0098\2\u08ac\u08ae\5\u0134\u009b\2\u08ad"+
		"\u08aa\3\2\2\2\u08ad\u08ab\3\2\2\2\u08ad\u08ac\3\2\2\2\u08ae\u0127\3\2"+
		"\2\2\u08af\u08b0\5\u0134\u009b\2\u08b0\u08b2\7\u0092\2\2\u08b1\u08b3\7"+
		"\u00b8\2\2\u08b2\u08b1\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b4\3\2\2\2"+
		"\u08b4\u08b5\7\u00ba\2\2\u08b5\u08cb\3\2\2\2\u08b6\u08b7\5\u0134\u009b"+
		"\2\u08b7\u08b8\7\u0092\2\2\u08b8\u08b9\5\u0164\u00b3\2\u08b9\u08cb\3\2"+
		"\2\2\u08ba\u08bb\5\u0134\u009b\2\u08bb\u08bc\7\26\2\2\u08bc\u08bd\5\u0134"+
		"\u009b\2\u08bd\u08be\7\f\2\2\u08be\u08bf\5\u0134\u009b\2\u08bf\u08cb\3"+
		"\2\2\2\u08c0\u08c2\7\u00b8\2\2\u08c1\u08c0\3\2\2\2\u08c1\u08c2\3\2\2\2"+
		"\u08c2\u08c3\3\2\2\2\u08c3\u08c4\7e\2\2\u08c4\u08c5\7\u015c\2\2\u08c5"+
		"\u08c6\5\u00e2r\2\u08c6\u08c7\7\u015f\2\2\u08c7\u08cb\3\2\2\2\u08c8\u08cb"+
		"\5\u012a\u0096\2\u08c9\u08cb\5\u012c\u0097\2\u08ca\u08af\3\2\2\2\u08ca"+
		"\u08b6\3\2\2\2\u08ca\u08ba\3\2\2\2\u08ca\u08c1\3\2\2\2\u08ca\u08c8\3\2"+
		"\2\2\u08ca\u08c9\3\2\2\2\u08cb\u0129\3\2\2\2\u08cc\u08ce\5\u0134\u009b"+
		"\2\u08cd\u08cf\7\u00b8\2\2\u08ce\u08cd\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf"+
		"\u08d0\3\2\2\2\u08d0\u08d1\7\u0083\2\2\u08d1\u08db\7\u015c\2\2\u08d2\u08d7"+
		"\5\u0134\u009b\2\u08d3\u08d4\7\u014e\2\2\u08d4\u08d6\5\u0134\u009b\2\u08d5"+
		"\u08d3\3\2\2\2\u08d6\u08d9\3\2\2\2\u08d7\u08d5\3\2\2\2\u08d7\u08d8\3\2"+
		"\2\2\u08d8\u08dc\3\2\2\2\u08d9\u08d7\3\2\2\2\u08da\u08dc\5\u00e2r\2\u08db"+
		"\u08d2\3\2\2\2\u08db\u08da\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08de\7\u015f"+
		"\2\2\u08de\u012b\3\2\2\2\u08df\u08e0\7\u015c\2\2\u08e0\u08e5\5\u0134\u009b"+
		"\2\u08e1\u08e2\7\u014e\2\2\u08e2\u08e4\5\u0134\u009b\2\u08e3\u08e1\3\2"+
		"\2\2\u08e4\u08e7\3\2\2\2\u08e5\u08e3\3";
	private static final String _serializedATNSegment1 =
		"\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e8\3\2\2\2\u08e7\u08e5\3\2\2\2\u08e8"+
		"\u08ea\7\u015f\2\2\u08e9\u08eb\7\u00b8\2\2\u08ea\u08e9\3\2\2\2\u08ea\u08eb"+
		"\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08ed\7\u0083\2\2\u08ed\u08ee\7\u015c"+
		"\2\2\u08ee\u08ef\5\u00e2r\2\u08ef\u08f0\7\u015f\2\2\u08f0\u012d\3\2\2"+
		"\2\u08f1\u08f2\5\u0134\u009b\2\u08f2\u08f3\5\u0132\u009a\2\u08f3\u08f4"+
		"\5\u0134\u009b\2\u08f4\u012f\3\2\2\2\u08f5\u08f6\t$\2\2\u08f6\u0131\3"+
		"\2\2\2\u08f7\u0904\7\u0152\2\2\u08f8\u0904\7\u0153\2\2\u08f9\u0904\7\u0154"+
		"\2\2\u08fa\u0904\7\u0155\2\2\u08fb\u0904\7\u0158\2\2\u08fc\u0904\7\u0159"+
		"\2\2\u08fd\u0904\7\u0156\2\2\u08fe\u0904\7\u0157\2\2\u08ff\u0901\7\u00b8"+
		"\2\2\u0900\u08ff\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0902\3\2\2\2\u0902"+
		"\u0904\t%\2\2\u0903\u08f7\3\2\2\2\u0903\u08f8\3\2\2\2\u0903\u08f9\3\2"+
		"\2\2\u0903\u08fa\3\2\2\2\u0903\u08fb\3\2\2\2\u0903\u08fc\3\2\2\2\u0903"+
		"\u08fd\3\2\2\2\u0903\u08fe\3\2\2\2\u0903\u0900\3\2\2\2\u0904\u0133\3\2"+
		"\2\2\u0905\u0906\b\u009b\1\2\u0906\u0907\7\u015c\2\2\u0907\u0908\5\u00e2"+
		"r\2\u0908\u0909\7\u015f\2\2\u0909\u0917\3\2\2\2\u090a\u090b\7\u015c\2"+
		"\2\u090b\u090c\5\u0134\u009b\2\u090c\u090d\7\u015f\2\2\u090d\u0917\3\2"+
		"\2\2\u090e\u0917\5\u0138\u009d\2\u090f\u0917\5\u013c\u009f\2\u0910\u0917"+
		"\5\u0140\u00a1\2\u0911\u0917\5\u0146\u00a4\2\u0912\u0917\5\u0148\u00a5"+
		"\2\u0913\u0917\5\u0150\u00a9\2\u0914\u0917\5\u0152\u00aa\2\u0915\u0917"+
		"\5\u0136\u009c\2\u0916\u0905\3\2\2\2\u0916\u090a\3\2\2\2\u0916\u090e\3"+
		"\2\2\2\u0916\u090f\3\2\2\2\u0916\u0910\3\2\2\2\u0916\u0911\3\2\2\2\u0916"+
		"\u0912\3\2\2\2\u0916\u0913\3\2\2\2\u0916\u0914\3\2\2\2\u0916\u0915\3\2"+
		"\2\2\u0917\u0928\3\2\2\2\u0918\u0919\f\20\2\2\u0919\u091a\7\u015a\2\2"+
		"\u091a\u0927\5\u0134\u009b\21\u091b\u091c\f\17\2\2\u091c\u091d\7\u0150"+
		"\2\2\u091d\u0927\5\u0134\u009b\20\u091e\u091f\f\16\2\2\u091f\u0920\7\u014c"+
		"\2\2\u0920\u0927\5\u0134\u009b\17\u0921\u0922\f\r\2\2\u0922\u0923\7\u0162"+
		"\2\2\u0923\u0927\5\u0134\u009b\16\u0924\u0925\f\21\2\2\u0925\u0927\5\u013a"+
		"\u009e\2\u0926\u0918\3\2\2\2\u0926\u091b\3\2\2\2\u0926\u091e\3\2\2\2\u0926"+
		"\u0921\3\2\2\2\u0926\u0924\3\2\2\2\u0927\u092a\3\2\2\2\u0928\u0926\3\2"+
		"\2\2\u0928\u0929\3\2\2\2\u0929\u0135\3\2\2\2\u092a\u0928\3\2\2\2\u092b"+
		"\u0934\5\u0158\u00ad\2\u092c\u0934\5\u015a\u00ae\2\u092d\u0934\5\u0164"+
		"\u00b3\2\u092e\u0934\5\u015c\u00af\2\u092f\u0934\5\u015e\u00b0\2\u0930"+
		"\u0934\5\u0162\u00b2\2\u0931\u0934\5\u0160\u00b1\2\u0932\u0934\5\u0166"+
		"\u00b4\2\u0933\u092b\3\2\2\2\u0933\u092c\3\2\2\2\u0933\u092d\3\2\2\2\u0933"+
		"\u092e\3\2\2\2\u0933\u092f\3\2\2\2\u0933\u0930\3\2\2\2\u0933\u0931\3\2"+
		"\2\2\u0933\u0932\3\2\2\2\u0934\u0137\3\2\2\2\u0935\u0936\7\u008f\2\2\u0936"+
		"\u0937\5\u0134\u009b\2\u0937\u0938\5\u013a\u009e\2\u0938\u0139\3\2\2\2"+
		"\u0939\u093a\t&\2\2\u093a\u013b\3\2\2\2\u093b\u093c\5\u013e\u00a0\2\u093c"+
		"\u093d\t\'\2\2\u093d\u0942\5\u013e\u00a0\2\u093e\u093f\t\'\2\2\u093f\u0941"+
		"\5\u013e\u00a0\2\u0940\u093e\3\2\2\2\u0941\u0944\3\2\2\2\u0942\u0940\3"+
		"\2\2\2\u0942\u0943\3\2\2\2\u0943\u013d\3\2\2\2\u0944\u0942\3\2\2\2\u0945"+
		"\u0946\7\u015c\2\2\u0946\u0947\5\u0134\u009b\2\u0947\u0948\7\u015f\2\2"+
		"\u0948\u094f\3\2\2\2\u0949\u094f\5\u0140\u00a1\2\u094a\u094f\5\u0148\u00a5"+
		"\2\u094b\u094f\5\u0150\u00a9\2\u094c\u094f\5\u0152\u00aa\2\u094d\u094f"+
		"\5\u0136\u009c\2\u094e\u0945\3\2\2\2\u094e\u0949\3\2\2\2\u094e\u094a\3"+
		"\2\2\2\u094e\u094b\3\2\2\2\u094e\u094c\3\2\2\2\u094e\u094d\3\2\2\2\u094f"+
		"\u013f\3\2\2\2\u0950\u0953\5\u0142\u00a2\2\u0951\u0953\5\u0144\u00a3\2"+
		"\u0952\u0950\3\2\2\2\u0952\u0951\3\2\2\2\u0953\u0141\3\2\2\2\u0954\u0955"+
		"\7#\2\2\u0955\u095b\5\u0134\u009b\2\u0956\u0957\7\u012c\2\2\u0957\u0958"+
		"\5\u0134\u009b\2\u0958\u0959\7\u0115\2\2\u0959\u095a\5\u0134\u009b\2\u095a"+
		"\u095c\3\2\2\2\u095b\u0956\3\2\2\2\u095c\u095d\3\2\2\2\u095d\u095b\3\2"+
		"\2\2\u095d\u095e\3\2\2\2\u095e\u0961\3\2\2\2\u095f\u0960\7[\2\2\u0960"+
		"\u0962\5\u0134\u009b\2\u0961\u095f\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u0963"+
		"\3\2\2\2\u0963\u0964\7_\2\2\u0964\u0143\3\2\2\2\u0965\u096b\7#\2\2\u0966"+
		"\u0967\7\u012c\2\2\u0967\u0968\5\u0124\u0093\2\u0968\u0969\7\u0115\2\2"+
		"\u0969\u096a\5\u0134\u009b\2\u096a\u096c\3\2\2\2\u096b\u0966\3\2\2\2\u096c"+
		"\u096d\3\2\2\2\u096d\u096b\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u0971\3\2"+
		"\2\2\u096f\u0970\7[\2\2\u0970\u0972\5\u0134\u009b\2\u0971\u096f\3\2\2"+
		"\2\u0971\u0972\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u0974\7_\2\2\u0974\u0145"+
		"\3\2\2\2\u0975\u0976\5\u015c\u00af\2\u0976\u0977\7\5\2\2\u0977\u0978\t"+
		"(\2\2\u0978\u0147\3\2\2\2\u0979\u097a\7\23\2\2\u097a\u097c\7\u015c\2\2"+
		"\u097b\u097d\5\u014a\u00a6\2\u097c\u097b\3\2\2\2\u097c\u097d\3\2\2\2\u097d"+
		"\u097e\3\2\2\2\u097e\u097f\5\u0134\u009b\2\u097f\u0981\7\u015f\2\2\u0980"+
		"\u0982\5\u014c\u00a7\2\u0981\u0980\3\2\2\2\u0981\u0982\3\2\2\2\u0982\u0a12"+
		"\3\2\2\2\u0983\u0984\78\2\2\u0984\u098a\7\u015c\2\2\u0985\u0987\5\u014a"+
		"\u00a6\2\u0986\u0985\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u0988\3\2\2\2\u0988"+
		"\u098b\5\u0134\u009b\2\u0989\u098b\7\u015a\2\2\u098a\u0986\3\2\2\2\u098a"+
		"\u0989\3\2\2\2\u098b\u098c\3\2\2\2\u098c\u098e\7\u015f\2\2\u098d\u098f"+
		"\5\u014c\u00a7\2\u098e\u098d\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u0a12\3"+
		"\2\2\2\u0990\u0991\79\2\2\u0991\u0997\7\u015c\2\2\u0992\u0994\5\u014a"+
		"\u00a6\2\u0993\u0992\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0995\3\2\2\2\u0995"+
		"\u0998\5\u0134\u009b\2\u0996\u0998\7\u015a\2\2\u0997\u0993\3\2\2\2\u0997"+
		"\u0996\3\2\2\2\u0998\u0999\3\2\2\2\u0999\u099b\7\u015f\2\2\u099a\u099c"+
		"\5\u014c\u00a7\2\u099b\u099a\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u0a12\3"+
		"\2\2\2\u099d\u099e\7\u0135\2\2\u099e\u099f\7\u015c\2\2\u099f\u09a0\7\u015f"+
		"\2\2\u09a0\u0a12\5\u014c\u00a7\2\u09a1\u09a2\7\u0139\2\2\u09a2\u09a3\7"+
		"\u015c\2\2\u09a3\u09a4\7\u015f\2\2\u09a4\u0a12\5\u014c\u00a7\2\u09a5\u09a6"+
		"\7\u013a\2\2\u09a6\u09a7\7\u015c\2\2\u09a7\u09a8\5\u0134\u009b\2\u09a8"+
		"\u09a9\7\u015f\2\2\u09a9\u09aa\5\u014c\u00a7\2\u09aa\u0a12\3\2\2\2\u09ab"+
		"\u09ac\7\u013b\2\2\u09ac\u09ad\7\u015c\2\2\u09ad\u09b4\5\u0134\u009b\2"+
		"\u09ae\u09af\7\u014e\2\2\u09af\u09b2\5\u0134\u009b\2\u09b0\u09b1\7\u014e"+
		"\2\2\u09b1\u09b3\5\u0134\u009b\2\u09b2\u09b0\3\2\2\2\u09b2\u09b3\3\2\2"+
		"\2\u09b3\u09b5\3\2\2\2\u09b4\u09ae\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b6"+
		"\3\2\2\2\u09b6\u09b7\7\u015f\2\2\u09b7\u09b8\5\u014c\u00a7\2\u09b8\u0a12"+
		"\3\2\2\2\u09b9\u09ba\7\u013c\2\2\u09ba\u09bb\7\u015c\2\2\u09bb\u09bc\5"+
		"\u0134\u009b\2\u09bc\u09bd\7\u015f\2\2\u09bd\u09be\5\u014c\u00a7\2\u09be"+
		"\u0a12\3\2\2\2\u09bf\u09c0\7\u013d\2\2\u09c0\u09c1\7\u015c\2\2\u09c1\u09c8"+
		"\5\u0134\u009b\2\u09c2\u09c3\7\u014e\2\2\u09c3\u09c6\5\u0134\u009b\2\u09c4"+
		"\u09c5\7\u014e\2\2\u09c5\u09c7\5\u0134\u009b\2\u09c6\u09c4\3\2\2\2\u09c6"+
		"\u09c7\3\2\2\2\u09c7\u09c9\3\2\2\2\u09c8\u09c2\3\2\2\2\u09c8\u09c9\3\2"+
		"\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09cb\7\u015f\2\2\u09cb\u09cc\5\u014c\u00a7"+
		"\2\u09cc\u0a12\3\2\2\2\u09cd\u09ce\7\u00a8\2\2\u09ce\u09d0\7\u015c\2\2"+
		"\u09cf\u09d1\5\u014a\u00a6\2\u09d0\u09cf\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1"+
		"\u09d2\3\2\2\2\u09d2\u09d3\5\u0134\u009b\2\u09d3\u09d5\7\u015f\2\2\u09d4"+
		"\u09d6\5\u014c\u00a7\2\u09d5\u09d4\3\2\2\2\u09d5\u09d6\3\2\2\2\u09d6\u0a12"+
		"\3\2\2\2\u09d7\u09d8\7\u00ae\2\2\u09d8\u09da\7\u015c\2\2\u09d9\u09db\5"+
		"\u014a\u00a6\2\u09da\u09d9\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dc\3\2"+
		"\2\2\u09dc\u09dd\5\u0134\u009b\2\u09dd\u09df\7\u015f\2\2\u09de\u09e0\5"+
		"\u014c\u00a7\2\u09df\u09de\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u0a12\3\2"+
		"\2\2\u09e1\u09e2\7\u0146\2\2\u09e2\u09e3\7\u015c\2\2\u09e3\u09e4\7\u015f"+
		"\2\2\u09e4\u0a12\5\u014c\u00a7\2\u09e5\u09e6\7\u0147\2\2\u09e6\u09e7\7"+
		"\u015c\2\2\u09e7\u09e8\7\u015f\2\2\u09e8\u0a12\5\u014c\u00a7\2\u09e9\u09ea"+
		"\7\u0148\2\2\u09ea\u09ec\7\u015c\2\2\u09eb\u09ed\5\u014a\u00a6\2\u09ec"+
		"\u09eb\3\2\2\2\u09ec\u09ed\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u09ef\5\u0134"+
		"\u009b\2\u09ef\u09f1\7\u015f\2\2\u09f0\u09f2\5\u014c\u00a7\2\u09f1\u09f0"+
		"\3\2\2\2\u09f1\u09f2\3\2\2\2\u09f2\u0a12\3\2\2\2\u09f3\u09f4\7\u010d\2"+
		"\2\u09f4\u09f6\7\u015c\2\2\u09f5\u09f7\5\u014a\u00a6\2\u09f6\u09f5\3\2"+
		"\2\2\u09f6\u09f7\3\2\2\2\u09f7\u09f8\3\2\2\2\u09f8\u09f9\5\u0134\u009b"+
		"\2\u09f9\u09fb\7\u015f\2\2\u09fa\u09fc\5\u014c\u00a7\2\u09fb\u09fa\3\2"+
		"\2\2\u09fb\u09fc\3\2\2\2\u09fc\u0a12\3\2\2\2\u09fd\u09fe\7\u0127\2\2\u09fe"+
		"\u0a00\7\u015c\2\2\u09ff\u0a01\5\u014a\u00a6\2\u0a00\u09ff\3\2\2\2\u0a00"+
		"\u0a01\3\2\2\2\u0a01\u0a02\3\2\2\2\u0a02\u0a03\5\u0134\u009b\2\u0a03\u0a05"+
		"\7\u015f\2\2\u0a04\u0a06\5\u014c\u00a7\2\u0a05\u0a04\3\2\2\2\u0a05\u0a06"+
		"\3\2\2\2\u0a06\u0a12\3\2\2\2\u0a07\u0a08\7\u014a\2\2\u0a08\u0a0a\7\u015c"+
		"\2\2\u0a09\u0a0b\5\u014a\u00a6\2\u0a0a\u0a09\3\2\2\2\u0a0a\u0a0b\3\2\2"+
		"\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0d\5\u0134\u009b\2\u0a0d\u0a0f\7\u015f"+
		"\2\2\u0a0e\u0a10\5\u014c\u00a7\2\u0a0f\u0a0e\3\2\2\2\u0a0f\u0a10\3\2\2"+
		"\2\u0a10\u0a12\3\2\2\2\u0a11\u0979\3\2\2\2\u0a11\u0983\3\2\2\2\u0a11\u0990"+
		"\3\2\2\2\u0a11\u099d\3\2\2\2\u0a11\u09a1\3\2\2\2\u0a11\u09a5\3\2\2\2\u0a11"+
		"\u09ab\3\2\2\2\u0a11\u09b9\3\2\2\2\u0a11\u09bf\3\2\2\2\u0a11\u09cd\3\2"+
		"\2\2\u0a11\u09d7\3\2\2\2\u0a11\u09e1\3\2\2\2\u0a11\u09e5\3\2\2\2\u0a11"+
		"\u09e9\3\2\2\2\u0a11\u09f3\3\2\2\2\u0a11\u09fd\3\2\2\2\u0a11\u0a07\3\2"+
		"\2\2\u0a12\u0149\3\2\2\2\u0a13\u0a14\t \2\2\u0a14\u014b\3\2\2\2\u0a15"+
		"\u0a16\7\u00c6\2\2\u0a16\u0a18\7\u015c\2\2\u0a17\u0a19\5\u014e\u00a8\2"+
		"\u0a18\u0a17\3\2\2\2\u0a18\u0a19\3\2\2\2\u0a19\u0a1b\3\2\2\2\u0a1a\u0a1c"+
		"\5\u011e\u0090\2\u0a1b\u0a1a\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c\u0a1d\3"+
		"\2\2\2\u0a1d\u0a1e\7\u015f\2\2\u0a1e\u014d\3\2\2\2\u0a1f\u0a20\7\u00ca"+
		"\2\2\u0a20\u0a21\7\36\2\2\u0a21\u0a26\5\u0134\u009b\2\u0a22\u0a23\7\u014e"+
		"\2\2\u0a23\u0a25\5\u0134\u009b\2\u0a24\u0a22\3\2\2\2\u0a25\u0a28\3\2\2"+
		"\2\u0a26\u0a24\3\2\2\2\u0a26\u0a27\3\2\2\2\u0a27\u014f\3\2\2\2\u0a28\u0a26"+
		"\3\2\2\2\u0a29\u0af2\7\u0134\2\2\u0a2a\u0a2b\7%\2\2\u0a2b\u0a2c\7\u015c"+
		"\2\2\u0a2c\u0a2d\5\u0134\u009b\2\u0a2d\u0a2e\7\17\2\2\u0a2e\u0a30\5\u0094"+
		"K\2\u0a2f\u0a31\5\u0096L\2\u0a30\u0a2f\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31"+
		"\u0a32\3\2\2\2\u0a32\u0a33\7\u015f\2\2\u0a33\u0af2\3\2\2\2\u0a34\u0a35"+
		"\78\2\2\u0a35\u0a38\7\u015c\2\2\u0a36\u0a39\5\u0134\u009b\2\u0a37\u0a39"+
		"\7\u015a\2\2\u0a38\u0a36\3\2\2\2\u0a38\u0a37\3\2\2\2\u0a39\u0a3a\3\2\2"+
		"\2\u0a3a\u0af2\7\u015f\2\2\u0a3b\u0af2\7\u0136\2\2\u0a3c\u0a3d\7>\2\2"+
		"\u0a3d\u0af2\7C\2\2\u0a3e\u0a42\7\u0137\2\2\u0a3f\u0a40\7>\2\2\u0a40\u0a42"+
		"\7\u0116\2\2\u0a41\u0a3e\3\2\2\2\u0a41\u0a3f\3\2\2\2\u0a42\u0a47\3\2\2"+
		"\2\u0a43\u0a44\7\u015c\2\2\u0a44\u0a45\5\u0134\u009b\2\u0a45\u0a46\7\u015f"+
		"\2\2\u0a46\u0a48\3\2\2\2\u0a47\u0a43\3\2\2\2\u0a47\u0a48\3\2\2\2\u0a48"+
		"\u0af2\3\2\2\2\u0a49\u0af2\7\u0138\2\2\u0a4a\u0a4b\7>\2\2\u0a4b\u0af2"+
		"\7\u014b\2\2\u0a4c\u0a4d\7\u013e\2\2\u0a4d\u0a4e\7\u015c\2\2\u0a4e\u0a5b"+
		"\5\u0134\u009b\2\u0a4f\u0a50\7\u014e\2\2\u0a50\u0a58\5\u0134\u009b\2\u0a51"+
		"\u0a52\7\u014e\2\2\u0a52\u0a53\5\u0134\u009b\2\u0a53\u0a54\7\u0152\2\2"+
		"\u0a54\u0a55\5\u0134\u009b\2\u0a55\u0a57\3\2\2\2\u0a56\u0a51\3\2\2\2\u0a57"+
		"\u0a5a\3\2\2\2\u0a58\u0a56\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59\u0a5c\3\2"+
		"\2\2\u0a5a\u0a58\3\2\2\2\u0a5b\u0a4f\3\2\2\2\u0a5b\u0a5c\3\2\2\2\u0a5c"+
		"\u0a5d\3\2\2\2\u0a5d\u0a5e\7\u015f\2\2\u0a5e\u0af2\3\2\2\2\u0a5f\u0a60"+
		"\7\u013f\2\2\u0a60\u0a61\7\u015c\2\2\u0a61\u0a6e\5\u0134\u009b\2\u0a62"+
		"\u0a63\7\u014e\2\2\u0a63\u0a6b\5\u0134\u009b\2\u0a64\u0a65\7\u014e\2\2"+
		"\u0a65\u0a66\5\u0134\u009b\2\u0a66\u0a67\7\u0152\2\2\u0a67\u0a68\5\u0134"+
		"\u009b\2\u0a68\u0a6a\3\2\2\2\u0a69\u0a64\3\2\2\2\u0a6a\u0a6d\3\2\2\2\u0a6b"+
		"\u0a69\3\2\2\2\u0a6b\u0a6c\3\2\2\2\u0a6c\u0a6f\3\2\2\2\u0a6d\u0a6b\3\2"+
		"\2\2\u0a6e\u0a62\3\2\2\2\u0a6e\u0a6f\3\2\2\2\u0a6f\u0a70\3\2\2\2\u0a70"+
		"\u0a71\7\u015f\2\2\u0a71\u0af2\3\2\2\2\u0a72\u0a73\7\u0140\2\2\u0a73\u0a74"+
		"\7\u015c\2\2\u0a74\u0a81\5\u0134\u009b\2\u0a75\u0a76\7\u014e\2\2\u0a76"+
		"\u0a7e\5\u0134\u009b\2\u0a77\u0a78\7\u014e\2\2\u0a78\u0a79\5\u0134\u009b"+
		"\2\u0a79\u0a7a\7\u0152\2\2\u0a7a\u0a7b\5\u0134\u009b\2\u0a7b\u0a7d\3\2"+
		"\2\2\u0a7c\u0a77\3\2\2\2\u0a7d\u0a80\3\2\2\2\u0a7e\u0a7c\3\2\2\2\u0a7e"+
		"\u0a7f\3\2\2\2\u0a7f\u0a82\3\2\2\2\u0a80\u0a7e\3\2\2\2\u0a81\u0a75\3\2"+
		"\2\2\u0a81\u0a82\3\2\2\2\u0a82\u0a83\3\2\2\2\u0a83\u0a84\7\u015f\2\2\u0a84"+
		"\u0af2\3\2\2\2\u0a85\u0a86\7\u0141\2\2\u0a86\u0a87\7\u015c\2\2\u0a87\u0a94"+
		"\5\u0134\u009b\2\u0a88\u0a89\7\u014e\2\2\u0a89\u0a91\5\u0134\u009b\2\u0a8a"+
		"\u0a8b\7\u014e\2\2\u0a8b\u0a8c\5\u0134\u009b\2\u0a8c\u0a8d\7\u0152\2\2"+
		"\u0a8d\u0a8e\5\u0134\u009b\2\u0a8e\u0a90\3\2\2\2\u0a8f\u0a8a\3\2\2\2\u0a90"+
		"\u0a93\3\2\2\2\u0a91\u0a8f\3\2\2\2\u0a91\u0a92\3\2\2\2\u0a92\u0a95\3\2"+
		"\2\2\u0a93\u0a91\3\2\2\2\u0a94\u0a88\3\2\2\2\u0a94\u0a95\3\2\2\2\u0a95"+
		"\u0a96\3\2\2\2\u0a96\u0a97\7\u015f\2\2\u0a97\u0af2\3\2\2\2\u0a98\u0a99"+
		"\7\u0142\2\2\u0a99\u0a9a\7\u015c\2\2\u0a9a\u0aa7\5\u0134\u009b\2\u0a9b"+
		"\u0a9c\7\u014e\2\2\u0a9c\u0aa4\5\u0134\u009b\2\u0a9d\u0a9e\7\u014e\2\2"+
		"\u0a9e\u0a9f\5\u0134\u009b\2\u0a9f\u0aa0\7\u0152\2\2\u0aa0\u0aa1\5\u0134"+
		"\u009b\2\u0aa1\u0aa3\3\2\2\2\u0aa2\u0a9d\3\2\2\2\u0aa3\u0aa6\3\2\2\2\u0aa4"+
		"\u0aa2\3\2\2\2\u0aa4\u0aa5\3\2\2\2\u0aa5\u0aa8\3\2\2\2\u0aa6\u0aa4\3\2"+
		"\2\2\u0aa7\u0a9b\3\2\2\2\u0aa7\u0aa8\3\2\2\2\u0aa8\u0aa9\3\2\2\2\u0aa9"+
		"\u0aaa\7\u015f\2\2\u0aaa\u0af2\3\2\2\2\u0aab\u0aac\7\u0143\2\2\u0aac\u0aad"+
		"\7\u015c\2\2\u0aad\u0aba\5\u0134\u009b\2\u0aae\u0aaf\7\u014e\2\2\u0aaf"+
		"\u0ab7\5\u0134\u009b\2\u0ab0\u0ab1\7\u014e\2\2\u0ab1\u0ab2\5\u0134\u009b"+
		"\2\u0ab2\u0ab3\7\u0152\2\2\u0ab3\u0ab4\5\u0134\u009b\2\u0ab4\u0ab6\3\2"+
		"\2\2\u0ab5\u0ab0\3\2\2\2\u0ab6\u0ab9\3\2\2\2\u0ab7\u0ab5\3\2\2\2\u0ab7"+
		"\u0ab8\3\2\2\2\u0ab8\u0abb\3\2\2\2\u0ab9\u0ab7\3\2\2\2\u0aba\u0aae\3\2"+
		"\2\2\u0aba\u0abb\3\2\2\2\u0abb\u0abc\3\2\2\2\u0abc\u0abd\7\u015f\2\2\u0abd"+
		"\u0af2\3\2\2\2\u0abe\u0abf\7\u0144\2\2\u0abf\u0ac0\7\u015c\2\2\u0ac0\u0ac8"+
		"\5\u0134\u009b\2\u0ac1\u0ac2\7\u014e\2\2\u0ac2\u0ac3\5\u0134\u009b\2\u0ac3"+
		"\u0ac4\7\u0152\2\2\u0ac4\u0ac5\5\u0134\u009b\2\u0ac5\u0ac7\3\2\2\2\u0ac6"+
		"\u0ac1\3\2\2\2\u0ac7\u0aca\3\2\2\2\u0ac8\u0ac6\3\2\2\2\u0ac8\u0ac9\3\2"+
		"\2\2\u0ac9\u0acb\3\2\2\2\u0aca\u0ac8\3\2\2\2\u0acb\u0acc\7\u015f\2\2\u0acc"+
		"\u0af2\3\2\2\2\u0acd\u0ace\7\u0145\2\2\u0ace\u0acf\7\u015c\2\2\u0acf\u0ad5"+
		"\5\u0134\u009b\2\u0ad0\u0ad1\7\u014e\2\2\u0ad1\u0ad2\5\u0134\u009b\2\u0ad2"+
		"\u0ad3\7\u0152\2\2\u0ad3\u0ad4\5\u0134\u009b\2\u0ad4\u0ad6\3\2\2\2\u0ad5"+
		"\u0ad0\3\2\2\2\u0ad6\u0ad7\3\2\2\2\u0ad7\u0ad5\3\2\2\2\u0ad7\u0ad8\3\2"+
		"\2\2\u0ad8\u0adb\3\2\2\2\u0ad9\u0ada\7\u014e\2\2\u0ada\u0adc\5\u0134\u009b"+
		"\2\u0adb\u0ad9\3\2\2\2\u0adb\u0adc\3\2\2\2\u0adc\u0add\3\2\2\2\u0add\u0ade"+
		"\7\u015f\2\2\u0ade\u0af2\3\2\2\2\u0adf\u0ae0\7\u00ef\2\2\u0ae0\u0ae1\7"+
		"\u015c\2\2\u0ae1\u0ae2\5\u0134\u009b\2\u0ae2\u0ae3\7\u015f\2\2\u0ae3\u0af2"+
		"\3\2\2\2\u0ae4\u0ae5\7\u010c\2\2\u0ae5\u0ae6\7\u015c\2\2\u0ae6\u0ae7\5"+
		"\u0134\u009b\2\u0ae7\u0ae8\7q\2\2\u0ae8\u0aeb\5\u0134\u009b\2\u0ae9\u0aea"+
		"\7m\2\2\u0aea\u0aec\5\u0134\u009b\2\u0aeb\u0ae9\3\2\2\2\u0aeb\u0aec\3"+
		"\2\2\2\u0aec\u0aed\3\2\2\2\u0aed\u0aee\7\u015f\2\2\u0aee\u0af2\3\2\2\2"+
		"\u0aef\u0af2\7\u0149\2\2\u0af0\u0af2\7\u014b\2\2\u0af1\u0a29\3\2\2\2\u0af1"+
		"\u0a2a\3\2\2\2\u0af1\u0a34\3\2\2\2\u0af1\u0a3b\3\2\2\2\u0af1\u0a3c\3\2"+
		"\2\2\u0af1\u0a41\3\2\2\2\u0af1\u0a49\3\2\2\2\u0af1\u0a4a\3\2\2\2\u0af1"+
		"\u0a4c\3\2\2\2\u0af1\u0a5f\3\2\2\2\u0af1\u0a72\3\2\2\2\u0af1\u0a85\3\2"+
		"\2\2\u0af1\u0a98\3\2\2\2\u0af1\u0aab\3\2\2\2\u0af1\u0abe\3\2\2\2\u0af1"+
		"\u0acd\3\2\2\2\u0af1\u0adf\3\2\2\2\u0af1\u0ae4\3\2\2\2\u0af1\u0aef\3\2"+
		"\2\2\u0af1\u0af0\3\2\2\2\u0af2\u0151\3\2\2\2\u0af3\u0af4\5\u015c\u00af"+
		"\2\u0af4\u0af6\7\u015c\2\2\u0af5\u0af7\5\u0154\u00ab\2\u0af6\u0af5\3\2"+
		"\2\2\u0af6\u0af7\3\2\2\2\u0af7\u0af8\3\2\2\2\u0af8\u0af9\7\u015f\2\2\u0af9"+
		"\u0153\3\2\2\2\u0afa\u0aff\5\u0156\u00ac\2\u0afb\u0afc\7\u014e\2\2\u0afc"+
		"\u0afe\5\u0156\u00ac\2\u0afd\u0afb\3\2\2\2\u0afe\u0b01\3\2\2\2\u0aff\u0afd"+
		"\3\2\2\2\u0aff\u0b00\3\2\2\2\u0b00\u0155\3\2\2\2\u0b01\u0aff\3\2\2\2\u0b02"+
		"\u0b08\6\u00ac\23\2\u0b03\u0b04\5\u015c\u00af\2\u0b04\u0b06\7\u0152\2"+
		"\2\u0b05\u0b07\7\u0156\2\2\u0b06\u0b05\3\2\2\2\u0b06\u0b07\3\2\2\2\u0b07"+
		"\u0b09\3\2\2\2\u0b08\u0b03\3\2\2\2\u0b08\u0b09\3\2\2\2\u0b09\u0b0a\3\2"+
		"\2\2\u0b0a\u0b0b\5\u0134\u009b\2\u0b0b\u0157\3\2\2\2\u0b0c\u0b0d\7C\2"+
		"\2\u0b0d\u0b0e\5\u015e\u00b0\2\u0b0e\u0159\3\2\2\2\u0b0f\u0b10\7\u0116"+
		"\2\2\u0b10\u0b11\5\u015e\u00b0\2\u0b11\u015b\3\2\2\2\u0b12\u0b15\7\u0164"+
		"\2\2\u0b13\u0b15\5\u016a\u00b6\2\u0b14\u0b12\3\2\2\2\u0b14\u0b13\3\2\2"+
		"\2\u0b15\u0b1d\3\2\2\2\u0b16\u0b19\7\6\2\2\u0b17\u0b1a\7\u0164\2\2\u0b18"+
		"\u0b1a\5\u016a\u00b6\2\u0b19\u0b17\3\2\2\2\u0b19\u0b18\3\2\2\2\u0b1a\u0b1c"+
		"\3\2\2\2\u0b1b\u0b16\3\2\2\2\u0b1c\u0b1f\3\2\2\2\u0b1d\u0b1b\3\2\2\2\u0b1d"+
		"\u0b1e\3\2\2\2\u0b1e\u015d\3\2\2\2\u0b1f\u0b1d\3\2\2\2\u0b20\u0b23\7\u0165"+
		"\2\2\u0b21\u0b23\7\u0166\2\2\u0b22\u0b20\3\2\2\2\u0b22\u0b21\3\2\2\2\u0b23"+
		"\u015f\3\2\2\2\u0b24\u0b26\t)\2\2\u0b25\u0b24\3\2\2\2\u0b25\u0b26\3\2"+
		"\2\2\u0b26\u0b27\3\2\2\2\u0b27\u0b28\7\u0167\2\2\u0b28\u0161\3\2\2\2\u0b29"+
		"\u0b2b\t)\2\2\u0b2a\u0b29\3\2\2\2\u0b2a\u0b2b\3\2\2\2\u0b2b\u0b2c\3\2"+
		"\2\2\u0b2c\u0b2d\7\u0168\2\2\u0b2d\u0163\3\2\2\2\u0b2e\u0b2f\t*\2\2\u0b2f"+
		"\u0165\3\2\2\2\u0b30\u0b31\7\u00ba\2\2\u0b31\u0167\3\2\2\2\u0b32\u0b33"+
		"\7\u0169\2\2\u0b33\u0169\3\2\2\2\u0b34\u0b35\t+\2\2\u0b35\u016b\3\2\2"+
		"\2\u0172\u0172\u0175\u0179\u017c\u0181\u0188\u018f\u0198\u019b\u019d\u01b9"+
		"\u01c6\u01d5\u01e5\u01ef\u01fe\u0200\u0202\u020a\u020c\u0214\u0216\u0225"+
		"\u0227\u022a\u0231\u023c\u023e\u0241\u0243\u0245\u0252\u0256\u0269\u0280"+
		"\u0287\u028e\u0290\u0297\u029e\u02ae\u02b5\u02b8\u02bd\u02c1\u02ca\u02cf"+
		"\u02d7\u02dc\u02e5\u02f1\u02f6\u02f9\u0303\u0306\u030a\u030d\u0315\u0318"+
		"\u0329\u032d\u0335\u0340\u034a\u0352\u0359\u035d\u0361\u0366\u036a\u036f"+
		"\u0373\u0377\u0381\u0385\u038a\u038f\u0393\u03a0\u03a5\u03ab\u03b4\u03b8"+
		"\u03c0\u03c3\u03c8\u03cd\u03d4\u03db\u03de\u03e5\u03eb\u03f0\u03f6\u03fb"+
		"\u03fe\u0404\u0412\u041c\u0422\u0427\u042c\u0431\u0435\u043a\u043d\u0447"+
		"\u0453\u045a\u045d\u0469\u046e\u0473\u0476\u047d\u0489\u0496\u0498\u049d"+
		"\u04a0\u04af\u04b5\u04c0\u04c3\u04cd\u04d4\u04da\u04e2\u04ec\u0500\u0506"+
		"\u050a\u050f\u0513\u0518\u051b\u0520\u0523\u0531\u0550\u0552\u0557\u055b"+
		"\u0560\u0567\u056a\u056d\u0572\u0576\u0578\u057f\u0585\u058c\u0592\u0595"+
		"\u059a\u059e\u05a1\u05a8\u05ae\u05b1\u05bb\u05c1\u05c4\u05ce\u05d0\u05d9"+
		"\u05e0\u05e7\u05e9\u05ef\u05f2\u05fd\u0606\u060c\u0612\u0615\u061a\u061d"+
		"\u0620\u0623\u0626\u062c\u0632\u0635\u063a\u063d\u0640\u0643\u0646\u064c"+
		"\u064e\u0658\u0663\u0666\u066d\u0672\u0677\u067b\u0683\u0687\u068c\u0690"+
		"\u0692\u0697\u069f\u06a4\u06aa\u06b3\u06b7\u06c1\u06d3\u06d7\u06de\u06e0"+
		"\u06ed\u06f3\u06f7\u06fb\u0707\u070e\u071e\u0725\u072a\u072e\u0735\u0739"+
		"\u073d\u0744\u0748\u074e\u0752\u075d\u0764\u0771\u0774\u077e\u0783\u0790"+
		"\u079b\u07a3\u07a7\u07ab\u07af\u07b1\u07b6\u07b9\u07bc\u07bf\u07c3\u07c6"+
		"\u07c9\u07cc\u07cf\u07d6\u07e3\u07e7\u07ea\u07ee\u07f5\u07f9\u0803\u080b"+
		"\u0811\u0815\u081b\u0824\u0827\u082c\u082f\u0839\u083e\u0847\u084c\u0850"+
		"\u0859\u085d\u086b\u0878\u087d\u0881\u0887\u0892\u0894\u0898\u089f\u08a7"+
		"\u08ad\u08b2\u08c1\u08ca\u08ce\u08d7\u08db\u08e5\u08ea\u0900\u0903\u0916"+
		"\u0926\u0928\u0933\u0942\u094e\u0952\u095d\u0961\u096d\u0971\u097c\u0981"+
		"\u0986\u098a\u098e\u0993\u0997\u099b\u09b2\u09b4\u09c6\u09c8\u09d0\u09d5"+
		"\u09da\u09df\u09ec\u09f1\u09f6\u09fb\u0a00\u0a05\u0a0a\u0a0f\u0a11\u0a18"+
		"\u0a1b\u0a26\u0a30\u0a38\u0a41\u0a47\u0a58\u0a5b\u0a6b\u0a6e\u0a7e\u0a81"+
		"\u0a91\u0a94\u0aa4\u0aa7\u0ab7\u0aba\u0ac8\u0ad7\u0adb\u0aeb\u0af1\u0af6"+
		"\u0aff\u0b06\u0b08\u0b14\u0b19\u0b1d\u0b22\u0b25\u0b2a";
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