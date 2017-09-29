import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationModeEmail implements ValidationMode {

	
	private Pattern pattern;
	private Matcher matcher;

	private static final String EMAIL_PATTERN =
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public ValidationModeEmail() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}
	
	@Override
	public String verify(Object value) {
		if(value != null){
			matcher = pattern.matcher(value.toString());
			return matcher.matches() ? null : "Email inválido";

		}
		return null;
	}

}
