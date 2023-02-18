public class Arbol {
    NodoArbol inicial;
    public Arbol(){
        this.inicial=null;
    }
    public void insertar(int valor){
        if (this.inicial==null){
            this.inicial= new NodoArbol(valor);
        }else{
            this.inicial.insertar(valor);
        }
    }


    public void ImprimirpreOrden(){
        this.preOrden(this.inicial);
    }
    public void preOrden(NodoArbol nodo){
        if(nodo==null){
            return;
        }else{
            System.out.println(nodo.getValorNodo());
            preOrden(nodo.nodoIzq);
            preOrden(nodo.getNodoDerecho());

        }
    }
    public void ImprimirinOrden(){
        this.inOrden(this.inicial);
    }
    public void inOrden(NodoArbol nodo){
        if(nodo==null){
            return;
        }else{
            inOrden(nodo.getNodoIzq());
            System.out.println(nodo.getValorNodo());
            inOrden(nodo.getNodoDerecho());

        }
    }
    public void ImprimirpostOrden(){
        this.postOrden(this.inicial);
    }
    public void postOrden(NodoArbol nodo){
        if(nodo==null){
            return;
        }else{
            postOrden(nodo.getNodoDerecho());
            System.out.println(nodo.getValorNodo());

        }
    }


}
