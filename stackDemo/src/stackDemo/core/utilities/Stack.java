package stackDemo.core.utilities;

public class Stack {
int kapasite;
Object []s;
int ust;
public Stack(int kapasite) {
	this.kapasite=kapasite;
	s=new Object[kapasite];
	ust=-1;
}
private boolean dolumu() {
	if(ust==kapasite-1) {
		return true;
	}else return false;
}
private boolean bosmu() {
	return ust==-1;
}
public void push(Object obje) {
if(!dolumu()) {
	ust=ust+1;
	s[ust]=obje;
System.out.println(obje);	
}
}
public Object pop() {
	if(!bosmu()) {
		ust=ust-1;
	System.out.println(s[ust+1]);
	return s[ust+1];
		
	}
	return-1;
}
}
