import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        int lowerLimit; //нижняя граница
        int upperLimit; //верхняя граница

        SQRService service = new SQRService();

        int count = service.calculate(200, 300);

        System.out.println(count);

    }
}
