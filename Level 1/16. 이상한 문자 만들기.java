class Solution {
    public String solution(String s) {
        // 리턴할 문자열 answer
        String answer = "";
        // 공백을 기준으로 증가할 정수 count
        int count = 0;
        // s의 크기만큼 반복하는데
        for(int i=0;i<s.length();i++){
            // i번째 문자가 공백이라면 answer에 공백을 넣고 count를 0으로 초기화함
            if(s.charAt(i) == ' '){
                answer += s.charAt(i);
                count = 0;
            }
            // 공백이 아니고 짝수번째라면 i번째 문자를 대문자로 변환하여 answer에 저장
            // count++
            else if(s.charAt(i) != ' ' && count%2 == 0){
                answer += Character.toUpperCase(s.charAt(i));
                count++;
            }
            // 공백이 아니고 홀수번째라면 i번째 문자를 소문자로 변환하여 answer에 저장
            // count++
            else if(s.charAt(i) != ' ' && count%2 == 1){
                answer += Character.toLowerCase(s.charAt(i));
                count++;
            }
        }
        return answer;
    }
}