package ruggi.chatbot.exception;


import ruggi.chatbot.exception.enums.UnauthorizedErrorType;

/**
 * Unauthorized exception
 * 
 * @author charz
 *
 */
public class UnauthorizedException extends BaseRuntimeException {

	private static final long serialVersionUID = 1L;

	public UnauthorizedException(UnauthorizedErrorType errorType) {
		super(errorType.getCode(), errorType.getMessage());
	}

}
