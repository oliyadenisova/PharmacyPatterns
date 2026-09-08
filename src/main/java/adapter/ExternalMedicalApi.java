package adapter;

// Условный сторонний медицинский API для проверки рецептов

public class ExternalMedicalApi {

    public String validatePrescription(String prescriptionNumber) {

        if (prescriptionNumber.equals("RX-123")) {
            return "VALID";
        }

        return "INVALID";
    }
}
