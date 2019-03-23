import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/*

public static MyAntlrErrorListener INSTANCE = new MyAntlrErrorListener();
private static final boolean REPORT_SYNTAX_ERRORS = true;

private String errorMsg = "";

@Override
public void syntaxError(Recognizer<?, ?> recognizer,
        Object offendingSymbol,
        int line,
        int charPositionInLine,
        String msg,
        RecognitionException re) {

        if (!REPORT_SYNTAX_ERRORS) {
        return;
        }

        String sourceName = recognizer.getInputStream().getSourceName();
        if (!sourceName.isEmpty()) {
        sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
        }
        System.err.println(sourceName+"line "+line+":"+charPositionInLine+" "+msg);
        errorMsg = errorMsg + "\n" + sourceName+"line "+line+":"+charPositionInLine+" "+msg;
        }

@Override
public String toString() {
        return errorMsg;
        }*/
public class myerrorlistener extends BaseErrorListener {
    public static myerrorlistener INSTANCE = new myerrorlistener();
    private static final boolean REPORT_SYNTAX_ERRORS = true;
    private String errorMsg = "";
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e)
    {
        if (!REPORT_SYNTAX_ERRORS) {
            return;
        }

        String sourceName = recognizer.getInputStream().getSourceName();
        if (!sourceName.isEmpty()) {
            sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
        }

        System.err.println(sourceName+"line "+line+":"+charPositionInLine+" msg : "+msg);

    }
    @Override
    public String toString() {
        return errorMsg;
    }
}