class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        // a<b이면 a~b까지
        if(a<b){
            for(int i=a;i<=b;i++)
                answer += i;
        }
        // a>b이면 b~a까지
        else{
            for(int i=b;i<=a;i++)
                answer += i;
        }
        return answer;
    }
}