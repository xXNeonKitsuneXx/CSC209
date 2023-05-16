public class BinarySearchTreeLab {
    public static void main(String[] args) {
        BSTtree tree1 = new BSTtree();
        tree1.insert(59);
        tree1.insert(100);
        tree1.insert(20);
        tree1.insert(200);
        //      59
        //  20      100
        //              200
        System.out.println(tree1.root.info);
        System.out.println(tree1.root.right.info);
        System.out.println(tree1.root.right.right.info);
        System.out.println(tree1.root.left.info);

        BSTnode s = tree1.search(1000);
        if (s != null) {
            System.out.println("Search: " + s.info);
        }
        else {
            System.out.println("Search: Not found");
        }

//////////////////////////////////////////////////////////////////////
        System.out.println();
//////////////////////////////////////////////////////////////////////

        tree1.insert(31);
        tree1.insert(43);
        tree1.insert(150);
        tree1.insert(1911);
        //        59
        //  20          100
        //     31           200
        //       43      150   1911

        //preorder: 59, 20, 31, 43, 100, 200, 150, 1911
        //inorder: 20, 31, 43, 59, 100, 150, 200, 1911 (Always look like sort)
        //postorder: 43, 31, 20, 150, 1911, 200, 100, 59
        System.out.println("---preorderTraversalIterative---");
        tree1.preorderTraversalIterative();

//////////////////////////////////////////////////////////////////////
        System.out.println();
//////////////////////////////////////////////////////////////////////

        //preorder: 59, 20, 31, 43, 100, 200, 150, 1911
        System.out.println();
        System.out.println("--preorderTraversalRecursion--");
        tree1.preorderTraversalRecursion(tree1.root);

        //inorder: 20, 31, 43, 59, 100, 150, 200, 1911 (Always look like sort)
        System.out.println();
        System.out.println("---inorderTraversalRecursion---");
        tree1.inorderTraversalRecursion(tree1.root);

        //postorder: 43, 31, 20, 150, 1911, 200, 100, 59
        System.out.println();
        System.out.println("--postorderTraversalRecursion--");
        tree1.postorderTraversalRecursion(tree1.root);

//////////////////////////////////////////////////////////////////////
        System.out.println();
//////////////////////////////////////////////////////////////////////

        System.out.println();
        //        59
        //  20          100
        //     31           200
        //       43      150   1911

        //Case 1 delete root
//        System.out.println("---DeleteByMerging: Delete root---");
//        tree1.deleteByMerging(59); //Delete root;
//        //  20
//        //     31
//        //       43
//        //          100
//        //              200
//        //           150    1911
//        System.out.println(tree1.root.info);
//        System.out.println(tree1.root.right.right.right.info);

//        //Case 2 delete _____
//        System.out.println("---DeleteByMerging: Delete _____---");
//        tree1.deleteByMerging(31);
//        System.out.println(tree1.root.left.right.info);
//        //        59
//        //  20          100
//        //     43           200
//        //               150   1911

//        //Case 3 delete _____
//        System.out.println("---DeleteByMerging: Delete _____---");
//        tree1.deleteByMerging(200);
//        System.out.println(tree1.root.right.right.info);
//        System.out.println(tree1.root.right.right.right.info);
//        //        59
//        //  20          100
//        //     31           150
//        //       43            1911

        //Case 4 delete leaf
        System.out.println("---DeleteByMerging: Delete leaf---");
        tree1.deleteByMerging(150);
        System.out.println(tree1.root.right.right.left);
        //        59
        //  20          100
        //     31           200
        //       43            1911
        // ***** But Get Error if type .info because it is "null" *****
    }
}