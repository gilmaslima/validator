import java.util.List;

public class ValidationModeNull implements ValidationMode{

	@Override
	public String verify(Object value) {
		
		if(value == null){
			return "Valor nulo";
		}
		return null;
	}

}
