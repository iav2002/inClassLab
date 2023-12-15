/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inclassca;

import java.sql.SQLException;

/**
 *
 * @author bernardogandara
 */
public interface DatabaseOperation {
    void createTable(String tableName) throws SQLException;
}
