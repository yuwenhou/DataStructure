/**
 * @description:
 * @time:2019/5/29
 */
public class Student {

    private String name;
    private int score;

    public Student(String studentName, int studentScore){
        name = studentName;
        score = studentScore;
    }

    @Override
    public String toString() {
        return String.format("Student(name:%s, score:%d)",name,score);
    }

    public static void main(String[] args) {
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("Alice",100));
        arr.addLast(new Student("Fanganqi",110));
        arr.addLast(new Student("houyuwen",150));
        System.out.println(arr);
    }
}
