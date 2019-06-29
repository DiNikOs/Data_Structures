package ru.geekbrain.HW.HW7;

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

        graph.cfs("Moscow", "Voronezh");
        System.out.println("--------------");

    }
}
