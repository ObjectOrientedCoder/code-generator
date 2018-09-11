/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package cn.coder4j.code.generator.model;

/**
 * @author buhao
 * @version Field.java, v 0.1 2018-08-31 23:10 buhao
 */
public class Field {

    private String name;
    private String type;
    private String comment;

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>type</tt>.
     *
     * @return property value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter method for property <tt>type</tt>.
     *
     * @param type value to be assigned to property type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter method for property <tt>comment</tt>.
     *
     * @return property value of comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * Setter method for property <tt>comment</tt>.
     *
     * @param comment value to be assigned to property comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}