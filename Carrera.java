import java.util.Date;

public class Carrera
{
    private String codigo;
    private String nombre;
    private Integer semestre;
    private Integer numeroCreditos;
    private String titulo;
    private String director;
    private Date fechaInicio;

    
    public Carrera(){
        
    }

    public Carrera(String codigo,String nombre,Integer semestre,Integer numeroCreditos,String titulo,String director,
    Date fechaInicio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.semestre=semestre;
        this.numeroCreditos=numeroCreditos;
        this.titulo=titulo;
        this.director=director;
        this.fechaInicio=fechaInicio;

    }
    //GETTER 
    
    public String getCodigo(){
        return this.codigo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Integer getSemestre(){
        return this.semestre;
    }

    public Integer getNumeroCreditos(){
        return this.numeroCreditos;
    }
    
    public String getTitulo(){
        return this.titulo;
    }

    public String getDirector(){
        return this.director;
    }

    public Date getFechaInicio(){
        return this.fechaInicio;
    }
    
    //SETTER
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setSemestre(Integer semestre){
        this.semestre = semestre;
    }
    
    public void setNumcreditos(Integer numeroCreditos){
        this.numeroCreditos = numeroCreditos;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setDirector(String director){
        this.director = director;
    }
    
    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    
    //MUESTRA EL NUMERO DE CREDITOS
    public void mostrarCreditos(){
        System.out.println("Los creditos de la carrera son:" +getNumeroCreditos());
    }
}