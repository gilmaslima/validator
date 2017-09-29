import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

	public static void main(String[] args) throws ParseException {

		String nome = "Gilmar";

		int idade = 37;

		String email = "gilmaslima@gmail.com";

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataNascimento = df.parse("18/12/1979");
		Date d1 = df.parse("18/12/1990");
		Date d2 = df.parse("18/12/1999");
		
		ValidatorResponse response = new Validator().verify(nome, Validator.notNull())
				.verify(email, Validator.email())
				.verify(dataNascimento, Validator.dateBetween(d1, d2)).validate();

		System.out.println(response.hasErrors());
		System.out.println(response.getErrors());

	}

}
