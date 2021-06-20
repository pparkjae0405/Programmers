class Solution {
    public int solution(int n) {
        int answer = 0;
        // 2부터 주어진 n까지 반복함
        for(int i=2;i<=n;i++){
            //우선 소수인지 판별할 a 선언 (기본값 true)
            boolean a = true;
            // 2 ~ 제곱이 i와 같을때 까지 반복하는 j 선언
            for (int j = 2; j*j <= i; j++) {
                // i를 j로 나눴을 때 나눠지면 소수가 아니므로 a를 false로 설정하고 탈출
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            // 다 돌았는데 a가 true라면 소수이므로 answer의 값 1 추가
            if(a)
                answer += 1;
        }
        return answer;
    }
}