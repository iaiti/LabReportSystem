package com.web.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * @author admin
 *由hibernate.cfg.xml可导出数据库语句
 */
public class ExportDB {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SchemaExport export = new SchemaExport(cfg);
		export.create(true, true);
	}
}
