/**
 * @author Acer
 *
 */
package com.xiongjun.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMall{
	//准备分类测试数据
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				try (
					Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3308/tmall_ssm?useUnicode=true&characterEncoding=utf8",
					        "root", "123456");
					Statement s = c.createStatement();
				){
					for (int i = 1; i <= 10;i++) {
						String sqlFormat = "insert into category values (null,'测试分类%d')";
						String sql = String.format(sqlFormat, i);
						s.execute(sql);
					}
					System.out.println("已经成功创建10条分类测试数据");
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
}