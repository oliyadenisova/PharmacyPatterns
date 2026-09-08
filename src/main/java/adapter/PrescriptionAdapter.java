package adapter;

// Адаптер, преобразующий сторонний API под интерфейс PrescriptionService

public class PrescriptionAdapter implements PrescriptionService {

    private ExternalMedicalApi externalApi;

   public PrescriptionAdapter(ExternalMedicalApi externalApi){
       this.externalApi = externalApi;
   }

    @Override
    public boolean checkPrescription(String prescriptionId) {
       String results = externalApi.validatePrescription(prescriptionId);
        return results.equals("VALID");
    }
}
