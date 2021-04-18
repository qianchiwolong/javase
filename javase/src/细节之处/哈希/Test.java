package 细节之处.哈希;

import java.util.Objects;

/**
 * @Author 陈豪
 * @Date 2021/3/20 20:17
 * @Version 1.0
 */

public class Test {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return age == test.age &&
                Objects.equals(name, test.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
