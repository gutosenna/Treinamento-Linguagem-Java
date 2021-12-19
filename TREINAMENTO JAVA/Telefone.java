

public class Telefone {
    public Telefone telefone;
    public String cl, tr, tc, fx;
    public Telefone(String cl, String tr, String tc, String fx) {
        this.cl = cl;
        this.tr = tr;
        this.tc = tc;
        this.fx = fx;

}
    public Telefone getTelefone() {
        return telefone;
    }
    public String getCelular() {
        return cl;
    }
    public String getTelefone_residencial() {
        return tr;
    }
    public String getTelefone_comercial() {
        return tc;
    }
    public String getFax() {
        return fx;
    }
}