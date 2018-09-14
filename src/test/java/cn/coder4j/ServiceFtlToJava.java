/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package cn.coder4j;

import com.google.common.base.CaseFormat;
import com.google.common.collect.Lists;
import freemarker.template.TemplateExceptionHandler;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author chenhx
 * @version ServiceFtlToJava.java, v 0.1 2018-09-14 下午 7:07
 */
public class ServiceFtlToJava {

    @Test
    public void genService() {
        try {
            String modelName = "";
            String tableName = "t_user";

            freemarker.template.Configuration cfg = getConfiguration();

            Map<String, Object> data = new HashMap<>();
            data.put("date", DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
            data.put("author", getAuthor());
            String className = StringUtils.isEmpty(modelName) ? tableNameConvertUpperCamel(tableName) : modelName;
            data.put("className", className+"Mapper");
            data.put("packageName", (getJavaPath()+packageConvertPath()).replace(File.separator,"."));
            List<String> importLists = Lists.newArrayList("java.lang.Integer","java.lang.Long");
            data.put("importLists", importLists);
            String pathName = PROJECT_PATH + "src"+ File.separator+"main"+ File.separator+"java"+ File.separator+getJavaPath() + packageConvertPath() +File.separator+ className + "Mapper.java";
            System.out.println("pathName="+pathName);
            File file = new File(pathName);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            cfg.getTemplate("Mapper.java.ftl").process(data,
                    new FileWriter(file));
            System.out.println(className+"Mapper.java 生成成功");

        } catch (Exception e) {
            throw new RuntimeException("生成Mapper失败", e);
        }
    }

    private String packageConvertPath() {
        return  File.separator+"test"+ File.separator+"mapper";
    }

    private String getJavaPath() {
        return "cn"+ File.separator+"coder4j"+ File.separator+"code"+ File.separator+"generator";
    }

    private String tableNameConvertUpperCamel(String tableName) {
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, tableName.toLowerCase());
    }

    private String getAuthor() {
        return "test";
    }

    /**
     * 项目在硬盘上的根路径
     */
    private static final String PROJECT_PATH = System.getProperty("user.dir") + File.separator;

    /**
     * 类的模板位置
     */
    private static final String TEMPLATE_FILE_PATH = PROJECT_PATH + "/src/main/resources/templates";

    private freemarker.template.Configuration getConfiguration() throws IOException {
        freemarker.template.Configuration cfg = new freemarker.template.Configuration(freemarker.template.Configuration.VERSION_2_3_23);
        cfg.setDirectoryForTemplateLoading(new File(TEMPLATE_FILE_PATH));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
        return cfg;
    }


}