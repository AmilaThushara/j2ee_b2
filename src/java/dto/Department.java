/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import lombok.Data;
import lombok.ToString;
import lombok.NoArgsConstructor;

/**
 *
 * @author REDTECH
 */

@Data
@ToString
public class Department {
    String code;
    String name;
    boolean  isactive;

//    public Department(String code, String name, boolean state) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public Department() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

 


}
