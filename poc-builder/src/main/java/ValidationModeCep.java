import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationModeCep implements ValidationMode {

	private Pattern pattern;
	private Matcher matcher;

	private static final String CEP_PATTERN =
		"([0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9])";

	public ValidationModeCep() {
		pattern = Pattern.compile(CEP_PATTERN);
	}
	
	@Override
	public String verify(Object value) {
		if(value != null){
			matcher = pattern.matcher(value.toString());
			return matcher.matches() ? null : "CEP inválido";

		}
		return null;
	}


	
}



