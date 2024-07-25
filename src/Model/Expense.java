/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Hadaragama
 */
public class Expense {

    Connection con = SqlConnection.getCon();
    PreparedStatement pst = null;
    ResultSet rs = null;

   String ex_id;
   String ex_ono;
   String ex_tot;
   String ex_pmethod;
   String ex_pdate;
   String ex_status;
   String ex_type;

    public Expense(String ex_id, String ex_ono, String ex_tot, String ex_pmethod, String ex_pdate, String ex_status, String ex_type) {
        this.ex_id = ex_id;
        this.ex_ono = ex_ono;
        this.ex_tot = ex_tot;
        this.ex_pmethod = ex_pmethod;
        this.ex_pdate = ex_pdate;
        this.ex_status = ex_status;
        this.ex_type = ex_type;
    }
      

    
}
