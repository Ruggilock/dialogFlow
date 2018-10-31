package ruggi.chatbot.exception;


import ruggi.chatbot.exception.enums.ServerErrorType;

/**
 * Internal server exception
 * 
 * @author charz
 *
 */
public class InternalServerException extends BaseRuntimeException {

	private static final long serialVersionUID = 1L;

	public InternalServerException(ServerErrorType errorType) {
		super(errorType.getCode(), errorType.getMessage());
	}

}
