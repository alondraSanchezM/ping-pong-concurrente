
import Jpmi.*;

public class pingPong {
    
    public static void main(String args[]) {
        CanalSimple c1 = new CanalSimple();
        CanalSimple c2 = new CanalSimple();

        while (true) {
            int n = (int) (Math.random() * 101);
            int m = (int) (Math.random() * 101);

            Mensaje msg1 = new Mensaje("Sujeto A", n);
            Mensaje msg2 = new Mensaje("Sujeto B", m);

            Paralelo par = new Paralelo(new Proceso[]{
                new SujetoA(msg1, c1, c2),
                new SujetoB(msg2, c1, c2),
            });

            par.run();
        }

    }
}
  
  
  