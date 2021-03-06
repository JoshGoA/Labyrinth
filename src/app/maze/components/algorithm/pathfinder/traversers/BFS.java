package app.maze.components.algorithm.pathfinder.traversers;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Set;

import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

import app.maze.components.algorithm.pathfinder.PathFinder;

public class BFS extends PathFinder {

    private static final long serialVersionUID = 1L;

    @Override
    protected final TreeNode advance(final Set<MutableTreeNode> currGen)
            throws StackOverflowError, InterruptedException {
        return null;
    }

    @Override
    public AlgorithmParameterSpec getParameterSpec() {
        return null;
    }

}
