/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package cn.coder4j;

import cn.coder4j.code.generator.model.Field;
import cn.coder4j.code.generator.model.Project;
import cn.coder4j.code.generator.model.db.Table;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.FileResourceLoader;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author buhao
 * @version BeetlTest.java, v 0.1 2018-08-31 23:06 buhao
 */
public class BeetlTest {

    @Test
    public void testTemp() throws IOException {


        Project project = new Project();
        project.setPath("dal");

        Field field = new Field();
        field.setName("id");
        field.setComment("主键 ID");
        field.setType("Integer");


        List<Field> fields = new ArrayList<>();
        fields.add(field);

        Table table = new Table();
        table.setName("tp_admin");
        table.setComment("管理员表");

        String root = "/Users/kiwi/study/code/code-generate/src/main/java/cn/coder4j/code/generator";


        FileResourceLoader resourceLoader = new FileResourceLoader(root, "utf-8");
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Template t = gt.getTemplate("/DoObject.temp");
        t.binding("project", project);
        t.binding("fields", fields);
        t.binding("table", table);
        String str = t.render();
        System.out.println(str);

    }
}