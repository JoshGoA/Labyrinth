package utils.DataStructures.Elements;

import utils.DataStructures.Element;

public final class Node extends Element {

    private final Node parent;
    private final Element val;
    private final int[] seed;

    /**
     * Individual node which stores pointer to parent node
     *
     * @param parent Node
     * @param val    int
     * @param seed   int[]
     */
    public Node(final Node parent, final Element val, final int[] seed) {
        this.parent = parent;
        this.val = val;
        this.seed = seed;
    }

    public String toString() {
        return String.format("Node(val: %d, seed: [%d, %d])", this.val, this.seed[0], this.seed[1]);
    }

    public Node get_parent() {
        return this.parent;
    }

    public Element get_val() {
        return this.val;
    }

    public int[] get_seed() {
        return this.seed;
    }

}