/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package cn.coder4j.code.generator;

import cn.coder4j.code.generator.common.SqlContants;
import cn.coder4j.code.generator.model.db.Column;
import cn.coder4j.code.generator.model.db.Table;
import cn.hutool.db.SqlRunner;
import cn.hutool.db.ds.simple.SimpleDataSource;

import java.sql.SQLException;
import java.util.List;

/**
 * @author buhao
 * @version DbUtils.java, v 0.1 2018-08-01 00:24 buhao
 */
public class DbUtils {

    private static SimpleDataSource dataSource = new SimpleDataSource("jdbc:mysql:///bikestation", "root", "root");

    private static SqlRunner sqlRunner = SqlRunner.create(dataSource);

    public static void main(String[] args) {


        List<Table> tables = finaAllTable("bikestation");
        for (Table table : tables) {
            System.out.println(findColumn(table.getName()));
        }
    }


    public static List<Column> findColumn(String tableName) {

        try {
            return sqlRunner.query(SqlContants.FIND_COLUMNS_BY_TABLE, Column.class, tableName);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    /**
     * 获得数据中所有的表
     *
     * @return
     */
    public static List<Table> finaAllTable(String dbName) {

        try {
            List<Table> tableList = sqlRunner.query(SqlContants.FIND_ALL_TABLE_BY_DB, Table.class, dbName);
            return tableList;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


}