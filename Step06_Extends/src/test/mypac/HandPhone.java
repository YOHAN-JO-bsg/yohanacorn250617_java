package test.mypac;

public class HandPhone extends Phone { // 대문자 Phone 으로 수정!
    public HandPhone() {
        System.out.println("HandPhone 생성자 호출 됨");
    }

    public void mobileCall() {
        System.out.println("이동중에 전화를 걸어요");
    }

    public void takePicture() {
        System.out.println("30만 화소의 사진을 찍어요");
    }
}