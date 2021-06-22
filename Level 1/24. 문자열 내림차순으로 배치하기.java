import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a = new String[s.length()];
        // 문자열 s의 크기만큼 돌면서 a배열에 저장
        for(int i=0;i<s.length();i++){
            a[i] = s.charAt(i)+"";
        }
        // a배열을 내림차순으로 정렬
        Arrays.sort(a,Collections.reverseOrder());
        // 내림차순으로 정렬된 a배열을 answer에 하나씩 추가하여 저장
        for(int i=0;i<a.length;i++){
            answer += a[i];
        }
        return answer;
    }
}