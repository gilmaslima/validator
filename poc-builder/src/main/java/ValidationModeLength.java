
public class ValidationModeLength implements ValidationMode {

	
	
	private int length;

	public ValidationModeLength(int length) {
		this.length = length;
		
	}

	@Override
	public String verify(Object value) {
		
		if(value == null || value.toString().length() != length){
			return "Tamanho inválido";
		}
		
		return null;
	}

}
