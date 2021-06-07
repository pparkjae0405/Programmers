class Solution {
    public String solution(String phone_number) {
        // 주어진 문자열의 길이
        int a = phone_number.length();
        StringBuilder br = new StringBuilder(phone_number);
        // 길이-4까지 반복하여
        for(int i=0;i<a-4;i++){
            //문자를 *로 변경
            br.setCharAt(i,'*');
        }
        // answer 문자열은 *로 변경한 br 집합
        String answer = br.toString();
        return answer;
    }
}