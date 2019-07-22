

public class Test1 {
    public String ccc(String x){
        String result;
        result = x;

        return result.toString();
    }

    public static void main(String[] args) {
        String sum = null;
        Test1 test1 = new Test1();
        sum = test1.ccc("xiaoming");
        System.out.println(sum);

    }


}

enum FiveLine
{
    Gold,
    Wood,
    Water,
    Fire,
    Earth,
};
