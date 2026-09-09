package proxy;
import adapter.PrescriptionService;

// Реализация паттерна Прокси

public class PrescriptionProxy implements PrescriptionService {

    private PrescriptionService prescriptionService;
    private boolean authorized;

    public PrescriptionProxy(PrescriptionService prescriptionService, boolean authorized) {
        this.prescriptionService = prescriptionService;
        this.authorized = authorized;
    }

    @Override
    public boolean checkPrescription(String prescriptionId) {
        if (!authorized) {
            System.out.println("Доступ запрещён");
            return false;
        }
        System.out.println("Доступ разрешен");
        return prescriptionService.checkPrescription(prescriptionId);
    }
}
