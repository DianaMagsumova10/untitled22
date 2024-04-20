package lessons20;

public class CreditCardIssue {
    public static void main(String[] args) {

        PhoneNumberRegisterService service = new PhoneNumberRegisterService();
        try {
            service.validatePhone("+1-111-111-11-11");
        } catch (PhoneNumberIsExistException e) {
            e.printStackTrace();
        }
    }
}
