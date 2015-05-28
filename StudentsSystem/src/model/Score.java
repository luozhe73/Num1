package model;

/**
 * Score entity. @author MyEclipse Persistence Tools
 */

public class Score implements java.io.Serializable {

	// Fields

	private Integer id;
	private String stuid;
	private String stuname;
	private Integer chinese;
	private Integer math;
	private Integer english;
	private Integer total;

	// Constructors

	/** default constructor */
	public Score() {
	}

	/** full constructor */
	public Score(String stuid, String stuname, Integer chinese, Integer math,
			Integer english, Integer total) {
		this.stuid = stuid;
		this.stuname = stuname;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.total = total;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStuid() {
		return this.stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return this.stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public Integer getChinese() {
		return this.chinese;
	}

	public void setChinese(Integer chinese) {
		this.chinese = chinese;
	}

	public Integer getMath() {
		return this.math;
	}

	public void setMath(Integer math) {
		this.math = math;
	}

	public Integer getEnglish() {
		return this.english;
	}

	public void setEnglish(Integer english) {
		this.english = english;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}