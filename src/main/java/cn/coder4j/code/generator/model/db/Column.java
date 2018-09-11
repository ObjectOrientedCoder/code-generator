/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package cn.coder4j.code.generator.model.db;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author buhao
 * @version Column.java, v 0.1 2018-08-01 21:07 buhao
 */
public class Column {

    /**
     * 字段名
     */
    private String name;
    /**
     * 类型
     */
    private String type;
    /**
     * 键类型
     */
    private String keyType;
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
     * Getter method for property <tt>keyType</tt>.
     *
     * @return property value of keyType
     */
    public String getKeyType() {
        return keyType;
    }

    /**
     * Setter method for property <tt>keyType</tt>.
     *
     * @param keyType value to be assigned to property keyType
     */
    public void setKeyType(String keyType) {
        this.keyType = keyType;
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