package minimumspanningtree;

import graph.Graph;
import graph.Node;

public abstract class MinimumSpanningTree<T> {

    protected Graph<T> MSTGraph;



    protected int valueOfMSTGraph;


    public MinimumSpanningTree(Graph<T> graph, T start){
        calculateMST(graph, start);
    }

    protected abstract void calculateMST(Graph<T> graph, T start);

    public Graph<T> getMSTGraph() {
        return MSTGraph;
    }

    public int getValueOfMSTGraph() {
        return valueOfMSTGraph;
    }


}
