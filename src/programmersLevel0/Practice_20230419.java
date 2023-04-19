package programmersLevel0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Practice_20230419 {
    public static void main(String[] args) {
        System.out.println(checkDuplicatedNumber(new int[]{1, 1, 2, 3, 4, 5}, 1));
        System.out.println(dividePizza1(15));
        Arrays.stream(checkArrayLength(new String[]{"We", "are", "the", "world!"})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(reverseArray(new int[]{1, 2, 3, 4, 5})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(cutArray(new int[]{1, 3, 5}, 1, 2)).forEach(System.out::print);
        System.out.println();
        System.out.println(dividePizza2(4));
        System.out.println(dividePizza3(4, 12));
        System.out.println(reverseString("jaron"));

    }

    /* 중복된 숫자 개수 */
    public static int checkDuplicatedNumber (int[] array, int n) {
        int answer = 0;
        answer = (int)Arrays.stream(array).filter(num -> num == n).count();
        return answer;
    }

    /* 피자 나눠먹기(1) */
    public static int dividePizza1(int n){
        int answer = 0;
        while(true){
            answer++;
            if(n - (7 * answer) <= 0){ break; }
        }
        return answer;
    }

    /* 배열 원소의 길이 */
    public static int[] checkArrayLength(String[] strlist){
        int[] answer = new int[strlist.length];
        IntStream.range(0, strlist.length).forEach(i -> answer[i] = strlist[i].length());
        return answer;
    }

    /* 배열 뒤집기 */
    public static int[] reverseArray(int[] num_list){
        int[] answer = new int[num_list.length];
        IntStream.range(0, num_list.length).forEach(i -> answer[num_list.length - i - 1] = num_list[i]);
        return answer;
    }

    /* 배열 자르기 */
    public static int[] cutArray(int[] numbers, int num1, int num2){
        int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        return answer;
    }

    /* 피자 나눠먹기(2) */
    public static int dividePizza2(int n){
        int answer = 0;
        while(true){
            answer++;
            if((6 * answer) % n == 0){ break; }
        }
        return answer;
    }

    /* 피자 나눠먹기(3) */
    public static int dividePizza3(int slice, int n){ // 7, 10
        int answer = 0;
        while(true){
            answer++;
            if((slice * answer) / n >= 1 && n - (slice * answer) <= 0){ break; }
        }
        return answer;
    }

    /* 문자열 뒤집기 */
    public static String reverseString(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            answer += my_string.charAt(my_string.length() - i - 1);
        }
        return answer;
    }
}
