package graphdijkstra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class GraphWeighted {

    private Set<NodeWeighted> nodes;
    
    // Constructor
    public GraphWeighted() {
        nodes = new HashSet<>();
    }

    public void addNode(NodeWeighted... n) {
         nodes.addAll(Arrays.asList(n));
    }

    public void addEdge(NodeWeighted source, NodeWeighted destination, double weight) {
        nodes.add(source);
        nodes.add(destination);
        source.edges.add(new EdgeWeighted(source, destination, weight));
    }
    
    
    // Class of Node
    static public class NodeWeighted {
        int indx;
        String name;
        private boolean visited;
        LinkedList<GraphWeighted.EdgeWeighted> edges;

        // Constrcutor of Node
        public NodeWeighted(int indx, String name) {
            this.indx = indx;
            this.name = name;
            visited = false;
            edges = new LinkedList<>();
        }

        boolean isVisited() {
            return visited;
        }

        void visit() {
            visited = true;
        }

        void unvisit() {
            visited = false;
        }
    }
    
    // Class of Edge
    public class EdgeWeighted {
        NodeWeighted source;
        NodeWeighted destination;
        double weight;

        EdgeWeighted(NodeWeighted s, NodeWeighted d, double w) {
            source = s;
            destination = d;
            weight = w;
        }
    }
    
    
    public double DijkstraShortestPath(NodeWeighted start, NodeWeighted end) {
        
        // Pointers of Nodes
        HashMap<NodeWeighted, NodeWeighted> changedAt = new HashMap<>();
        changedAt.put(start, null);
        
        // Shortest path for everyNode
        HashMap<NodeWeighted, Double> shortestPathMap = new HashMap<>();

        // Put the start node 0
        shortestPathMap.put(start, 0.0);
        
        // For every node put OO 
        for (NodeWeighted node : nodes) 
                shortestPathMap.put(node, Double.POSITIVE_INFINITY);
        
        // Traverse the start edges
        for (EdgeWeighted edge : start.edges) {
            shortestPathMap.put(edge.destination, edge.weight);
            changedAt.put(edge.destination, start);
        }

        start.visit();

        
        
        while (true) {
            NodeWeighted currentNode = closestReachableUnvisited(shortestPathMap);
        
            if (currentNode == end) return shortestPathMap.get(end);
            
            currentNode.visit();

            for (EdgeWeighted edge : currentNode.edges) {
                if (edge.destination.isVisited()) continue;
                
                double curr = shortestPathMap.get(edge.destination);
                double othr = shortestPathMap.get(currentNode) + edge.weight;
                if (othr < curr ) 
                {
                    shortestPathMap.put(edge.destination, othr);
                    changedAt.put(edge.destination, currentNode);
                }
            }
        }
        
    }
    
    public NodeWeighted closestReachableUnvisited(HashMap<NodeWeighted, Double> shortestPathMap) {

        double shortestDistance = Double.POSITIVE_INFINITY;
        
        NodeWeighted closestReachableNode = null;
        
        for (NodeWeighted node : nodes) {
            
            if (node.isVisited()) continue;

            double currentDistance = shortestPathMap.get(node);
            
            if (currentDistance != Double.POSITIVE_INFINITY)
                if (currentDistance < shortestDistance) {
                    shortestDistance = currentDistance;
                    closestReachableNode = node;
                }
        }
        return closestReachableNode;
    }

}
