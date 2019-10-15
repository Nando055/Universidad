public class Estudiante
{
    private String codigo;
    private String nombre;
    private String telefono;
    private String email;
    private String direccion;
    private Integer edad;
    private String documento;
    private String tipoDocumento;
    private Integer creditosCursados;
    private Integer semestresCursados;
    private String estado;
    private Carrera carrera;
    
    public Estudiante (){
    
    }
    
    public Estudiante( String codigo, String nombre,String telefono,String email,String direccion,Integer edad,String documento,String tipoDocumento,Integer creditosCursados,Integer semestresCursados,
    String estado,Carrera carrera){
       this.codigo=codigo;
       this.nombre=nombre;
       this.telefono=telefono;
       this.email=email;
       this.direccion=direccion;
       this.edad=edad;
       this.documento=documento;
       this.tipoDocumento=documento;
       this.creditosCursados=creditosCursados;
       this.semestresCursados=semestresCursados;
       this.estado=estado;
       this.carrera=carrera;
    }
    
    //GETTER
    
    public String getCodigo(){
    return this.codigo;
    }
    
    public String getNombre(){
    return this.nombre;
    }
    
    public String getTelefono(){
    return this.telefono;
    }
    
    public String getEmail(){
    return this.email;
    }
    
    public String getDireccion(){
    return this.direccion;
    }
    
    public Integer getEdad(){
    return this.edad;
    }
    
    public String getDocumento(){
    return this.documento;
    }
    
    public String getTipoDocumento(){
    return this.tipoDocumento;
    }
    
    public Integer getCreditosCursados(){
    return this.creditosCursados;
    }
    
    public Integer getSemestresCursados(){
    return this.semestresCursados;
    }
    
    public String getEstado(){
    return this.estado;
    }
    
    //SETTER
    
    public void setCodigo(String codigo){
    this.codigo=codigo;
    }
    
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public void setTelefono(String telefono){
    this.telefono=telefono;
    }
    
    public void setEmail(String email){
    this.email=email;
    }
    
    public void setDireccion(String direccion){
    this.direccion=direccion;
    }
    
    public void setEdad(Integer edad){
     this.edad=edad;
    }
    
    public void setDocumento(String documento){
    this.documento=documento;
    }
    
    public void setTipoDocumento(String tipoDocumento){
    this.tipoDocumento=tipoDocumento;
    }
    
    public void setCreditosCursados(Integer creditosCursados){
    this.creditosCursados=creditosCursados;
    }
    
    public void getSemestresCursados(Integer semestresCursados){
    this.semestresCursados=semestresCursados;
    }
    
    public void setEstado(String estado){
    this.estado= estado;
    }
    
    //METODOS ANALIZADORES
    
    public void esMayorEdad(){
        if(getEdad() >= 18){
            System.out.println("El estudiante es mayor de edad."); 
        }
        else { System.out.println("El estudiante es menor de edad.");   }
    }
    
    public void cursoTotalCreditos()
    {
        if(getCreditosCursados()>=carrera.getNumeroCreditos()){
           System.out.println("Estas a un paso de obtener el titulo."); 
        }
    }
    
    public void matricularProyecto(){
        if(getCreditosCursados()>=(carrera.getNumeroCreditos()*0.7)&& getSemestresCursados()>7)
        {
            System.out.println("Usted ya puede matricular proyecto de grado");}
        }
        
    public void mostrarCreditos(){
        
        Float promedio=(float)(getCreditosCursados()/getSemestresCursados());
        
        System.out.println("El promedio de creditos cursados es: " + promedio);

    }
    
    public void actualizarEstado(){
   
        if (getSemestresCursados()>=carrera.getSemestre()*2)
        {
             this.estado ="PFU";
        }
    }
}