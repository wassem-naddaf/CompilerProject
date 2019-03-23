import java.util.ArrayList;
import java.util.List;

public class SymbolTable {

    Scope CurrScope;
    Scope RootScope;

    public SymbolTable(){


    }


    public void AddVariables (gParser.Declare_cppContext ctx){

        if(ctx == null)
            return;

        AddVariables(ctx.declare_cpp());
        // (int a)(,b)(,c)
        if(myvisitors.CurrentType == "") {
            myvisitors.CurrentType = ctx.start.getText();
        }
        String Name = ctx.ident(0).start.getText();

        if(this.CurrScope.GetVariable(this.CurrScope,Name) == null)
            this.CurrScope.AddVariable(Name, myvisitors.CurrentType);
        else
            System.out.println("ERROR !! " + Name + " Declared Previously");
    }
    // Check All Scope Instruction To Detect assignment error or to add new variables
    public void CheckScopeInstruction(List<gParser.Cpp_stmtContext> stmts){

        for(int i=0;i<stmts.size();i++){
            if(stmts.get(i).assignment_stmt_cpp() != null){

                String First = stmts.get(i).assignment_stmt_cpp().assignment_cpp().ident(0).start.getText();
                String Second = "";
                if(stmts.get(i).assignment_stmt_cpp().assignment_cpp().ident(1) != null)
                    Second = stmts.get(i).assignment_stmt_cpp().assignment_cpp().ident(1).start.getText();
                if(this.CurrScope.GetVariable(this.CurrScope,First) == null){
                    System.out.println("Error !! " + First + " is not defined");
                }
                if(Second != "" && this.CurrScope.GetVariable(this.CurrScope,Second) == null){
                    System.out.println("Error !! " + Second + " is not defined");
                }
            }
            if(stmts.get(i).declare_stmt_cpp() != null){
                AddVariables(stmts.get(i).declare_stmt_cpp().declare_cpp());
            }
        }

    }
    // Define Condition (if - elseif - else ) Scope
    public void AddConditionScope(List<gParser.Cpp_stmtContext> AllConditionInstruction) {
        // New Scope ( Condition )
        Scope CondScope = new Scope();

        if(!this.CurrScope.GetType().equals("Root")){

            // Set Parent of this scope as root scope (we can not  declare Condition in global scope)
            CondScope.SetParent(this.CurrScope);

            // Set Type
            CondScope.SetType("Condition");

            // Add me as child to current scope
            this.CurrScope.Childs.add(CondScope);

            // Set Current Scope
            this.CurrScope = CondScope;

            // Check For assignment Errors and add new variables
            CheckScopeInstruction(AllConditionInstruction);

        }
        else
            System.out.println("Error !! Condition in root scope");
    }
    // Define Function Scope
    public void AddFunctionScope(gParser.Func_cpp_stmtContext ctx) {

             // New Scope ( Function )
            Scope FunScope = new Function();

            // Set Type
            FunScope.SetType("Function");

            // Set Parent of this scope as root scope (we can  declare function in global just)
            FunScope.SetParent(this.RootScope);

            // Add Return Type
            ((Function) FunScope).SetReturnType(ctx.dtype().start.getText());

            // Add Function Name
            ((Function) FunScope).SetName(ctx.ident().start.getText());

            // Add me as child to current scope
            this.CurrScope.Childs.add(FunScope);

            // Set This Scope As Current Scope
            this.CurrScope = FunScope;

            // Add Parameters To This Scope
            this.CurrScope.AddParametersList(ctx.paramsection().parameters(0));

            // Check For assignment Errors and add new variables
            List<gParser.Cpp_stmtContext> stmts = new ArrayList<>();
            stmts = ctx.cpp_body().cpp_stmt();
            CheckScopeInstruction(stmts);

    }

    // Define Loop Scope
    public void AddLoopScope(gParser.For_cpp_stmtContext ctx) {
        // New Scope ( Loop )
        Scope LoopScope = new Scope();

        if(!this.CurrScope.GetType().equals("Root")){

            // Set Parent of this scope as root scope (we can not  declare loop in global scope)
            LoopScope.SetParent(this.CurrScope);

            // Set Type
            LoopScope.SetType("Loop");

            // Add me as child to current scope
            this.CurrScope.Childs.add(LoopScope);

            // Set Current Scope
            this.CurrScope = LoopScope;

            // Add This loop iterator  to it
            AddVariables(ctx.declare_stmt_cpp().declare_cpp());

            // Check For assignment Errors and add new variables
            List<gParser.Cpp_stmtContext> stmts = new ArrayList<>();
            stmts = ctx.cpp_body().cpp_stmt();
            CheckScopeInstruction(stmts);
        }
        else
            System.out.println("Error !! Loop in root scope");
    }
}
