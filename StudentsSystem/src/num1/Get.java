package num1;

import hibernate.HibernateSessionFactory;

import java.util.ArrayList;
import java.util.List;






import model.Score;
import model.Users;

import org.hibernate.Query;
import org.hibernate.Session;

public class Get {
	//得到Users表中用户名为 name的角色和密码
	public static List<String> getUserInfo(String name) {
		Session s = HibernateSessionFactory.getSession();
		Query q = s.createQuery("from Users where username='"+ name +"'");
		List<Users> l =  q.list();
		List<String> list = new ArrayList<String>();
		list.add(l.get(0).getRole().trim());
		list.add(l.get(0).getPassword().trim());
		HibernateSessionFactory.closeSession();
		return list;
	}
	//得到Score表中所有学生的成绩信息
	public static List<String[]> getScoreInfo() {
		Session s = HibernateSessionFactory.getSession();
		Query q = s.createQuery("from Score");
		List<Score> l =  q.list();
		List<String[]> list = new ArrayList<String[]>();
		for (int i=0;i<l.size();i++) {
			list.add(new String[] {
				l.get(i).getStuid().trim(),		l.get(i).getStuname().trim(),		l.get(i).getChinese().toString(),
				l.get(i).getMath().toString(),	l.get(i).getEnglish().toString(),	l.get(i).getTotal().toString(),
			});
		}
		HibernateSessionFactory.closeSession();
		return list;
	}
}
