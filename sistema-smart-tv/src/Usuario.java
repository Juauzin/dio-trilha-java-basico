public class Usuario {

    public static void main(String[] args) throws Exception{
        
        SmartTv smartTv  = new SmartTv ();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);

        System.out.println("Volume Atual" + smartTv.volume);


        System.out.println("TV Ligada?" + smartTv.Ligada);
        System.out.println("Canal Atual:" + smartTv.canal);
        System.out.println("Volume Atual:" + smartTv.volume);

        smartTv.Ligar ();
        System.out.println("Novo Status -> TV LIgada" + smartTv.Ligada );

        smartTv.desligar();
        System.out.println("Novo Status -> TV LIgada" + smartTv.Ligada);


    }
    
    }

