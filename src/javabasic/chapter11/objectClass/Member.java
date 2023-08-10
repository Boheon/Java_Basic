package javabasic.chapter11.objectClass;

//VO(Value Object) :  VO란 이렇게 도메인에서 한 개 또는 그 이상의 속성들을 묶어서 특정 값을 나타내는 객체

public class Member {
    public String id;
    public int age;

    public Member(String id, int age) {
        super();
        this.id = id;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {//매개값이 Member인지 확인
            Member member = (Member) obj;//타입변환, obj는 id필드를 가지고 있지 않음
            if (id.equals(member.id) && age == member.age) {//id 필드 동일 여부 확인
                return true;
            }
        }
        return false;
    }
}
