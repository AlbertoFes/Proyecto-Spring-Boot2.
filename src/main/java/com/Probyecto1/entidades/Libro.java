package com.Probyecto1.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //para los metodos getters,setters
@AllArgsConstructor
@NoArgsConstructor
@Entity // el mapeo de la base de datos
@Table(
        name = "tablas_libros" //nombre con el que se mapea la base de datos
)
public class Libro {

    @Id //identificador unico
    @GeneratedValue(strategy = GenerationType.IDENTITY)//especifica como se generan los valores de las llaves primarias
    private  Long idLibro;
    private String titulo;
    private String autor;
    private String genero;
    private Float  año;
    private String email;
    private String sub;
    private String asunto;
    private String mensaje;

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void  setGenero(String genero){
        this.genero = genero;
    }
    public  void setAño(Float año){
        this.año = año;
    }
    public long getId(){
        return idLibro;
    }
    public void setId(long idLibro){
        this.idLibro = idLibro;
    }
    public  String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public  String getGenero(){
        return genero;
    }
    public  Float getAño(){
        return año;
    }

    //Email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getSub(){
        return sub;
    }
    public  void  setSub(String sub){
        this.sub = sub;
    }
    public String getAsunto(){
        return asunto;
    }
    public void setAsunto(String asunto){
        this.asunto = asunto;
    }
    public String getMensaje(){
        return mensaje;
    }
    public void setMensaje(String asunto){
        this.asunto = asunto;
    }
}

// GETTERS Y SETTERS
