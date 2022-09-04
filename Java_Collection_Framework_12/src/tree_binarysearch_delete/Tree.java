package tree_binarysearch_delete;

public interface Tree<E> {
    boolean insert(E e);

    void postorder();

    void inorder();

    void preorder();

    int getSize();

    boolean delete(E e);

    boolean search(E e);
}
