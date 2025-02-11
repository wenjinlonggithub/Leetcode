package other.tree;

/**
 * Created by gouthamvidyapradhan on 21/03/2017. Given a binary tree, find the lowest common
 * ancestor (LCA) of two given nodes in the tree.
 *
 * <p>According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined
 * between two nodes v and w as the lowest node in T that has both v and w as descendants (where we
 * allow a node to be a descendant of itself).”
 *
 * <p>_______3______ / \ ___5__ ___1__ / \ / \ 6 _2 0 8 / \ 7 4 For example, the lowest common
 * ancestor (LCA) of nodes 5 and 1 is 3. Another example is LCA of nodes 5 and 4 is 5, since a node
 * can be a descendant of itself according to the LCA definition.
 */
public class LCA {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  /**
   * Main method
   *
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {}

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root != null) {
      if (root.equals(p) || root.equals(q)) return root;
      TreeNode left = lowestCommonAncestor(root.left, p, q);
      TreeNode right = lowestCommonAncestor(root.right, p, q);
      if (left != null && right != null) return root;
      else if (left != null) return left;
      else return right;
    }
    return null;
  }
}
