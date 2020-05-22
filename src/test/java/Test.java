import com.alibaba.fastjson.JSON;

/**
 * @Auther: yanke
 * @Date: 2020/5/21 14:56
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        String js = "{\n" +
                "\t\"name\": \"yanke\",\n" +
                "\t\"count\": 2\n" +
                "}";

        WordCount wordCount = JSON.parseObject(js, WordCount.class);
        System.out.println(wordCount);
    }
}
