package num1;

import hibernate.HibernateSessionFactory;

import java.util.List;





import model.Score;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Set {
	//删除某个学生的信息
	public static void deleteStudent(String stuid) {
		Session session = null; // 定义Session
		Transaction tr = null; // 定义事务
		try {
			session = HibernateSessionFactory.getSession(); // 通过工厂建立连接
			tr = session.beginTransaction(); // 通过连接开启事务
			//使用HQL语句删除
			String hql = "delete Score where stuid='"+ stuid +"'";
			Query q = session.createQuery(hql);
			q.executeUpdate();
			tr.commit(); // 提交事务
		} catch (Exception e) {
			tr.rollback(); // 出现异常回滚
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
	//添加学生信息
	public static void addStudent(String stuid, String stuname, Integer chinese, Integer math, Integer english) {
		Session session = null; // 定义Session
		Transaction tr = null; // 定义事务
		try {
			session = HibernateSessionFactory.getSession(); // 通过工厂建立连接
			tr = session.beginTransaction(); // 通过连接开启事务
			Integer total = chinese+math+english;
			Score s = new Score();
			s.setStuid(stuid);
			s.setStuname(stuname);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			s.setTotal(total);
			session.save(s);
			tr.commit(); // 提交事务
		} catch (Exception e) {
			tr.rollback(); // 出现异常回滚
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
	//更新学生信息
	public static void updateStudent(String stuid, Integer chinese, Integer math, Integer english) {
		Session session = null; // 定义Session
		Transaction tr = null; // 定义事务
		try {
			session = HibernateSessionFactory.getSession(); // 通过工厂建立连接
			tr = session.beginTransaction(); // 通过连接开启事务
			Integer total = chinese+math+english;
			Query q = session.createQuery("from Score where stuid='"+ stuid +"'");
			List<Score> l =  q.list();
			Score s = l.get(0);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			s.setTotal(total);
			session.update(s);
			tr.commit(); // 提交事务
		} catch (Exception e) {
			tr.rollback(); // 出现异常回滚
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
}
