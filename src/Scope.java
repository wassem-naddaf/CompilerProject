import java.util.*;

public class Scope {

    protected String Type;

    protected Map<String,Object> Variables ;

    protected Scope Parent ;

    protected List<Scope> Childs;

    public int Level;

    public Scope(){
        Level = 0;
        Variables = new HashMap<>();
        Childs = new ArrayList<>();
    }
    public Scope(String type, Scope parent){

        Type = type;
        Parent = parent;
    }


    // To Add New Variable into Current Scope
    public boolean AddVariable(String name,Object value){
        // To Chech if variable Exist
        if(Variables.containsKey(name))
            return false;
        // Else Add This Variable
        Variables.put(name,value);
        return  true;
    }

    // To Get Variable value by name
    public Object GetVariable(Scope curr,String name){

        if(curr == null)
            return  null;
        if(curr.Variables.containsKey(name))
            return curr.Variables.get(name);

        return GetVariable(curr.Parent , name);
    }


    public void SetParent(Scope parent){
        Parent = parent;
    }

    public Scope GetParent(){
        return Parent;
    }

    public void SetType(String type){
        Type = type;
    }
    public String GetType(){
        return  Type;
    }


    public  boolean AddParameter(String name,Object value){return  false; }
    public void AddParametersList(gParser.ParametersContext ctx){ return;}
    public String GetName (){
        return  "";
    }

}
