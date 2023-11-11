package assigment;

public class Grade7 implements CommonLessons{
    @Override
    public void math() {
        System.out.println("Expressions" + " Interpreting negative number statements");

    }

    @Override
    public void english() {
        System.out.println("Adjectives, Pronouns, Adverbs" + " Figurative Language");

    }

    @Override
    public void art() {
        CommonLessons.super.art();
   }
}
