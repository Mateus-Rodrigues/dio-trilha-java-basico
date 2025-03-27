public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void AumentarVolume(){
        volume ++;
    }

    public void DiminuirVolume(){
        volume --;
    }

    public void mudarCanal(){
        canal ++;
    }

    public void MudarCanal(){
        canal --;
    }
    
}
