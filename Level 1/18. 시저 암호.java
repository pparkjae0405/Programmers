class Solution {
    public String solution(String s, int n) {
        String answer = "";
        // 입력받은 문자열 s의 길이만큼 반복
        for(int i=0;i<s.length();i++){
            //소문자일 경우
            if(s.charAt(i) > 96 && s.charAt(i) < 123){
                // n을 추가하였을 때 z의 범위를 넘어간다면 맨처음으로 돌아가도록
                if(s.charAt(i)+n > 122)
                    answer += (char)(s.charAt(i)-26+n);
                // 그 외에는 정상적으로 더함
                else
                    answer += (char)(s.charAt(i)+n);
            }
            //대문자일 경우
            if(s.charAt(i) > 64 && s.charAt(i) < 91){
                // n을 추가하였을 때 Z의 범위를 넘어간다면 맨처음으로 돌아가도록
                if(s.charAt(i)+n > 90)
                    answer += (char)(s.charAt(i)-26+n);
                    // 그 외에는 정상적으로 더함
                else
                    answer += (char)(s.charAt(i)+n);
            }
            //공백일 경우
            if(s.charAt(i) == ' '){
                //answer에 공백을 더해 저장
                answer += ' ';
            }
        }
        return answer;
    }
}