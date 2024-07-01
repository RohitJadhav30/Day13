public class Refactor2 <T extends Comparable <T>> {

    public T findMax(T num1, T num2, T num3){
        T max = num1;

        if(num2.compareTo(max) > 0){
            max = num2;
        }
        if(num3.compareTo(max) > 0){
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        //Integer
        Refactor2<Integer> refactor = new Refactor2<>();

            //Test case 1: Max no at first position
            Integer num1 = 10;
            Integer num2 = 5;
            Integer num3 = 8;
            System.out.println("Integer test case1: Max element is : " + refactor.findMax(num1, num2, num3));
    
            //Test case 2: Max no at second position
            num1 = 8;
            num2 = 12;
            num3 = 9;
            System.out.println("Integer test case2: Max element is : " + refactor.findMax(num1, num2, num3));
    
            //Test case 3: Max no at third position
            num1 = 5;
            num2 = 10;
            num3 = 12;
            System.out.println("Integer test case3: Max element is : " + refactor.findMax(num1, num2, num3));

            //Float
            Refactor2<Float> ref = new Refactor2<>();
            float f1 = 10.5f;
            float f2 = 5.6f;
            float f3 = 8.9f;
            System.out.println("Float test case1: Max element is : " + ref.findMax(f1, f2, f3));
    
            //String
            Refactor2<String> refact = new Refactor2<>();
            String str1 = "peach";
            String str2 = "banana";
            String str3 = "apple";
            System.out.println("String test case 1: Max element is: " + refact.findMax(str1, str2, str3));
    }
}