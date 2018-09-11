/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package cn.coder4j.code.generator.common;

/**
 * @author buhao
 * @version SqlContants.java, v 0.1 2018-08-31 21:15 buhao
 */
public class SqlContants {

    /**
     * 查询数据中所有表
     */
    public static final String FIND_ALL_TABLE_BY_DB = "select TABLE_NAME name, TABLE_COMMENT comment from information_schema.tables where table_schema=? and table_type='base table';";
    /**
     * 查询字段根据表
     */
    public static final String FIND_COLUMNS_BY_TABLE = "select column_name name, data_type type,column_key keyType, column_comment comment  from information_schema.columns where table_name=?";
}