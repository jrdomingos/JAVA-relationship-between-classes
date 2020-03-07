package vetores.java;  

public class LaboratorioInformatica {
     
    private ArCondicionado[] arCondicionado = new ArCondicionado[2];

    public LaboratorioInformatica() {
    }

    public LaboratorioInformatica( ArCondicionado[] arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public ArCondicionado[] getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(ArCondicionado[] arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public String toString() {
        return "LaboratorioInformatica{" + "arCondicionado=" + arCondicionado + '}';
    }
    
    
     
     
}
