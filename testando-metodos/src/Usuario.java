public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv SmartTv = new SmartTv();

        System.out.println("Tv ligada? " + SmartTv.ligada );
        System.out.println("Canal Atual: " + SmartTv.canal );
        System.out.println("Volume Atual: " +SmartTv.volume );

        SmartTv.ligar();
        System.out.println("Tv ligada? " + SmartTv.ligada );

        SmartTv.aumentarCanal();
        System.out.println("Canal Atual: " + SmartTv.canal );

        SmartTv.diminuirCanal();
        System.out.println("Canal Atual: " + SmartTv.canal );

        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();
        System.out.println("Volume Atual: " + SmartTv.volume ); //Até aqui tudo certo

        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        System.out.println("Volume Atual: " + SmartTv.volume); //ok até aqui rodando como deveria rodar
    }
}
