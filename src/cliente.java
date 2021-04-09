
public class cliente {
    
    private int codigoCliente;
    private String nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String Telefono;
    private String Direccion;
    private int Edad;
    
    public cliente(){
    }
    
    public cliente(int codigoCliente, String nombre, String ApellidoPaterno, String ApellidoMaterno, String Telefono, String Direccion, int Edad){
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Edad = Edad;
    }
    
    public int getcodigoCliente(){
        return codigoCliente;
    }
    public void getcodigoCliente(int codigoCliente){
        this.codigoCliente = codigoCliente;
    }
    public String getnombre(){
        return nombre;
    }
    public void getnombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidoPaterno(){
        return ApellidoPaterno;
    }
    public void getApellidoPaterno(String ApellidoPaterno){
        this.ApellidoMaterno = ApellidoPaterno;
    }
    public String getApellidoMaterno(){
        return ApellidoMaterno;
    }
    public void getApellidoMaterno(String ApellidoMaterno){
        this.ApellidoMaterno = ApellidoMaterno;
    }
    public String getTelefono(){
        return Telefono;
    }
    public void getTelefono(String Telefono){
        this.Telefono = Telefono;
    }
    public String getDireccion(){
        return Direccion;
    }
    public void getDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    public int getEdad(){
        return Edad;
    }
    public void getEdad(int Edad){
        this.Edad = Edad;
    }

    void setEdad(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDireccion(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTelefo(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setApellidoMaterno(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setnombre(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setcodigocliente(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setApellidoPaterno(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

