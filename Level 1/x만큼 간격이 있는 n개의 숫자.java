class Solution {
    public long[] solution(long x, int n) {
        // answer 배열은 n개
        long[] answer = new long[n];
        // 0~n까지 반복
        for(int i=0;i<n;i++){
            // x값을 answer[i]에 저장
            answer[i] = x*(i+1);
        }
        return answer;
    }
}