package minimumspanningtree;

import graph.Arc;
import graph.Graph;
import graph.Node;
import graph.UndirectedGraph;

import java.util.*;

public class PrimAlgorithm<T> extends MinimumSpanningTree<T> {


    public PrimAlgorithm(Graph<T> graph, T start) {
        super(graph, start);
    }

    private Node<T> getAvailableNodeForArc(Set<Node<T>> unvisited, Arc<T> arc) {
        if (unvisited.contains(arc.getEnd())) {
            return arc.getEnd();
        }

        if (unvisited.contains(arc.getInit())) {
            return arc.getInit();
        }
        return null;
    }

    @Override
    protected void calculateMST(Graph<T> graph, T start) {
        if (graph == null)
            throw new NullPointerException();

        if (graph.isDirected()) {
            throw new IllegalArgumentException();
        }

        int s = 0;
        Node<T> node = graph.getNode(start);
        final Set<Node<T>> unvisited = new HashSet<>(graph.getVertices());
        unvisited.remove(node);

        final LinkedList<Arc<T>> path = new LinkedList<>();
        final Queue<Arc<T>> arcAvailable = new PriorityQueue<>();


        while (!unvisited.isEmpty()) {

            for (Arc<T> arc : node.getArcs()) {
                if (getAvailableNodeForArc(unvisited, arc) != null) {
                    arcAvailable.add(arc);
                }
            }

            Arc<T> arc;

            do {
                arc = arcAvailable.remove();
            } while (getAvailableNodeForArc(unvisited, arc) == null);


            s += arc.getWeight();
            path.add(arc);

            node = getAvailableNodeForArc(unvisited,arc);
            unvisited.remove(node);
        }


        Graph<T> MST = new UndirectedGraph<>();
        for(Node<T> n: graph.getVertices()){
            MST.add(n.getValue());
        }
        for(Arc<T> a: path){
            MST.add(a);
        }

        this.MSTGraph = MST;
        this.valueOfMSTGraph = s;

    }
}
