package ruggi.chatbot.exception;


import ruggi.chatbot.exception.enums.NotFoundErrorType;

/**
 * Resource not found exception
 * 
 * @author charz
 *
 */
public class ResourceNotFoundException extends BaseRuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(NotFoundErrorType errorType) {
		super(errorType.getCode(), errorType.getMessage());
	}

}
