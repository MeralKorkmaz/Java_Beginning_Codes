package day16_stringbuilder_stringbuffer_accessmodifiers;

public class C02AccessModifiers01 {
    public static void main(String[] args)  {
        /*
        1)Access Modifiers are used to modify who can access to data
        2)There are types of access modifiers: public>protected>default>private
        3)Private access modifiers cannot be reached from other Classes
        4)Public data can be reached from anywhere
        5)Default (package private) data can be reached by classes on the same package
        6)Protected data can be reached from the same package and from other package as well  if it is child.
         */

        C03AccessModifiersClass obj = new C03AccessModifiersClass();
        System.out.println(obj.name);
        int a = obj.age;
        System.out.println(a);

    }
}
