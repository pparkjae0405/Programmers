class Solution {
    public int[] solution(long n) {
        // 주어진 수의 자릿수 파악
        int length = (int)(Math.log10(n)+1);
        // 파악한 자릿수만큼 answer배열 선언
        int[] answer = new int[length];
        // arr[i]에 n의 맨뒷자리 저장 및 10 나누기 반복
        for(int i=0;i<length;i++){
            answer[i] = (int)(n%10);
            n = n/10;
        }
        return answer;
    }
}