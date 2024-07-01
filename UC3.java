public class UC3{

    public static String findMax(String str1, String str2, String str3){
        String max = str1;

        if(str2.compareTo(max) > 0){
            max = str2;
        }
        if(str3.compareTo(max) > 0){
            max = str3;
        }
        return max;
    }

    public static void testCases(){
        //Test case 1: Max no at first position
        String str1 = "peach";
        String str2 = "apple";
        String str3 = "banana";
        System.out.println("test case 1: Max element is: " + findMax(str1, str2, str3));

        //Test case 2: Max no at second position
        str1 = "banana";
        str2 = "peach";
        str3 = "apple";
        System.out.println("test case2: Max element is : " + findMax(str1, str2, str3));

        //Test case 3: Max no at third position
        str1 = "apple";
        str2 = "banana";
        str3 = "peach";
        System.out.println("test case3: Max element is : " + findMax(str1, str2, str3));

    }
    public static void main(String[] args) {
        testCases();
    }
}