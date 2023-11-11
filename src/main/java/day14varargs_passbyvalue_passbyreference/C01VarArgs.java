package day14varargs_passbyvalue_passbyreference;

public class C01VarArgs {


        public static void main(String[] args) {
        int r1 = add();
        System.out.println(r1);//0

        int r2 = add(3);
        int r3 = add(3,4,9);
        int r4 = add(3,7,5,3,4,98,65,32,1,11,23,43);
        System.out.println(r4);//295
        System.out.println(r2);//3
        System.out.println(r3);//16
    }
    /*   type a method to add integers
    public static int add(int a , int b){
        return a +b;
    }

    what if I give you three ints?
    public static int add(int a , int b, int c){
        return a +b+c ;
    }

    what if I give you four ints?
    public static int add(int a , int b, int c , int d){
        return a +b+c+d ;
     }
     */

    //"varArgs" stands for "Variable Arguments"
    //"varArgs" has logic of Array behind. When using "varArgs" think of Arrays.
    //You cannot add another parameter after varArt since it is never ending. You can use another variable before varArt.
    //If you  work with other parameters use them before "varArg"
    //You cannot use more than one varArg in a method


    public static int add(int  ... a ) {//There a list of integers. I am calling them 'a'. 'a'  symbolize Array
        int sum = 0;
        for(int w:a){
            sum = sum + w;
        }
        return sum;
    }

        }
