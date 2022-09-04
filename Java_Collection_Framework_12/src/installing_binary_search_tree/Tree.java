package installing_binary_search_tree;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();
    int getSize();
}
