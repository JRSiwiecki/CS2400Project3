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
		int height = tree.getHeight();
		assertEquals(0, height);
		
		assertThrows(EmptyTreeException.class, () -> {tree.postorderTraverse(); });
	}
	
	@Test
	void UninitializedTreeTest()
	{
		BinaryTree<String> tree;
		int height = tree.getHeight();
		assertEquals(0, height);
		
		assertThrows(EmptyTreeException.class, () -> {tree.postorderTraverse(); });
	}
}
