package adapter;

// Вывод результата проверки рецепта в консоль

public class PrescriptionPrinter {

    public static void printResult(
            PrescriptionService service,
            String prescriptionId) {

        boolean result = service.checkPrescription(prescriptionId);

        if (result) {
            System.out.println(
                    "Рецепт " + prescriptionId + " подтвержден");
        } else {
            System.out.println(
                    "Рецепт " + prescriptionId + " отсутствует");
        }
    }
}
