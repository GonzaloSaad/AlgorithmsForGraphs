package minimumspanningtree;

import graph.Graph;
import graph.Node;

public interface MinimumSpanningTree<T> {
    int getMinimumSpanningTree(Graph<T> graph, T start);
}
