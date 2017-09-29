
public class ValidationModeLengthBetween implements ValidationMode {

	private int min;
	private int max;

	public ValidationModeLengthBetween(int min, int max) {
		this.min = min;
		this.max = max;
	}


	@Override
	public String verify(Object value) {
		
		if(value == null || checkLength(value)){
			return "Tamanho inválido";
		}
		
		return null;
	}


	private boolean checkLength(Object value) {
		int length = value.toString().length();
		return min <= length && max >= length;
	}
}
