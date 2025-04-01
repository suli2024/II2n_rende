import java.time.LocalDate;

public class Employee {
    String nev;
    String anyjaNeve;
    String telpules;
    String lakcim;
    Double fizetes;
    LocalDate szuletes;
    Double jutalom;
    public Employee() {
    }
    public Employee(String nev, String anyjaNeve, String telpules, String lakcim, Double fizetes, LocalDate szuletes,
            Double jutalom) {
        this.nev = nev;
        this.anyjaNeve = anyjaNeve;
        this.telpules = telpules;
        this.lakcim = lakcim;
        this.fizetes = fizetes;
        this.szuletes = szuletes;
        this.jutalom = jutalom;
    }
    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }
    public String getAnyjaNeve() {
        return anyjaNeve;
    }
    public void setAnyjaNeve(String anyjaNeve) {
        this.anyjaNeve = anyjaNeve;
    }
    public String getTelpules() {
        return telpules;
    }
    public void setTelpules(String telpules) {
        this.telpules = telpules;
    }
    public String getLakcim() {
        return lakcim;
    }
    public void setLakcim(String lakcim) {
        this.lakcim = lakcim;
    }
    public Double getFizetes() {
        return fizetes;
    }
    public void setFizetes(Double fizetes) {
        this.fizetes = fizetes;
    }
    public LocalDate getSzuletes() {
        return szuletes;
    }
    public void setSzuletes(LocalDate szuletes) {
        this.szuletes = szuletes;
    }
    public Double getJutalom() {
        return jutalom;
    }
    public void setJutalom(Double jutalom) {
        this.jutalom = jutalom;
    }
    
}
