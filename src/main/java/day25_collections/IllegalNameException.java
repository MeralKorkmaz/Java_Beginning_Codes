package day25_collections;

public class IllegalNameException extends Exception{//we use the parent of CompileTimeException
    public IllegalNameException(String message) {
        super(message);
    }
}
