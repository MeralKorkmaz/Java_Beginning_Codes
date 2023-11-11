package assigment;

public class Grade6 implements CommonLessons{

    @Override
    public void math() {
        System.out.println("Fractions" + " Equations" + " Percentages");

    }

    @Override
    public void english( ) {
        System.out.println("Parts of speech and word usage" +" Sentence structure and punctuation.");

    }

    @Override
    public void art() {
        CommonLessons.super.art();
    }
}
