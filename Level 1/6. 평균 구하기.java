class Solution {
    public double solution(int[] arr) {
        // arr 배열의 길이 a
        int a = arr.length;
        // 점수 합계 sum
        double sum = 0;
        // arr 배열의 길이만큼 반복하여
        for(int i=0;i<a;i++){
            // 합계 도출
            sum = sum + arr[i];
        }
        // 평균값인 answer = 총합/개수
        double answer = sum/a;
        return answer;
    }
}