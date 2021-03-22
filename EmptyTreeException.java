/**
 * Empty tree exception class.
 * @author Joseph
 *
 */
public class EmptyTreeException extends RuntimeException
{
	public EmptyTreeException()
	{
		this(null);
	} 

	public EmptyTreeException(String message)
	{
		super(message);
	} 
} 
