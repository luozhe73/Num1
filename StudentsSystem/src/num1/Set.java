package num1;

import hibernate.HibernateSessionFactory;

import java.util.List;





import model.Score;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Set {
	//ɾ��ĳ��ѧ������Ϣ
	public static void deleteStudent(String stuid) {
		Session session = null; // ����Session
		Transaction tr = null; // ��������
		try {
			session = HibernateSessionFactory.getSession(); // ͨ��������������
			tr = session.beginTransaction(); // ͨ�����ӿ�������
			//ʹ��HQL���ɾ��
			String hql = "delete Score where stuid='"+ stuid +"'";
			Query q = session.createQuery(hql);
			q.executeUpdate();
			tr.commit(); // �ύ����
		} catch (Exception e) {
			tr.rollback(); // �����쳣�ع�
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
	//���ѧ����Ϣ
	public static void addStudent(String stuid, String stuname, Integer chinese, Integer math, Integer english) {
		Session session = null; // ����Session
		Transaction tr = null; // ��������
		try {
			session = HibernateSessionFactory.getSession(); // ͨ��������������
			tr = session.beginTransaction(); // ͨ�����ӿ�������
			Integer total = chinese+math+english;
			Score s = new Score();
			s.setStuid(stuid);
			s.setStuname(stuname);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			s.setTotal(total);
			session.save(s);
			tr.commit(); // �ύ����
		} catch (Exception e) {
			tr.rollback(); // �����쳣�ع�
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
	//����ѧ����Ϣ
	public static void updateStudent(String stuid, Integer chinese, Integer math, Integer english) {
		Session session = null; // ����Session
		Transaction tr = null; // ��������
		try {
			session = HibernateSessionFactory.getSession(); // ͨ��������������
			tr = session.beginTransaction(); // ͨ�����ӿ�������
			Integer total = chinese+math+english;
			Query q = session.createQuery("from Score where stuid='"+ stuid +"'");
			List<Score> l =  q.list();
			Score s = l.get(0);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			s.setTotal(total);
			session.update(s);
			tr.commit(); // �ύ����
		} catch (Exception e) {
			tr.rollback(); // �����쳣�ع�
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
}
