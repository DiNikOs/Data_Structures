package ru.geekbrain.HW.HW7;

import java.util.Stack;

public class HW7 {

    public static void main(String[] args) {
        testBfs();
    }

    private static void testBfs() {
        Graph graph = new Graph(10);
        graph.addVertex("Moscow");
        graph.addVertex("Tula");
        graph.addVertex("Ryazan");
        graph.addVertex("Kaluga");
        graph.addVertex("Lipetsk");
        graph.addVertex("Tambov");
        graph.addVertex("Orel");
        graph.addVertex("Saratov");
        graph.addVertex("Kursk");
        graph.addVertex("Voronezh");

        graph.addEdges("Moscow", "Tula", "Ryazan", "Kaluga");
        graph.addEdge("Tula", "Lipetsk");
        graph.addEdge("Lipetsk", "Voronezh");
        graph.addEdge("Ryazan", "Tambov");
        graph.addEdge("Tambov", "Saratov");
        graph.addEdge("Saratov", "Voronezh");
        graph.addEdge("Kaluga", "Orel");
        graph.addEdge("Orel", "Kursk");
        graph.addEdge("Kursk", "Voronezh");

        //Stack<String> path = graph.cfs("Moscow", "Voronezh");
        Stack<String> path = graph.cfs("Ryazan", "Kursk");
        System.out.println("\n Shortest path:");
        showShortPath(path);
    }

    private static void showShortPath(Stack<String> path) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        int lenght = 0;

        while ( !path.isEmpty() ) {
            if (!isFirst) {
                sb.append(" -> ");
            }
            isFirst = false;
            sb.append(path.pop());
            lenght++;
        }
        System.out.println(sb);
        System.out.printf("Path = %d vertex", lenght);
    }
}
