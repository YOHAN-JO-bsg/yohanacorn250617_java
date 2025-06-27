package test.main;

import java.util.ArrayList;
import java.util.List;
import test.mypac.MemberDto;

public class MainClass05 {
    public static void main(String[] args) {
        // MemberDto 객체를 저장할 수 있는 ArrayList 객체 생성
        // 보통 List 인터페이스 type 으로 참조값을 받아서 사용
        List<MemberDto> list = new ArrayList<>();

        // 1번 회원의 정보 저장
        MemberDto dto = new MemberDto();
        dto.setNum(1);
        dto.setName("김구라");
        dto.setAddr("노량진");

        // 2번 회원의 정보는 생성자 이용
        MemberDto dto2 = new MemberDto(2, "해골", "행신동");

        // 3번 회원의 정보는 생성자 이용
        MemberDto dto3 = new MemberDto(3, "원숭이", "동물원");

        // 생성한 회원 객체들을 ArrayList에 추가 (누적)
        list.add(dto);
        list.add(dto2);
        list.add(dto3);

        // 확장 for문을 이용해서 출력
        System.out.println("확장 for문 출력 ↓");
        for (MemberDto tmp : list) {
            String info = String.format("번호:%d 이름:%s 주소:%s", 
                                        tmp.getNum(), tmp.getName(), tmp.getAddr());
            System.out.println(info);
        }

        // forEach() 메서드를 이용한 출력
        System.out.println("forEach() 를 이용한 출력 ↓");
        list.forEach(item -> {
            String info = String.format("번호:%d 이름:%s 주소:%s", 
                                        item.getNum(), item.getName(), item.getAddr());
            System.out.println(info);
        });
    }
}
