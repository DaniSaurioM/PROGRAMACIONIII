public class NodoArbol {
    int valorNodo;
    NodoArbol nodoIzq;
    NodoArbol nodoDerecho;

    public NodoArbol(int valorNodo) {
        this.valorNodo = valorNodo;
        this.nodoIzq = null;
        this.nodoDerecho = null;
    }

    public void insertar(int _valorNodo){
        if (_valorNodo<this.valorNodo){
            if (this.nodoIzq==null){
                this.nodoIzq=new NodoArbol(_valorNodo);
            }else{
                this.nodoIzq.insertar(_valorNodo);
            }
        }else{
            if (this.nodoDerecho==null){
                this.nodoDerecho=new NodoArbol(_valorNodo);
            }else{
                this.nodoDerecho.insertar(_valorNodo);
            }
        }
    }



    public void setValorNodo(int valorNodo) {
        this.valorNodo = valorNodo;
    }
    public int getValorNodo() {
        return valorNodo;
    }
    public NodoArbol getNodoIzq() {
        return nodoIzq;
    }
    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }
}
