public class Test {
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.function());
    }
    private String function() {
        return("A");
    }
    private static final String function(int data) {
        return("B");
    }
}
