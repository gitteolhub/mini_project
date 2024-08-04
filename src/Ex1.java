public class Ex1 {
    public static void main(String[] args){
        int kor = 95;
        int eng = 90;
        int math = 88;
        int sum = kor + eng + math;
        float avg = Math.round((float)sum / 3 * 1e3) / 1000f; //소수점 'n'자리까지 반올림 >> 1e'n'F (나중에 공부해서 규칙성 함수화 가능)
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
