package TaskSeven;

public class Squirrel {
    public void pickNutsFromTree(Tree t){
        double sum = 0;
        int n = t.getNutTree().length;
        for (int i =0; i<n; i++){
            sum+=t.getNutTree()[i].getWeight();
            System.out.println("ура, ещё орех! "+t.getNutTree()[i].getWeight());
        }
        System.out.println("собрала "+sum+" кг. орехов!");
    }
}
