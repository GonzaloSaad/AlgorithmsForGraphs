package minimumspanningtree;

import graph.Graph;

public class KruskalAlgorithm<T>  {

    public int getMinimumSpanningTree(Graph<T> graph, T start) {

        /*String outputMessage = "";

        Collections.sort(graphEdges);        //sort edges with smallest weight 1st
        ArrayList<Edge> mstEdges = new ArrayList<Edge>();    //list of edges included in the Minimum spanning tree (initially empty)

        DisjointSet nodeSet = new DisjointSet(nodeCount + 1);        //Initialize singleton sets for each node in graph. (nodeCount +1) to account for arrays indexing from 0

        for (int i = 0; i < graphEdges.size() && mstEdges.size() < (nodeCount - 1); i++) {        //loop over all edges. Start @ 1 (ignore 0th as placeholder). Also early termination when number of edges=(number of nodes-1)
            Edge currentEdge = graphEdges.get(i);
            int root1 = nodeSet.find(currentEdge.getVertex1());        //Find root of 1 vertex of the edge
            int root2 = nodeSet.find(currentEdge.getVertex2());
            outputMessage += "find(" + currentEdge.getVertex1() + ") returns " + root1 + ", find(" + currentEdge.getVertex2() + ") returns " + root2;        //just print, keep on same line for union message
            String unionMessage = ",\tNo union performed\n";        //assume no union is to be performed, changed later if a union DOES happen
            if (root1 != root2) {            //if roots are in different sets the DO NOT create a cycle
                mstEdges.add(currentEdge);        //add the edge to the graph
                nodeSet.union(root1, root2);    //union the sets
                unionMessage = ",\tUnion(" + root1 + ", " + root2 + ") done\n";        //change what's printed if a union IS performed
            }
            outputMessage += unionMessage;
        }

        outputMessage += "\nFinal Minimum Spanning Tree (" + mstEdges.size() + " edges)\n";
        int mstTotalEdgeWeight = 0;
        for (Edge edge : mstEdges) {
            outputMessage += edge + "\n";        //print each edge
            mstTotalEdgeWeight += edge.getWeight();
        }
        outputMessage += "\nTotal weight of all edges in MST = " + mstTotalEdgeWeight;

        System.out.println(outputMessage);

        try (PrintWriter outputFile = new PrintWriter(new File("06outputMST.txt"));) {
            outputFile.println(outputMessage);
            System.out.println("\nOpen \"06outputMST.txt\" for backup copy of answers");
        } catch (FileNotFoundException e) {
            System.out.println("Error! Couldn't create file");
        }*/
        return 0;
    }


}
