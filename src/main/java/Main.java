public class Main {
    public static void main(String[] args) {
        final int INFANTRYMEN = 500;
        final int ORCS = 999;

        final int UNION = INFANTRYMEN + ORCS;

        System.out.println("Количество пехотинцев у Ланнистеров: " + INFANTRYMEN);
        System.out.println("Количество орков у Сарумана: " + ORCS);
        System.out.println("Количество войск в союзе Ланнистеров и Сарумана: " + UNION);
    }
}
