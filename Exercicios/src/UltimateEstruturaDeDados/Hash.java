package UltimateEstruturaDeDados;

public class Hash<T> {
    private List<T>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public Hash() {
        table = (List<T>[]) new List[10];
        for(int i = 0; i < table.length; i++){
            table[i] = new List<T>();
        }
        size = 0;
    }

    private int hashing(T data){
        return data.hashCode() % table.length;
    }

    private void createEspace(){
        List<T>[] auxTable = new List[table.length];
        for(int i = 0; i < table.length; i++){
            auxTable[i] = table[i];
        }
        table = new List[table.length + (table.length / 2)];
        for(int i = 0; i < table.length; i++){
            if(table[i] != null){
                table[i] = auxTable[i];
            }
            else{
                table[i] = new List<T>();
            }
        }
    }

    public void add(T data){
        try {
            table[hashing(data)].add(data);
            size++;
        }
        catch (IndexOutOfBoundsException e){
            createEspace();
            add(data);
        }
    }

    public void remove(T data){
        table[hashing(data)].remove(data);
        size--;
    }

    public boolean contains(T data){
        int key = hashing(data);
        for(int i = 0; i < table[key].size(); i++){
            if(table[key].get(i).equals(data)){
                return true;
            }
        }
        return false;
    }

    public int size(){
        return size;
    }

    public void clear(){
        for(int i = 0; i < table.length; i++){
            table[i].clear();
        }
    }

    @Override
    public String toString()
    {
        String s = "";
        for(int i = 0; i < table.length - 1; i++) {
            s += "[";
            try {
                for(int j = 0; j < table[i].size() - 1; j++)
                {
                    s += table[i].get(j) + ", ";
                }
                s += table[i].get(table[i].size()) + ", ";
            }
            catch(Exception e) {
                s += "]";
            }
        }
        return s;
    }

}
