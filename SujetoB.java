
import Jpmi.*;

public class SujetoB implements Proceso {

    Mensaje msgEnviar, msgRec;
    CanalSimple in, out;

    public SujetoB(Mensaje msgEnviar, CanalSimple in, CanalSimple out) {
        this.in = in;
        this.out = out;
        this.msgEnviar = msgEnviar;
        msgRec = new Mensaje();
    }

    public void run() {
        System.out.println(msgEnviar.id + " envia " + msgEnviar.mensaje + " al Sujeto A...");
        out.send(msgEnviar);
        msgRec = (Mensaje) in.receive();
        System.out.println("Sujeto B recibiendo " + msgRec.mensaje + " de " + msgRec.id + ".");
    }
}
  
  