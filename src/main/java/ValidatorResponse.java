import java.util.List;

public class ValidatorResponse {

	private List<String> errors;
	
	public ValidatorResponse(Validator validator) {
		errors = validator.getErrors();// TODO Auto-generated constructor stub
	}

	public boolean hasErrors(){
		return !errors.isEmpty();
	}

	public List<String> getErrors() {
		return errors;
	}
	
	
}
