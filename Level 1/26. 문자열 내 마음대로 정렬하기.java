import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        int length = strings.length;
        // answer배열은 strings의 길이만큼
        String[] answer = new String[length];
        // strings배열의 n인덱스를 앞에 추가하여 answer배열에 추가
        // ex) sun bed car 1이면 usun ebed acar로 저장
        for(int i=0;i<length;i++){
            answer[i] = strings[i].charAt(n) + strings[i];
        }
        // 오름차순 정렬
        Arrays.sort(answer);
        // 정렬한 배열에서 맨앞글자 제거
        for(int i=0;i<length;i++){
            answer[i] = answer[i].substring(1);
        }
        return answer;
    }
}