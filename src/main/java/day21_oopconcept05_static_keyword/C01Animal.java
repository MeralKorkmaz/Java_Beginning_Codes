package day21_oopconcept05_static_keyword;


/*
   Child                       Parent
   class                       interface     ----->  we use "extends"
   class                        class       -----> we use "implements"
   interface                    interface  -----> we use "extends"
  interface                     class -----> It is impossible for interface to inherent from class


  Abstracts and interface cannot have objects
  ***What is difference between Abstract Class and Interface:
  i) Methods: "Abstract Class" can use "concrete" and "abstract" methods
            "Interface" can use only "abstract"  methods
                Note: By using "static" or "default" keywords we can create concrete mtds in Interface.
                        "Static" : we can call them by name of the Interface.
                        "Default" : we need to create an object to call them
               All methods in interface are public, but in abstract class they can be "public", "protected"
               or "default"

  ii)Variable: Access Modifier of variables in Interface is public, static and final but in Abstract Class it can have any access modifiers.

  iii)Java does not support multiple inheritance.If you need to use multiple inheritance use Interface.

  iv) If we need to use multiple inheritance with some compulsory methods we use Interface.
      Example: When we need to use multiple browsers  in our software, create Browser interface and determine
      the obligatory methods that will be used by different browsers.

 */

public interface C01Animal extends C00Creatures{

    int eat();

    //String eat(String foodName);
}
