/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package cn.coder4j.code.generator.config;

import java.util.HashMap;
import java.util.Map;

/**
 * @author buhao
 * @version TypeMapper.java, v 0.1 2018-08-31 23:51 buhao
 */
public class TypeMapper {

    private static Map<String, String> typeMap;

    public static void init() {
        typeMap = new HashMap<>();
        typeMap.put("varchar", "java.lang.String");
        typeMap.put("char", "java.lang.String");
        typeMap.put("blob", "java.lang.byte[]");
        typeMap.put("text", "java.lang.String");
        typeMap.put("integer", "java.lang.Integer");
        typeMap.put("tinyint", "java.lang.Integer");
        typeMap.put("smallint", "java.lang.Integer");
        typeMap.put("mediumint", "java.lang.Integer");
        typeMap.put("bit", "java.lang.Boolean");
        typeMap.put("bigint", "java.math.BigInteger");
        typeMap.put("float", "java.lang.Float");
        typeMap.put("double", "java.lang.Double");
        typeMap.put("decimal", "java.math.BigDecimal");
        typeMap.put("date", "java.util.Date");
        typeMap.put("time", "java.util.Date");
        typeMap.put("datetime", "java.util.Date");
        typeMap.put("timestamp", "java.util.Date");
        typeMap.put("year", "java.util.Date");
    }


    /**
     * 根据数据库类型转换 java 类型
     *
     * @param dbType
     * @return
     */
    public static String getJavaTypeByDBType(String dbType) {

        if (typeMap == null) {
            init();
        }

        return typeMap.get(dbType);
    }

}