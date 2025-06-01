package interfaces;

import java.util.List;

public interface INodo {
	
	
    int getValor();
    void agregarVecino(INodo vecino, int peso);
    List<INodo> getVecinos();
    List<Integer> getPesos();
    
    
}
