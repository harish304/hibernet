package com.hibernet.org.FirstHibernet;

import javax.persistence.Embeddable;

@Embeddable
public class FullName {
private String FristName;
private String MiddlesName;
private String LastName;
public String getFristName() {
	return FristName;
}
public void setFristName(String fristName) {
	FristName = fristName;
}
public String getMiddlesName() {
	return MiddlesName;
}

public void setMiddlesName(String middlesName) {
	MiddlesName = middlesName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
@Override
public String toString() {
	return "FullName [FristName=" + FristName + ", MiddlesName=" + MiddlesName + ", LastName=" + LastName + "]";
}

}
