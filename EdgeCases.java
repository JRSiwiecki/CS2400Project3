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
}
