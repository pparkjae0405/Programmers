class Solution {
    public int solution(int n) {
        int answer = 0;
        //1~본인수까지 반복하며 나눴을 때 나머지가 0 이면 약수이므로 answer에 더하여 저장
        for(int i=1;i<=n;i++){
            if(n%i == 0)
                answer += i;
        }
        return answer;
    }
}