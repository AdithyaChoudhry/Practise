package OOPS.Interfaces;

public class Allinonecar {


    private Engine typeofengine;//data hiding
    private Media player = new MediaPlayer();//creating objects
    public Allinonecar() {
        typeofengine =  new PowerEngine();//creating objects  and we are putting in constructor to make easy flow of program
    }

    public Allinonecar(Engine typeofengine) {
        this.typeofengine = typeofengine;//refering to the type of engine
    }

    public void start(){
        typeofengine.start();//refers to power engine start

    }

    public void stop(){
        typeofengine.stop();//refers to power engine stop
    }
public void startMusic(){
        player.start();//medial player starts
}


    public void stopMusic(){
        player.stop();
    }

    public void upgradeengine(){
        this.typeofengine=new ElectricalEngine();// upgrades the engine after again using the start
    }


}
