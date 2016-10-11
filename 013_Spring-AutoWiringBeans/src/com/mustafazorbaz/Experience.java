package com.mustafazorbaz;

public class Experience {
    private boolean java;
    private boolean    c;
    private boolean  php;
    private boolean  Android;
	public boolean isJava() {
		return java;
	}
	public void setJava(boolean java) {
		this.java = java;
	}
	public boolean isC() {
		return c;
	}
	public void setC(boolean c) {
		this.c = c;
	}
	public boolean isPhp() {
		return php;
	}
	public void setPhp(boolean php) {
		this.php = php;
	}
	public boolean isAndroid() {
		return Android;
	}
	public void setAndroid(boolean android) {
		Android = android;
	}
	@Override
	public String toString() {
		return "Experience [java=" + java + ", c=" + c + ", php=" + php + ", Android=" + Android + "]";
	}
    
}
