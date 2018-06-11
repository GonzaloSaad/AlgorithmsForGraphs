import graph.Graph;
import graph.UndirectedGraph;
import minimumspanningtree.MinimumSpanningTree;
import minimumspanningtree.PrimAlgorithm;

public class Main {
    public static void main(String[] args) {

        MinimumSpanningTree<String> prims = new PrimAlgorithm<>();


        Graph<String> ud1 = new UndirectedGraph<>();
        ud1.add("1");
        ud1.add("2");
        ud1.add("3");
        ud1.addArc("2","1",67);
        ud1.addArc("3","1",46);
        ud1.addArc("3","2",75);

        //System.out.println(prims.getMinimumSpanningTree(ud1,"3"));

        Graph<String> ud2 = new UndirectedGraph<>();
        ud2.add("1");
        ud2.add("2");
        ud2.add("3");
        ud2.add("4");
        ud2.add("5");
        ud2.add("6");
        ud2.addArc("1","2",50);
        ud2.addArc("1","3",80);
        ud2.addArc("2","3",60);
        ud2.addArc("2","4",20);
        ud2.addArc("3","5",40);
        ud2.addArc("2","5",30);
        ud2.addArc("4","5",10);
        ud2.addArc("4","6",10);
        ud2.addArc("5","6",500);

        System.out.println(prims.getMinimumSpanningTree(ud2,"1"));

    }
}
