/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package cn.coder4j.code.generator.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/**
 * @author buhao
 * @version DataObject.java, v 0.1 2018-08-31 23:24 buhao
 */
public class DataObject {

    /**
     * 映射表名
     */
    private String table;
    /**
     * 注释
     */
    private String comment;
    /**
     * java 类名
     */
    private String javaClassName;
    /**
     * 包名
     */
    private String packageName;
    /**
     * 属性列表
     */
    private List<Field> fields;

    /**
     * Getter method for property <tt>table</tt>.
     *
     * @return property value of table
     */
    public String getTable() {
        return table;
    }

    /**
     * Setter method for property <tt>table</tt>.
     *
     * @param table value to be assigned to property table
     */
    public void setTable(String table) {
        this.table = table;
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

    /**
     * Getter method for property <tt>javaClassName</tt>.
     *
     * @return property value of javaClassName
     */
    public String getJavaClassName() {
        return javaClassName;
    }

    /**
     * Setter method for property <tt>javaClassName</tt>.
     *
     * @param javaClassName value to be assigned to property javaClassName
     */
    public void setJavaClassName(String javaClassName) {
        this.javaClassName = javaClassName;
    }

    /**
     * Getter method for property <tt>packageName</tt>.
     *
     * @return property value of packageName
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Setter method for property <tt>packageName</tt>.
     *
     * @param packageName value to be assigned to property packageName
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * Getter method for property <tt>fields</tt>.
     *
     * @return property value of fields
     */
    public List<Field> getFields() {
        return fields;
    }

    /**
     * Setter method for property <tt>fields</tt>.
     *
     * @param fields value to be assigned to property fields
     */
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }
}