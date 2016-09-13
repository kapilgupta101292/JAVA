public class TwoTupple<A,B>{
	public final A a;
	public final B b;

	public TwoTupple(A a, B b){
		this.a = a;
		this.b = b;
	}

	public String toString(){
		return "(" + a + ", " + b + ")";
	}

	public static void main(String[] args){
		TwoTupple<String,Integer> tt = new TwoTupple<>("Kapil",2);
		System.out.print(tt);
	}


}