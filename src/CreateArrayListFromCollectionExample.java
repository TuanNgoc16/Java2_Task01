import java.util. ArrayList;
import java.util.List;
public class CreateArrayListFromCollectionExample{
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers =new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        System.out.println(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumber = new ArrayList<>();
        nextFivePrimeNumber.add(13);
        nextFivePrimeNumber.add(17);
        nextFivePrimeNumber.add(19);
        nextFivePrimeNumber.add(29);


        firstFivePrimeNumbers.addAll(nextFivePrimeNumber);
        System.out.println(firstFivePrimeNumbers);
    }}