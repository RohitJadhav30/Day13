import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UC4 <T extends Comparable<T>> {

    @SuppressWarnings("unchecked")
    public final T findMax(T... values){
        if(values == null || values.length == 0){
            return null;
        }

        List<T> list = Arrays.asList(values);
        Collections.sort(list);
        System.out.println(list);
        return list.get(list.size() - 1);
    }
    public static void main(String[] args) {
        //Integer
        UC4<Integer> integerType = new UC4<>();

        Integer num1 = 10;
        Integer num2 = 5;
        Integer num3 = 8;
        Integer num4 = 6;
        System.out.println("Integer test case1: Max element is : " + integerType.findMax(num1, num2, num3, num4));

        //String
        UC4<String> stringType = new UC4<>();
        String str1 = "peach";
        String str2 = "banana";
        String str3 = "apple";
        System.out.println("String test case 1: Max element is: " + stringType.findMax(str1, str2, str3));
    }
}
