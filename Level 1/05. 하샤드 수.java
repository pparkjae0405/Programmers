class Solution {
    public boolean solution(int x) {
        // 정수 x의 복사본 y
        int y = x;
        // 각 자리의 합
        int sum = 0;
        boolean answer = true;
        // x의 자릿수 a만큼 반복하여
        int a = (int)(Math.log10(y)+1);
        for(int i = 0;i < a;i++){
            // 1자리씩 더하여 sum에 저장
            sum = sum + (y%10);
            y = y/10;
        }
        if(x%sum != 0)
            answer = false;
        return answer;
    }
}