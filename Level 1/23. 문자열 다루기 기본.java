class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        // 정수 length는 문자열 s의 길이
        int length = s.length();
        // 4와 6이 아니라면 false 리턴
        if(length != 4 && length != 6){
            answer = false;
        }
        // 그 외에는 하나씩 비교하며 숫자가 아닐 시 false 리턴
        else{
            for(int i=0;i<length;i++){
                if(s.charAt(i) < 48 || s.charAt(i) > 57){
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}