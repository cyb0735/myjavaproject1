package yanbing.chen.entity;

import java.util.Random;

public class CreatNums{
	Random random = new Random();
	 public CreatNums(){
			this.a = random.nextInt(10);
			this.b = random.nextInt(10); 
			this.c = random.nextInt(10);
			while (this.a ==0){
				this.a = random.nextInt(10);
			}
			while (this.b == this.a || this.b == 0){
				this.b =random.nextInt(10);
				}
			while (this.c == this.a || this.c == this.b || this.c ==0){
				this.c = random.nextInt(10);
				}
	}
	
	private int a;
	private int b;
	private int c;
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
}