package installing_binary_search_tree;

public abstract class AbstractTree<E extends Comparable<E>> implements Tree {
    public abstract boolean insert(E e);

    @Override
    public void inorder() {
    }
}
