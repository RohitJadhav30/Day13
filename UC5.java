import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UC5 <T extends Comparable<T>> {

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

    public static <T> void printMax(T max){
        System.out.println("Maximum element is : " + max);
    }

    @SuppressWarnings("unchecked")
    public final void testMax(T... values){
        T max = findMax(values);
        printMax(max);
    }
    public static void main(String[] args) {
        UC5<Integer> integerType = new UC5<>();

        Integer num1 = 10;
        Integer num2 = 5;
        Integer num3 = 8;
        Integer num4 = 6;
        integerType.testMax(num1, num2, num3, num4);

        //String
        UC5<String> stringType = new UC5<>();
        String str1 = "peach";
        String str2 = "banana";
        String str3 = "apple";
        stringType.testMax(str1, str2, str3);
    }
}
