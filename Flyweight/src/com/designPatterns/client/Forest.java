package com.designPatterns.client;

import com.designPatterns.contextClass.Tree;
import com.designPatterns.flyweightClass.TreeType;
import com.designPatterns.flyweightFactory.TreeFactory;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, int val) {
        TreeType type = TreeFactory.getTreeType(name, color, val); // Get shared TreeType
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void drawForest() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}
