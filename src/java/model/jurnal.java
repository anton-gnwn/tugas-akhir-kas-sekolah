package model;

public class jurnal {

    public String getNojurnal() {
        return nojurnal;
    }

    public void setNojurnal(String nojurnal) {
        this.nojurnal = nojurnal;
    }

    public String getNotrans() {
        return notrans;
    }

    public void setNotrans(String notrans) {
        this.notrans = notrans;
    }

    public String getTgl_jurnal() {
        return tgl_jurnal;
    }

    public void setTgl_jurnal(String tgl_jurnal) {
        this.tgl_jurnal = tgl_jurnal;
    }

    public String getKet_jurnal() {
        return ket_jurnal;
    }

    public void setKet_jurnal(String ket_jurnal) {
        this.ket_jurnal = ket_jurnal;
    }

    public String getNo_akun() {
        return no_akun;
    }

    public void setNo_akun(String no_akun) {
        this.no_akun = no_akun;
    }

    public Double getDebet() {
        return debet;
    }

    public void setDebet(Double debet) {
        this.debet = debet;
    }

    public Double getKredit() {
        return kredit;
    }

    public void setKredit(Double kredit) {
        this.kredit = kredit;
    }
    
    private String nojurnal, notrans, tgl_jurnal, ket_jurnal, no_akun;
    private Double debet,kredit;

    
    
    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
    

    public String getPilih() {
        return pilih;
    }

    public void setPilih(String pilih) {
        this.pilih = pilih;
    }
    private String balance, pilih;
}
