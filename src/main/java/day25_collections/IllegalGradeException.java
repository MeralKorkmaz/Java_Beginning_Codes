package day25_collections;

public class IllegalGradeException extends RuntimeException {//the child of RuntimeException


    public IllegalGradeException(String message) {//to give a message to user
        super(message);
    }
}
