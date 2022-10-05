public class TestaPilha2 {
    
    public static void main(String[] args) {
        
        Pilha p = new Pilha();
        p.push(1);
        p.push(143);
        p.push(9);
        p.pop();
        p.clear();
        System.out.println(p.size());
    }
}
