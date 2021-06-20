class Solution {
    public String solution(int n) {
        String answer = "";
        // 1부터 주어진 정수 n까지 돌면서
        // 홀수이면 수, 짝수이면 박을 추가하며 answer 문자열에 저장
        for(int i=1;i<=n;i++){
            if(i%2 == 1)
                answer += "수";
            else
                answer += "박";
        }
        return answer;
    }
}