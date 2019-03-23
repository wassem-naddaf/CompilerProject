import javax.swing.text.AsyncBoxView;
import java.util.ArrayList;
import java.util.List;

public class AST {


    public String RoleName;
    public String Token;

    public List<AST> Childs;

    public AST(){
        Childs = new ArrayList<>();
    }
}
