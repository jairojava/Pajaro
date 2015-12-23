package f.pajaro;


public class Lista_entrada {
    private int idImagen;
    private String textoEncima;
    private String textoDebajo;

    public Lista_entrada(int idImagen,String textoEncima,String textoDebajo){
        this.idImagen = idImagen;
        this.textoEncima = textoEncima;
        this.textoDebajo = textoDebajo;
    }
    public String getTextoEncima(){
        return textoEncima;
    }
    public String getTextoDebajo(){
        return textoDebajo;
    }
    public int getIdImagen(){
        return idImagen;
    }
}
