package programmersLevel0;

import java.util.Arrays;
import java.util.Comparator;

public class Practice_20230420 {
    public static void main(String[] args) {
        System.out.println(findLocationOfPoint(new int[]{-7, 9}));
        System.out.println(removeVowel("nice to meet you"));
        System.out.println(removeLetter("BCBdbe", "B"));
        System.out.println(makeMax(new int[]{1, 2, 3, 4, 5}));
        System.out.println(parseMorse(".... . .-.. .-.. ---"));
        System.out.println(parseMorse(".--. -.-- - .... --- -."));
    }

    /* 점의 위치 구하기 */
    public static int findLocationOfPoint(int[] dot){
        int answer = 0;
        if(dot[0] > 0){
            if(dot[1] > 0) { answer = 1; }
            else { answer = 4; }

        } else {
            if (dot[1] > 0) { answer = 2;}
            else { answer = 3; }
        }
        return answer;
    }

    /* 모음 제거 */
    public static String removeVowel(String my_string) {
        String answer = "";
        String vowels = "aeiou";
        String[] arr_my_string = my_string.split("");
        for(String str : arr_my_string){
            if(!vowels.contains(str)){
                answer += str;
            }
        }
        return answer;
    }

    /* 특정 문자 제거하기 */
    public static String removeLetter(String my_string, String letter){
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) != letter.charAt(0)){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    /* 최댓값 만들기(1) */
    public static int makeMax(int[] numbers){
        int answer = 0;
        Integer[] sortedNumbers = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        answer = sortedNumbers[0] * sortedNumbers[1];
        return answer;
    }

    /* 모스부호(1) */
    public static String parseMorse(String letter){
        String answer = "";
        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."
        };
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] parseLetter = letter.split(" ");

        for(String str : parseLetter){
            for(int i = 0; i < morse.length; i++){
                if(str.equals(morse[i])){
                    answer += alphabet.charAt(i);
                }
            }
        }
        return answer;
    }
}
