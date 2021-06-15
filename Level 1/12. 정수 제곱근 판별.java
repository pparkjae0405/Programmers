class Solution {
    public long solution(long n) {
        long answer = 0;
        // answer에 먼저 a의 제곱근을 저장 (x역할)
        answer = (long) Math.sqrt(n);
        // answer(x역할)의 제곱이 a라면
        if((long)Math.pow(answer,2) == n)
            // answer+1(x+1)의 제곱을 answer에 저장
            answer = (long) Math.pow(answer+1,2);
        else
            // 그 외에는 -1 저장
            answer = -1;

        return answer;
    }
}