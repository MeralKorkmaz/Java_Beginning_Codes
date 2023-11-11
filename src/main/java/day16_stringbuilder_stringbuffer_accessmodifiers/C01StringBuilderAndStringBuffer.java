package day16_stringbuilder_stringbuffer_accessmodifiers;

public class C01StringBuilderAndStringBuffer {
    public static void main(String[] args) {

        /*
        Java has three ways to create a String data:
        i)String Class ii)StringBuilder Class iii)StringBuffer Class

        1)String Class "immutable" (you cannot stop or change) but other two are "mutable"
        When we update a value in String class, Java does not change the original value. ....>"immutable"
        Java creates a new container and put updated data in this container.
        String s = "Java";
        String t = "Java";
        s = s + "!";
        System.out.println("before " + s);//before Java!
        s.concat("!");
        System.out.println("after " + s);//after Java!
        //we should assign s.concat("!"); this to s. When we assign it we are breaking the link between references and make new connect to the new container with new reference

       2)When you updated value in StringBuilder or StringBuffer Java update the original value .....>"mutable"
        StringBuilder y = new StringBuilder("Python");
        StringBuilder z = new StringBuilder("Python");
        //String and StringBuilder have different methods
        y.append("!");
        System.out.println(y);//Python!

        3)Is there other immutable classes in Java: Yes, all Wrapper classes are immutable

       4)The differences between StringBuilder and StringBuffer are:
             i)StringBuilder is faster
             ii)StringBuffer is "thread-safe" and "synchronized". So, we are using it for multiple tasks
             Thread-safe: Can handle multiple tasks (threads) at the same time //Whatsapp application is thread-safing app
             synchronised: Can put threads in logical order


StringBuffer x = new StringBuffer("Ruby");
        System.out.println(x);

         */

        //Methods used in StringBuilder:

        StringBuilder a = new StringBuilder();
        a.append("Hi!").append(" Java!...");
        System.out.println(a);

        System.out.println("a.length() = " + a.length());//a.length() = 12
        System.out.println("a.capacity() = " + a.capacity());//a.capacity() = 16

        StringBuilder stateAbbr = new StringBuilder(3);
        stateAbbr.append("FL").append("Why").append("Fatih");
        System.out.println(stateAbbr.capacity());//extra capacity = current capacity*2 + 2;
        System.out.println(stateAbbr.length());

        //stateAbbr.append("FL12345678990) in this case "current capacity*2 +2 is not enough. So, it's applying the formula. Then, it's adding a spot for the missing part for capacity

        a.reverse();//...avaJ !iH
        System.out.println(a);

        a.replace(0,4,"*");
        System.out.println(a);//*avaJ !iH

       /* a.replace(0,1,"what is ");
        System.out.println(a);//what is avaJ !iH
       */

        a.insert(6,"!");//jumped 6 char and add !
        System.out.println(a);//*avaJ !!iH

        a.delete(6,8);
        System.out.println(a);//*avaJ iH

        a.deleteCharAt(0);
        System.out.println(a);//avaJ iH

        //StringBuffer  methods
        StringBuffer sbf = new StringBuffer("Java");
        StringBuffer sbf1 = new StringBuffer("Kava");
        System.out.println(sbf.compareTo(sbf1));//Compares two StringBuffer instances lexicographically(alphabetically)//-1
        //StringBuffer sbf1 = new StringBuffer("Hava");//2

        // StringBuffer sbf4 = new StringBuffer("Jaya");
        //        System.out.println(sbf.compareTo(sbf4));; first it's checking the first one, if it is equal,second one.It's going like that till the difference one //-3





    }
}
