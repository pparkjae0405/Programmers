class Solution {
    public String solution(int num) {
        //num값에 따라 바뀔 answer문자열
        String answer;
        // num을 2로 나눈 나머지가 0이면 짝수이므로 Even
        if(num%2 == 0){
            answer = "Even";
        }
        // 0이 아니라면 홀수이므로 Odd
        else{
            answer = "Odd";
        }
        return answer;
    }
}