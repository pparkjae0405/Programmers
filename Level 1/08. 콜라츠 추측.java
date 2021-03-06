class Solution {
    // num이 long이 아니면 626331을 넣었을 때 오류가 나므로 long으로 변경
    public int solution(long num) {
        // 반복 횟수를 카운트할 answer
        int answer = 0;
        //넘어온 num값이 1이라면 그 자체로 1이므로 예외처리
        if(num == 1)
            return 0;
        //500번 반복하여 짝수면 2로 나누고 홀수면 3곱하고 1을 더한 뒤
        //answer값을 증가시키고, num이 1이 되었다면 루프문 탈출
        for(int i=0;i<500;i++) {
            if (num % 2 == 0)
                num = num / 2;
            else
                num = num*3 + 1;
            answer++;
            if(num == 1)
                break;
        }
        //만약 500번을 다 실행하였음에도 num이 1이 아니라면
        //answer값을 -1로 설정
        if(num != 1)
            answer = -1;
        //answer값 리턴하여 종료
        return answer;
    }
}