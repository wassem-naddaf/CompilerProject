import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.*;
import  org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Launch{

    public static AST ast = new AST();

    public  static  void main(String[] args){

        try{
            //  ANTLRErrorListener error = new BaseErrorListener();
            String source="test.txt";
            myvisitors.init();
            CharStream cs=fromFileName(source);
            // ANTLRInputStream input = new ANTLRInputStream(System.in);
            gLexer lexer =new gLexer( cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            gParser parser = new gParser(token);

            lexer.removeErrorListeners();
            lexer.addErrorListener(myerrorlistener.INSTANCE);
            parser.removeErrorListeners();
            parser.addErrorListener(myerrorlistener.INSTANCE);
          // ParserRuleContext ctx = parser.program();
        //    BuildAST(ctx, false, 0,ast);
            ParseTree tree = parser.program();
            myvisitors visitor = new myvisitors();
            visitor.visit(tree);
       //     myvisitors.PrintDataTypes();

            // myvisitors.flat("Table","");

        }catch (IOException e){
            e.printStackTrace();
        }


    }
    private static void BuildAST(RuleContext ctx, boolean verbose, int spaces, AST ast) {
        boolean checkifvalid = !verbose && ctx.getChildCount() == 1 && ctx.getChild(0) instanceof ParserRuleContext;

        if (!checkifvalid) {
            String ruleName = gParser.ruleNames[ctx.getRuleIndex()];
            for (int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }
            System.out.println(ruleName + " -> " + ctx.getText());
            // Add To AST
            ast.RoleName = ruleName;
            ast.Token = ctx.getText();

        }
        // Add Childs To Ast
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {

                AST child = new AST();

                ast.Childs.add(child);

                BuildAST((RuleContext) element, verbose, spaces + (checkifvalid ? 0 : 1),child);
            }
        }
    }
}