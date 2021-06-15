import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        // n의 자릿수 판별하는 정수 length
        int length = (int)(Math.log10(n)+1);
        // n의 자릿수만큼 arr배열 선언
        long[] arr = new long[length];
        // 자릿수 별 숫자를 분리하여 arr배열에 저장
        for(int i=0;i<length;i++){
            arr[i] = n%10;
            n = n/10;
        }
        // arr 배열 오름차순 정렬 (1,2,3,4...)
        Arrays.sort(arr);
        // 정렬된 배열의 마지막부터 처음까지(내림차순)으로 자릿수만큼 곱해 저장
        for(int i=length-1;i>-1;i--){
            // answer에 arr[5]*10의 5제곱을 더하고 length--,
            // arr[4]*10의 4제곱을 더하고 length-- ...
            answer += (long)(arr[i]*(Math.pow(10,length-1)));
            length--;
        }
        // 저장한 answer 리턴
        return answer;
    }
}