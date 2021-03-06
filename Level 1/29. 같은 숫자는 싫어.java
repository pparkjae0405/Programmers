// i번째 수와 i+1번째를 비교하게 되면 연속되는 수가 2개 이상 나왔을 때
// 연속되는지 확인이 안되기 때문에 i번째 수를 저장하고 for문을 돌며
// arr의 값과 비교하여 같으면 넘어가고 다르면 저장하는 방식
import java.util.*;
public class Solution {
    public int[] solution(int []arr) {
        // 정수형 ArrayList array 선언
        ArrayList<Integer> Array = new ArrayList<Integer>();
        //조건이 0~9까지이므로 10으로 설정
        int result = 10;
        for(int i = 0; i < arr.length; i++){
            // 설정한 result값이 아니면 0~9이므로
            if(arr[i] != result){
                // Array에 arr[i]값 추가
                Array.add(arr[i]);
                // result에 arr[i]의 값을 저장하고 다음번째와 비교했을 때
                // 해당 숫자가 연속되는지를 확인할 수 있음
                result = arr[i];
            }
        }
        // for문을 탈출하였을 때의 Array의 크기만큼 answer배열 선언
        int[] answer = new int[Array.size()];
        // Array의 크기만큼 돌면서 answer배열에 Array의 값을 저장하고
        for(int i = 0; i < Array.size(); i++){
            answer[i]=Array.get(i);
        }
        // answer배열 리턴
        return answer;
    }
}