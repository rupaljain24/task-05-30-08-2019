
public class Project {
   private int proCode;
   private String proTitle;
   private String proDuration;
   private String companyName;
   

public String toString() {
	return "Project [proCode=" + proCode + ", proTitle=" + proTitle + ", proDuration=" + proDuration + ", companyName="
			+ companyName + "]";
}
public Project(int proCode, String proTitle, String proDuration, String companyName) {
	super();
	this.proCode = proCode;
	this.proTitle = proTitle;
	this.proDuration = proDuration;
	this.companyName = companyName;
}
public int getProCode() {
	return proCode;
}
public void setProCode(int proCode) {
	this.proCode = proCode;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
	result = prime * result + proCode;
	result = prime * result + ((proDuration == null) ? 0 : proDuration.hashCode());
	result = prime * result + ((proTitle == null) ? 0 : proTitle.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Project other = (Project) obj;
	if (companyName == null) {
		if (other.companyName != null)
			return false;
	} else if (!companyName.equals(other.companyName))
		return false;
	if (proCode != other.proCode)
		return false;
	if (proDuration == null) {
		if (other.proDuration != null)
			return false;
	} else if (!proDuration.equals(other.proDuration))
		return false;
	if (proTitle == null) {
		if (other.proTitle != null)
			return false;
	} else if (!proTitle.equals(other.proTitle))
		return false;
	return true;
}
public String getProTitle() {
	return proTitle;
}
public void setProTitle(String proTitle) {
	this.proTitle = proTitle;
}
public String getProDuration() {
	return proDuration;
}
public void setProDuration(String proDuration) {
	this.proDuration = proDuration;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
   
   
   
}
