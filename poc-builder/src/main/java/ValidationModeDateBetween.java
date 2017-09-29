import java.util.Date;

public class ValidationModeDateBetween implements ValidationMode{

	private Date d1;
	private Date d2;

	public ValidationModeDateBetween(Date d1, Date d2) {
		this.d1 = d1;
		this.d2 = d2;
	}

	@Override
	public String verify(Object value) {
		
		if(value != null && value instanceof Date){
			Date date = (Date) value;
			boolean between = d1.before(date) && d2.after(date);
			if(!between){
				return "Data não encontra-se dentro do intervalo";
			}
		} else {
			return "Data inválida";
		}
		return null;
	}
}
