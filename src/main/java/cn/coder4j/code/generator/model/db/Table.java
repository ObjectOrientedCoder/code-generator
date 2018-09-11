/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package cn.coder4j.code.generator.model.db;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author buhao
 * @version Table.java, v 0.1 2018-08-01 00:38 buhao
 */
public class Table {

    /**
     * 表名
     */
    private String name;
    /**
     * 注释
     */
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

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }
}