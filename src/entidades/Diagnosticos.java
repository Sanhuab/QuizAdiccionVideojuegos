
package entidades;

public class Diagnosticos {
    
    private int idDiagnostico;
    private int idPacinete;
    private String diagnostico;
    private int puntos;

    public Diagnosticos(int idDiagnostico, int idPacinete, String diagnostico, int puntos) {
        this.idDiagnostico = idDiagnostico;
        this.idPacinete = idPacinete;
        this.diagnostico = diagnostico;
        this.puntos = puntos;
    }

    public Diagnosticos() {
        
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public int getIdPacinete() {
        return idPacinete;
    }

    public void setIdPacinete(int idPacinete) {
        this.idPacinete = idPacinete;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
