package assigment;

public interface CommonLessons {
    void math();

     void english();

     default void art(){
         System.out.println("Gesture Drawing" + " Tissue Paper Collage Flowers");
     }



}
