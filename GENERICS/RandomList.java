import java.util.*;
public class RandomList<T>{
	ArrayList<T> list = new ArrayList<>();
	private Random rand = new Random(434);
	public void add(T item){
		list.add(item);
	}
	public T select(){
		return list.get(rand.nextInt(list.size())); 
	}

	public static void main(String[] args){
		RandomList<String> rl = new RandomList<>();
		for(String s : "Kapil is the best".split(" ")){
			rl.add(s);
		}
		for(int i = 0;i<10;i++){
			System.out.println(rl.select());
		}

	}
}