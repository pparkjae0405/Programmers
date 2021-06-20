class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        // 0~seoul의 길이까지 반복
        for(int i=0;i<seoul.length;i++) {
            // seoul[i] 의 값이 Kim과 같다면
            // answer에 김서방은 i에 있다를 추가하여 저장하고 탈출
            if (seoul[i].equals("Kim")) {
                answer += "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }
}