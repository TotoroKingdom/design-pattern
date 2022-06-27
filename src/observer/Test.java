package observer;

public class Test {
    public static void main(String[] args) {
        SubjectConcrete concrete = new SubjectConcrete();

        Observer1 observer1 = new Observer1(concrete);
        Observer2 observer2 = new Observer2(concrete);

        concrete.setMsg("111");
        concrete.setMsg("222");
        concrete.setMsg("333");
    }
}
