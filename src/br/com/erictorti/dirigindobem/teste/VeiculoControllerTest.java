package br.com.erictorti.dirigindobem.teste;

import java.util.Set;

import static org.junit.Assert.*;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.Test;

import br.com.erictorti.dirigindobem.modelo.Veiculo;

public class VeiculoControllerTest {

	private static Validator validator;

	@Before
	public void setUp() throws Exception {
		ValidatorFactory validatorFactory = Validation
				.buildDefaultValidatorFactory();
		validator = validatorFactory.getValidator();
	}

	@Test
	public void naoAceitaPlacaNula() {
		Veiculo veiculo = new Veiculo();
		veiculo.setPlaca(null);

		Set<ConstraintViolation<Veiculo>> constraintViolations = validator
				.validate(veiculo);

		assertEquals(1, constraintViolations.size());
	}

	@Test
	public void naoAceitaPlacaComMaisDeOitoCaracteres() {
		Veiculo veiculo = new Veiculo();
		veiculo.setPlaca("um-monte-de-caracteres");

		Set<ConstraintViolation<Veiculo>> constraintViolations = validator
				.validate(veiculo);
		for (ConstraintViolation<Veiculo> violation : constraintViolations) {
			System.out.println(violation.getMessage());
			System.out.println(violation.getMessageTemplate());
			System.out.println(violation.getRootBean());
			System.out.println(violation.getInvalidValue());
		}
		assertEquals(1, constraintViolations.size());
	}
	
	@Test
	public void naoAceitaPlacaComMenosDeOitoCaracteres() {
		Veiculo veiculo = new Veiculo();
		veiculo.setPlaca("");

		Set<ConstraintViolation<Veiculo>> constraintViolations = validator
				.validate(veiculo);
		
		for (ConstraintViolation<Veiculo> violation : constraintViolations) {
			System.out.println(violation.getMessage());
			System.out.println(violation.getMessageTemplate());
			System.out.println(violation.getRootBean());
			System.out.println(violation.getInvalidValue());
		}
		
		assertEquals(1, constraintViolations.size());
	}
	
	@Test
	public void naoAceitaPlacaQueNaoAtendeARegex() {
		Veiculo veiculo = new Veiculo();
		veiculo.setPlaca("AA5151");

		Set<ConstraintViolation<Veiculo>> constraintViolations = validator
				.validate(veiculo);
		
		for (ConstraintViolation<Veiculo> violation : constraintViolations) {
			System.out.println(violation.getMessage());
			System.out.println(violation.getMessageTemplate());
			System.out.println(violation.getRootBean());
			System.out.println(violation.getInvalidValue());
		}
		
		assertEquals(1, constraintViolations.size());
	}

}
