import java.util.HashMap;
import java.util.Map;

public class Function extends Scope{

    private String Name;

    private Map<String,Object> Parameters;

    private String ReturnType;


    public Function(){

        Parameters = new HashMap<>();

    }

    public Function(String name ,String returntype){

    }
    public void SetReturnType (String returntype){
        ReturnType = returntype;
    }
    public String GetReturnType (){
        return  ReturnType;
    }
    public void SetName (String name){
        Name = name;
    }
    public String GetName (){
        return  Name;
    }

    public void AddParametersList(gParser.ParametersContext ctx){

        if(ctx == null)
            return;

        AddParametersList(ctx.parameters());

        String Name = ctx.ident().start.getText();
        String Type = ctx.dtype().start.getText();

        //  System.out.println(ctx.ident().start.getText() + CurrentType);

        if(this.GetVariable(this,ctx.ident().start.getText()) == null)
        {
            // Add To Parameters list
            this.AddParameter(Name,Type);
            // Add To Variables list
            this.AddVariable(Name,Type);
        }
        else
            System.out.println("ERROR !! " + Name + " Declared Previously");
    }

    // To Add New Variable into Parameter List
    @Override
    public boolean AddParameter(String name, Object value){
         if(Parameters.containsKey(name))
            return false;

        Parameters.put(name,value);
        return  true;
    }



}
