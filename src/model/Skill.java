package model;

public class Skill
{
	long skillld;
	String skillName;
	
	public Skill(long skillld, String skillName) {
		super();
		this.skillld = skillld;
		this.skillName = skillName;
	}
	
	public long getSkillld() {
		return skillld;
	}
	public void setSkillld(long skillld) {
		this.skillld = skillld;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	
	
	}
