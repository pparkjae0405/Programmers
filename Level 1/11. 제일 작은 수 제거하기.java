class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        // arr의 크기가 1이면 -1을 리턴하도록
        if(arr.length == 1){
            return new int[]{-1};
        }
        // 그게 아니라면 arr크기-1 만큼 answer배열 설정
        answer = new int[arr.length-1];
        // 최솟값 저장할 정수 min
        int min = arr[0];
        // arr 배열의 최솟값을 찾아 min에 저장
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        // 하나씩 비교할 정수 j 선언
        int j = 0;
        // arr[0]와 min을 비교하여 min값과 같으면 저장하지 않고
        // j++과 i--를 한 뒤 넘어가고, 그 외에는 저장하고 j++
        for (int i = 0; i < answer.length; i++) {
            if (arr[j] == min) {
                j++;
                i--;
                continue;
            }
            answer[i] = arr[j];
            j++;
        }
        return answer;
    }
}