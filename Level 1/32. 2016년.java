class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // 월 별 몇일까지 있는지 선언한 month 정수배열
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 2016년 1월 1일이 금요일이므로 그 기준으로 일주일 선언한 week 문자열배열
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        // a에 따른 월 별 날짜의 합 c
        int c = 0;
        for(int i=0;i<a-1;i++){
            c += month[i];
        }
        // c에 b-1을 더하여 7로 나눈 나머지가 해당 요일이
        c += b-1;
        answer = week[c%7];
        return answer;
    }
}