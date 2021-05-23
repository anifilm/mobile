// 자바의 Person 클래스와 접근 메서드
package chap06.section1;

class Person {
    // 멤버 필드
    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter/Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Chaeyoung", 44);
        //p1.name = "Dooly"  // 오류! 직접 접근 불가
        p1.setName("Dooly"); // Setter에 의한 접근
        System.out.println(p1.getName()); // Getter에 의한 접근
    }
}
