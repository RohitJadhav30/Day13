public class Refactor1{

    public static <T extends Comparable<T>> T findMax(T num1, T num2, T num3){
        T max = num1;

        if(num2.compareTo(max) > 0){
            max = num2;
        }
        if(num3.compareTo(max) > 0){
            max = num3;
        }
        return max;
    }

    public static void testCases(){
        //Test case 1: Max no at first position
        Integer num1 = 10;
        Integer num2 = 5;
        Integer num3 = 8;
        System.out.println("test case1: Max element is : " + findMax(num1, num2, num3));

        //Test case 2: Max no at second position
        num1 = 8;
        num2 = 12;
        num3 = 9;
        System.out.println("test case2: Max element is : " + findMax(num1, num2, num3));

        //Test case 3: Max no at third position
        num1 = 5;
        num2 = 10;
        num3 = 12;
        System.out.println("test case3: Max element is : " + findMax(num1, num2, num3));

        String str1 = "apple";
        String str2 = "banana";
        String str3 = "cherry";
        System.out.println("test case 1: Max element is: " + findMax(str1, str2, str3));

    }
    public static void main(String[] args) {
        testCases();
    }
}