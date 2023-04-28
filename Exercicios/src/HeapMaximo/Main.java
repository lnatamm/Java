package HeapMaximo;

import javax.crypto.spec.GCMParameterSpec;

public class Main {
    
    public static void main(String[] args) {
        
        Heap<Integer> h = new Heap<Integer>();
        h.enqueue(92);
        h.enqueue(32);
        h.enqueue(7);
        h.enqueue(102);
        h.enqueue(72);

        System.out.println(h);

    }

}
