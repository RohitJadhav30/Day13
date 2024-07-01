public class UC2{

    public static float findMax(float num1, float num2, float num3){
        float max = num1;

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
        float num1 = 10.5f;
        float num2 = 5.0f;
        float num3 = 8.4f;
        System.out.println("test case1: Max element is : " + findMax(num1, num2, num3));

        //Test case 2: Max no at second position
        num1 = 8.2f;
        num2 = 12.9f;
        num3 = 12.8f;
        System.out.println("test case2: Max element is : " + findMax(num1, num2, num3));

        //Test case 3: Max no at third position
        num1 = 5.5f;
        num2 = 10.3f;
        num3 = 12.4f;
        System.out.println("test case3: Max element is : " + findMax(num1, num2, num3));

    }
    public static void main(String[] args) {
        testCases();
    }
}