import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        int[] answer = {};
        // answer배열의 크기 정하는 for문
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor == 0){
                cnt++;
            }
        }
        // 나눠지는게 없으면 answer의 크기는 1이고 그 값은 -1
        if(cnt == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[cnt];
            // arr 배열만큼 도는데
            // divisor로 나눠지면 answer배열의 0번째에 추가하고 cnt++
            cnt = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%divisor == 0){
                    answer[cnt] = arr[i];
                    cnt++;
                }
            }
            // 오름차순 정렬
            Arrays.sort(answer);
        }
        return answer;
    }
}