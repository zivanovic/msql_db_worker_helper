/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.draw;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
class DBColumn extends DBComponent
{

    private DBTypes type;
    private DBConstraint decoration;

    public DBColumn(String name)
    {
        super(name);
    }

    public void setType(DBTypes type)
    {
        this.type = type;
    }

    public void setDecoration(DBConstraint decoration)
    {
        this.decoration = decoration;
    }

    public DBTypes getType()
    {
        return type;
    }

    public DBConstraint getDecoration()
    {
        return decoration;
    }
}
