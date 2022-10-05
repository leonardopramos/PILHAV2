public class PilhaArray implements PilhaTAD{

    private Integer[] arr;
    private Integer top;
    private int tamanho;

    public PilhaArray(int tamanho){
        this.tamanho = tamanho;
        this.arr = new Integer[tamanho];
        this.top = arr[tamanho - 1];
    }

    @Override
    public void push(int e) {
        if(top == null){
            top = e;
            return;
        }
        Integer antigoTop = top;
        arr[tamanho - 1] = antigoTop;
        top = e;
        return;
    }

    @Override
    public int pop() {
        int aux = arr[tamanho - 1];
        arr[tamanho -1] = null;
        return aux;
    }

    @Override
    public int top() {
        return this.top;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public boolean isEmpty() {
        for(int i = 0; i < tamanho; i++){
            if(arr[i] != null){
                return false;
            }
        }
        return true;
    }

    @Override
    public void clear() {
        for(int i = 0; i < tamanho; i++){
            arr[i] = null;
        }
        
    }

}