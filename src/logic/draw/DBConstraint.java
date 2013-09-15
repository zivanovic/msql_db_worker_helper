/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.draw;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public enum DBConstraint
{
    PRIMARY_KEY,
    FOREIGN_KEY,
    NOT_NULL,
    UNIQUE,
    CHECK,
    DEFAULT ;
    
    public String toString()
    {
        String val="";
        switch(this)
        {
            case PRIMARY_KEY:
                val="PRIMARY KEY";
                break;
            case FOREIGN_KEY:
                val="FOREIGN KEY";
                break;
            case NOT_NULL:
                val="NOT NULL";
                break;
            case UNIQUE:
                val="UNIQUE";
                break;
            case CHECK:
                val="CHECK";
                break;
            case DEFAULT:
                val = "DEFAULT";
                break;
        }
        return val;
    }
    
}
