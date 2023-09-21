public class Main {

    public static void main(String[] args) {

    int resultOne = add(1,2);
        System.out.println(resultOne);

    String resultTwo = greeting("Steven");
        System.out.println(resultTwo);

    int resultThree = add(2, 4, 6, 8);
    System.out.println(resultThree);

    String printMe = printMe("Hello");


    }

    public static int add(int numOne, int numTwo){
        return numOne+numTwo;
    }
    public static String greeting(String name){
        return "Bonjour,"+name+"!";
    }
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        return add(numOne, add(numTwo, add(numThree,numFour)));
    }
    public static String printMe(String value){
        return"";
    }
}
