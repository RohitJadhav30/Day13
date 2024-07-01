public class UC1{

    public static int findMax(int num1, int num2, int num3){
        int max = num1;

        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }
        return max;
    }

    public static void testCases(){
        //Test case 1: Max no at first position
        int num1 = 10;
        int num2 = 5;
        int num3 = 8;
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

    }
    public static void main(String[] args) {
        testCases();
    }
}