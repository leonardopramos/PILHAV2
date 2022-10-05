public class TestaPilha {
    
    public static void main(String[] args) {
        PilhaArray p = new PilhaArray(100);

        p.push(1);
        p.push(9);
        p.pop();
        System.out.println(p.top());
        System.out.println(p.size());
    }
}
