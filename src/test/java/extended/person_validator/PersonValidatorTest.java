package extended.person_validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.Assert.assertTrue;

@DisplayName("Testing PersonValidator")
public class PersonValidatorTest {

    @Nested
    @DisplayName("When using valid data")
    @ExtendWith(ValidPersonParameterResolver.class)
    public class ValidData{
        @RepeatedTest(10)
        @DisplayName("All first names are valid")
        public void testValidateFirstname(Person person){
            assertTrue(PersonValidator.validateFirstName(person));
        }
    }

    @Nested
    @DisplayName("When using valid data")
    @ExtendWith(InvalidPersonParameterResolver.class)
    public class InValidData{
        @RepeatedTest(10)
        @DisplayName("All first names are invalid")
        public void testValidateFirstname(Person person){
            assertTrue(PersonValidator.validateFirstName(person));
        }
    }

}
