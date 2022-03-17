import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Collection {
    public static List<Integer> count(int n) {
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            l.add(i);
        }
        return l;
    }

    public static void printList(List<String> l) {
        System.out.println("Elements in List: " + l.size());
        for (String i: l) {
            System.out.println(i);
        }
    }

    public static void printListWithIndices(List<String> l) {
        System.out.println("Elements in List: " + l.size());
        for (int i = 0; i < l.size(); i++) {
            System.out.println(i+1 + ": " + l.get(i));
        }
    }

    public static List<String> concatenateLists(List<String> l1, List<String> l2) {
        List<String> newList = new ArrayList<>();
        newList.addAll(l1);
        newList.addAll(l2);
        return newList;
    }

    public static List<String> reverseList(List<String> l) {
        List<String> lrev = new ArrayList<>();
        for (int i = l.size()-1; i >= 0; i--) {
            lrev.add(l.get(i));
        }
        return lrev;
    }

    public static void reverseListInPlace(List<String> l) {
        Collections.reverse(l);
    }

    public static List<Integer> filterEvenIndices(List<Integer> l) {
        List<Integer> lnew = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            if (i % 2 != 0) {
                lnew.add(l.get(i));
            }
        }
        return lnew;
    }

    public static List<Integer> filterEven(List<Integer> l) {
        List<Integer> lnew = new ArrayList<>();
        for (Integer integer : l) {
            if (integer % 2 != 0) {
                lnew.add(integer);
            }
        }
        return lnew;
    }

    public static void mutableFilterEvenIndices(List<Integer> l) {
        List<Integer> lnew = new ArrayList<>(l);
        for (int i = 0; i < lnew.size(); i++) {
            if (i % 2 == 0) {
                l.remove(lnew.get(i));
            }
        }
    }

    public static void mutableFilterEven(List<Integer> l) {
        List<Integer> lnew = new ArrayList<>(l);
        for (Integer integer : lnew) {
            if (integer % 2 == 0) {
                l.remove(integer);
            }
        }
    }

    private static void doReadWordsInFile(String s, Set<String> st) throws FileNotFoundException {
        Scanner in = new Scanner(new File(s));
        StringBuilder sBuilder = new StringBuilder();
        while(in.hasNext())
            sBuilder.append(in.nextLine()).append("\r\n");
        s = sBuilder.toString();
        String [] a = s.replaceAll("[^à-ÿÀ-ß ]", "").toLowerCase().split("\\s+");
        st.addAll(Arrays.asList(a));
        for (String value : st) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> listOfInts = count(10);
        List<String> list1 = List.of("abc", "xyz", "ooo");
        printList(list1);
        System.out.println("\n");
        printListWithIndices(list1);
        System.out.println("\n");
        List<String> list3 = List.of("aaa", "bbb", "ccc");
        List<String> list4 = List.of("xxx", "yyy", "zzz");
        List<String> list3plusList4 = concatenateLists(list3, list4);
        System.out.println(list3plusList4);
        System.out.println("\n");
        System.out.println(list3);
        System.out.println("\n");
        System.out.println(list4);
        System.out.println("\n");
        List<String> list5 = new ArrayList<>(List.of("first", "middle1", "middle2" , "last"));
        List<String> list5rev = reverseList(list5);
        System.out.println("list5rev = " + list5rev + ", but list5 = " + list5);
        System.out.println("\n");
        reverseListInPlace(list5);
        System.out.println("list5 = " + list5);
        System.out.println("\n");
        List<Integer> ints = List.of(11, 22, 33, 55, 66, 88, 100, 3, 4);
        System.out.println("ints = " + ints);
        System.out.println("\n");
        System.out.println("ints no even indices = " + filterEvenIndices(ints));
        System.out.println("\n");
        System.out.println("ints without even = " + filterEven(ints));
        System.out.println("\n");
        System.out.println(" =================== mutable lists =================== ");
        System.out.println("\n");
        List<Integer> mutableInts = new ArrayList<>(ints);
        mutableFilterEvenIndices(mutableInts);
        System.out.println("ints no even indices = " + mutableInts);
        System.out.println("\n");
        mutableInts = new ArrayList<>(ints);
        mutableFilterEven(mutableInts);
        System.out.println("ints without even = " + mutableInts);
        System.out.println("\n");
        System.out.println(" =================== file reading =================== ");
        System.out.println("\n");
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        System.out.println(" ========================================================= Hashset ========================================================= ");
        System.out.println("\n");
        doReadWordsInFile("D:/java-Tsvetkova-3sem-master/src/Gogol-Nikolay-Shinel.txt", hashSet);
        System.out.println("\n");
        System.out.println(" ========================================================= LinkedHashSet ========================================================= ");
        System.out.println("\n");
        doReadWordsInFile("D:/java-Tsvetkova-3sem-master/src/Gogol-Nikolay-Shinel.txt", linkedHashSet);
        System.out.println("\n");
        System.out.println(" ========================================================= TreeSet========================================================= ");
        System.out.println("\n");
        doReadWordsInFile("D:/java-Tsvetkova-3sem-master/src/Gogol-Nikolay-Shinel.txt", treeSet);
        System.out.println("\n");
    }
}

