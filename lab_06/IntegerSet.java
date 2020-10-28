public class IntegerSet {
    private final boolean[] zbior;
    public IntegerSet() {
        this.zbior = new boolean[100];
    }
    public static IntegerSet union(IntegerSet a, IntegerSet b){
        IntegerSet n=new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if(a.zbior[i] || b.zbior[i])
            {
                n.zbior[i]=true;
            }
        }
        return n;

    }
    public static IntegerSet intersection(IntegerSet a, IntegerSet b){
        IntegerSet n=new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if(a.zbior[i] && b.zbior[i])
            {
                n.zbior[i]=true;
            }
        }
        return n;

    }

    public void insertElement(int a){
        this.zbior[a-1]=true;
    }
    public void deleteElement(int a){
        this.zbior[a-1]=false;
    }
    public String toString(){
        StringBuilder n=new StringBuilder();
        for (int i = 0; i < 100; i++) {
            if(this.zbior[i])
            {
                n.append(i+1);
                n.append(" ");
            }
        }
        return n.toString();

    }
    public boolean equals(IntegerSet b){
        return this.toString().equals(b.toString());
    }
}

