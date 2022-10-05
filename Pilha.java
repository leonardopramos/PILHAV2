public class Pilha implements PilhaTAD{
    
    private Nodo top;
    private int tamanho;

    public Pilha(){
        tamanho = 0;
        top = null;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public void push(int e) {
        Nodo novoNodo = new Nodo(e);
        if(top == null){
            top = novoNodo;
            tamanho++;
            return;
        }
        Nodo antigoTop = top;
        top = novoNodo;
        antigoTop.proximo = novoNodo;
        tamanho++;
    }

    @Override
    public int pop() {
        Nodo aux = top;
        top = null;
        tamanho--;
        return aux.elemento;
    }

    @Override
    public int top() {
        return top.elemento;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public boolean isEmpty() {
        if(top == null){
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        while(tamanho != 0){
            pop();
            tamanho--;
        }
    }

    @Override
    public String toString() {
        String aux = " ";
        aux += "[ ";
        aux += top.elemento;
        aux += " ]";
        return aux;
    }
    
}
