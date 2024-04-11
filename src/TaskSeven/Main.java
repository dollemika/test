package TaskSeven;

public class Main {
    public static void main(String[] args){
        Squirrel s = new Squirrel();
        int r = (50 - 1) + 1;
        int n = (int)(Math.random()*r)+1;
        System.out.println("орехов будет: "+n);
        Tree t = new Tree(n);
        s.pickNutsFromTree(t);
    }
}
