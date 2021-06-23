class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // p와 y의 갯수를 샐 정수 p,y 선언
        int p = 0;
        int y = 0;
        // 주어진 문자열의 크기만큼 돌면서
        for(int i=0;i<s.length();i++){
            // p나 P이면 p의개수 추가, y나 Y이면 y의개수 추가
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P')
                p++;
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                y++;
        }
        // for문을 끝낸 뒤 p와 y의 개수를 비교해 같지 않다면 answer을 false로 설정
        if(p != y)
            answer = false;
        return answer;
    }
}