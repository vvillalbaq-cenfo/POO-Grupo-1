public class Main {
    public static void main(String[] args) {
        MElectrico motorE = new MElectrico("Toshiba", "EGP5", 5000, 2.5f);
        MCGasolina motorG = new MCGasolina("Nissan", "N300", 3500, 95f);
        MCDiesel motorD = new MCDiesel("Cummis", "C789", 25000, 150f);
 
        System.out.println(motorE);
        System.out.println(motorG);
        System.out.println(motorD);


        motorE.setAlgo(350.0f);
        motorG.setAlgo(98.0f);
        motorD.setAlgo(200.0f);

        System.out.println("Modificando atributos");
        System.out.println(motorE.toString());
        System.out.println(motorG.toString());
        System.out.println(motorD.toString());

    }
}
