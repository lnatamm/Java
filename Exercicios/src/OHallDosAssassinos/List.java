package OHallDosAssassinos;

public class List {

    private Person[] v;

    private int cont;

    public List() {

        this.v = new Person[10];

        this.cont = 0;

    }

    private void createEspace() {

        Person[] auxV = this.v;

        v = new Person[v.length + v.length / 2];

        for (int i = 0; i < auxV.length; i++) {

            this.v[i] = auxV[i];

        }

    }

    public void add(Person p) {

        try {

            this.v[cont] = p;

            cont++;

        } catch (IndexOutOfBoundsException e) {

            createEspace();

            add(p);

        }

    }

    public void addAssassination(Person killer, Person killed){
        if(contains(killer)){
            get(killer).incKillCount();
        }
        else {
            add(killer);
        }
        remove(killed);
    }

    public int size() {

        return this.cont;

    }

    public boolean isEmpty(){
        return cont == 0;
    }

    public void clear() {

        this.cont = 0;

    }

    public boolean contains(Person n) {

        for (int i = 0; i < this.cont; i++) {

            if (v[i].getName().equals(n.getName())) {

                return true;

            }

        }

        return false;

    }

    public void remove(Person n) {

        try {

            for (int i = 0; i < cont; i++) {

                if (v[i].getName().equals(n.getName())) {

                    v[i] = v[i + 1];
                    cont--;
                }

            }

        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }

    public void remove(int i) {

        try {

            for (int j = i; j < this.cont; j++) {

                this.v[j] = this.v[j + 1];

            }

            this.cont--;

        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }

    public Person remove(){
        Person ret = v[0];
        try {

            for (int j = 0; j < this.cont; j++) {

                this.v[j] = this.v[j + 1];

            }

            this.cont--;

        } catch (ArrayIndexOutOfBoundsException e) {

        }
        return ret;
    }

    public Person get(int i) {

        return v[i];

    }

    public Person get(Person p){

        for (int i = 0; i < this.cont; i++) {

            if (v[i].getName().equals(p.getName())) {

                return v[i];

            }

        }

        return null;

    }

    public int indexOf(Person n) {

        for (int i = 0; i < this.cont; i++) {

            if (this.v[i].equals(n)) {

                return i;

            }

        }

        return -1;

    }

    @Override
    public String toString() {

        String string = "";

        for (int i = 0; i < this.cont; i++) {

            string += v[i].getName() + " ";

        }

        return string;

    }

}
