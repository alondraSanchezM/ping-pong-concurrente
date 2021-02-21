
import Jpmi.*;

public class SujetoA implements Proceso { 

    Mensaje msgEnviar, msgRec;
    CanalSimple out, in;

    public SujetoA(Mensaje msgEnviar, CanalSimple out, CanalSimple in) {
        this.out = out;
        this.in = in;
        this.msgEnviar = msgEnviar;
        msgRec = new Mensaje();
    }

    public void run() {
        msgRec = (Mensaje) in.receive();
        System.out.println("Sujeto A recibe " + msgRec.mensaje + " de " + msgRec.id + ".");
        System.out.println(msgEnviar.id + " envia " + msgEnviar.mensaje + " al Sujeto B...");
        out.send(msgEnviar);
    }
}
