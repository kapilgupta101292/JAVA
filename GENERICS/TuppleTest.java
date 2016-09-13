public class TuppleTest{
	static TwoTupple<String,Integer> f(){
		return new TwoTupple<String,Integer>("Hi",43);
	}
	public static void main(String[] args){	
			TwoTupple<String,Integer> ttsi = f();
			System.out.println(ttsi);

	}
}