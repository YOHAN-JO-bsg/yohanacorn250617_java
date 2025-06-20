package test.main;

import test.mypac.MemberInfo;

public class MainClass04 {
    public static void main(String[] args) {
        MemberInfo m1 = new MemberInfo();
        m1.num = 1;
        m1.name = "김구라";
        m1.addr = "노량진";

        MemberInfo m2 = new MemberInfo();
        m2.num = 2;
        m2.name = "해골";
        m2.addr = "행신동";

        MemberInfo m3 = new MemberInfo();
        m3.num = 3;
        m3.name = "원숭이";
        m3.addr = "동물원"; 

        // 위에서 생성한 MemberInfo 객체의 참조값 3개를 배열에 순서대로 담아 보세요.
        MemberInfo[] members = {m1, m2, m3};

        // 아래와 같이 할 수도 있다.
        MemberInfo[] member2 = {null, null, null};
        member2[0] = m1;
        member2[1] = m2;
        member2[2] = m3;

        // 이것도 가능
        MemberInfo[] members3 = new MemberInfo[3];
        members3[0] = m1;
        members3[1] = m2;
        members3[2] = m3;

        // 예를 들면 이렇게 모두 출력 가능
        for (MemberInfo m : members) {
            System.out.println(m.num + ", " + m.name + ", " + m.addr);
        }
    }
}
