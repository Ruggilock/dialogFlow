package ruggi.chatbot.exception;


import ruggi.chatbot.exception.enums.ServerErrorType;

/**
 * Not implemented exception
 * 
 * @author charz
 *
 */
public class NotImplementedException extends BaseRuntimeException {

	private static final long serialVersionUID = 1L;

	public NotImplementedException(ServerErrorType errorType) {
		super(errorType.getCode(), errorType.getMessage());
	}

}
