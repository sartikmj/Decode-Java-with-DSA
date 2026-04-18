package Trees.BinarySearchTree.Questions;

//Leetcode 108
public class ConvertSortedArrayIntoBST {

    public Node helper(int[] arr, int lo, int hi){
        if(lo>hi) return null;
        int mid = (lo+hi)/2;
        Node root = new Node(arr[mid]);
        root.left = helper(arr,lo,mid-1);
        root.right = helper(arr,mid+1,hi);
        return root;
    }
    public Node sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
}
