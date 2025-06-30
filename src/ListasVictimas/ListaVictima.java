/**
 * @author Greivin
 */
package ListasVictimas;

import Listas.Lista;
import Victimas.Victima;

public class ListaVictima implements Lista<Victima> {
    private static Victima Victimas[] = new Victima[100];

    @Override
    public void Agregar(Victima t) {
    }

    @Override
    public void Eliminar(Victima t) {
    }

    @Override
    public Victima Buscar(Object id) {
        int max = Victimas.length;
        for (int i = 0; i < max; i++) {
            if(Victimas[i] != null && Victimas[i].getCedula().equals(id)){
                return Victimas[i];
            }
        }
        return null;
    }
}