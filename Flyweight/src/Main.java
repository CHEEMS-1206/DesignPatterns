import com.designPatterns.client.Forest;


public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        // Plant trees with shared types
        forest.plantTree(1, 2, "Oak", "Green", 2);
        forest.plantTree(3, 5, "Pine", "Dark Green", 5);
        forest.plantTree(10, 15, "Oak", "Green", 6);  // Uses existing Oak type
        forest.plantTree(7, 12, "Pine", "Dark Green", 8);  // Uses existing Pine type
        // values out : 2, 5, 2, 5 hence clear no new objects created in case already a treeType exists
        // Draw all trees
        forest.drawForest();
    }
}
