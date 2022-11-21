package model;

public class biaya_operasional {

    public String getNo_bo() {
        return no_bo;
    }

    public void setNo_bo(String no_bo) {
        this.no_bo = no_bo;
    }

    public String getTgl_pengajuan() {
        return tgl_pengajuan;
    }

    public void setTgl_pengajuan(String tgl_pengajuan) {
        this.tgl_pengajuan = tgl_pengajuan;
    }

    public String getJenis_bantuan() {
        return jenis_bantuan;
    }

    public void setJenis_bantuan(String jenis_bantuan) {
        this.jenis_bantuan = jenis_bantuan;
    }

    public String getKet_dana() {
        return ket_dana;
    }

    public void setKet_dana(String ket_dana) {
        this.ket_dana = ket_dana;
    }

    public String getTgl_pencairan() {
        return tgl_pencairan;
    }

    public void setTgl_pencairan(String tgl_pencairan) {
        this.tgl_pencairan = tgl_pencairan;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public Double getJumlah_dana() {
        return jumlah_dana;
    }

    public void setJumlah_dana(Double jumlah_dana) {
        this.jumlah_dana = jumlah_dana;
    }
    
    private String no_bo, tgl_pengajuan, jenis_bantuan, ket_dana, tgl_pencairan, id_user, foto;

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    private Double jumlah_dana;
}
