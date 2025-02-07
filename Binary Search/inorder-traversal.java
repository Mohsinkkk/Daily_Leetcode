class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer>li=new ArrayList<Integer>();
        in(root,li);
        return li;
    }
    void in(Node root,ArrayList<Integer>li){
        if(root==null) return;
        in(root.left,li);
        li.add(root.data);
        in(root.right,li);
    }
}
