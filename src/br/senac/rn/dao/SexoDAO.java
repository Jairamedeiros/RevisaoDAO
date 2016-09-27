
package br.senac.rn.dao;

import br.senac.rn.model.Sexo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SexoDAO {
    private DataBase db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    
    public SexoDAO(){
        db = new DataBase();
    }
    
     public boolean insert(Sexo sexo){
    
    
     }
     
     
     
     public boolean delete(Sexo sexo){
    
    
     }
     
     
     
     
     
     public boolean update(Sexo sexo){
    
    
     }
     
     
     public List<Sexo> selecTAll(){
                
          
     }
    
    
    public Sexo selectById(int id){
        
        
        
    }
     
     
    public sexo selectByFilter(String filter){
        
    }
    
}
