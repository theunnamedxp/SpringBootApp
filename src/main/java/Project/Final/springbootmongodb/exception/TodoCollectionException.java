package Project.Final.springbootmongodb.exception;

public class TodoCollectionException extends Exception {

	public TodoCollectionException(String message) {
		super(message);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String NotFoundException(String id)
	{
		return "Todo with "+id+" not found !";
	}
	
	public static String TodoAlreadyExists()
	{
		return "Todo with given name already exists";
	}
}
