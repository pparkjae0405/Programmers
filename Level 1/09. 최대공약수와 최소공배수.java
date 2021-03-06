class Solution {
    public int[] solution(int n, int m) {
        //최대공약수, 최소공배수를 저장할 answer배열
        int[] answer = new int[2];
        // 두 수를 비교하여 큰 값과 작은 값을 구분할 max,min
        int max,min;
        if(n<m){
            min = n;
            max = m;
        }
        else{
            min = m;
            max = n;
        }
        //최대공약수 추출
        for(int i=1;i<=min;i++){
            if(n%i ==0 && m%i ==0){
                answer[0] = i;
            }
        }
        //최소공배수 추출
        for(int i=max;i>=max;i++){
            if(i%n==0 && i%m ==0) {
                answer[1] = i;
                break;
            }
        }
        // answer배열 리턴
        return answer;
    }
}