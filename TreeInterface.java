/**
 * Provides generic implentation of a tree.
 * @author Joseph
 *
 * @param <T> Generic data type.
 */
public interface TreeInterface<T>
{
   public T getRootData();
   public int getHeight();
   public int getNumberOfNodes();
   public boolean isEmpty();
   public void clear();
} 
