package xl.qinhu.com.mytest.kotlinPackage

/**
 * Created by xl100 on 2018/5/9.
 */
public interface Command<T> {
    fun execute(): T
}