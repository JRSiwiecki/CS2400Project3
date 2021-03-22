import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * JUnit test class for testing edge cases.
 * @author Joseph
 *
 */
class EdgeCases 
{
	@Test
	void EmptyTreeTest() 
	{
		BinaryTree<String> tree = new BinaryTree<>();
		
		assertThrows(EmptyTreeException.class, () -> {tree.getHeight(); });
		assertThrows(EmptyTreeException.class, () -> {tree.postorderTraverse(); });
		assertThrows(EmptyTreeException.class, () -> {tree.getNumberOfNodes(); });
	}	
	
	/* No real way to test if a variable/object is uninitialized, no? You can 
	 * test if it is null I suppose but that is only works if the variable/object
	 * was initialized beforehand?
	@Test
	void UninitTreeTest()
	{
		BinaryTree<String> tree;
		
		assertThrows(EmptyTreeException.class, () -> {tree.getHeight(); });
		assertThrows(EmptyTreeException.class, () -> {tree.postorderTraverse(); });
		assertThrows(EmptyTreeException.class, () -> {tree.getNumberOfNodes(); });
	}
	*/
}
