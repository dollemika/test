package TaskSeven;

public class Tree {
    private Nut[] n;
    public Tree(int amountOfNuts) {
        n = growArrayOfNuts(amountOfNuts);
    }

    public Nut[] getNutTree() {
        return n;
    }

    public Nut[] growArrayOfNuts(int n){
        this.n = new Nut[n];
        for (int i=0; i<n; i++) this.n[i] = new Nut();
        return this.n;
    }
}
