class Main {
  public static void main(String[] args) {
    String[] vertices = {
      "Liberal Arts",
      "Student Services",
      "Health Careers & Sciences",
      "Health Technologies Center",
      "Recreation Center",
      "Technology Learning Center",
      "Business & Technology",
      "Theatre"
    };

    int[][] edges = {
      {0, 1}, // Liberal Arts - Student Services
      {1, 2}, // Student Services - Health Careers & Sciences
      {2, 3}, // Health Careers & Sciences - Health Technologies Center
      {1, 5}, // Student Services - Technology Learning Center
      {5, 4}, // Technology Learning Center - Recreation Center
      {5, 6}, // Technology Learning Center - Business & Technology
      {6, 7}  // Business & Technology - Theatre
    };

    Graph<String> graph = new UnweightedGraph<>(vertices, edges);

    // Get a dfs starting at the Business and Technology Building
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(graph.getIndex("Business & Technology"));

    // Print paths
    System.out.println("Path from Business & Technology to Health Technologies Center:");
    dfs.printPath(graph.getIndex("Health Technologies Center"));

    System.out.println("\nPath from Business & Technology to Student Services:");
    dfs.printPath(graph.getIndex("Student Services"));

    System.out.println("\nPath from Business & Technology to Recreation Center:");
    dfs.printPath(graph.getIndex("Recreation Center"));

    // Print the entire DFS tree
    System.out.println("\nDFS Tree:");
    dfs.printTree();
  }
}
