import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Validator {

	private List<String> errors = new ArrayList<String>();
	
	public ValidatorResponse validate(){
		return new ValidatorResponse(this);
	}

	public Validator verify(Object value, ValidationMode mode){
		add(mode.verify(value));
		return this;
	}
	
	private void add(String error) {
		if(error != null){
			errors.add(error);
		}
	}

	public static ValidationModeNull notNull(){
		return new ValidationModeNull();
	}
	
	public static ValidationModeCep cep(){
		return new ValidationModeCep();
	}
	
	public static ValidationModeEmail email(){
		return new ValidationModeEmail();
	}
	
	public static ValidationModeDateBetween dateBetween(Date d1, Date d2){
		return new ValidationModeDateBetween(d1, d2);
	}
	
	public static ValidationModeLength length(int length){
		return new ValidationModeLength(length);
	}
	
	public static ValidationModeLengthBetween lengthBetween(int min, int max){
		return new ValidationModeLengthBetween(min, max);
	}
	
	List<String> getErrors() {
		return errors;
	}
}
