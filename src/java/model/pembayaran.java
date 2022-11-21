package model;

public class pembayaran {

    public String getNotrans() {
        return notrans;
    }

    public void setNotrans(String notrans) {
        this.notrans = notrans;
    }

    public String getTgl_trans() {
        return tgl_trans;
    }

    public void setTgl_trans(String tgl_trans) {
        this.tgl_trans = tgl_trans;
    }

    public String getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(String id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Double getTotal_pem() {
        return total_pem;
    }

    public void setTotal_pem(Double total_pem) {
        this.total_pem = total_pem;
    }

    public Double getDibayar() {
        return dibayar;
    }

    public void setDibayar(Double dibayar) {
        this.dibayar = dibayar;
    }

    public Double getKembali() {
        return kembali;
    }

    public void setKembali(Double kembali) {
        this.kembali = kembali;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }
    
    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }
    
    private String notrans, tgl_trans, id_kategori, status, keterangan, nis, id_user;

    
    private Double total_pem, dibayar, kembali;
}
