/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.draw;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public enum DBTypes
{
    /*
     * A integer that can be signed or unsigned
     */

    INT, // [ -2147483648, 2147483647] or [0, 4294967295]
    TINYINT, // [-128, 127] 
    SMALLINT, // [-32768, 32767]
    MEDIUMINT, // [-8388608, 8388607]
    BIGINT, // [-9223372036854775808, 9223372036854775807] or [0, 18446744073709551615]
    FLOAT,
    DOUBLE,
    DECIMAL,
    /*
     * Date and Time Types
     */
    DATE,
    DATETIME,
    TIMESTAMP,
    TIME,
    YEAR,
    /*
     * String Types
     */
    CHAR,
    VARCHAR,
    BLOB, TEXT,
    TINYBLOB, TINYTEXT,
    MEDIUMBLOB, MEDIUMTEXT,
    LONGBLOB, LONGTEXT,
    ENUM;  

    @Override
    public String toString()
    {

        String val = "";
        switch (this)
        {
            case INT:
                val = "INT";
                break;
            case TINYINT:
                val = "TINYINT";
                break;
            case SMALLINT:
                val = "SMALLINT";
                break;
            case MEDIUMINT:
                val = "MEDIUMINT";
                break;
            case BIGINT:
                val = "BIGINT";
                break;
            case FLOAT:               
                val = "FLOAT(N,M)";
                break;
            case DOUBLE:
                val = "DOUBLE(N,M)";
                break;
            case DECIMAL:
                val = "DECIMAL(N,M)";
                break;
            case DATE:
                val = "DATE";
                break;
            case DATETIME:
                val = "DATETIME";
                break;
            case TIMESTAMP:
                val = "TIMESTAMP";
                break;
            case TIME:
                val = "TIME";
                break;
            case YEAR:
                val = "YEAR(M)";
                break;
            case CHAR:
                val = "CHAR(M)";                
                break;
            case VARCHAR:
                val = "VARCHAR(M)";                                                                                                                                                                                                                                                            
                break;
            case BLOB:
                val = "BLOB";
                break;
            case TEXT:
                val = "TEXT";
                break;
            case TINYBLOB:
                val = "TINYBLOB";
                break;
            case TINYTEXT:
                val = "TINYTEXT";
                break;
            case MEDIUMBLOB:
                val = "MEDIUMBLOB";
                break;
            case MEDIUMTEXT:
                val = "MEDIUMTEXT";
                break;
            case LONGBLOB:
                val = "LONGBLOB";
                break;
            case LONGTEXT:
                val = "LONGTEXT";
                break;
            case ENUM:
                val = "ENUM";
                break;
        }
        return val;

    }
     public String writeString()
    {

        String val = "";
        switch (this)
        {
            case INT:
                val = "INT";
                break;
            case TINYINT:
                val = "TINYINT";
                break;
            case SMALLINT:
                val = "SMALLINT";
                break;
            case MEDIUMINT:
                val = "MEDIUMINT";
                break;
            case BIGINT:
                val = "BIGINT";
                break;
            case FLOAT:               
                val = "FLOAT";
                break;
            case DOUBLE:
                val = "DOUBLE";
                break;
            case DECIMAL:
                val = "DECIMAL";
                break;
            case DATE:
                val = "DATE";
                break;
            case DATETIME:
                val = "DATETIME";
                break;
            case TIMESTAMP:
                val = "TIMESTAMP";
                break;
            case TIME:
                val = "TIME";
                break;
            case YEAR:
                val = "YEAR";
                break;
            case CHAR:
                val = "CHAR";                
                break;
            case VARCHAR:
                val = "VARCHAR";                                                                                                                                                                                                                                                            
                break;
            case BLOB:
                val = "BLOB";
                break;
            case TEXT:
                val = "TEXT";
                break;
            case TINYBLOB:
                val = "TINYBLOB";
                break;
            case TINYTEXT:
                val = "TINYTEXT";
                break;
            case MEDIUMBLOB:
                val = "MEDIUMBLOB";
                break;
            case MEDIUMTEXT:
                val = "MEDIUMTEXT";
                break;
            case LONGBLOB:
                val = "LONGBLOB";
                break;
            case LONGTEXT:
                val = "LONGTEXT";
                break;
            case ENUM:
                val = "ENUM";
                break;
        }
        return val;

    }


    public int num_of_arguments()
    {
        int val = 0;
        if (this == FLOAT || this == DOUBLE || this == DECIMAL)
        {
            val = 2;
        } else if (this == YEAR || this == CHAR || this == VARCHAR)
        {
            val = 1;
        }
        return val;
    }
}
