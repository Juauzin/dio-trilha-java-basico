public class SmartTv {
    
    boolean Ligada=false;
    int canal=1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    
    }

    public void diminuiRCanal(){
        canal--;

    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando Volume para" + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o Volume para " + volume);
}

    public void Ligar(){
        Ligada=true;
    }
    public void desligar(){
        Ligada=false;
    }
}
