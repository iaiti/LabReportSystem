package com.web.util;
import java.sql.Types;

import org.hibernate.Hibernate;
import org.hibernate.dialect.MySQL5InnoDBDialect;


/**
 * @author admin
 * 	hibernate3对数据库 varchar长度过长 和 text类型的字段支持不完善 
 *	数据处理时会有很多问题   直接继承下面父类  构造方法
 */
public class MySQLDialect extends MySQL5InnoDBDialect{
    public MySQLDialect(){  
        super(); 
        registerHibernateType(Types.LONGVARCHAR, Hibernate.TEXT.getName());
       }  
}