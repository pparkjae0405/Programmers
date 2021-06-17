public class Solution {
    public int solution(int n) {
        int answer = 0;
        // n의 자릿수 판별
        int length = (int)(Math.log10(n)+1);
        // 자릿수 별 숫자를 더해 answer에 저장
        for(int i=0;i<length;i++){
            answer += (n%10);
            n = n/10;
        }
        return answer;
    }
}