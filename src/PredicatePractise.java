import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractise {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("basics");
		list.add("strong");
		list.add("");
		list.add("nish");

		Predicate<String> predicate = s -> s.isEmpty();

		List<String> newList = filterList(list, predicate);

		for (String string : newList) {
			System.out.println(string);
		}
		System.out.println("---------");
		Predicate<String> filter = s -> !s.contains("nish");
		List<String> newestList = filterList(list, filter);
		for (String string : newestList) {
			System.out.println(string);
		}
		
		
		List<Integer> intList = List.of(1,4,6,7,8);
		Predicate<Integer> intFilter = e -> !(e % 2 == 0);
		
		List<Integer> newnewList = filterList(intList,intFilter);

		System.out.println("----------------");
		for (Integer integer: newnewList)
		{
			System.out.println(integer);
		}
		

	}

	private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {

		List<T> newList = new ArrayList<>();

		for (T string : list) {
			if (predicate.test(string)) {
				// dont do anything
			} else {
				newList.add(string);
			}
		}

		return newList;

	}

}
