class Solution {
    public String solution(String s) {
        String answer = "";
        // 문자열 s의 길이 인식
        int length = s.length();
        // 짝수이면 중간 두 글자,
        if(length%2 == 0){
            int a = length/2;
            answer = s.charAt(a-1)+""+s.charAt(a)+"";
            // 홀수이면 중간 한글자
        }else{
            int a = (length-1)/2;
            answer = s.charAt(a)+"";
        }
        return answer;
    }
}