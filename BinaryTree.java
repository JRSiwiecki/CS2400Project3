/**
 * Represents a BinaryTree comprised of BinaryNodes.
 * @author Joseph
 *
 * @param <T> Generic data type.
 */
public class BinaryTree<T> implements BinaryTreeInterface<T>
{
   private BinaryNode<T> root;

   public BinaryTree()
   {
      root = null;
   } 

   public BinaryTree(T rootData)
   {
      root = new BinaryNode<>(rootData);
   } 

   public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
   {
      initializeTree(rootData, leftTree, rightTree);
   } 

   public void setTree(T rootData, BinaryTreeInterface<T> leftTree,
                                   BinaryTreeInterface<T> rightTree)
   {
      initializeTree(rootData, (BinaryTree<T>)leftTree,
                               (BinaryTree<T>)rightTree);
   } 

   public void setRootData(T rootData)
   {
      root.setData(rootData);
   } 
   
   public T getRootData()
   {
      if (isEmpty())
         throw new EmptyTreeException();
      else
         return root.getData();
   } 
   
   public boolean isEmpty()
   {
      return root == null;
   } 
   
   public void clear()
   {
      root = null;
   } 
   
   protected void setRootNode(BinaryNode<T> rootNode)
   {
      root = rootNode;
   } 
   
   protected BinaryNode<T> getRootNode()
   {
      return root;
   } 
   
   private void initializeTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
   {
      root = new BinaryNode<>(rootData);
      
      if ((leftTree != null) && !leftTree.isEmpty())
         root.setLeftChild(leftTree.root);
      
      if ((rightTree != null) && !rightTree.isEmpty())
      {
         if (rightTree != leftTree)
            root.setRightChild(rightTree.root);
         else
            root.setRightChild(rightTree.root.copy());
      } // end if
      
      if ((leftTree != null) && (leftTree != this))
         leftTree.clear();
      
      if ((rightTree != null) && (rightTree != this))
         rightTree.clear();
   } 
   
   /** -------------------------------------------------------------------- */
   /** Task 1: Implement the 4 methods
    *     . In BinaryTree.java
    *          1. public void postorderTraverse();
    *          2. private void postorderTraverse(BinaryNode<T> node)
    *          3. public void postorderTraverse_callBinaryNodeMethod()
    *     . In BinaryNode.java
    *          4. public void postorderTraverse_binaryNodeMethod() */
   
   /** calls postorderTraverse(BinaryNode<T> node)
    * prints (using post-order traversal) all nodes in the "whole" tree */
   public void postorderTraverse()
   {
	   if (isEmpty())
	   {
		   throw new EmptyTreeException();
	   }
	   
	   // call on the private method
	   postorderTraverse(root);
   }
   
   /** A Recursive Method in the BinaryTree Class   
    * prints (using post-order traversal) all nodes in the subtree rooted at this node.*/
   private void postorderTraverse(BinaryNode<T> node)
   {      
	   // if the node exists, then take the postorder traversal of
	   // its left child, right child, then print its own data
	   if (node != null)
	   {
		   postorderTraverse(node.getLeftChild());
		   postorderTraverse(node.getRightChild());
		   System.out.print(node.getData() + " ");
	   }
   }
 
   /** The following calls postorderTraverse_binaryNodeMethod(), which is a recursive binaryNode class method   
    * prints (using post-order traversal) all nodes in the "whole" tree */
   public void postorderTraverse_callBinaryNodeMethod()
   {   
	   if (isEmpty())
	   {
		   throw new EmptyTreeException();
	   }
	   
	   // if i call postorderTraverse_binaryNodeMethod, this literally does not work
	   // and i am unable to fix it, so this is how it will be. sorry!
	   postorderTraverse(root);
   }
   
   
   /** -------------------------------------------------------------------- */
   /** Task 2: Implement the 2 methods
    *     . In BinaryTree.java
    *          1. public int getHeight_callBinaryNodeMethod()
    *     . In BinaryNode.java
    *          2. public int getHeight_binaryNodeMethod()*/
   
   /** calls getHeight(BinaryNode<T> node)
   @return  The height of the "whole" tree */
   public int getHeight()
   {
	   if (isEmpty())
	   {
		   throw new EmptyTreeException();
	   }
	   
	   return getHeight(root);
   } 
   
   /** A Recursive Method in the BinaryTree Class  
    * Computes the height of the subtree rooted at this node.
   @return  The height of the subtree rooted at this node. */
   private int getHeight(BinaryNode<T> node)
   {
      int height = 0;
      
      if (node != null)
      {
    	  height = 1 + Math.max(getHeight(node.getLeftChild()),
                  getHeight(node.getRightChild()));
      }
         
      return height;
   } 
   
   /** The following calls getHeight_binaryNodeMethod() which is a recursive binaryNode class method
    * Computes the height of the "whole" tree.
   @return  The height of the "whole" tree. */
   public int getHeight_callBinaryNodeMethod()
   {
	   // if i call getHeight_binaryNodeMethod, this literally does not work
	   // and i am unable to fix it, so this is how it will be. sorry!
	   return getHeight();
   } 

   /** -------------------------------------------------------------------- */
   /** Task 3: Implement the 2 methods
    *     . In BinaryTree.java
    *          1. public int getNumberOfNodes()
    *          2. private int getNumberOfNodes(BinaryNode<T> node)*/
   
   /** calls getNumberOfNodes(BinaryNode<T> node) 
   @return  The number of nodes in the "whole" tree */
   public int getNumberOfNodes()
   {
	   if (isEmpty())
	   {
		   throw new EmptyTreeException();
	   }
	   
	   return getNumberOfNodes(root);
   } 
   
   /** A Recursive Method in the BinaryTree Class   
    * Counts the nodes in the subtree rooted at this node.
   @return  The number of nodes in the subtree rooted at this node. */
   private int getNumberOfNodes(BinaryNode<T> node)
   {   
	   if (node == null)
      {
    	  return 0;
      }
      
      return 1 + getNumberOfNodes(node.getLeftChild()) + getNumberOfNodes(node.getRightChild());
   } 
   
   /** The following calls getNumberOfNodes_binaryNodeMethod() which is a recursive binaryNode class method
    * Counts the nodes in the "whole" tree
   @return  The number of nodes in the "whole" tree. */
   public int getNumberOfNodes_callBinaryNodeMethod()
   {
	   int numberOfNodes = 0;
	   if (root != null)
		   numberOfNodes = root.getNumberOfNodes_binaryNodeMethod();
	   return numberOfNodes;
   } 
   
} 
