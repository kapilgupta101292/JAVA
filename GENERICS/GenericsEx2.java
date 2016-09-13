public class GenericsEx2<T>{
	private T a;
	private T b;
	private T c;

	public GenericsEx2(T a, T b, T c){
		this.a = a ;
		this.b = b ;
		this.c = c ;
	}

	public void setA(T a){
		this.a = a ;
	}
	
	public T getA(){
		return  a;
	}
	
	public void setB(T b){
		this.b = b ;
	}
	
	public T getB(){
		return  b;
	}
	public void setC(T c){
		this.c = c ;
	}
	
	public T getC(){
		return  c;
	}

	public static void main(String[] args){
		GenericsEx2<Automobile> g  = new GenericsEx2<>(new Automobile(),new Automobile(), new Automobile() );
		System.out.println(g.getA());
		System.out.println(g.getB());
		System.out.println(g.getC());

	}


}