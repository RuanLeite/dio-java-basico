public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();
        System.out.println("TV ligada ? " + smartTv.ligada);
        smartTv.ligarTV();
        System.out.println("TV ligada ? " + smartTv.ligada);

        System.out.println("Volume atual : " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual : " + smartTv.volume);


        System.out.println("Canal atual : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.desligarTV();
        System.out.println("TV ligada ? " + smartTv.ligada);

    }
}
