package Thread.shangguigu;

/**
 * 测试thread中的一些方法
 * 1 start 方法启动当前线程 调用当前线程的run
 * 2 run 通常重写此方法 将线程执行的操作声明在此方法中
 * 3 currentThread 静态方法 返回当前代码的线程
 * 4 getName 获取当前线程的名称
 * 5 steName 设置当前线程的名称
 * 6 yiedl  释放当前cpu的执行权
 * 7 join 在线程a中调用线程b的join 方法此时线程a进入阻塞状态 直到b线程执行完 线程a才结束阻塞状态
 * 8 sleep 让当前线程进入阻塞状态
 * 9 isAlive 判断线程是否存活
 *
 *
 * 线程的优先级
 * 1
 *  MAX_PRIORITY 10
 *  MIN_PRIORITY 1
 *  NORM_PRIORITY 5
 * 2 获取和设置当前线程的优先级
 * getPriority 获取优先级
 * setPriority（int p） 设置优先级
 *
 *
 * @Author 陈豪
 * @Date 2021/3/21 10:46
 * @Version 1.0
 */

public class ThreadMethodTest {
}
